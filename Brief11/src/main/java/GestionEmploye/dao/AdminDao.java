package GestionEmploye.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import GestionEmploye.model.Admin;

public interface AdminDao extends JpaRepository<Admin, Long>{

}
