package com.sandeep.fullstackbackend.repositories;

import com.sandeep.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
