package com.kronicles.kronicles_springBoot.Repository;

import com.kronicles.kronicles_springBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class UserRepo implements JpaRepository<User,Integer> {
}
