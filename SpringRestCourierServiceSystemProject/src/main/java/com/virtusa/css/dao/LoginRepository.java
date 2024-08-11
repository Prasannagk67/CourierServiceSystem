package com.virtusa.css.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.virtusa.css.dto.LoginDTO;
import com.virtusa.css.dto.UserDTO;
@Repository
public interface LoginRepository extends JpaRepository<LoginDTO, Integer>{
	@Query("select a from LoginDTO a where a.userName=:p1 and a.passWord=:p2")
	public LoginDTO getvalidate(@Param("p1") String name,@Param("p2") String password);
//	LoginDTO fingByuserName(String userName);
}
