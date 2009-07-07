/**
 * HostMultipathInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostMultipathInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.HostMultipathInfoLogicalUnit[] lun;

    public HostMultipathInfo() {
    }

    public HostMultipathInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.HostMultipathInfoLogicalUnit[] lun) {
        super(
            dynamicType,
            dynamicProperty);
        this.lun = lun;
    }


    /**
     * Gets the lun value for this HostMultipathInfo.
     * 
     * @return lun
     */
    public com.vmware.vim25.HostMultipathInfoLogicalUnit[] getLun() {
        return lun;
    }


    /**
     * Sets the lun value for this HostMultipathInfo.
     * 
     * @param lun
     */
    public void setLun(com.vmware.vim25.HostMultipathInfoLogicalUnit[] lun) {
        this.lun = lun;
    }

    public com.vmware.vim25.HostMultipathInfoLogicalUnit getLun(int i) {
        return this.lun[i];
    }

    public void setLun(int i, com.vmware.vim25.HostMultipathInfoLogicalUnit _value) {
        this.lun[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostMultipathInfo)) return false;
        HostMultipathInfo other = (HostMultipathInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lun==null && other.getLun()==null) || 
             (this.lun!=null &&
              java.util.Arrays.equals(this.lun, other.getLun())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getLun() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLun());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLun(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostMultipathInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMultipathInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lun");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lun"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMultipathInfoLogicalUnit"));
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
