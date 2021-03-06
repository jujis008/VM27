/**
 * VirtualDiskOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualDiskOption extends com.vmware.vim25.VirtualDeviceOption
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.LongOption capacityInKB;

	public VirtualDiskOption() {
	}

	public VirtualDiskOption(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String type,
			com.vmware.vim25.VirtualDeviceConnectOption connectOption,
			java.lang.String controllerType,
			com.vmware.vim25.BoolOption autoAssignController,
			com.vmware.vim25.VirtualDeviceBackingOption[] backingOption,
			java.lang.Integer defaultBackingOptionIndex,
			java.lang.String[] licensingLimit, boolean deprecated,
			boolean plugAndPlay, java.lang.Boolean hotRemoveSupported,
			com.vmware.vim25.LongOption capacityInKB) {
		super(dynamicType, dynamicProperty, type, connectOption,
				controllerType, autoAssignController, backingOption,
				defaultBackingOptionIndex, licensingLimit, deprecated,
				plugAndPlay, hotRemoveSupported);
		this.capacityInKB = capacityInKB;
	}

	/**
	 * Gets the capacityInKB value for this VirtualDiskOption.
	 * 
	 * @return capacityInKB
	 */
	public com.vmware.vim25.LongOption getCapacityInKB() {
		return capacityInKB;
	}

	/**
	 * Sets the capacityInKB value for this VirtualDiskOption.
	 * 
	 * @param capacityInKB
	 */
	public void setCapacityInKB(com.vmware.vim25.LongOption capacityInKB) {
		this.capacityInKB = capacityInKB;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualDiskOption)) {
			return false;
		}
		VirtualDiskOption other = (VirtualDiskOption) obj;
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
				&& ((this.capacityInKB == null && other.getCapacityInKB() == null) || (this.capacityInKB != null && this.capacityInKB
						.equals(other.getCapacityInKB())));
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
		if (getCapacityInKB() != null) {
			_hashCode += getCapacityInKB().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualDiskOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualDiskOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("capacityInKB");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"capacityInKB"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LongOption"));
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
