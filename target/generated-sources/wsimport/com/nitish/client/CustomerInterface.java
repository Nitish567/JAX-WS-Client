
package com.nitish.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CustomerInterface", targetNamespace = "http://soap.nitish.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomerInterface {


    /**
     * 
     * @return
     *     returns java.util.List<com.nitish.client.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loadCustomer", targetNamespace = "http://soap.nitish.com/", className = "com.nitish.client.LoadCustomer")
    @ResponseWrapper(localName = "loadCustomerResponse", targetNamespace = "http://soap.nitish.com/", className = "com.nitish.client.LoadCustomerResponse")
    @Action(input = "http://soap.nitish.com/CustomerInterface/loadCustomerRequest", output = "http://soap.nitish.com/CustomerInterface/loadCustomerResponse")
    public List<Customer> loadCustomer();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteCustomer", targetNamespace = "http://soap.nitish.com/", className = "com.nitish.client.DeleteCustomer")
    @ResponseWrapper(localName = "deleteCustomerResponse", targetNamespace = "http://soap.nitish.com/", className = "com.nitish.client.DeleteCustomerResponse")
    @Action(input = "http://soap.nitish.com/CustomerInterface/deleteCustomerRequest", output = "http://soap.nitish.com/CustomerInterface/deleteCustomerResponse")
    public boolean deleteCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateCustomer", targetNamespace = "http://soap.nitish.com/", className = "com.nitish.client.UpdateCustomer")
    @ResponseWrapper(localName = "updateCustomerResponse", targetNamespace = "http://soap.nitish.com/", className = "com.nitish.client.UpdateCustomerResponse")
    @Action(input = "http://soap.nitish.com/CustomerInterface/updateCustomerRequest", output = "http://soap.nitish.com/CustomerInterface/updateCustomerResponse")
    public boolean updateCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        Customer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCustomer", targetNamespace = "http://soap.nitish.com/", className = "com.nitish.client.AddCustomer")
    @ResponseWrapper(localName = "addCustomerResponse", targetNamespace = "http://soap.nitish.com/", className = "com.nitish.client.AddCustomerResponse")
    @Action(input = "http://soap.nitish.com/CustomerInterface/addCustomerRequest", output = "http://soap.nitish.com/CustomerInterface/addCustomerResponse")
    public boolean addCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        Customer arg0);

}