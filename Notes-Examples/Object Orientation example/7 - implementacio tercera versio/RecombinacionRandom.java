//package simpleGav3;

public class RecombinacionRandom extends Recombinacion {

  // Recombinacion de un individuo completamente random
  public Individuo recombinaIndividuos(Individuo indv1, Individuo indv2, double umbralRecombinacion) {
    // NOTA: Si se quiere almacenar otra cosa, hay que indicarlo aqui
    Individuo nuevoIndv = new Individuo<ValorGenCharacter>(new ValorGenCharacter());

    for (int i = 0; i < nuevoIndv.numGenes(); i++) {
      if (Math.random() <= umbralRecombinacion) {
        nuevoIndv.setGen(i,indv1.getGen(i));
      } else {
        nuevoIndv.setGen(i,indv2.getGen(i));
      }
    }
    return nuevoIndv;
  }

}
