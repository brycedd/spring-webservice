/**
 * IReaderService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dd.springwebservice.webservice;

public interface IReaderService extends java.rmi.Remote {
    public com.dd.springwebservice.webservice.Reader getReader(java.lang.String name, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String getStrDemo() throws java.rmi.RemoteException;
    public com.dd.springwebservice.webservice.Reader[] getReaders() throws java.rmi.RemoteException;
}
