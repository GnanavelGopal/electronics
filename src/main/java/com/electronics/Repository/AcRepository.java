package com.electronics.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electronics.entity.Ac;

public interface AcRepository extends JpaRepository<Ac, Integer> {

}
