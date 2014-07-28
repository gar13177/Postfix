/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Stack {
    protected double[] _array;
    
    
    public Stack(){}
    
    public Stack(double[] array){
        _array = array;
    }
    
    public void Push(double valor){
        double[] arrayTemp = new double[_array.length +1];
        for (int i = 0; i< _array.length; i++){
            arrayTemp[i] = _array[i];                    
        }
        arrayTemp[arrayTemp.length] = valor;
        
        double[] _array = new double[arrayTemp.length];
        _array = arrayTemp;       
    }
    
    public double Pop(){
        double[] arrayTemp = new double[_array.length-1];
        for (int i=0; i<arrayTemp.length;i++){
            arrayTemp[i]=_array[i+1];
        }
        double valor = _array[0];
        double[] _array = new double[arrayTemp.length];
        _array = arrayTemp;
        
        return valor;
    }
    
    public void setStack(double[] array){
        _array = array;
    }
    
    public double[] getStack(){
        return _array;
    }
    
}
