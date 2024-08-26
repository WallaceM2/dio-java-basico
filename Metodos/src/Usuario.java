public class Usuario {
    public static void main(String[] args) {
        
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("Canal atual: " + smartTV.canal);

        smartTV.mudarCanal(99);
        System.out.println("Canal atual: " + smartTV.canal);
        
        System.out.println("TV ligada? " + smartTV.ligada);
       
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo status -> TV Ligada: " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status -> TV Ligada: " + smartTV.ligada);
    }
}
