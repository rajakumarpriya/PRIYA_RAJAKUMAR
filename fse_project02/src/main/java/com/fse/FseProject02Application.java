package com.fse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fse.entities.Movie;
import com.fse.services.MovieService;

@SpringBootApplication
public class FseProject02Application implements CommandLineRunner {

	@Autowired
	public MovieService service;
	
	public void run(String... args) throws Exception {
		service.saveMovie(new Movie("Superman", "Miley", 4.4));
		service.saveMovie(new Movie("Spiderman", "Clark", 4.4));
		service.saveMovie(new Movie("Ironman", "Tom", 4.4));
		service.saveMovie(new Movie("Antman", "John", 4.4));
		service.saveMovie(new Movie("Heman", "Mike", 4.4));
	}
	

	
	public static void main(String[] args) {
		SpringApplication.run(FseProject02Application.class, args);
	}

}
