package com.mob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mob.op.PostOfficeResponceBean;
import com.mob.serv.PostService;

@RestController
@RequestMapping("/indian")
public class PostController {
	
	@Autowired
	PostService postService;
	
	@GetMapping(value="/post/{city}",consumes=MediaType.ALL_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getByCity(@PathVariable("city") String city)
	{
		PostOfficeResponceBean postOfficeResponceBean=postService.getByCity(city);
		return new ResponseEntity<>(postOfficeResponceBean,HttpStatus.OK);
	} 

}
