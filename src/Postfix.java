/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */

/*
Kevin Garcia 13177
Luis Avila 13077
Vidal Villegas 13023

Main que permite el ingreso de una cadena string 
y utiliza la clase Operacion para obtener el resultado de la misma
*/

import java.util.Scanner;

public class Postfix {
    public static void main (String args[]){
        String _ingreso;
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Bienvenido");
        System.out.println("Ingresa una cadena en formato Postfix");
        System.out.println("Separa cada operando y la operacion por medio de un espacio");
        System.out.println("Ejemplo: '3 4 +' = 3+4, '3 4 /' = 3/4");
        
        _ingreso = scan.nextLine();
        
        Operacion postfix = new Operacion(_ingreso);
        
        postfix.Calculo();
        
        double resultado = postfix.getResultado();
        
        System.out.println(resultado);
        
        
        
        
    }
    
}
