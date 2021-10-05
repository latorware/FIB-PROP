//package simpleGav3;

public class MutacionRandom extends Mutacion {

  // Mutacion de un individuo completamente random
  public void mutaIndividuo(Individuo indv, double tasaMutacion) {
    for (int i = 0; i < indv.numGenes(); i++) {
      if (Math.random() <= tasaMutacion) {
        // Crear gen al azar
        indv.setGenRandom(i);
      }
    }
  }

}
