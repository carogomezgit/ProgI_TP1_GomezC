package mascotapp;

import mascotapp.model.Gato;
import mascotapp.model.Mascota;
import mascotapp.model.Perro;

public class Main {
  public static void main(String[] args) {

    // crear objetos
    Mascota mascota1 = new Perro("Shelly", 4, "Collie", "caminar", "01", 34.2, 56.1);
    Mascota mascota2 = new Gato("Kuki", 3, "Ragdoll", "ronronear", "02", 6.4, 24);
    Mascota mascota3 = new Perro();
    Mascota mascota4 = new Gato();
    Mascota mascota5 = new Perro();




  }
}