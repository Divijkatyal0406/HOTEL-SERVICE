package com.sb.hotelservice.hotel_s.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.hotelservice.hotel_s.entities.Hotel;
import com.sb.hotelservice.hotel_s.services.HotelService;


@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	HotelService hotelService;
	
	@PostMapping
	public ResponseEntity<Hotel> createUser(@RequestBody Hotel u){
		Hotel u1=hotelService.saveHotel(u);
		return ResponseEntity.status(HttpStatus.CREATED).body(u1);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getSingleUser(@PathVariable String id){
		Hotel u1=hotelService.getHotel(id);
		return ResponseEntity.ok(u1);
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllUsers(){
		List<Hotel> u1=hotelService.getAllHotel();
		return ResponseEntity.ok(u1);
	}

}
