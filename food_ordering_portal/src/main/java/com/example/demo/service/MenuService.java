package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.model.Menu;
import com.example.demo.repository.MenuRepo;
@Service
public class MenuService {
	@Autowired
	 MenuRepo mr;
	 
	 public Menu saveinfo(Menu ss) {
		 return mr.save(ss);
	 }
	 public List<Menu> savedetails(List<Menu> ss) {
		 return (List<Menu>)mr.saveAll(ss);
	 }
	 public List<Menu> showinfo(){
		 return mr.findAll();
	 }
	 public Menu changeinfo(Menu ss) {
		 return mr.saveAndFlush(ss); 
	}
	public void deleteinfo(Menu ss) {
		mr.delete(ss);
	}
	public void deleteid(int id) {
		mr.deleteById(id);
	}
	public void deletepid(int id) {
		mr.deleteById(id);
	}
	public Optional<Menu> showbyid(int id){
		return mr.findById(id);
	}
	public String updateinfobyid(int id,Menu ss) {
		mr.saveAndFlush(ss);
		if(mr.existsById(id)) {
			return "updated";
			
		}
		else {
			return "enter valid id";
		}
	}
	 public List<Menu> sortinfo(String s){
		 return mr.findAll(Sort.by(Sort.Direction.DESC,s));
	}
	 
	 public List<Menu> getbypage(int pgno,int pgsize){
		 Page<Menu>p=mr.findAll(PageRequest.of(pgno, pgsize));
		 return p.getContent();
	 }
	 
	 public List<Menu> sortpaging(int pgno,int pgsize,String str){
		 Page<Menu>p=mr.findAll(PageRequest.of(pgno, pgsize,Sort.by(str)));
		 return p.getContent();
	 }
	 public List<Menu> showprice(int price){
			return mr.getpriceinfo(price);
		}
		public List<Menu> showitemname(String itemname){
			return mr.getitemnameinfo(itemname);
		}
}
