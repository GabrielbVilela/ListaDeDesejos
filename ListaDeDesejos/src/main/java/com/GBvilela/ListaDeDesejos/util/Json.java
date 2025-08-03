package com.GBvilela.ListaDeDesejos.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.http.HttpResponse;

public class Json {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static Object JsonBody (HttpResponse<String> resposta) {
        return gson.fromJson(resposta.body(), Object.class);
    }
}
