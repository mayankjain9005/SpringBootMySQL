package com.m3bi.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.m3bi.entity.Room;

public class RoomCustomDAOImpl  implements RoomCustomDAO{

	@PersistenceContext
	private EntityManager em;

	@Override
	public Room getEmptyRoom() {
		Room room1=null;
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Room> query = cb.createQuery(Room.class);
		Root<Room> room = query.from(Room.class);
		query.where(cb.isNull(room.get("status")));
		TypedQuery<Room> q= em.createQuery(query);
		if(!q.getResultList().isEmpty()){
			room1=q.getResultList().get(0);
		}
		return room1;
	}

}
