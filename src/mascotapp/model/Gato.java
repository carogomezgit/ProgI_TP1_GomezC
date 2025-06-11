package mascotapp.model;

public class Gato extends Mascota {

  private double peso;
  private double tamanio;

  // metodo constructor (super)
  public Gato(String nombre, int edad, String raza,
              String comportamiento, String id, double peso, double tamanio) {
    super(id, nombre, edad, raza, comportamiento);
    this.peso = peso;
    this.tamanio = tamanio;
  }

  // getters y setters
  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getTamanio() {
    return tamanio;
  }

  public void setTamanio(double tamanio) {
    this.tamanio = tamanio;
  }

  // metodos
  @Override
  public String toString() {
    return "Peso: " + peso
        + "\nTamaño " + tamanio;
  }

  @Override
  String tipoMascota() {
    return "Gato";
  }
}
