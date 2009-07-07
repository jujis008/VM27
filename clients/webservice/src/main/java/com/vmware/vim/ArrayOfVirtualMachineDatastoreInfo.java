/**
 * ArrayOfVirtualMachineDatastoreInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfVirtualMachineDatastoreInfo  implements java.io.Serializable {
    private com.vmware.vim.VirtualMachineDatastoreInfo[] virtualMachineDatastoreInfo;

    public ArrayOfVirtualMachineDatastoreInfo() {
    }

    public ArrayOfVirtualMachineDatastoreInfo(
           com.vmware.vim.VirtualMachineDatastoreInfo[] virtualMachineDatastoreInfo) {
           this.virtualMachineDatastoreInfo = virtualMachineDatastoreInfo;
    }


    /**
     * Gets the virtualMachineDatastoreInfo value for this ArrayOfVirtualMachineDatastoreInfo.
     * 
     * @return virtualMachineDatastoreInfo
     */
    public com.vmware.vim.VirtualMachineDatastoreInfo[] getVirtualMachineDatastoreInfo() {
        return virtualMachineDatastoreInfo;
    }


    /**
     * Sets the virtualMachineDatastoreInfo value for this ArrayOfVirtualMachineDatastoreInfo.
     * 
     * @param virtualMachineDatastoreInfo
     */
    public void setVirtualMachineDatastoreInfo(com.vmware.vim.VirtualMachineDatastoreInfo[] virtualMachineDatastoreInfo) {
        this.virtualMachineDatastoreInfo = virtualMachineDatastoreInfo;
    }

    public com.vmware.vim.VirtualMachineDatastoreInfo getVirtualMachineDatastoreInfo(int i) {
        return this.virtualMachineDatastoreInfo[i];
    }

    public void setVirtualMachineDatastoreInfo(int i, com.vmware.vim.VirtualMachineDatastoreInfo _value) {
        this.virtualMachineDatastoreInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineDatastoreInfo)) return false;
        ArrayOfVirtualMachineDatastoreInfo other = (ArrayOfVirtualMachineDatastoreInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineDatastoreInfo==null && other.getVirtualMachineDatastoreInfo()==null) || 
             (this.virtualMachineDatastoreInfo!=null &&
              java.util.Arrays.equals(this.virtualMachineDatastoreInfo, other.getVirtualMachineDatastoreInfo())));
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
        if (getVirtualMachineDatastoreInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineDatastoreInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineDatastoreInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineDatastoreInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfVirtualMachineDatastoreInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineDatastoreInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineDatastoreInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineDatastoreInfo"));
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
