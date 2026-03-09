package org.example;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConsultaMoneda {

    public JsonObject obtenerTasas() throws Exception {

        String url = "https://v6.exchangerate-api.com/v6/66de25f0f0c9c590ce00cbe2/latest/USD";

        HttpClient cliente = HttpClient.newHttpClient();

        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response =
                cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

        return json.getAsJsonObject("conversion_rates");
    }
}