package mascotapp.model;



public class Banio implements Servicio {

  @Override
  public void aplicarServicio() {
    System.out.println("Aplicar servicio de Baño...");
  }

  @Override
  public double calcularPrecio() {
    return 15000.0;
  }

  // eso solo es de ayuda para obtener el nombre del servicio en la clase turno
  @Override
  public String obtenerNombreServicio() {
    return "Baño";
  }
}
