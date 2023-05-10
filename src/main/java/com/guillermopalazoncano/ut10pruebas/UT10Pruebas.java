/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.guillermopalazoncano.ut10pruebas;

import adicionales.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author guillermopalazoncano
 */
public class UT10Pruebas {

    public static void main(String[] args) {
        ejercicioExcepcion();        
    }
    
    
    
    public static void ejercicioExcepcion(){
        int num1 = 5, num2 = 0;
        try {
            int resultado = num1/num2;
            System.out.println("Resultado: "+resultado);
        } catch(ArithmeticException ex){
            System.out.println("No ha podido realizarse la división, "
                    + "no está permitido dividir por 0");
        }
        
//          String cadena = "99Guille";
//          int num = Integer.parseInt(cadena);
//          System.out.println("Cadena: "+cadena);

//          String[] aCadenas = {"Hola","Adiós","Guillermo"};
//          System.out.println(aCadenas[5]);

//            Persona p = new Persona("Guillermo", "Palazón", "1111111A", 25);
//            System.out.println(p);
//            p.setEdad(-2);
//            System.out.println(p);
        

    }
    
    public static void ejercicioArrayList(){
        // Se crea vacío
        ArrayList pruebas = new ArrayList();
        // Añado un entero
        pruebas.add(5);
        // Añado un String
        pruebas.add("Hola Mundo");
        // Añado un booleano
        pruebas.add(false);
        // Añado un double
        double d = 17.48;
        pruebas.add(d);
        // Añado un objeto de tipo Persona
        Persona p = new Persona ("Guillermo","Palazón Cano", 
                "1111111A", 15);
        pruebas.add(p);
        // Añado otro objeto de tipo Persona
        pruebas.add(new Persona("Joaquín", "Martínez Lucas", 
                "22222222B", 21));
        
        for (int i = 0; i < pruebas.size(); i++) {
            System.out.println(pruebas.get(i));
        }
        
        
        ArrayList<String> alString = new ArrayList<String>();
        alString.add("Hola");
        String cadena = "Guillermo Palazón";
        alString.add(cadena);
        
        
        for (int i = 0; i < alString.size(); i++) {
            System.out.println(pruebas.get(i));
        }
        System.out.println("");
        
        String[] metodos = {"Programación", "Bases de Datos", "Entornos de Desarrollo"};
        ArrayList<String> alMetodos = new ArrayList<String>();
        Collections.addAll(alMetodos, metodos);
        Collections.addAll(alMetodos,"Inglés", "EIE", "FOL");
        alMetodos.add("Sistemas Informáticos");    
        Collections.sort(alMetodos);
        
        System.out.println("Imprimir con For-each");
        for (String str: alMetodos){ 
            // Obtenemos en str cada Objeto (en este caso de tipo String) del ArrayList
            System.out.println(str);
        }
        
       System.out.println("\nPrimer recorrido");        
       ArrayList<Integer> arrList = new ArrayList<>();
       Collections.addAll(arrList, 3, 5,1,4,9);
       // Para cada objeto num en este caso de tipo Integer de arrList
       // Suma a ese objeto num la cantidad de 2
       arrList.forEach(num -> {
           num = num + 2;
           System.out.println(num);
       });
       
       System.out.println("\nSegundo recorrido");       
       for (Integer i: arrList){ 
            // Obtenemos en str cada Objeto (en este caso de tipo String) del ArrayList
            System.out.println(i);
       }
       
       System.out.println("\nPrimer recorrido");        
       ArrayList<Persona> arrListP = new ArrayList<>();
       arrListP.add(new Persona("Guillermo", "Palazón", "1111A", 15));
       arrListP.add(new Persona("Juan", "Martínez", "2222B", 21));
       arrListP.forEach(per -> {
           per.setNombre("Mario");
           System.out.println(per);
       });
       
       System.out.println("\nSegundo recorrido");       
       for (Persona per: arrListP){ 
            // Obtenemos en str cada Objeto (en este caso de tipo String) del ArrayList
            System.out.println(per);
       }
    }
}
