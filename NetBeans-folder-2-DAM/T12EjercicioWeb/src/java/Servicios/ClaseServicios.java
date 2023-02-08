/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Usuario
 */
@WebService
public class ClaseServicios {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "holaMundo")
    public String holaMundo() {
        //TODO write your implementation code here:
        return "Hola juan";
    }
    

    
}
