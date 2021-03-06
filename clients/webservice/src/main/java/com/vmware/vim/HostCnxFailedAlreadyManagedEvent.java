/**
 * HostCnxFailedAlreadyManagedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostCnxFailedAlreadyManagedEvent extends com.vmware.vim.HostEvent
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String serverName;

	public HostCnxFailedAlreadyManagedEvent() {
	}

	public HostCnxFailedAlreadyManagedEvent(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int key,
			int chainId, java.util.Calendar createdTime,
			java.lang.String userName,
			com.vmware.vim.DatacenterEventArgument datacenter,
			com.vmware.vim.ComputeResourceEventArgument computeResource,
			com.vmware.vim.HostEventArgument host,
			com.vmware.vim.VmEventArgument vm,
			java.lang.String fullFormattedMessage, java.lang.String serverName) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm,
				fullFormattedMessage);
		this.serverName = serverName;
	}

	/**
	 * Gets the serverName value for this HostCnxFailedAlreadyManagedEvent.
	 * 
	 * @return serverName
	 */
	public java.lang.String getServerName() {
		return serverName;
	}

	/**
	 * Sets the serverName value for this HostCnxFailedAlreadyManagedEvent.
	 * 
	 * @param serverName
	 */
	public void setServerName(java.lang.String serverName) {
		this.serverName = serverName;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostCnxFailedAlreadyManagedEvent)) {
			return false;
		}
		HostCnxFailedAlreadyManagedEvent other = (HostCnxFailedAlreadyManagedEvent) obj;
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = super.equals(obj)
				&& ((this.serverName == null && other.getServerName() == null) || (this.serverName != null && this.serverName
						.equals(other.getServerName())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	@Override
	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = super.hashCode();
		if (getServerName() != null) {
			_hashCode += getServerName().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostCnxFailedAlreadyManagedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostCnxFailedAlreadyManagedEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serverName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"serverName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

}
