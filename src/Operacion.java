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
    
    //atributos, cadena con operaciones y pila nueva
    private String _cadena;
    private Stack _pila = new Stack();
    
    //constructores, uno sobrecargado
    public Operacion(){}
    
    public Operacion(String cadena){
        _cadena = cadena;
    }
    
    
    //lectura utiliza la pila para realizar los calculos
    public void Lectura(){
        //se separa la cadena en un arreglo
        String[] array = _cadena.split(" ");
        //se establecen los operadores 
        double operando1;
        double operando2;
        
        //se recorre el arreglo verificando si es numero o simbolo
        //push mete un valor al final de la pila
        //pop saca el primer valor
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
            //se muestra el estado de la pila
            System.out.println("Estado de la pila: ");
            System.out.print(_pila);
        }
    }
    
    
    
    //gets y sets
    public String getCadena(){
        return _cadena;
    }
    
    public void setCadena(String cadena){
        _cadena = cadena;
    }
    
    
    //get resultado obtiene el ultimo valor de la pila
    //deja vacia la pila ya que esta se utiliza luego de realizar todas las operaciones
    public double getResultado(){
        return _pila.Pop();
    }
}
