package com.m3bi.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.m3bi.DAO.RoomDAO;
import com.m3bi.entity.Room;
import com.m3bi.entity.User;

@Service("roomService")
@Configurable
@Transactional
public class RoomServiceImpl implements RoomService {
	@Autowired
	private RoomDAO roomDAO;
	@Autowired
	private UserService userService;
	
	
	@Override
	public Room getEmptyRoom() {
		return roomDAO.getEmptyRoom();
	}

	@Override
	public String bookRoom(int id) {
		String meesage=null;
		Room room= getEmptyRoom();
		if(room != null){
		User user=userService.retriveUser(id);
		int points =user.getPoints();
		int charge=room.getCharge();
			room.setMappedUserId(id);
		if(points>= charge){
				room.setStatus("Booked");
				meesage="Room Booked Succcessfully";
			
		}else{
			room.setStatus("Pending Approval");
			meesage= "Not Enough Point ,Approval Pending";
		}
		roomDAO.save(room);
		int remainingPoints=points-charge;
		user.setPoints(remainingPoints);
		userService.updatePoints(user);
		}else{
			meesage="No Room Found for Allotment";
		}
		return meesage;
	}

	@Override
	public Iterable<Room> findAll() {
		return roomDAO.findAll();
	}

}
