/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Operacion {
    
    private String[] _array;
    
    public Operacion(){}
    
    public Operacion(String[] array){
        _array = array;
    } 
    
    public double Calculo(){
        double resultado;
        
        for (int i=0; i<=(_array.length-3); i=i+2){
            IdentiOperacion(_array[i],_array[i+1],_array[i+2]);
        }
        
        return resultado;
    }
    
    public String IdentiOperacion(String operando1, String operando2, String operacion){
        String resultado;
        double a = Double.parseDouble(operando1);
        double b = Double.parseDouble(operando2);
        
        if (operacion.equals("+"))
            resultado = ""+(a+b);
        else if (operacion.equals("-"))
            resultado = ""+(a-b);
        else if (operacion.equals("*"))
            resultado = ""+(a*b);
        else
            resultado = ""+(a/b);
               
        return resultado;
    }
    
}
