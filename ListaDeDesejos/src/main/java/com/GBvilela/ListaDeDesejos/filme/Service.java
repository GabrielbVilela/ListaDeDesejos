package com.GBvilela.ListaDeDesejos.filme;

import com.GBvilela.ListaDeDesejos.util.Json;

public class Service {
    private final static String linkBase = "http://www.omdbapi.com/?apikey=3a62b7e0&";

    public static Object ProcuraFilme (String titulo) {
        var filme = Json.JsonBody(linkBase + "s=" + titulo, DtoResponseFilme.class);
        if (filme.Error() != null) {
            return EscolherFilme(titulo, false);
        }
        return filme;
    }

    public static Object EscolherFilme (String titulo, boolean IsId) {
        String tipo = IsId ? "i=" : "t=";
        return Json.JsonBody(linkBase + tipo + titulo, DtoFilmeEscolhido.class);
    }

}
