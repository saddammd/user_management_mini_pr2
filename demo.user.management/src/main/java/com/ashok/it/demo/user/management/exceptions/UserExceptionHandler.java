package com.ashok.it.demo.user.management.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler {

	@ExceptionHandler()
	public ResponseEntity handleException(){
		
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
}
