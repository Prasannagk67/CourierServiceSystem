package com.virtusa.css.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.virtusa.css.dto.CourierDTO;
import com.virtusa.css.dto.EmployeeDTO;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDTO, Integer> {
	@Query("SELECT a from employee_tbl a where status=?1")
	public List<EmployeeDTO> getEmployeeByStatus(String status);
}
