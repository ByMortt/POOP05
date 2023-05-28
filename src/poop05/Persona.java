/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop05;

/**
 *
 * @author poo08alu03
 */
public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private Fecha nacimiento;
    
    // Constructores
    /**
     * Constructor sin parámetros de la clase Persona.
     * Inicializa los atributos nombre, apellido y nacimiento con valores predeterminados.
     */
    public Persona() {
    }
    
    /**
     * Constructor de la clase Persona con parámetros.
     * 
     * @param nombre El nombre de la persona.
     * @param apellido El apellido de la persona.
     * @param nacimiento La fecha de nacimiento de la persona.
     */
    public Persona(String nombre, String apellido, Fecha nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
    }
    
    /**
     * Constructor de la clase Persona con parámetros.
     * Crea un objeto Fecha a partir de los parámetros de día, mes y año.
     * 
     * @param nombre El nombre de la persona.
     * @param apellido El apellido de la persona.
     * @param dia El día de nacimiento de la persona.
     * @param mes El mes de nacimiento de la persona.
     * @param anio El año de nacimiento de la persona.
     */
    public Persona(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = new Fecha(dia, mes, anio);
    }
    
    // Métodos
    
    /**
     * Obtiene el nombre de la persona.
     * 
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece el nombre de la persona.
     * 
     * @param nombre El nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene el apellido de la persona.
     * 
     * @return El apellido de la persona.
     */
    public String getApellido() {
        return apellido;
    }
    
    /**
     * Establece el apellido de la persona.
     * 
     * @param apellido El apellido de la persona.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * Obtiene la fecha de nacimiento de la persona.
     * 
     * @return La fecha de nacimiento de la persona.
     */
    public Fecha getNacimiento() {
        return nacimiento;
    }
    
    /**
     * Establece la fecha de nacimiento de la persona.
     * 
     * @param nacimiento La fecha de nacimiento de la persona.
     */
    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    /**
     * Devuelve una representación en forma de cadena de la persona.
     * 
     * @return La representación de la persona en formato de cadena.
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + nacimiento + '}';
    }
}

