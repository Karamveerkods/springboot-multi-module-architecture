package com.karamveer.service.doctor;

import com.karamveer.dao.doctor.DoctorRepository;
import com.karamveer.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @PostConstruct
    private void init(){
        doctorRepository.saveAll(Stream.of(new Doctor(101,"Karamveer","Cardiac"),new Doctor(102,"Peter","Eye")).collect(Collectors.toList()));
    }

    public List<Doctor> getDoctors(){
        return doctorRepository.findAll();
    }

}
