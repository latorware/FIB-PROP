//package simpleGav3;

import java.util.*;

public class Individuo<PValorGen extends ValorGen> {

  // Datos
  private static final int numGenesPorDefecto = 64;
  private Vector<PValorGen> genes;

  // Para aumentar eficiencia
  private double fitness = 0;
  // Para poder hacer new de PValorGen (new PValorGen() da error)
  private PValorGen valorGen;

  // Constructor
  public Individuo (PValorGen valGen) {
    valorGen = valGen;
    genes = new Vector<PValorGen>();
    for (int indice=0; indice<numGenesPorDefecto; indice++) {
      PValorGen valor = (PValorGen)valorGen.newValorGen();
      genes.add(valor);
    }
  }

  // Numero de genes
  public int numGenes() {
    return genes.size();
  }

  // Obtener el gen de una posicion concreta
  public PValorGen getGen(int indice) {
    return genes.get(indice);
  }

  // Informar el gen de una posicion concreta
  public void setGen(int indice, PValorGen valor) {
    genes.set(indice,valor);
    fitness = 0;
  }

  // Informar el gen de una posicion concreta con un valor random
  public void setGenRandom(int indice) {
    PValorGen gen = (PValorGen)valorGen.newValorGen();
    gen.setValor(valorGen.valorRandom());
    setGen(indice,gen);
  }

  // Inicializar individuo con valores random
  public void inicializaIndividuo() {
    for (int i = 0; i < numGenes(); i++) {
      setGenRandom(i);
    }
  }

  // String con la informacion del individuo
  public String toString() {
    String genString = "";
    for (int i = 0; i < numGenes(); i++) {
      genString += getGen(i).toString();
    }
    return genString;
  }

  /////////////////////////////////////
  // Metodos especificos del genetico
  /////////////////////////////////////

  // Fitness
  public double fitnessIndividuo() {
    if (fitness == 0) {
      fitness = CalculoFitness.fitnessIndividuo(this);
    }
    return fitness;
  }

}
