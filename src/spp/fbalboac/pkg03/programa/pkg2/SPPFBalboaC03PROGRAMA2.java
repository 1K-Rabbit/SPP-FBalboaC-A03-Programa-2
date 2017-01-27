/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.fbalboac.pkg03.programa.pkg2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPPFBalboaC03PROGRAMA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int Numero1;
        int Numero2;
        System.out.println(" Bienvenido a ¿Que numero es mayor? ");
        System.out.println("Enseñame un numero");
        Numero1 = kb.nextInt();
        System.out.println("Ahora enseñame otro");
        Numero2 = kb.nextInt ();
        //Función Math.max de Java.
        System.out.println("De acuerdo con lo que me dijiste, el numero mayor es  "
                + "" + Math.max(Numero1, Numero2)) ;
        
 
      
        
    }
     
        // TODO code application logic here
    }
  
