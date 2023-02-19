package com.sb.hotelservice.hotel_s.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.hotelservice.hotel_s.entities.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String>{

}
