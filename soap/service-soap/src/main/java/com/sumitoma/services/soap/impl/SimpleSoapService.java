package com.sumitoma.services.soap.impl;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public class SimpleSoapService{

    @WebMethod
    public String sayHello(@WebParam(header = true, partName = "header", name = "customHeader1") String customHeader, 
    @WebParam(header = true, partName = "header", name = "customHeader2") String customHeader2,
    @WebParam(partName = "parambody", name = "param1") String name){
        return "Hello "+ name;
    }
}
