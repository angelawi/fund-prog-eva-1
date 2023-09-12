/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_5_entrada_Salida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. declaracion de variables
        String apellido;
        String nombre;
        int semestre;
        Scanner captura = new Scanner(System.in); 
        //; fin de instruccion en java
        //2. captura de variables
        System.out.println("introduce tu apellido");
        nombre = captura.nextLine();
        System.out.println("introduce tu nombre");
        apellido = captura.nextLine(); 
        System.out.println("introduce el semestre");
        semestre = captura.nextInt();
        //java es sensible a mayusculas y minusculas
        //es decir: es diferente System a system
        //3. mostrar los datos capturados
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(semestre); 
    }
    
}
