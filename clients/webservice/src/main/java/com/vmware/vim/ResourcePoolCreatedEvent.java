/**
 * ResourcePoolCreatedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ResourcePoolCreatedEvent extends com.vmware.vim.ResourcePoolEvent
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.ResourcePoolEventArgument parent;

	public ResourcePoolCreatedEvent() {
	}

	public ResourcePoolCreatedEvent(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int key,
			int chainId, java.util.Calendar createdTime,
			java.lang.String userName,
			com.vmware.vim.DatacenterEventArgument datacenter,
			com.vmware.vim.ComputeResourceEventArgument computeResource,
			com.vmware.vim.HostEventArgument host,
			com.vmware.vim.VmEventArgument vm,
			java.lang.String fullFormattedMessage,
			com.vmware.vim.ResourcePoolEventArgument resourcePool,
			com.vmware.vim.ResourcePoolEventArgument parent) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm,
				fullFormattedMessage, resourcePool);
		this.parent = parent;
	}

	/**
	 * Gets the parent value for this ResourcePoolCreatedEvent.
	 * 
	 * @return parent
	 */
	public com.vmware.vim.ResourcePoolEventArgument getParent() {
		return parent;
	}

	/**
	 * Sets the parent value for this ResourcePoolCreatedEvent.
	 * 
	 * @param parent
	 */
	public void setParent(com.vmware.vim.ResourcePoolEventArgument parent) {
		this.parent = parent;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResourcePoolCreatedEvent)) {
			return false;
		}
		ResourcePoolCreatedEvent other = (ResourcePoolCreatedEvent) obj;
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
				&& ((this.parent == null && other.getParent() == null) || (this.parent != null && this.parent
						.equals(other.getParent())));
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
		if (getParent() != null) {
			_hashCode += getParent().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ResourcePoolCreatedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ResourcePoolCreatedEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parent");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "parent"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ResourcePoolEventArgument"));
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
