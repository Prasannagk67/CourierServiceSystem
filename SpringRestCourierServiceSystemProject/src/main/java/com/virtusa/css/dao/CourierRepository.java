package com.virtusa.css.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.virtusa.css.dto.CourierDTO;
@Repository
public interface CourierRepository extends JpaRepository<CourierDTO, Integer> {
	@Query("SELECT c from courier_tbl c where userid=?1")
	public List<CourierDTO> getCourierByUserid(int UserId);
	
	@Query("SELECT a from courier_tbl a where empid=?1")
	public List<CourierDTO> getCourierByEmpid(int EmpId);
}
