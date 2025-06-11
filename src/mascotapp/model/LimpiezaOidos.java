package mascotapp.model;

public class LimpiezaOidos implements Servicio{

  @Override
  public void aplicarServicio() {
    System.out.println("Aplicando servicio de Limpieza de Oídos");
  }

  @Override
  public double calcularPrecio() {
    return 10000;
  }

  // eso solo es de ayuda para obtener el nombre del servicio en la clase turno
  @Override
  public String obtenerNombreServicio() {
    return "Limpieza de oídos";
  }
}
