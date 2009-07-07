/**
 * VmDeployedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VmDeployedEvent  extends com.vmware.vim.VmEvent  implements java.io.Serializable {
    private com.vmware.vim.VmEventArgument srcTemplate;

    public VmDeployedEvent() {
    }

    public VmDeployedEvent(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           int key,
           int chainId,
           java.util.Calendar createdTime,
           java.lang.String userName,
           com.vmware.vim.DatacenterEventArgument datacenter,
           com.vmware.vim.ComputeResourceEventArgument computeResource,
           com.vmware.vim.HostEventArgument host,
           com.vmware.vim.VmEventArgument vm,
           java.lang.String fullFormattedMessage,
           boolean template,
           com.vmware.vim.VmEventArgument srcTemplate) {
        super(
            dynamicType,
            dynamicProperty,
            key,
            chainId,
            createdTime,
            userName,
            datacenter,
            computeResource,
            host,
            vm,
            fullFormattedMessage,
            template);
        this.srcTemplate = srcTemplate;
    }


    /**
     * Gets the srcTemplate value for this VmDeployedEvent.
     * 
     * @return srcTemplate
     */
    public com.vmware.vim.VmEventArgument getSrcTemplate() {
        return srcTemplate;
    }


    /**
     * Sets the srcTemplate value for this VmDeployedEvent.
     * 
     * @param srcTemplate
     */
    public void setSrcTemplate(com.vmware.vim.VmEventArgument srcTemplate) {
        this.srcTemplate = srcTemplate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmDeployedEvent)) return false;
        VmDeployedEvent other = (VmDeployedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.srcTemplate==null && other.getSrcTemplate()==null) || 
             (this.srcTemplate!=null &&
              this.srcTemplate.equals(other.getSrcTemplate())));
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
        if (getSrcTemplate() != null) {
            _hashCode += getSrcTemplate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmDeployedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VmDeployedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "srcTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VmEventArgument"));
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
