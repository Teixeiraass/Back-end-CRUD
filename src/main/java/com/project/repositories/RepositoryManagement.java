package com.project.repositories;

import com.project.model.ManagementModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryManagement extends JpaRepository<ManagementModel, Long> {}
