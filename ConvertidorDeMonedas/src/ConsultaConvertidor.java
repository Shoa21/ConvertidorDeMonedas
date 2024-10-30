import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class ConsultaConvertidor {

    public Conversion realizarConversion(String origen, String deseado) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/13a84e441bd784e7afa64b17/pair/"
                + origen + "/" + deseado);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {
            throw new RuntimeException("Esa conversion no existe");
        }
    }
}
