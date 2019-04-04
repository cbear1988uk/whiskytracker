package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping
    public List<Distillery> getAllDistilleries(){
        return distilleryRepository.findAll();
    }

    @GetMapping(value = "/region/{region}")
    public List<Distillery> findDistilleryByRegion(@PathVariable String region){
        return distilleryRepository.findDistilleryByRegion(region);
    }

    @GetMapping(value = "/{id}")
    public List<Distillery> findDistilleryById(@PathVariable Long id){
        return distilleryRepository.findDistilleryById(id);
    }

//    @GetMapping(value = "/find-distillery-with-12-year/{age}")
//    public List<Distillery> findDistilleriesWithWhiskies12YearsOld(@PathVariable int age){
//        return distilleryRepository.findDistilleriesWithWhiskies12YearsOld(age);
//    }

}
