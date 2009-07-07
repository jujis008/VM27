/**
 * UpdateInternetScsiName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class UpdateInternetScsiName  implements java.io.Serializable {
    private com.vmware.vim.ManagedObjectReference _this;

    private java.lang.String iScsiHbaDevice;

    private java.lang.String iScsiName;

    public UpdateInternetScsiName() {
    }

    public UpdateInternetScsiName(
           com.vmware.vim.ManagedObjectReference _this,
           java.lang.String iScsiHbaDevice,
           java.lang.String iScsiName) {
           this._this = _this;
           this.iScsiHbaDevice = iScsiHbaDevice;
           this.iScsiName = iScsiName;
    }


    /**
     * Gets the _this value for this UpdateInternetScsiName.
     * 
     * @return _this
     */
    public com.vmware.vim.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this UpdateInternetScsiName.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the iScsiHbaDevice value for this UpdateInternetScsiName.
     * 
     * @return iScsiHbaDevice
     */
    public java.lang.String getIScsiHbaDevice() {
        return iScsiHbaDevice;
    }


    /**
     * Sets the iScsiHbaDevice value for this UpdateInternetScsiName.
     * 
     * @param iScsiHbaDevice
     */
    public void setIScsiHbaDevice(java.lang.String iScsiHbaDevice) {
        this.iScsiHbaDevice = iScsiHbaDevice;
    }


    /**
     * Gets the iScsiName value for this UpdateInternetScsiName.
     * 
     * @return iScsiName
     */
    public java.lang.String getIScsiName() {
        return iScsiName;
    }


    /**
     * Sets the iScsiName value for this UpdateInternetScsiName.
     * 
     * @param iScsiName
     */
    public void setIScsiName(java.lang.String iScsiName) {
        this.iScsiName = iScsiName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateInternetScsiName)) return false;
        UpdateInternetScsiName other = (UpdateInternetScsiName) obj;
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
            ((this.iScsiHbaDevice==null && other.getIScsiHbaDevice()==null) || 
             (this.iScsiHbaDevice!=null &&
              this.iScsiHbaDevice.equals(other.getIScsiHbaDevice()))) &&
            ((this.iScsiName==null && other.getIScsiName()==null) || 
             (this.iScsiName!=null &&
              this.iScsiName.equals(other.getIScsiName())));
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
        if (getIScsiHbaDevice() != null) {
            _hashCode += getIScsiHbaDevice().hashCode();
        }
        if (getIScsiName() != null) {
            _hashCode += getIScsiName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateInternetScsiName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", ">UpdateInternetScsiName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IScsiHbaDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "iScsiHbaDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IScsiName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "iScsiName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
