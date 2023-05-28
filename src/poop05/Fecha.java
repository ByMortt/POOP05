/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop05;

/**
 *
 * @author poo08alu03
 */
public class Fecha {
    // Atributos
    private int dia;
    private int mes;
    private int anio;
    
    // Constructores
    /**
     * Constructor sin parámetros de la clase Fecha.
     * Inicializa los atributos dia, mes y anio con valores predeterminados.
     */
    public Fecha() {
    }
    
    /**
     * Constructor de la clase Fecha con parámetros.
     * 
     * @param dia El día de la fecha.
     * @param mes El mes de la fecha.
     * @param anio El año de la fecha.
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    // Métodos
    
    /**
     * Obtiene el valor del día de la fecha.
     * 
     * @return El día de la fecha.
     */
    public int getDia() {
        return dia;
    }
    
    /**
     * Establece el valor del día de la fecha.
     * 
     * @param dia El día de la fecha.
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    /**
     * Obtiene el valor del mes de la fecha.
     * 
     * @return El mes de la fecha.
     */
    public int getMes() {
        return mes;
    }
    
    /**
     * Establece el valor del mes de la fecha.
     * 
     * @param mes El mes de la fecha.
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    /**
     * Obtiene el valor del año de la fecha.
     * 
     * @return El año de la fecha.
     */
    public int getAnio() {
        return anio;
    }
    
    /**
     * Establece el valor del año de la fecha.
     * 
     * @param anio El año de la fecha.
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    /**
     * Devuelve una representación en forma de cadena de la fecha.
     * 
     * @return La representación de la fecha en formato de cadena.
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
}

