package mascotapp.model;

public class Banio implements Servicio{

  @Override
  public void aplicarServicio() {
    System.out.println("Aplicar servicio de Baño a");
  }

  @Override
  public double calcularPrecio() {
    return 15000;
  }
}
