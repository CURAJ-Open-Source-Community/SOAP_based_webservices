/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author mnnit
 */
@WebService(serviceName = "Calculator")
public class Calculator {
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "SUM")
    public int SUM(@WebParam(name = "var1" ) int var1, @WebParam(name = "var2") int var2) {
        return var1+var2;
    }
        @WebMethod(operationName = "SUB")
    public int SUB(@WebParam(name = "var1" ) int var1, @WebParam(name = "var2") int var2) {
        return var1-var2;
    }
}
