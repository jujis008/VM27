/**
 * ConfigureLicenseSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ConfigureLicenseSource implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private com.vmware.vim.ManagedObjectReference host;

	private com.vmware.vim.LicenseSource licenseSource;

	public ConfigureLicenseSource() {
	}

	public ConfigureLicenseSource(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host,
			com.vmware.vim.LicenseSource licenseSource) {
		this._this = _this;
		this.host = host;
		this.licenseSource = licenseSource;
	}

	/**
	 * Gets the _this value for this ConfigureLicenseSource.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this ConfigureLicenseSource.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the host value for this ConfigureLicenseSource.
	 * 
	 * @return host
	 */
	public com.vmware.vim.ManagedObjectReference getHost() {
		return host;
	}

	/**
	 * Sets the host value for this ConfigureLicenseSource.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim.ManagedObjectReference host) {
		this.host = host;
	}

	/**
	 * Gets the licenseSource value for this ConfigureLicenseSource.
	 * 
	 * @return licenseSource
	 */
	public com.vmware.vim.LicenseSource getLicenseSource() {
		return licenseSource;
	}

	/**
	 * Sets the licenseSource value for this ConfigureLicenseSource.
	 * 
	 * @param licenseSource
	 */
	public void setLicenseSource(com.vmware.vim.LicenseSource licenseSource) {
		this.licenseSource = licenseSource;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ConfigureLicenseSource)) {
			return false;
		}
		ConfigureLicenseSource other = (ConfigureLicenseSource) obj;
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
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.host == null && other.getHost() == null) || (this.host != null && this.host
						.equals(other.getHost())))
				&& ((this.licenseSource == null && other.getLicenseSource() == null) || (this.licenseSource != null && this.licenseSource
						.equals(other.getLicenseSource())));
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
		int _hashCode = 1;
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getHost() != null) {
			_hashCode += getHost().hashCode();
		}
		if (getLicenseSource() != null) {
			_hashCode += getLicenseSource().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ConfigureLicenseSource.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">ConfigureLicenseSource"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licenseSource");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"licenseSource"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"LicenseSource"));
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
