/**
 * ValidateMigration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ValidateMigration  implements java.io.Serializable {
    private com.vmware.vim.ManagedObjectReference _this;

    private com.vmware.vim.ManagedObjectReference[] vm;

    private com.vmware.vim.VirtualMachinePowerState state;

    private java.lang.String[] testType;

    private com.vmware.vim.ManagedObjectReference pool;

    private com.vmware.vim.ManagedObjectReference host;

    public ValidateMigration() {
    }

    public ValidateMigration(
           com.vmware.vim.ManagedObjectReference _this,
           com.vmware.vim.ManagedObjectReference[] vm,
           com.vmware.vim.VirtualMachinePowerState state,
           java.lang.String[] testType,
           com.vmware.vim.ManagedObjectReference pool,
           com.vmware.vim.ManagedObjectReference host) {
           this._this = _this;
           this.vm = vm;
           this.state = state;
           this.testType = testType;
           this.pool = pool;
           this.host = host;
    }


    /**
     * Gets the _this value for this ValidateMigration.
     * 
     * @return _this
     */
    public com.vmware.vim.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ValidateMigration.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the vm value for this ValidateMigration.
     * 
     * @return vm
     */
    public com.vmware.vim.ManagedObjectReference[] getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this ValidateMigration.
     * 
     * @param vm
     */
    public void setVm(com.vmware.vim.ManagedObjectReference[] vm) {
        this.vm = vm;
    }

    public com.vmware.vim.ManagedObjectReference getVm(int i) {
        return this.vm[i];
    }

    public void setVm(int i, com.vmware.vim.ManagedObjectReference _value) {
        this.vm[i] = _value;
    }


    /**
     * Gets the state value for this ValidateMigration.
     * 
     * @return state
     */
    public com.vmware.vim.VirtualMachinePowerState getState() {
        return state;
    }


    /**
     * Sets the state value for this ValidateMigration.
     * 
     * @param state
     */
    public void setState(com.vmware.vim.VirtualMachinePowerState state) {
        this.state = state;
    }


    /**
     * Gets the testType value for this ValidateMigration.
     * 
     * @return testType
     */
    public java.lang.String[] getTestType() {
        return testType;
    }


    /**
     * Sets the testType value for this ValidateMigration.
     * 
     * @param testType
     */
    public void setTestType(java.lang.String[] testType) {
        this.testType = testType;
    }

    public java.lang.String getTestType(int i) {
        return this.testType[i];
    }

    public void setTestType(int i, java.lang.String _value) {
        this.testType[i] = _value;
    }


    /**
     * Gets the pool value for this ValidateMigration.
     * 
     * @return pool
     */
    public com.vmware.vim.ManagedObjectReference getPool() {
        return pool;
    }


    /**
     * Sets the pool value for this ValidateMigration.
     * 
     * @param pool
     */
    public void setPool(com.vmware.vim.ManagedObjectReference pool) {
        this.pool = pool;
    }


    /**
     * Gets the host value for this ValidateMigration.
     * 
     * @return host
     */
    public com.vmware.vim.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this ValidateMigration.
     * 
     * @param host
     */
    public void setHost(com.vmware.vim.ManagedObjectReference host) {
        this.host = host;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateMigration)) return false;
        ValidateMigration other = (ValidateMigration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._this==null && other.get_this()==null) || 
             (this._this!=null &&
              this._this.equals(other.get_this()))) &&
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              java.util.Arrays.equals(this.vm, other.getVm()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.testType==null && other.getTestType()==null) || 
             (this.testType!=null &&
              java.util.Arrays.equals(this.testType, other.getTestType()))) &&
            ((this.pool==null && other.getPool()==null) || 
             (this.pool!=null &&
              this.pool.equals(other.getPool()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        if (getVm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTestType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTestType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTestType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPool() != null) {
            _hashCode += getPool().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateMigration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", ">ValidateMigration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachinePowerState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "testType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pool");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "pool"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
