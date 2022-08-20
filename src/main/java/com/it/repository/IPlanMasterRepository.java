// IPlanMasterRepository.java
package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.entity.PlanMaster;

public interface IPlanMasterRepository extends JpaRepository<PlanMaster, Integer> {

}
