package com.dbpkg.digitalbook.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbpkg.digitalbook.entities.Author;
import com.dbpkg.digitalbook.service.AutherService;
import com.fse.entities.Movie;
import com.fse.services.MovieService;

@RestController
public class AuthorController {

//	@Autowired
//	public AutherService service;
	
	
		@Autowired
	    private AutherService service;
	 
	 
		@GetMapping("/Digital")
		public List<String> searchBooks(){
			//service.
			return Arrays.asList("Author","reader");
		}
	    @GetMapping()
	    public List<Author> getAllAuthors(){
	        return service.getAllAuthors();
	    }
	    
	    
	    @GetMapping("/{movieId}")
	    public Author getBookId(@PathVariable int bookid) throws Exception{
	        return service.getBookId(bookid);
	    }

	    @PostMapping("/saveAuthor")
	    public Author saveAuthor(@RequestBody Author author){
	        return service.saveAuthor(author);
	    }

//	    @PutMapping("/{movieId}")
//	    public Author updateMovie(@PathVariable int movieId, @RequestBody Author movie){
//	        return service.updateAuthor(movieId, movie);
//	    }
//
//	    @DeleteMapping("/{movieId}")
//	    public Author delete(@PathVariable int movieId){
//	        return service.delete(movieId);
//	    }
}
