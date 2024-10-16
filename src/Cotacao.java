import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Cotacao {
    private String keyApi = "3e40e063a82cabd5f2d2117e";

    public Resultado buscarCotacao(String m1, String m2){
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(URI.create("https://v6.exchangerate-api.com/v6/" + keyApi + "/pair/"+ m1 + "/" + m2)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Resultado.class);
        } catch (Exception e) {
            throw new RuntimeException("erro!!!!!");
        }

    }
}
