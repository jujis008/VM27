/**
 * ArrayOfOvfNetworkInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfOvfNetworkInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.OvfNetworkInfo[] ovfNetworkInfo;

	public ArrayOfOvfNetworkInfo() {
	}

	public ArrayOfOvfNetworkInfo(
			com.vmware.vim25.OvfNetworkInfo[] ovfNetworkInfo) {
		this.ovfNetworkInfo = ovfNetworkInfo;
	}

	/**
	 * Gets the ovfNetworkInfo value for this ArrayOfOvfNetworkInfo.
	 * 
	 * @return ovfNetworkInfo
	 */
	public com.vmware.vim25.OvfNetworkInfo[] getOvfNetworkInfo() {
		return ovfNetworkInfo;
	}

	/**
	 * Sets the ovfNetworkInfo value for this ArrayOfOvfNetworkInfo.
	 * 
	 * @param ovfNetworkInfo
	 */
	public void setOvfNetworkInfo(
			com.vmware.vim25.OvfNetworkInfo[] ovfNetworkInfo) {
		this.ovfNetworkInfo = ovfNetworkInfo;
	}

	public com.vmware.vim25.OvfNetworkInfo getOvfNetworkInfo(int i) {
		return this.ovfNetworkInfo[i];
	}

	public void setOvfNetworkInfo(int i, com.vmware.vim25.OvfNetworkInfo _value) {
		this.ovfNetworkInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfOvfNetworkInfo)) {
			return false;
		}
		ArrayOfOvfNetworkInfo other = (ArrayOfOvfNetworkInfo) obj;
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
		_equals = true && ((this.ovfNetworkInfo == null && other
				.getOvfNetworkInfo() == null) || (this.ovfNetworkInfo != null && java.util.Arrays
				.equals(this.ovfNetworkInfo, other.getOvfNetworkInfo())));
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
		if (getOvfNetworkInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getOvfNetworkInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getOvfNetworkInfo(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ArrayOfOvfNetworkInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfOvfNetworkInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ovfNetworkInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"OvfNetworkInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OvfNetworkInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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
