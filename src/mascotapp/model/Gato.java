package mascotapp.model;

public class Gato extends Mascota{

  double peso;
  double tamanio;

  // metodo constructor (super)
  public Gato(String nombre, int edad, String raza, String comportamiento, String id, double peso, double tamanio){
    super(nombre, edad, raza, comportamiento, id);
    this.peso = peso;
    this.tamanio = tamanio;
  }

  // getters y setters
  public double getPeso(){
    return peso;
  }
  public void setPeso(double peso){
    this.peso = peso;
  }

  public double getTamanio(){
    return tamanio;
  }
  public void setTamanio(double tamanio){
    this.tamanio = tamanio;
  }

  // metodos
  @Override
  String tipoMascota() {
    return "Tipo de mascota: Perro \n Peso: "
        + peso + "\n Tamano: " + tamanio;
  }
}
