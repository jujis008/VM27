/**
 * HostCpuPackageVendor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostCpuPackageVendor implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HostCpuPackageVendor(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _unknown = "unknown";
    public static final java.lang.String _intel = "intel";
    public static final java.lang.String _amd = "amd";
    public static final HostCpuPackageVendor unknown = new HostCpuPackageVendor(_unknown);
    public static final HostCpuPackageVendor intel = new HostCpuPackageVendor(_intel);
    public static final HostCpuPackageVendor amd = new HostCpuPackageVendor(_amd);
    public java.lang.String getValue() { return _value_;}
    public static HostCpuPackageVendor fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HostCpuPackageVendor enumeration = (HostCpuPackageVendor)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HostCpuPackageVendor fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HostCpuPackageVendor.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostCpuPackageVendor"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
