package com.virtusa.css.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.virtusa.css.dto.UserDTO;
@Repository
public interface UserRepository extends JpaRepository<UserDTO, Integer>{
	
}
