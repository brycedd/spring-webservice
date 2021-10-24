package com.dd.springwebservice.test;

import com.dd.springwebservice.webservice.IReaderService;
import com.dd.springwebservice.webservice.Reader;
import com.dd.springwebservice.webservice.ReaderServiceLocator;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

/**
 * @author Bryce_dd
 * @date 2021/10/24
 */
public class DemoTest2 {
    public static void main(String[] args) throws MalformedURLException, ServiceException, RemoteException {
        URL url = new URL("http://localhost:8080/readerService?wsdl");
        ReaderServiceLocator readerServiceLocator = new ReaderServiceLocator();
        IReaderService readerServicePort = readerServiceLocator.getReaderServicePort(url);
        Reader[] readers = readerServicePort.getReaders();
        Reader reader = readerServicePort.getReader("dd", "tt");
        System.out.println(reader.toString());
        System.out.println(reader);
        System.out.println(readers);
        System.out.println("===========================");
        String strDemo = readerServicePort.getStrDemo();
        System.out.println(strDemo);
    }
}
