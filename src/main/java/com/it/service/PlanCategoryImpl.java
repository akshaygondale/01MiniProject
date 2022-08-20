//PlanCategoryImpl .java
package com.it.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.it.entity.Plan;
import com.it.repository.IPlanMasterRepository;
import com.it.repository.IPlanRepository;
@Component
public class PlanCategoryImpl implements IPlanService {
	@Autowired
	private  IPlanRepository planRepo;

	@Autowired
	private  IPlanMasterRepository masterRepo;
	
	@Override
	public Map<Integer, String> getPlanCategory() {
		   List <Plan> allplan= planRepo.findAll();
		   Map <Integer, String> categories= new HashMap<>();
		   allplan.forEach(category->{
			   categories.put(category.getId(), category.getName());
		   });
		return categories;
	}

	@Override
	public boolean savePlan(Plan plan) {
		Plan save=planRepo.save(plan);
		return save.getId()!=null?true:false;
	}

	@Override
	public List<Plan> getAllPlans() {
		return planRepo.findAll();
	}

	@Override
	public Plan getPlanById(Integer id) {
		     Optional<Plan> findByid=planRepo.findById(id);
		     if(findByid.isPresent()) {
		    	 return findByid.get();
		     }
		return null;
	}

	@Override
	public boolean updatePlan(Plan plan) {
		Plan saved=planRepo.save(plan);
		return saved.getId()!=null;
	}

	@Override
	public boolean deletePlanById(Integer id) {
		boolean flag=false;
		try {
			planRepo.deleteById(id);
			flag=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean planStatusChange(Integer id, String status) {
		Optional <Plan> getByid=planRepo.findById(id);
		if(getByid.isPresent()) {
			Plan plan =getByid.get();
			 plan.setActivesw(status);
		     planRepo.save(plan);
		     return true;
		}
		return false;
	}
}//class
