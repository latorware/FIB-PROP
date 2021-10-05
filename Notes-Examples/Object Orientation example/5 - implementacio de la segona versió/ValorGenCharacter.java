//package simpleGav2;

// Clase para guardar chars
public class ValorGenCharacter extends ValorGen {

  public ValorGenCharacter newValorGen() {
    return new ValorGenCharacter();
  }

  public Character valorRandom() {
      return new Character((char)('a' + Math.round(Math.random()*25)));
  }

  public Character valorFromString(String s) {
    // NOTA: Este metodo no se necesita en la implementacion actual,
    //       pero se incluye para que la clase sea mas completa
    if (s.length() == 0)
      return null;
    return new Character(s.charAt(0));
  }

  public boolean esIgual(Object v) {
    Character v1 = (Character)this.getValor();
    Character v2 = (Character)((ValorGenCharacter)v).getValor();
    return(v1.charValue() == v2.charValue());
    //return (v1.equals(v2));
  }

  public String toString() {
    String genString = "";
    genString += valor;
    return genString;
  }

}
