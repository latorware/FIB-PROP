//package simpleGav3;

public class GA {

  private static final int maxGeneraciones = 1000;
  private static final int nIndividuosPoblacion = 50;

  public void algoritmoGenetico() {
    // Evolucion
    Evolucion evolucion = new Evolucion();

    // Solucion
    CalculoFitness.defineSolucionRandom();

    // Crear poblacion inicial
    Poblacion poblacion = new Poblacion(nIndividuosPoblacion,true);

    // Evolucionar la poblacion hasta conseguir encontrar el mas adaptado
    int generacion = 0;
    while (generacion < maxGeneraciones &&
           poblacion.individuoMasApto().fitnessIndividuo() < CalculoFitness.maxFitness()) {
      System.out.println("Generacion: " + generacion +
                         " Fittest: " + poblacion.individuoMasApto().fitnessIndividuo());
      poblacion = evolucion.evolucionaPoblacion (poblacion);
      generacion++;
    }
    System.out.println("Generacion: " + generacion +
                       " Fittest: " + poblacion.individuoMasApto().fitnessIndividuo());

    // Resultados
    System.out.println("Genes de la solucion:");
    System.out.println(CalculoFitness.stringSolucion());
    System.out.println("Genes del mejor individuo encontrado en la generacion " + generacion + ":");
    System.out.println(poblacion.individuoMasApto().toString());
    double diferencia = CalculoFitness.maxFitness() - poblacion.individuoMasApto().fitnessIndividuo();
    System.out.println("Diferencia de fitness con respecto a la solucion real: " + diferencia);
  }

}
