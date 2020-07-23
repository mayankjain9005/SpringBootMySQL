package com.m3bi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m3bi.service.RoomService;
import com.m3bi.service.UserService;

@RestController

public class AppController {
	
	@Autowired
	private  UserService userService;

	@Autowired
	@Qualifier("roomService")
	private RoomService roomService;

	@PostMapping("/book/user/{id}")
	public ResponseEntity bookRoom(@PathVariable Integer id){
		try{
		String message=	roomService.bookRoom(id);
		return ResponseEntity.status(HttpStatus.OK).body(message);
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}
	
	@GetMapping("/points/user/{id}")
	public ResponseEntity getPointsAgnstUser(@PathVariable Integer id){
		try{
		int points =userService.retriveUser(id).getPoints();
		return ResponseEntity.status(HttpStatus.OK).body(points);
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}
	
	@GetMapping("/users")
	public ResponseEntity getUsers(){
		try{
		return ResponseEntity.status(HttpStatus.OK).body(userService.findAllUsers());
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}
	@GetMapping("/rooms")
	public ResponseEntity getRooms(){
		try{
		return ResponseEntity.status(HttpStatus.OK).body(roomService.findAll());
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}


}
