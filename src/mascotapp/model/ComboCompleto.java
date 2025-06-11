package mascotapp.model;

public class ComboCompleto implements Servicio {
  // esta clase utiliza todos los servicios
  private Servicio banio;
  private Servicio cortePelo;
  private Servicio limpiezaOidos;

  public ComboCompleto() {
    this.banio = new Banio();
    this.cortePelo = new CortePelo();
    this.limpiezaOidos = new LimpiezaOidos();
  }

  @Override
  public void aplicarServicio() {
    banio.aplicarServicio();
    cortePelo.aplicarServicio();
    limpiezaOidos.aplicarServicio();
  }

  @Override
  public double calcularPrecio() {
    return banio.calcularPrecio() + cortePelo.calcularPrecio() + limpiezaOidos.calcularPrecio();
  }

  // eso solo es de ayuda para obtener el nombre del servicio en la clase turno
  @Override
  public String obtenerNombreServicio() {
    return "Combo completo";
  }
}


