package com.onebill.test.daotest;

import static org.mockito.Mockito.when;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.BeanUtils;

import com.onebill.customizer.dao.PlanDAO;
import com.onebill.customizer.entities.Bundel;
import com.onebill.customizer.entities.Plans;
import com.onebill.customizer.entities.Products;
import com.onebill.customizer.service.PlanService;
import com.onebill.customizer.service.PlanServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class PlanServiceTestIT {
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Mock
	private PlanDAO planDao;
	
	@InjectMocks
	private static PlanService service = new PlanServiceImpl();
	
	private Plans plan;
	
	@Test
	public void TestaddPlan(){
		plan=new Plans();
		plan.setPlanId(123);
		plan.setPlanDescription("hbkjyusg");
		plan.setPlanName("bfbhryyrrtrdt");
		
		Products p=new Products();
		p.setProductId(12);
		p.setProductName("rvtfe");
		p.setProductDescription("errrtgbrg");
		
		Bundel b= new Bundel();
		b.setBundelDescription("evg");
		b.setBundelId(2);
		
		plan.setProduct(p);
		plan.setBundel(b);
		
		Plans res = new Plans();
		BeanUtils.copyProperties(res ,plan );
		
		when(planDao.addPlan(plan)).thenReturn(plan);

	}
	

	@Test
	public void testUpdate() {
		plan=new Plans();
		plan.setPlanId(123);
		plan.setPlanDescription("hbkjyusg");
		plan.setPlanName("Airtel");
		
		Products p=new Products();
		p.setProductId(12);
		p.setProductName("rvtfe");
		p.setProductDescription("errrtgbrg");
		
		Bundel b= new Bundel();
		b.setBundelDescription("evg");
		b.setBundelId(2);
		
		plan.setProduct(p);
		plan.setBundel(b);
		
		Plans res = new Plans();
		BeanUtils.copyProperties(res ,plan );
		when(planDao.updatePlan(plan)).thenReturn(plan);

	}
	
	}
