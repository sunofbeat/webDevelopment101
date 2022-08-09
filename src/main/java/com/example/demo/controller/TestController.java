package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TestRequestBodyDTO;

@RestController
@RequestMapping("tset")

public class TestController {
	@GetMapping("/testRequestBody")
	public String testControllerRequestBody(@RequestBody TestRequestBodyDTO
			testRequestBodyDTO)
	{
	return "Hello Wordl! ID " + testRequestBodyDTO.getId() + "Message : " + testRequestBodyDTO.getMessage();
	}
}
