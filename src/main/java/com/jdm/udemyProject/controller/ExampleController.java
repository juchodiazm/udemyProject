package com.jdm.udemyProject.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdm.udemyProject.objects.Example;
import com.jdm.udemyProject.repository.ExampleRepository;

@RestController
public class ExampleController {

	@Autowired
	private ExampleRepository exampleRepository;

	@RequestMapping("/examples")
	public List<Example> getExamples() {
		return exampleRepository.findAll();
	}

	@RequestMapping("/example/{id}")
	public Example getExampleById(@PathVariable("id") BigInteger id) {
		return exampleRepository.getOne(id);
	}

	@PostMapping("/example/add")
	public void addExample(@RequestBody Example exampleToCreate) {
	
		exampleRepository.save(exampleToCreate);
	}
	@DeleteMapping("example/delete/{id}")
	public void deleteExample(@PathVariable("id")BigInteger id) {
	    exampleRepository.deleteById(id);
	}

}
