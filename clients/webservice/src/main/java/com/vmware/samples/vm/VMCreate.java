package com.vmware.samples.vm;

import java.util.ArrayList;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.apputils.vim.VMUtils;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.VirtualMachineConfigSpec;

/**
 *<pre>
 * his sample creates a VM.
 * 
 * arameters:
 * mname :       [required]: Name of the virtual machine
 * atacentername [required]: Name of the datacenter
 * ostname :     [optional]: Name fo the host
 * uestosid:     [optional]: Type of Guest OS
 * pucount:      [optional]: Total cpu count
 * isksize       [optional]: Size of the Disk
 * emorysize     [optional]: Size of the Memory in the blocks of 1024 MB
 * atastorename  [optional]: Name of datastore
 * 
 * b&gt;Command: To create a virtual machine when the name of the data center 
 * nd the host is provided:&lt;/b&gt;
 * un.bat com.vmware.samples.vm.VMCreate --url &lt;webserviceurl&gt; 
 * -username &lt;username&gt; --password &lt;password&gt; --vmname &lt;vmname&gt; 
 * -datacentername &lt;datacentername&gt;  
 * -hostname &lt;hostname&gt;
 * 
 * b&gt;Command: To create a virtual machine when the name of the vmname,datacenter name 
 * nd name of the guestosid is provided:&lt;/b&gt;
 * un.bat com.vmware.samples.vm.VMCreate --url &lt;webserviceurl&gt; 
 *  --username &lt;username&gt; --password &lt;password&gt; --vmname &lt;vmname&gt; 
 * -datacentername &lt;datacentername&gt;  --guestosid &lt;guestosid&gt;
 * 
 * b&gt;Command: To create a virtual machine when the name of the vmname,datacenter name 
 * and cpucount parameter value is provided:&lt;/b&gt;
 * un.bat com.vmware.samples.vm.VMCreate --url &lt;webserviceurl&gt;
 *  --username &lt;username&gt; --password &lt;password&gt; --vmname &lt;vmname&gt; 
 * -datacentername &lt;datacentername&gt;  --cpucount &lt;cpucount&gt;
 *</pre>
 */

public class VMCreate {
	private static AppUtil cb = null;
	private static VMUtils vmUtils = null;

	private void createVM() throws Exception {
		String dcName = cb.getOption("datacentername");
		ManagedObjectReference dcmor = cb.getServiceUtil().getDecendentMoRef(
				null, "Datacenter", dcName);

		if (dcmor == null) {
			System.out.println("Datacenter " + dcName + " not found.");
			return;
		}

		ManagedObjectReference hfmor = cb.getServiceUtil().getMoRefProp(dcmor,
				"hostFolder");
		ArrayList crmors = cb.getServiceUtil().getDecendentMoRefs(hfmor,
				"ComputeResource");

		String hostName = cb.getOption("hostname");
		ManagedObjectReference hostmor;
		if (hostName != null) {
			hostmor = cb.getServiceUtil().getDecendentMoRef(hfmor,
					"HostSystem", hostName);
			if (hostmor == null) {
				System.out.println("Host " + hostName + " not found");
				return;
			}
		} else {
			hostmor = cb.getServiceUtil().getFirstDecendentMoRef(dcmor,
					"HostSystem");
		}

		ManagedObjectReference crmor = null;
		hostName = (String) cb.getServiceUtil().getDynamicProperty(hostmor,
				"name");
		for (int i = 0; i < crmors.size(); i++) {
			ManagedObjectReference[] hrmors = (ManagedObjectReference[]) cb
					.getServiceUtil().getDynamicProperty(
							(ManagedObjectReference) crmors.get(i), "host");
			if (hrmors != null && hrmors.length > 0) {
				for (int j = 0; j < hrmors.length; j++) {
					String hname = (String) cb.getServiceUtil()
							.getDynamicProperty(hrmors[j], "name");
					if (hname.equalsIgnoreCase(hostName)) {
						crmor = (ManagedObjectReference) crmors.get(i);
						i = crmors.size() + 1;
						j = hrmors.length + 1;
					}
				}
			}
		}

		if (crmor == null) {
			System.out.println("No Compute Resource Found On Specified Host");
			return;
		}

		ManagedObjectReference resourcePool = cb.getServiceUtil().getMoRefProp(
				crmor, "resourcePool");
		ManagedObjectReference vmFolderMor = cb.getServiceUtil().getMoRefProp(
				dcmor, "vmFolder");

		VirtualMachineConfigSpec vmConfigSpec = vmUtils.createVmConfigSpec(cb
				.getOption("vmname"), cb.getOption("datastorename"), Integer
				.parseInt(cb.getOption("disksize")), crmor, hostmor);

		vmConfigSpec.setName(cb.getOption("vmname"));
		vmConfigSpec.setAnnotation("VirtualMachine Annotation");
		vmConfigSpec.setMemoryMB(new Long(Integer.parseInt(cb
				.getOption("memorysize"))));
		vmConfigSpec.setNumCPUs(Integer.parseInt(cb.getOption("cpucount")));
		vmConfigSpec.setGuestId(cb.getOption("guestosid"));

		ManagedObjectReference taskmor = cb
				.getConnection()
				.getService()
				.createVM_Task(vmFolderMor, vmConfigSpec, resourcePool, hostmor);
		String res = cb.getServiceUtil().waitForTask(taskmor);
		if (res.equalsIgnoreCase("sucess")) {
			System.out.println("Virtual Machine Created Sucessfully");
		} else {
			System.out.println("Virtual Machine could not be created. " + res);
		}
	}

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[8];
		useroptions[0] = new OptionSpec("vmname", "String", 1,
				"Name of the virtual machine", null);
		useroptions[1] = new OptionSpec("datacentername", "String", 1,
				"Name of the datacenter", null);
		useroptions[2] = new OptionSpec("hostname", "String", 0,
				"Name of the host", null);
		useroptions[3] = new OptionSpec("guestosid", "String", 0,
				"Type of Guest OS", "winXPProGuest");
		useroptions[4] = new OptionSpec("cpucount", "Integer", 0,
				"Total CPU Count", "1");
		useroptions[5] = new OptionSpec("disksize", "Integer", 0,
				"Size of the Disk", "64");
		useroptions[6] = new OptionSpec("memorysize", "Integer", 0,
				"Size of the Memory in the blocks of 1024 MB", "1024");
		useroptions[7] = new OptionSpec("datastorename", "String", 0,
				"Name of the datastore", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		VMCreate obj = new VMCreate();
		cb = AppUtil.initialize("VMCreate", VMCreate.constructOptions(), args);
		cb.connect();
		vmUtils = new VMUtils(cb);
		obj.createVM();
		cb.disConnect();
	}
}