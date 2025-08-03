package com.GBvilela.ListaDeDesejos.util;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requisao {

    private static final HttpClient client = HttpClient.newBuilder().build();

    public static HttpResponse<String> request(String link) {
         HttpRequest request = HttpRequest.newBuilder().uri(URI.create(link)).build();
        try {
            return client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
