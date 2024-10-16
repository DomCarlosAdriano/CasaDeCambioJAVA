public class Interacao {
    public String interagindo(int opcao, double valorAconverter){
        Cotacao conversor = new Cotacao();
        double calculo = valorAconverter;
        String aux = " ";

        switch (opcao){
            case 1:
                Resultado a = conversor.buscarCotacao("USD", "BRL");
                aux = " " + a.conversion_rate();
                calculo *=  Double.parseDouble(aux);

                return valorAconverter + " em Dolar = " + calculo + " em Real brasileiro " ;

            case 2:
                Resultado b = conversor.buscarCotacao("BRL", "ARS");
                aux = " " + b.conversion_rate();
                calculo *=  Double.parseDouble(aux);
                return valorAconverter + " em Real brasileiro = " + calculo + " em Peso argentino";

            case 3:
                Resultado c =conversor.buscarCotacao("EUR", "BRL" );
                aux = " " + c.conversion_rate();
                calculo *=  Double.parseDouble(aux);
                return valorAconverter + " em Euro = " + calculo + " em Real brasileiro ";

            case 4:
                Resultado d = conversor.buscarCotacao("EUR", "USD");
                aux = " " + d.conversion_rate();
                calculo *=  Double.parseDouble(aux);
                return valorAconverter + " em Euro = " + calculo + " em dolar";

            case 5:
                Resultado e = conversor.buscarCotacao("BRL", "RON");
                aux = " " + e.conversion_rate();
                calculo *=  Double.parseDouble(aux);
                return valorAconverter + " em Real brasileiro = " + calculo + " em Romanian Leu ";

            case 6:
                Resultado f = conversor.buscarCotacao("USD", "ARS");
                aux = " " + f.conversion_rate();
                calculo *=  Double.parseDouble(aux);
                return valorAconverter + " em Dolar =" + calculo+ " em Peso argentino";
            default:
                return null;



        }
    }
}
