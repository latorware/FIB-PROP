//package simpleGav3;

public class SeleccionRandom extends Seleccion {

  // Seleccion de un individuo (para recombinacion) completamente random
  public Individuo seleccionaIndividuo(Poblacion pobl, int numTorneos) {
    // Seleccion random de numTorneos numeros aleatorios
    int randomId = 0;
    for (int i = 0; i < numTorneos; i++) {
      randomId = (int) (Math.random() * pobl.numIndividuos());
    }
    // Obtiene el mas apto de los seleccionados
    Individuo fittest = pobl.getIndividuo(randomId);
    return fittest;
  }

}
