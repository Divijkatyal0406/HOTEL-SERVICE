package com.sb.hotelservice.hotel_s.services;

import java.util.List;

import com.sb.hotelservice.hotel_s.entities.Hotel;


public interface HotelService {
	
	Hotel saveHotel(Hotel h);
	
	List<Hotel> getAllHotel();
	
	Hotel getHotel(String id);
}
