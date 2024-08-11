package com.virtusa.css.service;

import java.util.List;

import com.virtusa.css.dto.CourierDTO;
import com.virtusa.css.dto.EmployeeDTO;
import com.virtusa.css.dto.UserDTO;
import com.virtusa.css.exception.ExceptionHandling;

public interface ICourierService {
	public CourierDTO saveCourierDTO(CourierDTO courier);
	public List<CourierDTO> findAllCouriersDTOs();
	public CourierDTO getCourier(int courierId);
	public void deleteCourier(int courierId);
	public CourierDTO updateCourier(CourierDTO courier);
	CourierDTO getCouriers(int CourierId) throws ExceptionHandling;
}
