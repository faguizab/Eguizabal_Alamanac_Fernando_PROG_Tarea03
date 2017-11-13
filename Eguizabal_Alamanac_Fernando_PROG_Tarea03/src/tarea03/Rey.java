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
    public Posicion posicion = new Posicion (1,'a');
    
    //creamos el constructor en funcion del color que nos pasan
    public Rey (int color){
        //según sea el color psado por parametros creamos la posicion
        if(color == 1){
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
    //creo el metodo toString para devolver todos los atributos del rey
    public String toString(){
        String rey = this.color+Integer.toString(this.posicion.getFila())+this.posicion.getColumna();
        return rey;
    }

    //Creamos le metodo mueve para recolocar la posicion del rey
    public void mueve (Direccion direccion){
        //creamos las variables necesarias para las comprobaciones
        int fila = this.posicion.getFila();
        char columna = this.posicion.getColumna();
        //Creamos una cadena con todas las columnas y una variable para saber a que columan va
        String cadena = "abcdefgh";
        char columna_final = 'a';
        
        switch(direccion){
            case NORTE: if (fila == 1){
                            //No podria mover en direccion NORTE
                            System.out.println("El movimiento hacia el NORTE no está permitido");
                        }else{
                            //Se mueve una casilla hacia el norte
                            this.posicion.setFila(fila-1);
                            System.out.println("Movemos al rey en la dirección NORTE");
                        }
                        break;
            case SUR:   if (fila==8){
                            //No podría mover en direccion SUR
                            System.out.println("El movimiento hacia el SUR no está permitido");
                        }else{
                            this.posicion.setFila(fila+1);
                            System.out.println("Movemos al rey en la dirección SUR");
                        }
                        break;
            case ESTE: if (columna == 'h'){
                            //No podría mover al ESTE
                            System.out.println("El movimiento hacia el ESTE no está permitido");
                        }else{
                            columna_final = cadena.charAt((cadena.lastIndexOf(columna)+1));
                            this.posicion.setColumna(columna_final);
                            System.out.println("Movemos al rey en la dirección ESTE");
                        }
                        break;
            case OESTE: if (columna == 'a'){
                            //No podría mover al OESTE
                            System.out.println("El movimiento hacia el OESTE no está permitido");
                        }else{
                            columna_final = cadena.charAt((cadena.lastIndexOf(columna)-1));
                            this.posicion.setColumna(columna_final);
                            System.out.println("Movemos al rey en la dirección OESTE");
                        }
                        break;
            case NORESTE:   if (fila == 1 || columna == 'h'){
                                //No podría mover al NOROESTE
                                System.out.println("El movimiento hacia el NORESTE no está permitido");
                            }else{
                                columna_final = cadena.charAt((cadena.lastIndexOf(columna)+1));
                                this.posicion.setColumna(columna_final);
                                this.posicion.setFila(fila-1);
                                System.out.println("Movemos al rey en la dirección NORESTE");
                            }
                        break;
            case SURESTE:   if (fila == 8 || columna == 'h'){
                                //No podría mover al SURESTE
                                System.out.println("El movimiento hacia el SURESTE no está permitido");
                            }else{
                                columna_final = cadena.charAt((cadena.lastIndexOf(columna)+1));
                                this.posicion.setColumna(columna_final);
                                this.posicion.setFila(fila+1);
                                System.out.println("Movemos al rey en la dirección SURESTE");
                            }
                        break;
            case NOROESTE:   if (fila == 1 || columna == 'a'){
                                //No podría mover al NOROESTE
                                System.out.println("El movimiento hacia el NOROESTE no está permitido");
                            }else{
                                columna_final = cadena.charAt((cadena.lastIndexOf(columna)-1));
                                this.posicion.setColumna(columna_final);
                                this.posicion.setFila(fila-1);
                                System.out.println("Movemos al rey en la dirección NOROESTE");
                            }
                        break;
            case SUROESTE:   if (fila == 8 || columna == 'a'){
                                //No podría mover al SUROESTE
                                System.out.println("El movimiento hacia el SUROESTE no está permitido");
                            }else{
                                columna_final = cadena.charAt((cadena.lastIndexOf(columna)-1));
                                this.posicion.setColumna(columna_final);
                                this.posicion.setFila(fila+1);
                                System.out.println("Movemos al rey en la dirección SUROESTE");
                            }
                        break;
            default: break;
       }
        System.out.println("La posición actual del Rey "+this.color+" es: "+this.posicion.getFila()+this.posicion.getColumna());
    }
}
