package com.dd.springwebservice.test;

import com.dd.springwebservice.webservice.IReaderService;
import com.dd.springwebservice.webservice.Reader;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.rmi.RemoteException;

/**
 * @author Bryce_dd
 * @date 2021/10/24
 */
public class DemoTest {
    public static void main(String[] args) throws RemoteException {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(IReaderService.class);
        factoryBean.setAddress("http://localhost:8080/readerService");

        IReaderService readerService = (IReaderService)factoryBean.create();
//        Reader reader = readerService.getReader("shun","123");
//        System.out.println("Reader:"+reader);
        Reader[] readers = readerService.getReaders();
        System.out.println("Reader:"+readers);
    }
}
