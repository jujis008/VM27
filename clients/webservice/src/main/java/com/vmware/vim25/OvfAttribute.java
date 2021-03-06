/**
 * OvfAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class OvfAttribute extends com.vmware.vim25.OvfInvalidPackage implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String elementName;

	private java.lang.String attributeName;

	public OvfAttribute() {
	}

	public OvfAttribute(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage, int lineNumber,
			java.lang.String elementName, java.lang.String attributeName) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage,
				lineNumber);
		this.elementName = elementName;
		this.attributeName = attributeName;
	}

	/**
	 * Gets the elementName value for this OvfAttribute.
	 * 
	 * @return elementName
	 */
	public java.lang.String getElementName() {
		return elementName;
	}

	/**
	 * Sets the elementName value for this OvfAttribute.
	 * 
	 * @param elementName
	 */
	public void setElementName(java.lang.String elementName) {
		this.elementName = elementName;
	}

	/**
	 * Gets the attributeName value for this OvfAttribute.
	 * 
	 * @return attributeName
	 */
	public java.lang.String getAttributeName() {
		return attributeName;
	}

	/**
	 * Sets the attributeName value for this OvfAttribute.
	 * 
	 * @param attributeName
	 */
	public void setAttributeName(java.lang.String attributeName) {
		this.attributeName = attributeName;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof OvfAttribute)) {
			return false;
		}
		OvfAttribute other = (OvfAttribute) obj;
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
				&& ((this.elementName == null && other.getElementName() == null) || (this.elementName != null && this.elementName
						.equals(other.getElementName())))
				&& ((this.attributeName == null && other.getAttributeName() == null) || (this.attributeName != null && this.attributeName
						.equals(other.getAttributeName())));
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
		if (getElementName() != null) {
			_hashCode += getElementName().hashCode();
		}
		if (getAttributeName() != null) {
			_hashCode += getAttributeName().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			OvfAttribute.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OvfAttribute"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("elementName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"elementName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("attributeName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"attributeName"));
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
