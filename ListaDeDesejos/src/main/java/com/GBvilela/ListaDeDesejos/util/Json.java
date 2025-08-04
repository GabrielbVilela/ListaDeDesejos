package com.GBvilela.ListaDeDesejos.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Json {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static <T> T JsonBody (String api, Class<T> ClassOfT) {
        return gson.fromJson(Requisao.request(api).body(), ClassOfT);
    }
}
