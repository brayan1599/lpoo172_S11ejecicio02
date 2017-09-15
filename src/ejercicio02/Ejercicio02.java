/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     //mostrar mensaje al usuario
        System.out.println("INGRESE DOS LETRAS: ");
        String str=input.nextLine();
        
        //Extraer carrera y nivel
        char carrera=Character.toUpperCase(str.charAt(0));
        char nivel=str.charAt(1);
        
        switch (carrera){
            case 'M': System.out.println("Matematicas");break;
            case 'C': System.out.println("Ciencias de la Comunicacion");break;
            case 'I': System.out.println("Tecnologia de la Informacion");break;
            default: System.out.println("Entrada Invalida.");
                System.exit(1);
        }
        switch(nivel){
            case '1': System.out.println("Freshman");break;
            case '2': System.out.println("Sopohomore");break;
            case '3': System.out.println("Junior");break;
            case '4': System.out.println("Senior");break;
            default:System.out.println("Entrada Invalida");
        }
        
        
        
        
        
        
    }      
}
