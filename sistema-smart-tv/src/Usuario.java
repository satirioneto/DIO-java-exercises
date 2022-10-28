public class Usuario {
    public static void main(String[] args) throws Exception {
        // Chama a classe 'SmartTv' (similar a um tipo boolean, int, double) e definide o objeto 'smartTv' (similar a uma variável)
        // A 'nova Smart TV' (new SmartTv()) possui caracteristicas próprias, sendo uma filha (herança)
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.escolherCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);    

        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("TV Ligada? "  + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status -> TV Ligada? "  + smartTv.ligada);
    
        smartTv.desligar ();
        System.out.println("Novo status -> TV Ligada? "  + smartTv.ligada);
    }
}
