package com.generation.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello, World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Persistência, orientação ao futuro, responsabilidade pessoal, mentalidade de crescimento.";
	}
	
	@GetMapping("/aprendizado")
	public String aprendizado() {
		return "Meus objetivos de aprendizagem para a semana são estudar mais SQL, começar a aprender Spring sem problemas e continuar melhorando minhas habilidades relacionadas a currículo, entrevistas e busca de emprego.";
	}

}
