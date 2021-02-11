class Main {
  public static void main (String[] args){
    Carro c1 = new Carro();
    c1.fabricante = "Volkswagen";
    c1.modelo = "Polo";
    c1.ano = 2018;
    c1.tanque = 50;
    c1.andar();

    Carro c2 = new Carro();
    c2.fabricante = "Ford";
    c2.modelo = "Fusion";
    c2.ano = 2015;
    c2.tanque = 100;
    c2.andar();
  }
}