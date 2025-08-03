package com.GBvilela.ListaDeDesejos;

import com.GBvilela.ListaDeDesejos.util.Json;
import com.GBvilela.ListaDeDesejos.util.Requisao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListaDeDesejosApplication implements CommandLineRunner {
	@Override
	public void run(String... args) {
		var teste = Json.JsonBody(Requisao.request("http://www.omdbapi.com/?apikey=3a62b7e0&t=matrix"));
		System.out.println(teste);
	}

	public static void main(String[] args) {
		SpringApplication.run(ListaDeDesejosApplication.class, args);
	}

}
