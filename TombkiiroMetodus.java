/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombkiirometodus;

/**
 *
 * @author levai
 */
public class TombkiiroMetodus {

    private static void tombkiiro(int[] tomb){
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(String.format("%,3d",tomb[i])+" ");
        }
        System.out.println("");
    }
    private static void feltoltes(int[] tomb){
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (int) (Math.random()*200)-100;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("\tTÖMBKIÍRÁS METÓDUSSAL\n\tKészítette: Lévai Viktória 113.C\n");
        int elemszam = 10;
        int tomb1[] = new int [elemszam];
        int tomb2[] = new int [elemszam];
        int tomb3[] = new int [elemszam];
        
       
        feltoltes(tomb1);
        feltoltes(tomb2);
        feltoltes(tomb3);
        
   
        System.out.println("Az első tömb elemei: ");
        tombkiiro(tomb1);
        System.out.println("A második tömb elemei: ");
        tombkiiro(tomb2);
        System.out.println("A harmadik tömb elemei: ");
        tombkiiro(tomb3);
    }
    
}
