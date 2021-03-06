/**
 * EvaluationLicenseSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class EvaluationLicenseSource extends com.vmware.vim25.LicenseSource
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.Long remainingHours;

	public EvaluationLicenseSource() {
	}

	public EvaluationLicenseSource(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.Long remainingHours) {
		super(dynamicType, dynamicProperty);
		this.remainingHours = remainingHours;
	}

	/**
	 * Gets the remainingHours value for this EvaluationLicenseSource.
	 * 
	 * @return remainingHours
	 */
	public java.lang.Long getRemainingHours() {
		return remainingHours;
	}

	/**
	 * Sets the remainingHours value for this EvaluationLicenseSource.
	 * 
	 * @param remainingHours
	 */
	public void setRemainingHours(java.lang.Long remainingHours) {
		this.remainingHours = remainingHours;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof EvaluationLicenseSource)) {
			return false;
		}
		EvaluationLicenseSource other = (EvaluationLicenseSource) obj;
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
				&& ((this.remainingHours == null && other.getRemainingHours() == null) || (this.remainingHours != null && this.remainingHours
						.equals(other.getRemainingHours())));
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
		if (getRemainingHours() != null) {
			_hashCode += getRemainingHours().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			EvaluationLicenseSource.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"EvaluationLicenseSource"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("remainingHours");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"remainingHours"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
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
