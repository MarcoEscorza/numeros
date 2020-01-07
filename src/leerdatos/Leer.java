
package leerdatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author marcoescorza
 */
public class Leer {
    
    
    public static String dato(){
        
        String sdato = "";
        
        try{
        
            //define un flujo de caracteres de entrada: FlujoE
            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);
            
            //leeer la entrada finaliza al pulsar la tecla entrar
            sdato = flujoE.readLine();
            
            
        }catch(IOException e){
        
            System.err.println("Error: "+ e.getMessage());
        }
        
        return sdato;
    }
    
    
    public static short datoShort(){
    
    try{
        
        return Short.parseShort(dato());
    
    }catch(NumberFormatException e){
        
        return Short.MAX_VALUE; //valor mas pequeño
    }
    
    }
    
    
    public static int datoInt(){
    
        try{
            
            return Integer.parseInt(dato());
        
        }catch(NumberFormatException e){
        
               return Integer.MIN_VALUE; // Dato mas pequeño
               
        
        }
    }
    
    
    public static long datoLong(){
    
    try{
        
        return Long.parseLong(dato());
    
    }catch(NumberFormatException e){
    
         return Long.MIN_VALUE; // valor mas paqueño
    }
    
    }
    
    
    public static float datoFloat(){
        
        try{
            
            return Float.parseFloat(dato());
        
        }catch(NumberFormatException e){
        
            return Float.NaN; // NO es numero: valor float
        }
    
    }
    
    
    public static double datoDouble(){
    
    try{
        
        return Double.parseDouble(dato());
    
    }catch(NumberFormatException e){
    
        return Double.NaN;
    }
    
    }
    
}
