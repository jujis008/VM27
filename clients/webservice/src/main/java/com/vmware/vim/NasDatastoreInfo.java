/**
 * NasDatastoreInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class NasDatastoreInfo extends com.vmware.vim.DatastoreInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.HostNasVolume nas;

	public NasDatastoreInfo() {
	}

	public NasDatastoreInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String name, java.lang.String url, long freeSpace,
			long maxFileSize, com.vmware.vim.HostNasVolume nas) {
		super(dynamicType, dynamicProperty, name, url, freeSpace, maxFileSize);
		this.nas = nas;
	}

	/**
	 * Gets the nas value for this NasDatastoreInfo.
	 * 
	 * @return nas
	 */
	public com.vmware.vim.HostNasVolume getNas() {
		return nas;
	}

	/**
	 * Sets the nas value for this NasDatastoreInfo.
	 * 
	 * @param nas
	 */
	public void setNas(com.vmware.vim.HostNasVolume nas) {
		this.nas = nas;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof NasDatastoreInfo)) {
			return false;
		}
		NasDatastoreInfo other = (NasDatastoreInfo) obj;
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
				&& ((this.nas == null && other.getNas() == null) || (this.nas != null && this.nas
						.equals(other.getNas())));
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
		if (getNas() != null) {
			_hashCode += getNas().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			NasDatastoreInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"NasDatastoreInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nas");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "nas"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostNasVolume"));
		elemField.setMinOccurs(0);
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
