import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Interacao interacao = new Interacao();
        int opcao = 0;
        int valorAconverte = 0;


        String menu = """
                Seja bem-vindo ao conversor de moedas 
                
                Escolha uma opção:
                
                1) Dolar ==> Real brasileiro
                2) Real brasileiro ==> Peso argentino
                3) Euro ==> Real brasileiro
                4) Euro ==> dolar
                5) Real brasileiro ==> Romanian Leu
                6) Dolar ==> Peso argentino
                7) Sair
                """;

        while (opcao != 7){
            System.out.println("************************************");
            System.out.println(menu);
            System.out.println("************************************");

            System.out.println("Digite:");
            opcao = leitura.nextInt();

            if( opcao > 7 || opcao <= 0){
                System.out.println("Opção invalida tente novamente");
            } else if(opcao !=7){
                System.out.println("Quanto você quer converter:");
                valorAconverte = leitura.nextInt();
                String n = interacao.interagindo(opcao, valorAconverte);
                System.out.println(n);
            }

        }

        System.out.println("Fim!");




    }
}