package com.acme;

public class Persona {

  private String nombre, apellidos;

  public Persona(String nombre, String apellidos) {
    this.nombre = nombre;
    this.apellidos = apellidos;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  @Override
  public String toString() {
    return "PersonaClase{" +
        "nombre='" + nombre + '\'' +
        ", apellidos='" + apellidos + '\'' +
        '}';
  }
}
