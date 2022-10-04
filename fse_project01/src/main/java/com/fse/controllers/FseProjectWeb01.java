package com.fse.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FseProjectWeb01 {
	
	@GetMapping("/Welcome")
	public List<String> getMessage(){
		List<String> s1=Arrays.asList("Spring","Angular","AWS","Kakfa","Java");
		
		for(Object s2: s1) {
			System.out.println(s2);
		}
		return s1;
	}
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	
	

}
