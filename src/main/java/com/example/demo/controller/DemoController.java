package com.example.demo.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/apitest")
public class DemoController {

    @PostMapping("/getlist")
    public String createData(@RequestParam Map<String, Object> allParams) {
    	ObjectMapper mapper = new ObjectMapper();
    	String json;
    	try {
    		json = mapper.writeValueAsString(allParams);
    	} catch(IOException e) {
    		json = "error";
    	}
    	
    	return json;
    }
	
    @GetMapping("/getstring/{flag}")
    public String getString(@PathVariable String flag) {
    	
    	return "(" + flag + ") completed";
    }
}
