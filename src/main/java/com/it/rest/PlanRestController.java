// PlanRestController.java
package com.it.rest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.entity.Plan;
import com.it.service.IPlanService;

@RestController
public class PlanRestController {
	
   @Autowired
    private IPlanService service;
   
   @GetMapping("/categories")
    public ResponseEntity<Map<Integer ,String >> planCategories(){
	    Map<Integer ,String> categories=service.getPlanCategory();
	    return new ResponseEntity<>(categories , HttpStatus.OK);
    }
   
   @PostMapping("/plan")
    public ResponseEntity<String> savePlan(@RequestBody Plan plan){
	     String responseMsg=null;
	     boolean isSaved=service.savePlan(plan);
	     if (isSaved) {
	    	 responseMsg="Response Is Saved";
	     }else {
	    	 responseMsg="Response is Not Saved";
	     }
    	return new ResponseEntity<>(responseMsg ,HttpStatus.CREATED);
    }
       
    @GetMapping("/plans")
   public ResponseEntity<List<Plan>> plans(){
	      List<Plan> getPlans=service.getAllPlans();
	      return new ResponseEntity<>(getPlans ,HttpStatus.OK);
   }
    
    @GetMapping("/plan/{id}")
    public ResponseEntity<Plan> editPlan(@PathVariable Integer  id){
    	Plan plan=service.getPlanById(id);
    	return new ResponseEntity<>(plan ,HttpStatus.OK);
    }
    
    @PutMapping("/plan")
    public ResponseEntity<String> updatePlan(@RequestBody  Plan  plan){
    	String msg=null; 
    	boolean update=service.updatePlan(plan);
    	  if(update) {
    		  msg=" Plan Is Updated";
    	  }else {
    		  msg="Plan Is Not Updated ";
    	  }
    	  return new ResponseEntity<>(msg ,HttpStatus.OK);
    }
    
    @DeleteMapping("/plan/{id}")
    public ResponseEntity<String> deletePlan(@PathVariable Integer id){
    	String msg=null;      
    	boolean delete=service.deletePlanById(id);
    	      if(delete) {
    	    	  msg=" Plan Is Deleted";
    	      }else {
    	    	  msg=" Plan Is Not Deleted";
    	      }
    	return new ResponseEntity<>(msg ,HttpStatus.OK);
    }
    
    @PutMapping("/status-changed/{id}/{status}")
    public ResponseEntity<String> statusChanged(@PathVariable Integer id ,@PathVariable  String status){
    	String msg=null;
    	boolean isStatusChanged=service.planStatusChange(id, status);
    	if(isStatusChanged) {
    		msg="Status Is Updated";
    	}else {
    		msg=" Status Is Not Updated";
    	}
    	return  new ResponseEntity<>(msg,HttpStatus.OK); 
    }
}
