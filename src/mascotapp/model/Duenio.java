package mascotapp.model;

public class Duenio {

  // atributos
  private String nombreDuenio;
  private String telefono;
  private Mascota[] mascotas = new Mascota[4];
  private int cantMascotas;

  // metodo constructor
  public Duenio(String nombreDuenio, String telefono){
    this.nombreDuenio = nombreDuenio;
    this.telefono = telefono;
    this.mascotas = mascotas;
    this.cantMascotas = 0;
  }

  // metodos
  public void agregarMascota(Mascota m){
    if (cantMascotas < 4){
      mascotas [cantMascotas] = m;
    } else{
      System.out.println("Has excedido la cantidad de mascotas a agregar");
      System.out.println("Máximo de mascotas: 4");
    }
  }

  public void mostrarMascotas(){
    for(int i = 0; i < cantMascotas; i++){
      mascotas[i].mostrarFicha();
    }

  }


}
