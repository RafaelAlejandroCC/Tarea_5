package com.mycompany.tarea_5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael Alejandro
 */
public class automovil extends Motor{

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
  private String color;
  private String precio;

public  String avanzar(double gas){
    return "Auto avanzando";
}

public automovil(){
    
}
public automovil(int gas,int ele){
        System.out.println("Gasolina");
        this.encenderAutomovil(gas);
        this.avanzaAutomovil(gas);
        System.out.println("     ");
    }
    
    private void encenderAutomovil(int gas){
        if (gas > 1)
            System.out.println("Automovil encendido");
        else
              System.out.println("No y falta combustible");
    }
    
        private void avanzaAutomovil(int gas){
        if (gas > 1 && gas < 10)
            System.out.println("Nivel bajo de combustible");
        else
              System.out.println("No y falta combustible");
    }

}
    
