package mascotapp.model;

public abstract class Mascota {

  // atributos
  private String nombre;
  private int edad;
  private String raza;
  private String comportamiento;
  private final String id;

  // metodo constructor
  public Mascota(String nombre, int edad, String raza, String comportamiento, String id){
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
    this.comportamiento = comportamiento;
    this.id = id;
  }

  // setters y getters
  public String getNombre(){
    return nombre;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public int getEdad(){
    return edad;
  }
  public void setEdad(int edad){
    this.edad = edad;
  }

  public String getRaza(){
    return raza;
  }
  public void setRaza(String raza){
    this.raza = raza;
  }

  public String getComportamiento(){
    return comportamiento;
  }
  public void setComportamiento(String comportamiento){
    this.comportamiento = comportamiento;
  }

  // metodos
  abstract String tipoMascota();

  public String toString(){
    return "Nombre de mascota: " + nombre
        + "\n Edad: " + edad
        + "\n Raza: " + raza
        + "\n Comportamiento: " + comportamiento
        + tipoMascota();
  }

  public void mostrarFicha(){
    System.out.println(toString());
  }
}
