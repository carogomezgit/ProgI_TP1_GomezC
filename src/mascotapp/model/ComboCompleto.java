package mascotapp.model;

public class ComboCompleto implements Servicio{
  // esta clase utiliza todos los servicios

  @Override
  public void aplicarServicio() {
    System.out.println("Aplicando combo completo a ");
  }

  @Override
  public double calcularPrecio() {
    return 40000;
  }
}
