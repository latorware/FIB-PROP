//package simpleGav2;

public class CalculoFitness {

  // Datos
  private Individuo solucion;

  // Creacion de la solucion
  public void defineSolucionRandom() {
    // NOTA: Si se quiere almacenar otra cosa, hay que indicarlo aqui
    solucion = new Individuo<ValorGenCharacter>(new ValorGenCharacter());
    solucion.inicializaIndividuo();
  }

  // String con la solucion
  public String stringSolucion() {
    return solucion.toString();
  }

  // Maxima fitness posible
  public double maxFitness() {
    return (double)solucion.numGenes();
  }

  // Calculo de la fitness para un individuo
  public double fitnessIndividuo(Individuo individuo) {
    int fitness = 0;   
    for (int i = 0; i < individuo.numGenes() && i < solucion.numGenes(); i++) {
      if (individuo.getGen(i).esIgual(solucion.getGen(i))) {
        fitness++;
      }
    }
    return (double)fitness;
  }
}

