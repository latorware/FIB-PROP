//package simpleGav3;

public class CalculoFitness {

  // Datos
  private static Individuo solucion;

  // Creacion de la solucion
  public static void defineSolucionRandom() {
    // NOTA: Si se quiere almacenar otra cosa, hay que indicarlo aqui
    solucion = new Individuo<ValorGenCharacter>(new ValorGenCharacter());
    solucion.inicializaIndividuo();
  }

  // String con la solucion
  public static String stringSolucion() {
    return solucion.toString();
  }

  // Maxima fitness posible
  public static double maxFitness() {
    return (double)solucion.numGenes();
  }

  // Calculo de la fitness para un individuo
  public static double fitnessIndividuo(Individuo individuo) {
    int fitness = 0;   
    for (int i = 0; i < individuo.numGenes() && i < solucion.numGenes(); i++) {
      if (individuo.getGen(i).esIgual(solucion.getGen(i))) {
        fitness++;
      }
    }
    return (double)fitness;
  }
}

