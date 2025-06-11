package mascotapp;

import java.time.LocalDate;
import mascotapp.model.*; // el import es mas simple de esta manera (checkstyle)

public class Main {
  public static void main(String[] args) {

    // crear objetos Mascota
    Mascota mascota1 = new Perro("Shelly", 4, "Collie", "Caminar", "01", 34.2, 56.1);
    Mascota mascota2 = new Gato("Kuki", 3, "Ragdoll", "Ronronear", "02", 6.4, 24);
    Mascota mascota3 = new Gato("Michi", 2, "Mestizo", "Comer", "03", 6, 22);

    // crear objetos Dueño
    Duenio duenio1 = new Duenio("Juli", "2848247723");
    Duenio duenio2 = new Duenio("Scoops", "4738246778");

    // mostrar fichas de mascotas
    mascota1.mostrarFicha();
    mascota2.mostrarFicha();
    mascota3.mostrarFicha();

    // asignar mascotas a dueños
    duenio1.agregarMascota(mascota1);
    duenio2.agregarMascota(mascota2);
    duenio1.agregarMascota(mascota3);

    // cantidad de mascotas por cada dueño (en este caso 2 dueños)
    duenio1.mostrarMascotas();
    duenio2.mostrarMascotas();

    // crear servicios y asignar turnos a mascotas
    Servicio banio = new Banio();
    Servicio cortePelo = new CortePelo();
    Servicio limpiezaOidos = new LimpiezaOidos();
    Servicio combo = new ComboCompleto();

    Turno turno1 = new Turno(mascota1, duenio1, limpiezaOidos, LocalDate.of(2025, 6, 20));
    Turno turno2 = new Turno(mascota2, duenio1, combo, LocalDate.of(2025, 7, 18));

    // mostrar turnos
    turno1.mostrarDetalle();
    turno2.mostrarDetalle();
  }
}