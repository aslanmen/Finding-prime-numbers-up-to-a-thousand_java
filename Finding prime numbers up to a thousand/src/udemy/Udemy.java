/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy;

import java.util.Scanner;



/**
 *
 * @author aasla
 */
public class Udemy {
    
   public static boolean asalMı(int sayı) {
       for (int i = 2; i < sayı; i++) {
           if (sayı%i==0) {
               return false;
           }
       }
      return true;
   
   }
      
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (asalMı(i)) {
                System.out.println(i);
            }
        }
    }
    
}
