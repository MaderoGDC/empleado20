/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado2.pkg0;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Main {
    
    public static void main(String [] args){
           
        ArrayList <Empleado20> empleados = new ArrayList <Empleado20> ();
        empleados.add(new Empleado20("Juan","Gomez",'m',"foto",300,new fecha(2,2,2018),new fecha(3,9,2018)));
        System.out.println(empleados.get(0));
   
   
    }
    
    
}
