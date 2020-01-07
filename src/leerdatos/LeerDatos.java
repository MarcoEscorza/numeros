/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerdatos;

/**
 *
 * @author marcoescorza
 */
public class LeerDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        short dato_short =0;
        int dato_int = 0;
        long dato_long = 0;
        float dato_float =0;
        double dato_double = 0;
        
        
        
        System.out.print("Dato short: ");
        dato_short = Leer.datoShort();
        
        
        System.out.print("Dato int: ");
        dato_int = Leer.datoInt();
        

        System.out.print("Dato long: ");
        dato_long = Leer.datoLong();
        
        
        System.out.print("Dato float: ");
        dato_float = Leer.datoFloat();
        
        
        System.out.print("Dato double: ");
        dato_double = Leer.datoDouble();
        
        
        
                
        
    }
    
}
