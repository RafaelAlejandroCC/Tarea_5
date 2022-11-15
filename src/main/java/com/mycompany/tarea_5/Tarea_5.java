/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea_5;

/**
 *
 * @author Rafael Alejandro
 */
public class Tarea_5 {

    public static void main(String[] args) {
        
        
        automovil[] audi = new automovil[5];
        for (int i = 0; i < audi.length; i++){
        audi[i] = new automovil();
        audi[i].setColor("Azul" + Integer.toString(i));
        audi[i].setModelo("A3"+ Integer.toString(i));
        audi[i].setPrecio("1000"+ Integer.toString(i));
        //System.out.println(audi[i].frenar());   
        }
        
        for (automovil auto: audi){
            System.out.println(auto.getColor());
            System.out.println(auto.getModelo());
            System.out.println(auto.getPrecio());
            System.out.println(auto.frenar());   
        }
    }
}
