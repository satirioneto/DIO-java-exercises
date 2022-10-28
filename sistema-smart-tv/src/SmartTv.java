public class SmartTv {
  // Foi criada a classe SmartTv e em seguida criamos novos atributos para ter uma iteração de estados (no caso esses abaixo são os estados iniciais)
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  // Será criado um método 'escolherCanal' com um parametro 'novoCanal'.
  public void escolherCanal(int novoCanal) {
    canal = novoCanal;
  }
  // Será criado um método 'aumentarCanal' com uma lógica definida.
  public void aumentarCanal() {
    canal++;  
  }

  public void diminuirCanal() {
    canal--;  
  }
  // Será criado um método 'aumentarVolume' com uma lógica definida.
  public void aumentarVolume() {
    // volume = volume + 1;
    volume++;
    // Sempre que o método for chamado, ele irá imprimir esse texto.
    System.out.println("Aumentando o volume para: " + volume);
  }

  public void diminuirVolume() {
    // volume = volume - 1;
    volume--;
    // Sempre que o método for chamado, ele irá imprimir esse texto.
    System.out.println("Diminuindo o volume para: " + volume);
  }

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
    
  }

}
