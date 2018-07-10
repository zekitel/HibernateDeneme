package com.zeki.HibernateDeneme.repository;

import com.zeki.HibernateDeneme.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer> {

    Users getOne();
}
