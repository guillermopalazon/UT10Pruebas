/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adicionales;

import java.util.Objects;

/**
 *
 * @author guillermopalazoncano
 */
public class Persona {
    
    private String nombre;
    private String apellidos;
    private String identificador;
    private int edad;

    public Persona(String nombre, String apellidos, String identificador, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificador = identificador;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getEdad() {
        return edad;
    }

    /**
     * 
     * @param edad Edad que se le va a asignar a la Persona
     * @throws Exception En el caso de que la Edad sea inferior a 0
     */
    public void setEdad(int edad) throws Exception {
        if (edad < 0){
            throw new Exception ("La Edad no puede ser negativa");
        }
        this.edad = edad;
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.identificador, other.identificador);
    }

    @Override
    public String toString() {
        return "Nombre y Apellidos= " + nombre + " " + apellidos + ". Identificador=" + identificador;
    }
    
    
    
    
}
