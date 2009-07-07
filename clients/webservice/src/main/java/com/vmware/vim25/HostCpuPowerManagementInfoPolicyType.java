/**
 * HostCpuPowerManagementInfoPolicyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostCpuPowerManagementInfoPolicyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HostCpuPowerManagementInfoPolicyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _off = "off";
    public static final java.lang.String _staticPolicy = "staticPolicy";
    public static final java.lang.String _dynamicPolicy = "dynamicPolicy";
    public static final HostCpuPowerManagementInfoPolicyType off = new HostCpuPowerManagementInfoPolicyType(_off);
    public static final HostCpuPowerManagementInfoPolicyType staticPolicy = new HostCpuPowerManagementInfoPolicyType(_staticPolicy);
    public static final HostCpuPowerManagementInfoPolicyType dynamicPolicy = new HostCpuPowerManagementInfoPolicyType(_dynamicPolicy);
    public java.lang.String getValue() { return _value_;}
    public static HostCpuPowerManagementInfoPolicyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HostCpuPowerManagementInfoPolicyType enumeration = (HostCpuPowerManagementInfoPolicyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HostCpuPowerManagementInfoPolicyType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostCpuPowerManagementInfoPolicyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCpuPowerManagementInfoPolicyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
