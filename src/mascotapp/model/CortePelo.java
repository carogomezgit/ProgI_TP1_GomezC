package mascotapp.model;

public class CortePelo implements Servicio {

  @Override
  public void aplicarServicio() {
    System.out.println("Aplicar servicio de Corte de Pelo");
  }

  @Override
  public double calcularPrecio() {
    return 12000;
  }

  // eso solo es de ayuda para obtener el nombre del servicio en la clase turno
  @Override
  public String obtenerNombreServicio() {
    return "Corte de pelo";
  }
}
