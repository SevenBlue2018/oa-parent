package com.zhss.oa.flow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhss.oa.flow.mapper.ApplicationMapper;
import com.zhss.oa.flow.model.Application;
import com.zhss.oa.flow.service.ApplicationService;

@Service("applicationService") 
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationMapper applicationMapper;
	
	@Override
	public void create(Application app) {
		System.out.println("create log!!!");
		applicationMapper.create(app); 
	}

	@Override
	public void delete(Long id) {

		System.out.println("delete log!!!");
		applicationMapper.delete(id);
	}

	@Override
	public Application findById(Long id) {
		return applicationMapper.findById(id);
	}


	public void updateEmployee(){

	}

	public void computeEmployee(){
		
	}
}
