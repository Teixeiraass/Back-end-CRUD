package com.project.service;

import com.project.model.ManagementModel;
import com.project.repositories.RepositoryManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class ManagementService {

    private Logger logger = Logger.getLogger(ManagementService.class.getName());

    @Autowired
    RepositoryManagement repository;

    public List<ManagementModel> findAll(){
        logger.info("requesting employeers");

        return repository.findAll();
    }

    public ManagementModel findById(Long id){
        logger.info("requesting employeer by id");

        return repository.findById(id).orElseThrow();
    }

    public ManagementModel create(ManagementModel model){
        logger.info("Creating new employeer");

        return repository.save(model);
    }

    public ManagementModel update(ManagementModel model){
        logger.info("Updating the employeer");

        var entity = repository.findById(model.getId()).orElseThrow();
        entity.setName(model.getName());
        entity.setSalary(model.getSalary());
        entity.setDataEntrada(model.getDataEntrada());
        entity.setDataSaida(model.getDataSaida());
        entity.setImage(model.getImage());
        entity.setOffice(model.getOffice());
        entity.setObservacoes(model.getObservacoes());

        return repository.save(model);
    }

    public void delete(Long id){
        logger.info("Deleting...");

        var entity = repository.findById(id).orElseThrow();

        repository.delete(entity);
    }



}
