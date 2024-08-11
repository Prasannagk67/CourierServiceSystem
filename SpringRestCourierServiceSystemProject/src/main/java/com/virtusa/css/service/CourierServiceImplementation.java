package com.virtusa.css.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.css.dao.CourierRepository;
import com.virtusa.css.dao.UserRepository;
import com.virtusa.css.dto.CourierDTO;
import com.virtusa.css.dto.UserDTO;
import com.virtusa.css.exception.ExceptionHandling;
@Service
public class CourierServiceImplementation implements ICourierService {
	@Autowired
	private CourierRepository dao;
//	@Autowired
//	private UserRepository dao1;

	@Override
	public CourierDTO saveCourierDTO(CourierDTO courier) {
		// TODO Auto-generated method stub
		return dao.save(courier);
	}

	@Override
	public List<CourierDTO> findAllCouriersDTOs() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public CourierDTO getCourier(int CourierId) {
		Optional<CourierDTO> optionalCourier = dao.findById(CourierId);
		if (optionalCourier.isPresent()) {
			return optionalCourier.get();
		}
		return null;
}

	@Override
	public CourierDTO updateCourier(CourierDTO courier) {
		return dao.save(courier);
	}
	
	
	
	public List<CourierDTO> getCourierByUserid(int UserId){
		return dao.getCourierByUserid(UserId);
	}
	
	
	public List<CourierDTO> getCourierByEmpid(int EmpId){
		return dao.getCourierByEmpid(EmpId);
	}
	
    public CourierDTO getCouriers(int CourierId) throws ExceptionHandling
    {
        return dao.findById(CourierId).orElseThrow(
            ()
                -> new ExceptionHandling(
                    "NO Courier PRESENT WITH ID = " + CourierId));
    }
	
	@Override
	public void deleteCourier(int courierId) {
		dao.deleteById(courierId);
	}
	
}