package com.onebill.test.daotest;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.BeanUtils;

import com.onebill.customizer.dao.ChargesDAO;
import com.onebill.customizer.entities.Charges;
import com.onebill.customizer.entities.Plans;
import com.onebill.customizer.service.ChargesServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestChargesService {
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Mock
	private ChargesDAO chargesdao;
	
	@InjectMocks
	private static ChargesServiceImpl service=new ChargesServiceImpl();
	
	@Test
	public void TestaddCharges() {
		Charges charge=new Charges();
		charge.setChargeDescription("vrr");
		charge.setChargeType("oneTime");
		charge.setStrategyCost(324l);
		charge.setStrategyName("vgrrbh");
		charge.setValidityInDays(234);
		Plans plan = new Plans();
		plan.setPlanId(9);
		charge.setPlan(plan );
		Charges charge1=new Charges();
         BeanUtils.copyProperties(charge1 ,charge );
		when(chargesdao.addCharge(charge)).thenReturn(charge);
	}
	
	@Test
	public void TestUpdateCharges() {
		Charges charge=new Charges();
		charge.setChargeDescription("vrr");
		charge.setChargeType("oneTime");
		charge.setStrategyCost(324l);
		charge.setStrategyName("vgrrbh");
		charge.setValidityInDays(234);
		Plans plan = new Plans();
		plan.setPlanId(9);
		charge.setPlan(plan );
		Charges charge1=new Charges();
        BeanUtils.copyProperties(charge1 ,charge );
		when(chargesdao.addCharge(charge)).thenReturn(charge);
	}
	
	@Test
	public void TestUpdateCharge() {
		Charges charge=new Charges();
		charge.setChargeDescription("vrr");
		charge.setChargeType("oneTime");
		charge.setStrategyCost(324l);
		charge.setStrategyName("vgrrbh");
		charge.setValidityInDays(234);
		Charges charge1=new Charges();
        BeanUtils.copyProperties(charge1 ,charge );
		when(chargesdao.addCharge(charge)).thenReturn(charge);
	}

}
