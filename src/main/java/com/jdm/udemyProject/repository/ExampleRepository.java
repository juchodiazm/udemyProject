package com.jdm.udemyProject.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdm.udemyProject.objects.Example;

	
public interface ExampleRepository extends JpaRepository<Example, BigInteger>{

}
