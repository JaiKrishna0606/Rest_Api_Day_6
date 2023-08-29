package com.example.demo.service;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.BabyModel;
import com.example.demo.repository.BabyRepo;

@Service
public class BabyService {

	@Autowired
    BabyRepo br;
	
	public List<BabyModel> saveinfo(List<BabyModel> ss)
	{
		return (List<BabyModel>)br.saveAll(ss);
	}
	public List<BabyModel> showinfo()
	{
		return br.findAll();
	}
	public BabyModel changeinfo(BabyModel ss)
	{
		return br.saveAndFlush(ss);
	}
	public void delete(BabyModel ss)
	{
		br.delete(ss);
	}
	public Optional<BabyModel> getbyid(int id)
	{
		return br.findById(id);
	}
	public List<BabyModel> sortinfo(String s)
	{
		return br.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	public List<BabyModel> getbypage(int pgno,int pgsize)
	{
		Page<BabyModel> p=br.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
}