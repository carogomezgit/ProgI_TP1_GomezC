package mascotapp.model;

import java.time.LocalDate;

public class Turno {

  // atributos
  private Mascota mascota;
  private Duenio duenio;
  private Servicio servicio;
  private LocalDate fecha;

  // metodo constructor
  public Turno(Mascota mascota, Duenio duenio, Servicio servicio, LocalDate fecha){
    this.mascota = mascota;
    this.duenio = duenio;
    this.servicio = servicio;
    this.fecha = fecha;
  }

  // getters y setters
  public Mascota getMascota(){
    return mascota;
  }
  public void setMascota(Mascota mascota){
    System.out.println(this.mascota);
  }

  public Duenio getDuenio(){
    return duenio;
  }
  public void setDuenio(Duenio duenio){
    System.out.println(this.duenio);
  }

  public Servicio getServicio(){
    return servicio;
  }
  public void setServicio(Servicio servicio){
    System.out.println(this.servicio);
  }

  public LocalDate getFecha(){
    return fecha;
  }
  public void setFecha(LocalDate fecha){
    System.out.println(this.fecha);
  }

  // metodos
  void confirmarTurno(){
    System.out.println("Confirmando turno para " );
  }

  void mostrarDetalle(){
    System.out.println("Detalle del turno:");
    System.out.println("Mascota: " + mascota.getNombre());
    System.out.println("Dueño: " + duenio.getNombre());
    System.out.println("Servicio: " + servicio.obtenerNombreServicio());
    System.out.println("Fecha " + fecha);
  }

}
