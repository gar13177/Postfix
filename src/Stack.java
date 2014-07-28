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

Pila que guarda los valores de las operaciones
*/

public class Stack {
    private double[] _array;
    
    public Stack(){}
    
    public Stack(double[] array){
        _array = array;
    }
    
    public void Push(double valor){
        double[] arrayTemp;
        try{
            arrayTemp = new double[_array.length + 1];
            for (int i = 0; i< _array.length; i++){
                arrayTemp[i] = _array[i];
            }
        } catch (Exception e){
            arrayTemp = new double[1];  
        }        
        arrayTemp[arrayTemp.length-1] = valor;
        _array = arrayTemp;       
    }
    
    public double Pop(){
        if (_array.length == 0){
            System.out.println("Error, pila vacia");
            return 0;
        }else{
            double[] arrayTemp;
            arrayTemp = new double[_array.length-1];
            for (int i=0; i<arrayTemp.length;i++){
                arrayTemp[i]=_array[i+1];
            }
            double valor = _array[0];
            _array = arrayTemp;
            return valor;
        }
    }
    
    public void setStack(double[] array){
        _array = array;
    }
    
    public double[] getStack(){
        return _array;
    }
    
    public String toString(){
        String cadena = "";
        for (int i = 0; i<_array.length; i++){
            cadena = cadena + _array[i]+"\n";
        }
        return cadena+"--------\n";
    }
}
