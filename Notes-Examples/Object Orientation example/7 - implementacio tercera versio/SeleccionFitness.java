//package simpleGav3;

public class SeleccionFitness extends Seleccion {

  // Seleccion de un individuo (para recombinacion) en funcion del fitness
  public Individuo seleccionaIndividuo(Poblacion pobl, int numTorneos) {
    Poblacion torneo = new Poblacion(numTorneos,false);

    // Seleccion random de numTorneos individuos
    for (int i = 0; i < numTorneos; i++) {
      int randomId = (int) (Math.random() * pobl.numIndividuos());
      torneo.setIndividuo(i,pobl.getIndividuo(randomId));
    }
    // Obtiene el mas apto de los seleccionados
    Individuo fittest = torneo.individuoMasApto();
    return fittest;
  }

}
