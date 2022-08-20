// IPlanService.java
package com.it.service;

import java.util.List;
import java.util.Map;

import com.it.entity.Plan;
import com.it.entity.PlanMaster;

public interface IPlanService {

	   public Map<Integer ,String> getPlanCategory();
	   
	   public boolean savePlan(Plan plan);
	   
	   public List<Plan> getAllPlans();
	   
	  public  Plan getPlanById(Integer id);
	  
	   public boolean updatePlan(Plan plan);
	   
	   public boolean deletePlanById(Integer id);
	   
	  public boolean planStatusChange(Integer id ,String status);
	   
}
