/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proryecto1;

/**
 *
 * @author Moncho
 */
public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double area(){
        return Math.PI*radio*radio;
    }
    
    public double longitud(){
        return 2*Math.PI*radio;
    }

    public double diametro(){
        return 2*radio;
    }
    
}
