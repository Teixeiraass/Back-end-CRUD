package com.project.controller;

import com.project.data.vo.v1.ManagementVO;
import com.project.model.ManagementModel;
import com.project.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/management/api")
public class ManagementController {

    @Autowired
    private ManagementService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ManagementVO> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}",
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public ManagementVO findById(@PathVariable(value = "id") Long id){
        return service.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public ManagementVO create(@RequestBody ManagementModel modal){
        return service.create(modal);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public ManagementVO update(@RequestBody ManagementModel modal){
        return service.update(modal);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
