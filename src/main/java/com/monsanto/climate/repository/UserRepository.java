package com.monsanto.climate.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monsanto.climate.model.AppUser;

@Repository
	public interface UserRepository extends JpaRepository<AppUser, Long>{

	}

