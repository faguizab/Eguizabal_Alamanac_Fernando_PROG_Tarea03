/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eguizabal_alamanac_fernando_prog_tarea03;

import tarea03.Direccion;
import utilidades.Entrada;

/**
 *
 * @author Fernando Eguizabal Alamañac
 */
public class Principal {
    //Creamos el método Main
    public static void main(String[] args) {
        //Pediremos al usuario que elija un color 
        //y creamos el objeto rey con dicho color
        int valor_color;
        System.out.println("Tarea Online 3 de Programación");
        System.out.println("------------------------------");
        System.out.println("    1: BLANCO");
        System.out.println("    2: NEGRO");
        System.out.print("Elige por favor el COLOR del rey: ");
        //Nos aseguramos que el usuario elija un color
        do{
            valor_color = Entrada.entero();
            if(valor_color!=1 && valor_color!=2){
                System.out.print("Selección no válida. Escoja otra opción: ");
            }
        }while(valor_color!=1 && valor_color!=2);
        
        //creamos el objeto rey conforme el color que el usuairo eligio
        tarea03.Rey rey_creado = new tarea03.Rey(valor_color);
        System.out.println("Rey "+rey_creado.color+" creado");
        
        //creamos un menu para mover el rey. Para ello pediremos al usuario una opcion
        //y saldremos al elegir la opcion salir.
        int opcion_menu = 0;
        int opcion_movimiento = 0;
        do{
            System.out.println("-------------------------------");
            System.out.println("-      1: Mover el Rey        -");
            System.out.println("-      2: Mostrar Posición    -");
            System.out.println("-      3: Salir               -");
            System.out.println("-------------------------------");
            System.out.print("Elija una Opción: ");
            opcion_menu = Entrada.entero();
            switch(opcion_menu){
                case 1:     //Mostramos las opciones de movimiento
                            System.out.println("---- OPCIONES de MOVIMIENTO ----");
                            System.out.println("-       1: NORTE        ");
                            System.out.println("-       2: NORESTE      ");
                            System.out.println("-       3: ESTE         ");
                            System.out.println("-       4: SURESTE      ");
                            System.out.println("-       5: SUR          ");
                            System.out.println("-       6: SUROESTE     ");
                            System.out.println("-       7: OESTE        ");
                            System.out.println("-       8: NOROESTE     ");
                            System.out.println("--------------------------------");
                            System.out.print("Elije un movimiento: ");
                            opcion_movimiento = Entrada.entero();
                            //comprobamos que ha introducido un entreo correcto
                            do{
                                if(opcion_movimiento >= 1 && opcion_movimiento <= 8){
                                    //Movemos al rey a la posicion deseada, el metodo llamado hará las
                                    //comprobaciones de si puede o no
                                    switch(opcion_movimiento){
                                        case 1: rey_creado.mueve(Direccion.NORTE);
                                                break;
                                        case 2: rey_creado.mueve(Direccion.NORESTE);
                                                break;
                                        case 3: rey_creado.mueve(Direccion.ESTE);
                                                break;
                                        case 4: rey_creado.mueve(Direccion.SURESTE);
                                                break;
                                        case 5: rey_creado.mueve(Direccion.SUR);
                                                break;
                                        case 6: rey_creado.mueve(Direccion.SUROESTE);
                                                break;
                                        case 7: rey_creado.mueve(Direccion.OESTE);
                                                break;
                                        case 8: rey_creado.mueve(Direccion.NOROESTE);
                                                break;
                                        default:break;
                                    }       
                                }else{
                                    // La opción de movimiento no es correcta
                                    System.out.print("Opción de movimiento no válida. Escoja otra opción: ");
                                    opcion_movimiento = Entrada.entero();
                                }
                            }while(opcion_movimiento < 1 || opcion_movimiento > 8);
                            
                            //TODO movemos el rey en la dirección deseada
                            break;
                case 2:     //Mostramos por pantalla la posicion actual del rey
                            System.out.println("La posicio actual del Rey "+rey_creado.color+" es:");
                            System.out.println("    fila    : "+rey_creado.posicion.getFila());
                            System.out.println("    columna : "+rey_creado.posicion.getColumna());
                            break;
                default:    System.out.println("Opción no existente en el menú");
                            break;
            }
        }while(opcion_menu!=3);
        //Mientras el usuario no elija salir mostraremos el menu
    }
}
