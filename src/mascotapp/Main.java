package mascotapp;

import java.time.LocalDate;
import mascotapp.model.*; // el import es mas simple de esta manera (checkstyle)

public class Main {
  public static void main(String[] args) {

    // crear objetos Mascota
    Mascota mascota1 = new Perro("01", "Shelly", 4, "Collie", "Caminar", 34.2, "Grande");
    Mascota mascota2 = new Gato("02", "Kuki", 3, "Ragdoll", "Ronronear", 6.4, "Mediano");
    Mascota mascota3 = new Perro("03", "Poli", 2, "Caniche", "Dormir", 4.3, "Chico");

    // crear objetos Dueño
    Duenio duenio1 = new Duenio("Juli", "284824");
    Duenio duenio2 = new Duenio("Ara", "473824");

    // asignar mascotas a dueños
    duenio1.agregarMascota(mascota1);
    duenio2.agregarMascota(mascota2);
    duenio2.agregarMascota(mascota3);

    // mostrar fichas de mascota por cada dueño (en este caso 2 dueños)
    duenio1.mostrarInfoDuenio();
    duenio1.mostrarMascotas();

    duenio2.mostrarInfoDuenio();
    duenio2.mostrarMascotas();

    // crear servicios y asignar turnos a mascotas
    Servicio banio = new Banio();
    Servicio cortePelo = new CortePelo();
    Servicio limpiezaOidos = new LimpiezaOidos();
    Servicio combo = new ComboCompleto();


    // crear turnos
    Turno turno1 = new Turno(mascota1, duenio1, banio, LocalDate.of(2025, 6, 20));
    turno1.confirmarTurno();

    Turno turno2 = new Turno(mascota2, duenio2, limpiezaOidos, LocalDate.of(2025, 7, 18));
    turno2.confirmarTurno();

    Turno turno3 = new Turno(mascota3, duenio2, combo, LocalDate.of(2025, 8, 2));
    turno3.confirmarTurno();

    // aplicar servicios de acuerdo a turnos
    banio.aplicarServicio();
    System.out.println("Servicio aplicado a " + mascota1.getNombre() + "\n");

    limpiezaOidos.aplicarServicio();
    System.out.println("Servicio aplicado a " + mascota2.getNombre() + "\n");

    combo.aplicarServicio();
    System.out.println("Servicio completo aplicado a " + mascota3.getNombre() + "\n");
  }
}