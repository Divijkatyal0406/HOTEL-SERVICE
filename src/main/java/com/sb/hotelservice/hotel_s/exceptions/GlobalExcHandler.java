package com.sb.hotelservice.hotel_s.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExcHandler {
	
	@ExceptionHandler(ResourceNotFoundExc.class)
	public ResponseEntity<Map<String, Object>> handleResourceNotFoundException(ResourceNotFoundExc ex){
		Map<String, Object> m=new HashMap<>();
		String message=ex.getMessage();
		m.put("message", message);
		m.put("success", false);
		m.put("status", HttpStatus.NOT_FOUND);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(m);
	}

}
