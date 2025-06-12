package mascotapp.model;

public class Gato extends Mascota {

  // metodo constructor (super)
  public Gato(String id, String nombre, int edad, String raza,
              String comportamiento, double peso, String tamanio) {
    super(id, nombre, edad, raza, comportamiento, peso, tamanio);
  }

  // metodos
  @Override
  String tipoMascota() {
    return "Gato";
  }
}
