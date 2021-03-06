/**
 * FaultToleranceSecondaryOpResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class FaultToleranceSecondaryOpResult extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference vm;

	private boolean powerOnAttempted;

	private com.vmware.vim25.ClusterPowerOnVmResult powerOnResult;

	public FaultToleranceSecondaryOpResult() {
	}

	public FaultToleranceSecondaryOpResult(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference vm,
			boolean powerOnAttempted,
			com.vmware.vim25.ClusterPowerOnVmResult powerOnResult) {
		super(dynamicType, dynamicProperty);
		this.vm = vm;
		this.powerOnAttempted = powerOnAttempted;
		this.powerOnResult = powerOnResult;
	}

	/**
	 * Gets the vm value for this FaultToleranceSecondaryOpResult.
	 * 
	 * @return vm
	 */
	public com.vmware.vim25.ManagedObjectReference getVm() {
		return vm;
	}

	/**
	 * Sets the vm value for this FaultToleranceSecondaryOpResult.
	 * 
	 * @param vm
	 */
	public void setVm(com.vmware.vim25.ManagedObjectReference vm) {
		this.vm = vm;
	}

	/**
	 * Gets the powerOnAttempted value for this FaultToleranceSecondaryOpResult.
	 * 
	 * @return powerOnAttempted
	 */
	public boolean isPowerOnAttempted() {
		return powerOnAttempted;
	}

	/**
	 * Sets the powerOnAttempted value for this FaultToleranceSecondaryOpResult.
	 * 
	 * @param powerOnAttempted
	 */
	public void setPowerOnAttempted(boolean powerOnAttempted) {
		this.powerOnAttempted = powerOnAttempted;
	}

	/**
	 * Gets the powerOnResult value for this FaultToleranceSecondaryOpResult.
	 * 
	 * @return powerOnResult
	 */
	public com.vmware.vim25.ClusterPowerOnVmResult getPowerOnResult() {
		return powerOnResult;
	}

	/**
	 * Sets the powerOnResult value for this FaultToleranceSecondaryOpResult.
	 * 
	 * @param powerOnResult
	 */
	public void setPowerOnResult(
			com.vmware.vim25.ClusterPowerOnVmResult powerOnResult) {
		this.powerOnResult = powerOnResult;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof FaultToleranceSecondaryOpResult)) {
			return false;
		}
		FaultToleranceSecondaryOpResult other = (FaultToleranceSecondaryOpResult) obj;
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
				&& ((this.vm == null && other.getVm() == null) || (this.vm != null && this.vm
						.equals(other.getVm())))
				&& this.powerOnAttempted == other.isPowerOnAttempted()
				&& ((this.powerOnResult == null && other.getPowerOnResult() == null) || (this.powerOnResult != null && this.powerOnResult
						.equals(other.getPowerOnResult())));
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
		if (getVm() != null) {
			_hashCode += getVm().hashCode();
		}
		_hashCode += (isPowerOnAttempted() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getPowerOnResult() != null) {
			_hashCode += getPowerOnResult().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			FaultToleranceSecondaryOpResult.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"FaultToleranceSecondaryOpResult"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("powerOnAttempted");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"powerOnAttempted"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("powerOnResult");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"powerOnResult"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterPowerOnVmResult"));
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
