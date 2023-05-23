package com.nagarro.kshitizagarwal.Application2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.kshitizagarwal.Application2.model.UserDetails;

public interface Repo extends JpaRepository<UserDetails, Integer> {

}
