//package simpleGav3;

public class Poblacion {

  // Datos
  private Individuo[] individuos;

  // Constructor
  public Poblacion(int tamanyo, boolean inicializa) {
    individuos = new Individuo[tamanyo];
    // Inicializa la poblacion
    if (inicializa) {
      for (int i = 0; i < numIndividuos(); i++) {
        // NOTA: Si se quiere almacenar otra cosa, hay que indicarlo aqui
        Individuo nuevoIndv = new Individuo<ValorGenCharacter>(new ValorGenCharacter());
        nuevoIndv.inicializaIndividuo();
        setIndividuo(i,nuevoIndv);
      }
    }
  }

  // Numero de individuos
  public int numIndividuos() {
    return individuos.length;
  }

  // Obtener el individuo de una posicion concreta
  public Individuo getIndividuo(int indice) {
    return individuos[indice];
  }

  // Informar el individuo de una posicion concreta
  public void setIndividuo(int indice, Individuo indv) {
    individuos[indice] = indv;
  }

  /////////////////////////////////////
  // Metodos especificos del genetico
  /////////////////////////////////////

  // Individuo mas apto
  public Individuo individuoMasApto() {
    Individuo fittest = individuos[0];
    for (int i = 0; i < numIndividuos(); i++) {
      if (fittest.fitnessIndividuo() <=
            getIndividuo(i).fitnessIndividuo()) {
        fittest = getIndividuo(i);
      }
    }
    return fittest;
  }

}
