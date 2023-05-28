/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop05;

/**
 *
 * @author poo08alu03
 */
public class POOP05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // persona1
        Persona per1 = new Persona();
        per1.setNombre("Oscar");
        per1.setApellido("de la Cruz");
        Fecha f1 = new Fecha();
        f1.setDia(12);
        f1.setMes(11);
        f1.setAnio(2001);
        per1.setNacimiento(f1);
        System.out.println(per1);
        
        System.out.println("************");
        
        // persona2
        Persona per2 = new Persona();
        per2.setNombre("Ruben");
        per2.setApellido("Ortega");
        Fecha f2 = new Fecha();
        f2.setDia(15);
        f2.setMes(11);
        f2.setAnio(1998);
        per2.setNacimiento(f2);
        System.out.println(per2);
        
        System.out.println("************"); 
        
        // persona3
        Persona per3 = new Persona("Gabriela", "Aquino", 15, 11, 1998);
        System.out.println(per3);
        
        System.out.println("************"); 
        
        // persona4
        Persona per4 = new Persona("Iram", "Franco", 8, 6, 2001);
        System.out.println(per4);
        
        System.out.println("************");
        
        // persona5
        Persona per5 = new Persona("Dayna", "Suarez", new Fecha(18, 8, 2002));
        System.out.println(per5);
        
        System.out.println("************");
    }
    
}

