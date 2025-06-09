package mascotapp;

import mascotapp.model.Duenio;
import mascotapp.model.Gato;
import mascotapp.model.Mascota;
import mascotapp.model.Perro;

public class Main {
  public static void main(String[] args) {

    // crear objetos Mascota
    Mascota mascota1 = new Perro("Shelly", 4, "Collie", "caminar", "01", 34.2, 56.1);
    Mascota mascota2 = new Gato("Kuki", 3, "Ragdoll", "ronronear", "02", 6.4, 24);
    Mascota mascota3 = new Perro();

    // crear objetos Dueño
    Duenio duenio1 = new Duenio("Juli","2848247723");
    Duenio duenio2 = new Duenio("Scoops", "4738246778");


  }
}