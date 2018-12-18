package com.mattcalimbas.courseplatform.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mattcalimbas.courseplatform.models.User;

@Repository
public interface UserRepo extends CrudRepository <User, Long> {

	User findByEmail(String email);

}
