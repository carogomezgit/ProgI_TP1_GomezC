package mascotapp.model;

public abstract class Mascota {

  // atributos
  private String nombre;
  private int edad;
  private String raza;
  private String comportamiento;
  private double peso;
  private String tamanio;
  private final String id;

  // metodo constructor
  public Mascota(String id, String nombre, int edad, String raza,
                 String comportamiento, double peso, String tamanio) {
    this.id = id;
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
    this.comportamiento = comportamiento;
    this.peso = peso;
    this.tamanio = tamanio;
  }

  // getters y setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getComportamiento() {
    return comportamiento;
  }

  public void setComportamiento(String comportamiento) {
    this.comportamiento = comportamiento;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public String getTamanio() {
    return tamanio;
  }

  public void setTamanio(String tamanio) {
    this.tamanio = tamanio;
  }


  // metodos
  abstract String tipoMascota();

  @Override
  public String toString() {
    return "ID: " + id
        + "\nNombre de mascota: " + nombre
        + "\nEdad: " + edad
        + "\nRaza: " + raza
        + "\nComportamiento: " + comportamiento
        + "\nTipo de Mascota: " + tipoMascota() + "\n";
  }

  public void mostrarFicha() {
    System.out.println(toString());
  }
}
