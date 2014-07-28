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

Operacion permite la resolucion de una operacion en formato
Postfix, con ella retorna el valor de la operacion
*/

public class Operacion {
    
    private String _cadena;
    private Stack _pila = new Stack();
    
    public Operacion(){}
    
    public Operacion(String cadena){
        _cadena = cadena;
    }
    
    public void Lectura(){
        String[] array = _cadena.split(" ");
        double operando1;
        double operando2;
        
        for (int i =0; i<array.length; i++){
            if (array[i].equals("+")){
                operando1 = _pila.Pop();
                operando2 = _pila.Pop();
                _pila.Push(operando1+operando2);
            }else if (array[i].equals("-")){
                operando1 = _pila.Pop();
                operando2 = _pila.Pop();
                _pila.Push(operando1-operando2);
            }else if (array[i].equals("*")){
                operando1 = _pila.Pop();
                operando2 = _pila.Pop();
                _pila.Push(operando1*operando2);
            }else if (array[i].equals("/")){
                operando1 = _pila.Pop();
                operando2 = _pila.Pop();
                _pila.Push(operando1/operando2);
            }else{
                _pila.Push(Double.parseDouble(array[i]));
            }
            System.out.print(_pila);
        }
    }
    
    
    public String getCadena(){
        return _cadena;
    }
    
    public void setCadena(String cadena){
        _cadena = cadena;
    }
    
    public double getResultado(){
        return _pila.Pop();
    }
}
