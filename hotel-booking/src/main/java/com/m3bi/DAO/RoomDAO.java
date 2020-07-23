package com.m3bi.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.m3bi.entity.Room;

@Repository
public interface RoomDAO extends CrudRepository<Room, Integer>,RoomCustomDAO {

}
