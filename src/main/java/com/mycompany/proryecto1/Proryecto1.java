/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proryecto1;

/**
 *
 * @author Moncho
 */
public class Proryecto1 {

    public static void main(String[] args) {
        int numero=5;
        
        System.out.println("El factorial de "+numero+" es "+factorial(numero));
        
    }
    
    private static int factorial(int numero){
        if(numero>1){
            return numero*factorial(numero-1);
        }else{
            return 1;
            
        }
    
    }

}
