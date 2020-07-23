package com.m3bi.service;

import com.m3bi.entity.Room;

public interface RoomService {
	public Room getEmptyRoom();
	public String bookRoom(int userId);
	public Iterable<Room> findAll();
}
