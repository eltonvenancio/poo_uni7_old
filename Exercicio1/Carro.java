class Carro{
  String fabricante;
  String modelo;
  int cor;
  int ano;
  int tanque;

  void andar(){
      if (tanque > 50)
        System.out.print ("O " + fabricante + "/" + modelo + " rodou 5 km/l...");
        else 
          System.out.print ("O " + fabricante + "/" + modelo + " rodou 10 km/l...");
  }
  
}