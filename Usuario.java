
public class Usuario {
public static void main(String[] args) {

    Smarttv smarttv = new Smarttv();
    
    smarttv.diminuirVolume();
    smarttv.diminuirVolume();
    smarttv.diminuirVolume();   

    System.out.println("Volume atual é " + smarttv.volume);

    
    smarttv.ligar();
    System.out.println("A tv está ligada? "+smarttv.ligada);

    smarttv.desligar();
     System.out.println("A tv está ligada? "+smarttv.ligada);

     System.out.println(" Qual canal está? "+smarttv.canal);
    smarttv.mudarCanal(13);
    System.out.println(" Mudou para qual canal? "+smarttv.canal);
    
    


}
}
