package com.project.service;

import com.project.data.vo.v1.ManagementVO;
import com.project.model.DozerMapper;
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

    public List<ManagementVO> findAll(){
        logger.info("requesting employeers");

        return DozerMapper.parseListObject(repository.findAll(), ManagementVO.class);
    }

    public ManagementVO findById(Long id){
        logger.info("requesting employeer by id");

        var entity =repository.findById(id).orElseThrow();

        return DozerMapper.parseObject(entity, ManagementVO.class);
    }

    public ManagementVO create(ManagementModel model){
        logger.info("Creating new employeer");

        var entity = DozerMapper.parseObject(model, ManagementModel.class);
        var vo =DozerMapper.parseObject(repository.save(entity), ManagementVO.class);

        return vo;
    }

    public ManagementVO update(ManagementModel model){
        logger.info("Updating the employeer");

        var entity = repository.findById(model.getId()).orElseThrow();

        entity.setName(model.getName());
        entity.setSalary(model.getSalary());
        entity.setDataEntrada(model.getDataEntrada());
        entity.setDataSaida(model.getDataSaida());
        entity.setImage(model.getImage());
        entity.setOffice(model.getOffice());
        entity.setObservacoes(model.getObservacoes());

        var vo =DozerMapper.parseObject(repository.save(entity), ManagementVO.class);

        return vo;
    }

    public void delete(Long id){
        logger.info("Deleting...");

        var entity = repository.findById(id).orElseThrow();

        repository.delete(entity);
    }
}
