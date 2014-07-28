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
        
        
        //Bienvenida e ingreso de cadena
        //no validada ante programación defensiva 
        System.out.println("Bienvenido");
        System.out.println("Ingresa una cadena en formato Postfix");
        System.out.println("Separa cada operando y la operacion por medio de un espacio");
        System.out.println("Ejemplo: '3 4 +' = 3+4, '3 4 /' = 3/4");
        
        //ingreso de la cadena
        _ingreso = scan.nextLine();
        
        //creacion de un objeto postfix con constructor sobrecargado
        Operacion postfix = new Operacion(_ingreso);
        //inicio de lectura de la cadena
        postfix.Lectura();
      
        
        //guarda resultado tras realizar la lectura
        double resultado = postfix.getResultado();
        
        //se imprime el resulado 
        System.out.println("Resultado: "+resultado);

    }
    
}
