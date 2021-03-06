package com.intalio.vmware;

import java.net.MalformedURLException;
import java.net.URL;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ServiceContent;
import com.vmware.vim25.VimPortType;
import com.vmware.vim25.VimServiceLocator;

public class Connection {
	public static final ManagedObjectReference SIMO_REF = new ManagedObjectReference();
	public static final String STR_SERVICE_INSTANCE = "ServiceInstance";

	protected VimPortType vimPort;
	protected ServiceContent serviceContent;
	protected String vimHost;

	protected String url;
	protected String username;
	protected String password;

	public Connection(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}

	/**
	 * 
	 * @param url
	 *            The URL of the server
	 * @param username
	 *            The user name for the session
	 * @param password
	 *            The password for the user
	 * 
	 *            Establishes session with the virtual center / ESX server
	 * 
	 * @throws Exception
	 */
	public void connect() throws Exception {
		vimPort.login(serviceContent.getSessionManager(), username, password,
				null);
	}

	public void connect(String url, String username, String password)
			throws Exception {
		connect(url, username, password);
	}

	/**
	 * Disconnects the user session
	 * 
	 * @throws Exception
	 */
	public void disconnect() throws Exception {
		vimPort.logout(serviceContent.getSessionManager());
	}

	public ServiceContent getServiceContent() {
		return serviceContent;
	}

	public String getVimHost() {
		return vimHost;
	}

	public VimPortType getVimPort() {
		return vimPort;
	}

	/*
	 * This method calls all the initialization methods required in order.
	 */
	public void initialize() {
		// These following methods have to be called in this order.
		initSIMORef();
		initVimPort(vimHost);
		initServiceContent();
	}

	protected void initServiceContent() {
		if (serviceContent == null) {
			try {
				serviceContent = vimPort.retrieveServiceContent(SIMO_REF);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Set the managed object reference type, and value to ServiceInstance
	 */
	protected void initSIMORef() {
		SIMO_REF.setType(STR_SERVICE_INSTANCE);
		SIMO_REF.set_value(STR_SERVICE_INSTANCE);
	}

	/**
	 * 
	 * @param url
	 *            The URL of the Virtual Center Server
	 * 
	 *            https://<Server IP / host name>/sdk
	 * 
	 *            The method establishes connection with the web service port on
	 *            the server. This is not to be confused with the session
	 *            connection.
	 * 
	 */
	protected void initVimPort(String url) {
		VimServiceLocator locator = new VimServiceLocator();
		locator.setMaintainSession(true);
		try {
			vimPort = locator.getVimPort(new URL(url));
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		} catch (Exception se) {
			se.printStackTrace();
		}
	}

}
