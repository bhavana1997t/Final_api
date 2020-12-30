package com.onebill.test.daotest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.onebill.customizer.dao.PlanDAO;
import com.onebill.customizer.service.PlanService;
import com.onebill.customizer.service.PlanServiceImpl;
import com.onebill.customizer.service.ProductService;
import com.onebill.customizer.service.ProductServiceImpl;
import com.onebill.testrepo.TestPlanDaoStub;

@Configuration
public class ProductConfig {

	@Bean
	TestPlanDaoStub getObj() {
		return new TestPlanDaoStub();
	}
	
	@Bean
	ProductService getService() {
		return new ProductServiceImpl();
	}

	@Bean
	PlanDAO getPlanObj() {
		return new TestPlanDaoStub();
	}
	
	@Bean
	PlanService getPlanService() {
		return new PlanServiceImpl();
	}
	
}