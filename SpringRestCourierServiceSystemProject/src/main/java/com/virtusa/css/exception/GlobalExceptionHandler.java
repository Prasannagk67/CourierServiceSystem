package com.virtusa.css.exception;

import java.net.URI;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.virtusa.css.dto.ErrorInfo;

@RestControllerAdvice
public class GlobalExceptionHandler {
	 @ExceptionHandler(value = ExceptionHandling.class)
public @ResponseBody ErrorInfo getExceptionHandling(ExceptionHandling e,HttpServletRequest req){
		 return new ErrorInfo(LocalDateTime.now(), e.getMessage(),req.getRequestURI());
	 }
}
