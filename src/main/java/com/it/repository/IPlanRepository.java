//IPlanRepository.java
package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.entity.Plan;

public interface IPlanRepository extends JpaRepository<Plan, Integer> {

}
