package mascotapp.model;

public class LimpiezaOidos implements Servicio{

  @Override
  public void aplicarServicio() {
    System.out.println("Aplicando servicio de Limpieza de Oídos a");
  }

  @Override
  public double calcularPrecio() {
    return 10000;
  }
}
