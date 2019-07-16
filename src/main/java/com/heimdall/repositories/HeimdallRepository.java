package com.heimdall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heimdall.domain.Heimdall;

@Repository
public interface HeimdallRepository extends JpaRepository<Heimdall, Integer>{

}
