/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

/**
 *
 * @author Fernando Eguizabal Alamañac
 */
public class Posicion {
    private int fila;
    private char columna;
    
    //Creamos enl constructor 
    public Posicion (int fila, char columna){
        //recibimos los parametros de posicion, los comprobamos y asignamos
        //a sus correspondientes atributos
        if(fila>=1 && fila <=8){
            this.fila = fila;
        }else{
            this.fila = 1;
        }
        
        //para saber si el caracter pasado por parametros esta entre la a y la h
        //creamos un string para buscarlos
        String cadena = "abcdefgh";
        if(cadena.indexOf(columna) == -1){
            this.columna = 'a';
        }else{
            this.columna = columna;
        }
    }
     //Creamos los metodos GET para los dos atributos
    public int getFila(){
        return this.fila;
    }
    public char getColumna(){
        return this.columna;
    }
    //Creamos el metodo SET para los dos atributos comparando siempre
    //que los parametros sean correctos
    public void setFila(int fila){
        if(fila>=1 && fila <=8){
            this.fila = fila;
        }else{
            this.fila = 1;
        }
    }
    public void setColumna(char columna){
        String cadena = "abcdefgh";
        if(cadena.indexOf(columna) == -1){
            this.columna = 'a';
        }else{
            this.columna = columna;
        }
    }
    //metodo que nos devolvera mediante un string la fila y columna 
    public String toString(){
        String posicion = Integer.toString(this.fila)+this.columna;
        return posicion;
    }
}
