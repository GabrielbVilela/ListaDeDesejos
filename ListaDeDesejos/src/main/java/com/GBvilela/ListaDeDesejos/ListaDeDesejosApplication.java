package com.GBvilela.ListaDeDesejos;

import com.GBvilela.ListaDeDesejos.filme.Service;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListaDeDesejosApplication implements CommandLineRunner {
	@Override
	public void run(String... args) {
		System.out.println(Service.ProcuraFilme("up"));
	}

	public static void main(String[] args) {
		SpringApplication.run(ListaDeDesejosApplication.class, args);
	}

}
