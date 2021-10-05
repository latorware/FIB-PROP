//package simpleGav3;

// Clase para guardar bytes
public class ValorGenByte extends ValorGen {

  public ValorGenByte newValorGen() {
    return new ValorGenByte();
  }

  public Byte valorRandom() {
    return new Byte((byte)Math.round(Math.random()));
  }

  public Byte valorFromString(String s) {
    // NOTA: Este metodo no se necesita en la implementacion actual,
    //       pero se necesita para que la clase sea mas completa
    if (s.length() == 0)
      return null;
    String c = s.substring(0,1);
    if (c.equals("0") || c.equals("1"))
      return new Byte(c);
    return null;
  }

  public boolean esIgual(Object v) {
    Byte v1 = (Byte)this.getValor();
    Byte v2 = (Byte)((ValorGenByte)v).getValor();
    return (v1.byteValue() == v2.byteValue());
  }

  public String toString() {
    String genString = "";
    genString += valor;
    return genString;
  }

}
