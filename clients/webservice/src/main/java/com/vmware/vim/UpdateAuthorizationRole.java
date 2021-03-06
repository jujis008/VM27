/**
 * UpdateAuthorizationRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class UpdateAuthorizationRole implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private int roleId;

	private java.lang.String newName;

	private java.lang.String[] privIds;

	public UpdateAuthorizationRole() {
	}

	public UpdateAuthorizationRole(com.vmware.vim.ManagedObjectReference _this,
			int roleId, java.lang.String newName, java.lang.String[] privIds) {
		this._this = _this;
		this.roleId = roleId;
		this.newName = newName;
		this.privIds = privIds;
	}

	/**
	 * Gets the _this value for this UpdateAuthorizationRole.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this UpdateAuthorizationRole.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the roleId value for this UpdateAuthorizationRole.
	 * 
	 * @return roleId
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * Sets the roleId value for this UpdateAuthorizationRole.
	 * 
	 * @param roleId
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	/**
	 * Gets the newName value for this UpdateAuthorizationRole.
	 * 
	 * @return newName
	 */
	public java.lang.String getNewName() {
		return newName;
	}

	/**
	 * Sets the newName value for this UpdateAuthorizationRole.
	 * 
	 * @param newName
	 */
	public void setNewName(java.lang.String newName) {
		this.newName = newName;
	}

	/**
	 * Gets the privIds value for this UpdateAuthorizationRole.
	 * 
	 * @return privIds
	 */
	public java.lang.String[] getPrivIds() {
		return privIds;
	}

	/**
	 * Sets the privIds value for this UpdateAuthorizationRole.
	 * 
	 * @param privIds
	 */
	public void setPrivIds(java.lang.String[] privIds) {
		this.privIds = privIds;
	}

	public java.lang.String getPrivIds(int i) {
		return this.privIds[i];
	}

	public void setPrivIds(int i, java.lang.String _value) {
		this.privIds[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof UpdateAuthorizationRole)) {
			return false;
		}
		UpdateAuthorizationRole other = (UpdateAuthorizationRole) obj;
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
				&& this.roleId == other.getRoleId()
				&& ((this.newName == null && other.getNewName() == null) || (this.newName != null && this.newName
						.equals(other.getNewName())))
				&& ((this.privIds == null && other.getPrivIds() == null) || (this.privIds != null && java.util.Arrays
						.equals(this.privIds, other.getPrivIds())));
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
		_hashCode += getRoleId();
		if (getNewName() != null) {
			_hashCode += getNewName().hashCode();
		}
		if (getPrivIds() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getPrivIds()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPrivIds(), i);
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
			UpdateAuthorizationRole.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">UpdateAuthorizationRole"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("roleId");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "roleId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("newName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"newName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("privIds");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"privIds"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
