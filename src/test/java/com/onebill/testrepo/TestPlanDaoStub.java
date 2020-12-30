package com.onebill.testrepo;

import java.util.List;

import com.onebill.customizer.dao.PlanDAO;
import com.onebill.customizer.entities.Plans;
import com.onebill.customizer.entities.Products;

public class TestPlanDaoStub implements PlanDAO{

	@Override
	public Plans addPlan(Plans plan) {
		plan.setPlanDescription("gtvbr");
		plan.setPlanId(123);
		plan.setPlanName("etv");
		Products product=new Products();
		product.setProductDescription("egvr");
		product.setProductId(1);
		product.setProductName("airtel");
		plan.setProduct(product);
		return plan;
	}

	@Override
	public Plans updatePlan(Plans plan) {
		plan.setPlanDescription("gtfddvbr");
		plan.setPlanId(123);
		plan.setPlanName("etv");
		Products product=new Products();
		product.setProductDescription("egvr");
		product.setProductId(1);
		product.setProductName("airtel");
		plan.setProduct(product);
		return plan;
	}

	@Override
	public List<Plans> getAllPlans(Products product) {
		
		return null;
	}

	@Override
	public Plans removePlan(int planId) {

		return null;
	}

	@Override
	public List<Plans> getPlan(String planName) {
	
		return null;
	}

	@Override
	public List<Plans> getMyPlan(String planName) {

		return null;
	}

	@Override
	public List<Plans> getPlansByProduct(int productID) {

		return null;
	}

	@Override
	public List<Plans> getPlansByBundel(int bundelId) {

		return null;
	}

}
