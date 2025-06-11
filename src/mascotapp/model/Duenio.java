package mascotapp.model;

public class Duenio {

  // atributos
  private String nombre;
  private String telefono;
  private Mascota[] mascotas = new Mascota[4];
  private int cantMascotas;

  // metodo constructor
  public Duenio(String nombre, String telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
    this.mascotas = mascotas;
    this.cantMascotas = 0;
  }

  // getters y setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  // metodos
  @Override
  public String toString() {
    return "Dueño: " + nombre + ", Teléfono: " + telefono;
  }

  public void mostrarInfoDuenio() {
    System.out.println(toString());
  }

  public void agregarMascota(Mascota m) {
    if (cantMascotas < 4) {
      mascotas[cantMascotas] = m;
    } else {
      System.out.println("Has excedido la cantidad de mascotas a agregar");
      System.out.println("Máximo de mascotas: 4");
    }
  }

  public void mostrarMascotas() {
    for (int i = 0; i < cantMascotas; i++) {
      mascotas[i].mostrarFicha();
    }
  }
}