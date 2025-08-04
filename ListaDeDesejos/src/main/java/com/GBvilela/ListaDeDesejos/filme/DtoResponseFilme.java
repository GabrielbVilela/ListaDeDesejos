package com.GBvilela.ListaDeDesejos.filme;

import java.util.List;

public record DtoResponseFilme(List<DtoFilmeProcurados> Search,
                               String Error) {
}
