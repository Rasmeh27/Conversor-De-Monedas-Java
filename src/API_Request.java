import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class API_Request {
    public API_Request(Conversor conversor) throws IOException, InterruptedException {

        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingresa el valor a convertir: ");

        var valor = ingreso.nextLine();
        conversor.setValor(valor);
        String monedaInicial = conversor.getMoneda();
        String monedaDespues = conversor.getSegundaMoneda();

        String Url = String.format("https://v6.exchangerate-api.com/v6/e155edc3af87be9351e1e19e/pair/%s/%s/%s",
                monedaInicial, monedaDespues, valor);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(Url))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        //Parseo del JSON usando JsonParser y JsonObject
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

        if(jsonObject.get("result").getAsString().equals("success")) {
            Gson gson = new Gson();
            Conversor conversion = gson.fromJson(json, Conversor.class);
            System.out.println(conversion);
        }else {
            System.out.println("Error en la conversion de moneda: " +
                    jsonObject.get("error-type").getAsString());
        }
    }
}
