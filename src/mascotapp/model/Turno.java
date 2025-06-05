package mascotapp.model;

import java.time.LocalDate;

public class Turno {

  // atributos
  Mascota mascota;
  Duenio duenio;
  Servicio servicio;
  LocalDate fecha;

  // metodo constructor
  public Turno(Mascota mascota, Duenio duenio, Servicio servicio, LocalDate fecha){
    this.fecha = fecha;
  }

  // metodos
  void confirmarTurno(){

  }
  void mostrarDetalle(){

  }

}
