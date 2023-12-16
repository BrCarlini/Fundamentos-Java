package estruturasDeDados;
/*
 * HelloWorld = Nome da classe
 * public = Tipo de acesso da classe
 * class = Tipo da classe 
 */

public class HelloWorld {

    public static void main(String[] args) {

        /*
         * Numeros (int, double, float, long)
         * Texto (String)
         * Booleanos (boolean)
         */

        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 3.14; 
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 4037437483797347L;
        String dadoDoTipoString = "Texto qualquer";
        boolean dadoDoTipoBoolean = false;

        // if - else

        // if(dadoDoTipoInt == 11){
        //     // sysout
        //     System.out.println("Entrou no if");
        // } else if(dadoDoTipoInt == 10){
        //     System.out.println("Entrou no else if");
        // }else {
        //     System.out.println("Caiu no else");
        // }


        
        // While (Enquanto a condição for verdadeira, execute o bloco)

        // int valorInicial = 0;
        // while(valorInicial < 3) {
        //     System.out.println("O valor inicial eh menor que 3");
        //     valorInicial++;
        // }
        // System.out.println("Saiu do While");


        // For
        for(int i = 0; i < 3; i++){
            System.out.println("O valor do i eh: " + i);
        }



        System.out.println("Hello World");
    }

}