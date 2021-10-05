//package simpleGav3;

public abstract class ValorGen {

  // Datos
  protected Object valor;

  /////////////////////////
  // Metodos implementados
  /////////////////////////

  // Obtener el valor
  public Object getValor() {
    return valor;
  }
  // Informar el valor
  public void setValor(Object v) {
    valor = v;
  }

  //////////////////////
  // Metodos abstractos
  //////////////////////

  // Nuevo objeto de la clase
  public abstract Object newValorGen();
  // Nuevo valor para el objeto: random
  public abstract Object valorRandom();
  // Nuevo valor para el objeto: a partir del parametro
  public abstract Object valorFromString(String s);
  // Comparacion de los valores de dos objetos de la clase
  public abstract boolean esIgual(Object v);
  // String con la informacion del objeto
  public abstract String toString();

}
