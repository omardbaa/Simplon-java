package GestionEmploye.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import GestionEmploye.model.Employe;

public interface EmployeeDao extends JpaRepository<Employe, Long> {

	Page<Employe> findByNomContains(String keyword, Pageable  pageable);
	
}
