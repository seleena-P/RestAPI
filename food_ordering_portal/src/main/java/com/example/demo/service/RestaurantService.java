package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.model.Restaurant;
import com.example.demo.repository.RestaurantRepo;

@Service
public class RestaurantService {
	@Autowired
RestaurantRepo rr;
	//post-single
	public Restaurant addrestaurant(Restaurant r) {
		return rr.save(r);
	}
	//post-multiple
	public List<Restaurant> addrestaurants(List<Restaurant> r)
	{
		return (List<Restaurant>)rr.saveAll(r);
	}
	//get
	public List<Restaurant> showrestaurants(){
		return rr.findAll();
	}
	//update
	public Restaurant alterrestaurantdetails(Restaurant r) {
		return rr.saveAndFlush(r);
	}
	//delete
	public void deleteRestaurant(Restaurant r) {
		rr.delete(r);
	}
	public void deleteid(int id) {
		rr.deleteById(id);
	}
	public void deletepid(int id) {
		rr.deleteById(id);
	}
	public Optional<Restaurant> showbyid(int id){
		return rr.findById(id);
	}
	public String updateinfobyid(int id,Restaurant ss) {
		rr.saveAndFlush(ss);
		if(rr.existsById(id)) {
			return "updated";
			
		}
		else {
			return "enter valid id";
		}
	}
	 public List<Restaurant> sortinfo(String s){
		 return rr.findAll(Sort.by(Sort.Direction.DESC,s));
	}
	 
	 public List<Restaurant> getbypage(int pgno,int pgsize){
		 Page<Restaurant>p=rr.findAll(PageRequest.of(pgno, pgsize));
		 return p.getContent();
	 }
	 
	 public List<Restaurant> sortpaging(int pgno,int pgsize,String str){
		 Page<Restaurant>p=rr.findAll(PageRequest.of(pgno, pgsize,Sort.by(str)));
		 return p.getContent();
	 }
	 //select query
	 public List<Restaurant> shownameandtype(String restaurantname,String cuisinetype){
			return rr.getrestaurantandtypeinfo(restaurantname,cuisinetype);
		}
	 public List<Restaurant> shownameandlocation(String restaurantname,String location){
			return rr.getrestaurantandplaceinfo(restaurantname,location);
		}
	 public List<Restaurant> showbyrating(float rating){
		 return rr.getbyrating(rating);
	 }
}
