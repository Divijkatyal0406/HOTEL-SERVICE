package com.sb.hotelservice.hotel_s.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.hotelservice.hotel_s.entities.Hotel;
import com.sb.hotelservice.hotel_s.exceptions.ResourceNotFoundExc;
import com.sb.hotelservice.hotel_s.repositories.HotelRepo;
import com.sb.hotelservice.hotel_s.services.HotelService;


@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	HotelRepo hotelRepo;

	@Override
	public Hotel saveHotel(Hotel h) {
		String random=UUID.randomUUID().toString();
		h.setId(random);
		return hotelRepo.save(h);
	}

	@Override
	public List<Hotel> getAllHotel() {
		return hotelRepo.findAll();
	}

	@Override
	public Hotel getHotel(String id) {
		return hotelRepo.findById(id).orElseThrow(()-> new ResourceNotFoundExc("Hotel"+id+"not found"));
	}

}
