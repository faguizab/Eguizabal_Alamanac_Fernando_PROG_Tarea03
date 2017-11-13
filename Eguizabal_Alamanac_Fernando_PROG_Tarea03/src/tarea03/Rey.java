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
public class Rey {
    //Creamos los atributos del rey con el tipo de los enum y clases que hemos creado
    public Color color;
    public Posicion posicion;
    
    //creamos el constructor en funcion del color que nos pasan
    public Rey (String color){
        //según sea el color psado por parametros creamos la posicion
        if(color.equalsIgnoreCase("BLANCO")){
            this.color = Color.BLANCO;
            this.posicion.setFila(1);
            this.posicion.setColumna('e');
        }else{
            this.color = Color.NEGRO;
            this.posicion.setFila(8);
            this.posicion.setColumna('e');
        }
    }
    //Creamos los metodos GET que nos devolveran los atributos del objeto
    //Devolviendo los mismos en el mismo tipo que son
    public Color getColor (){
        return this.color;
    }
    public Posicion getPosicion(){
        return this.posicion;
    }
}
