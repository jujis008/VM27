/**
 * DasHostIsolatedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DasHostIsolatedEvent  extends com.vmware.vim25.ClusterEvent  implements java.io.Serializable {
    private com.vmware.vim25.HostEventArgument isolatedHost;

    public DasHostIsolatedEvent() {
    }

    public DasHostIsolatedEvent(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int key,
           int chainId,
           java.util.Calendar createdTime,
           java.lang.String userName,
           com.vmware.vim25.DatacenterEventArgument datacenter,
           com.vmware.vim25.ComputeResourceEventArgument computeResource,
           com.vmware.vim25.HostEventArgument host,
           com.vmware.vim25.VmEventArgument vm,
           com.vmware.vim25.DatastoreEventArgument ds,
           com.vmware.vim25.NetworkEventArgument net,
           com.vmware.vim25.DvsEventArgument dvs,
           java.lang.String fullFormattedMessage,
           java.lang.String changeTag,
           com.vmware.vim25.HostEventArgument isolatedHost) {
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
            ds,
            net,
            dvs,
            fullFormattedMessage,
            changeTag);
        this.isolatedHost = isolatedHost;
    }


    /**
     * Gets the isolatedHost value for this DasHostIsolatedEvent.
     * 
     * @return isolatedHost
     */
    public com.vmware.vim25.HostEventArgument getIsolatedHost() {
        return isolatedHost;
    }


    /**
     * Sets the isolatedHost value for this DasHostIsolatedEvent.
     * 
     * @param isolatedHost
     */
    public void setIsolatedHost(com.vmware.vim25.HostEventArgument isolatedHost) {
        this.isolatedHost = isolatedHost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DasHostIsolatedEvent)) return false;
        DasHostIsolatedEvent other = (DasHostIsolatedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isolatedHost==null && other.getIsolatedHost()==null) || 
             (this.isolatedHost!=null &&
              this.isolatedHost.equals(other.getIsolatedHost())));
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
        if (getIsolatedHost() != null) {
            _hashCode += getIsolatedHost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DasHostIsolatedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DasHostIsolatedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isolatedHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "isolatedHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostEventArgument"));
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