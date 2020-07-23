package com.m3bi.DAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.m3bi.entity.User;

@Repository
public interface UserDAO extends CrudRepository<User, Integer> {

}
