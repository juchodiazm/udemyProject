package com.jdm.udemyProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdm.udemyProject.objects.Appointment;

public interface AppointmentRepository extends JpaRepository <Appointment,Integer>{
	
	public Appointment getAppointmentByName(String name);

}
