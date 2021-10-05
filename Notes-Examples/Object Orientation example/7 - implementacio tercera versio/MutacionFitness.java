//package simpleGav3;

public class MutacionFitness extends Mutacion {

  // Mutacion de un individuo en funcion del fitness
  public void mutaIndividuo(Individuo indv, double tasaMutacion) {
    double pctDiferencia =
      (CalculoFitness.maxFitness() - indv.fitnessIndividuo()) / CalculoFitness.maxFitness();
    for (int i = 0; i < indv.numGenes(); i++) {
      if (Math.random() <= tasaMutacion * pctDiferencia) {
        // Crear gen al azar
        indv.setGenRandom(i);
      }
    }
  }

}
