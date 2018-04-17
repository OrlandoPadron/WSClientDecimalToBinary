/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclientdecimaltobinary;

import java.util.Scanner;
import ws.NewJerseyClient;

/**
 *
 * @author OrlandoPadrón
 */
public class WSClientDecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NewJerseyClient decimal = new NewJerseyClient();
        
        Scanner sc = new Scanner(System.in); 
        int mode = 0; 
        int num = 0; 
        System.out.println("Seleccione la opción deseada.\n");
        System.out.println("1. Conversor Decimal a Binario. \n");
        System.out.println("2. Factorial. \n");
        mode = sc.nextInt(); 
        
        switch (mode){
            case 1: 
                System.out.println("CONVERSOR DECIMAL A BINARIO:");
                System.out.println("Introduzca un decimal a convertir: ");
                num = sc.nextInt(); 
                System.out.println("DECIMAL: " +num + "\n" + "BINARIO: " + decimal.conversor(String.class, Integer.toString(num)));
                break; 
                
            case 2: 
                System.out.println("FACTORIAL:");
                System.out.println("Introduzca el número deseado: ");
                num = sc.nextInt();
                System.out.println("NÚMERO: " +num + "\n" + "FACTORIAL: " + factorial(num));
                break;
                
            default: 
                System.out.println("No ha seleccionado ninguna opción válida. ");
                break;
                
        }
                
        
    }

    private static int factorial(int arg0) {
        ws.WSFactorial_Service service = new ws.WSFactorial_Service();
        ws.WSFactorial port = service.getWSFactorialPort();
        return port.factorial(arg0);
    }
    
}
