package mascotapp.model;

public class CortePelo implements Servicio{

  @Override
  public void aplicarServicio() {
    System.out.println("Aplicar servicio de Corte de Pelo a ");
  }

  @Override
  public double calcularPrecio() {
    return 12000;
  }
}
