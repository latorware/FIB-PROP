//package simpleGav3;

public class Evolucion {

  private static final boolean elitismo = true;
  // NOTA: Si se quiere cambiar la seleccion, hay que indicarlo aqui
  private static Seleccion seleccion = new SeleccionFitness();  // equivalente a la de GeneticoV2
  //private static Seleccion seleccion = new SeleccionRandom();   // nueva (es un ejemplo)
  private static final int numTorneos = 5;
  // NOTA: Si se quiere cambiar la recombinacion, hay que indicarlo aqui
  private static Recombinacion recombinacion = new RecombinacionRandom();  // equivalente a la de GeneticoV2
  //private static Recombinacion recombinacion = new RecombinacionFitness();   // nueva (es un ejemplo)
  private static final double umbralRecombinacion = 0.5;
  // NOTA: Si se quiere cambiar la mutacion, hay que indicarlo aqui
  private static Mutacion mutacion = new MutacionRandom();  // equivalente a la de GeneticoV2
  //private static Mutacion mutacion = new MutacionFitness();   // nueva (es un ejemplo)
  private static final double tasaMutacion = 0.015;
    
  // Evolucion de una poblacion
  // NOTA: Alternativa - Los parametros podrian ser atributos de las clases
  // NOTA: Alternativa - El metodo evolucionaPoblacion podria ser estatico
  public Poblacion evolucionaPoblacion (Poblacion poblacion) {
    Poblacion nuevaPoblacion = new Poblacion(poblacion.numIndividuos(),false);

    // Guarda el mejor individuo
    int indiceMejor;
    if (elitismo) {
      nuevaPoblacion.setIndividuo(0,poblacion.individuoMasApto());
      indiceMejor = 1;
    } else {
      indiceMejor = 0;
    }

    // Recombinacion
    for (int i = indiceMejor; i < poblacion.numIndividuos(); i++) {
      Individuo indv1 = seleccion.seleccionaIndividuo(poblacion,numTorneos);
      Individuo indv2 = seleccion.seleccionaIndividuo(poblacion,numTorneos);
      Individuo nuevoIndv = recombinacion.recombinaIndividuos(indv1,indv2,umbralRecombinacion);
      nuevaPoblacion.setIndividuo(i,nuevoIndv);
    }

    // Mutacion
    for (int i = indiceMejor; i < nuevaPoblacion.numIndividuos(); i++) {
      mutacion.mutaIndividuo(nuevaPoblacion.getIndividuo(i),tasaMutacion);      
    }

    return nuevaPoblacion;
  }

}
