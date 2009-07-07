/**
 * ArrayOfHostScsiTopologyInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostScsiTopologyInterface  implements java.io.Serializable {
    private com.vmware.vim.HostScsiTopologyInterface[] hostScsiTopologyInterface;

    public ArrayOfHostScsiTopologyInterface() {
    }

    public ArrayOfHostScsiTopologyInterface(
           com.vmware.vim.HostScsiTopologyInterface[] hostScsiTopologyInterface) {
           this.hostScsiTopologyInterface = hostScsiTopologyInterface;
    }


    /**
     * Gets the hostScsiTopologyInterface value for this ArrayOfHostScsiTopologyInterface.
     * 
     * @return hostScsiTopologyInterface
     */
    public com.vmware.vim.HostScsiTopologyInterface[] getHostScsiTopologyInterface() {
        return hostScsiTopologyInterface;
    }


    /**
     * Sets the hostScsiTopologyInterface value for this ArrayOfHostScsiTopologyInterface.
     * 
     * @param hostScsiTopologyInterface
     */
    public void setHostScsiTopologyInterface(com.vmware.vim.HostScsiTopologyInterface[] hostScsiTopologyInterface) {
        this.hostScsiTopologyInterface = hostScsiTopologyInterface;
    }

    public com.vmware.vim.HostScsiTopologyInterface getHostScsiTopologyInterface(int i) {
        return this.hostScsiTopologyInterface[i];
    }

    public void setHostScsiTopologyInterface(int i, com.vmware.vim.HostScsiTopologyInterface _value) {
        this.hostScsiTopologyInterface[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostScsiTopologyInterface)) return false;
        ArrayOfHostScsiTopologyInterface other = (ArrayOfHostScsiTopologyInterface) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostScsiTopologyInterface==null && other.getHostScsiTopologyInterface()==null) || 
             (this.hostScsiTopologyInterface!=null &&
              java.util.Arrays.equals(this.hostScsiTopologyInterface, other.getHostScsiTopologyInterface())));
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
        if (getHostScsiTopologyInterface() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostScsiTopologyInterface());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostScsiTopologyInterface(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostScsiTopologyInterface.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfHostScsiTopologyInterface"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostScsiTopologyInterface");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "HostScsiTopologyInterface"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostScsiTopologyInterface"));
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
