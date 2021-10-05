//package simpleGav3;

public class RecombinacionFitness extends Recombinacion {

  // Recombinacion de un individuo
  public Individuo recombinaIndividuos(Individuo indv1, Individuo indv2, double umbralRecombinacion) {
    // NOTA: Si se quiere almacenar otra cosa, hay que indicarlo aqui
    Individuo nuevoIndv = new Individuo<ValorGenCharacter>(new ValorGenCharacter());

    double fitness1 = indv1.fitnessIndividuo();
    double fitness2 = indv2.fitnessIndividuo();
    double factorFitness = 1;
    if (fitness1 > fitness2)
      factorFitness = 1.5;
    else
      factorFitness = 0.5;

    for (int i = 0; i < nuevoIndv.numGenes(); i++) {
      if (Math.random() <= umbralRecombinacion * factorFitness) {
        nuevoIndv.setGen(i,indv1.getGen(i));
      } else {
        nuevoIndv.setGen(i,indv2.getGen(i));
      }
    }
    return nuevoIndv;
  }

}
