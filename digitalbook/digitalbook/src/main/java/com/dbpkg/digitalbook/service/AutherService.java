package com.dbpkg.digitalbook.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dbpkg.digitalbook.entities.Author;
import com.dbpkg.digitalbook.repository.AuthorRespository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class AutherService {

	@Autowired
	public AuthorRespository repo;
    
    public List<Author> getAllMovies(){
        return repo.findAll();
    }

    public Author getMovieById(int movieId) throws Exception{
        Optional<Author> optional = repo.findById(movieId);

        if(optional.isEmpty()){
            throw new Exception("Movie not found with id: "+movieId);
        } else {
            return optional.get();
        }
    }

    public Author saveMovie(Author movie){
        return repo.save(movie);
    }

    public Author updateMovie(int id, Author movie){
        return null;
    }

    public Author delete(int movieId){
        return null;
    }
    
}
