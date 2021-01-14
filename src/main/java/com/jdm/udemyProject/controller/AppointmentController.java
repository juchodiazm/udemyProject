package com.jdm.udemyProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdm.udemyProject.objects.Appointment;
import com.jdm.udemyProject.repository.AppointmentRepository;

@RestController
public class AppointmentController {

	@Autowired
	private AppointmentRepository appointmentRepository;

	@GetMapping("/appointments/")
	public List<Appointment> getAllAppointments() {
		return appointmentRepository.findAll();
	}

	@GetMapping("/appointment/{name}")
	public Appointment getAppointmentByName(@PathVariable("name") String name) {
		return appointmentRepository.getAppointmentByName(name);
	}

	@PostMapping("/appointment/add")
	public void addAppointment(@RequestBody Appointment appointment) {
		appointmentRepository.save(appointment);
	}

	@DeleteMapping("/appointment/delete/{id}")
	public void deleteApopointmentById(@PathVariable("id") Integer id) {
		appointmentRepository.deleteById(id);
	}

}
