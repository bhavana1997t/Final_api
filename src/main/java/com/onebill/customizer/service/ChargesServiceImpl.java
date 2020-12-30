package com.onebill.customizer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.customizer.dao.ChargesDAO;
import com.onebill.customizer.entities.Charges;
import com.onebill.customizer.entities.Plans;
import com.onebill.customizer.exception.CustomizePlanException;

@Service
public class ChargesServiceImpl implements ChargesService {
	@Autowired
	private ChargesDAO dao;

	@Override
	public Charges addCharge(Charges charge) {
		try {
			Charges charge1 = dao.addCharge(charge);
			if (charge1 != null) {
				return charge1;
			} else {
				throw new CustomizePlanException("unable to add charge");
			}
		} catch (Exception e) {
			throw new CustomizePlanException("unable to add charges with strategy name" + charge.getStrategyName()
					+ " , strategy cost" + charge.getStrategyCost() + "and validity  "
					+ charge.getValidityInDays() +" with charge id");
		}
	}

	@Override
	public Charges removeCharge(int charge) {
		try {
		Charges charge1 = dao.removeCharge(charge);
		if (charge1 != null) {
			return charge1;
		} else {
			throw new CustomizePlanException("unable to remove charge with id "+charge);
		}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to remove charges with id "+charge);
		}
	}

	@Override
	public Charges updateCharge(Charges charge) {
		Charges charge1=null;
		try {
			charge1 = dao.updateCharge(charge);
		if (charge1 != null) {
			return charge1;
		} else {
			throw new CustomizePlanException("unable to update charge");
		}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to update details with Strategy name "+
		charge.getStrategyName()+ " with plan  ");
		}
	}

	@Override
	public List<Charges> getAllCharges() {
		try {
		List<Charges> charge1 = dao.getAllCharges();
		if (charge1 != null) {
			return charge1;
		} else {
			throw new CustomizePlanException("unable to get charge");
		}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to get charges");
		}
	}

	@Override
	public List<Charges> getCharges(int chargeId) {
		try {
		List<Charges> charge1 = dao.getcharges(chargeId);
		if (charge1 != null) {
			return charge1;
		} else {
			throw new CustomizePlanException("unable to get charge with id ");
		}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to get charges with id "+chargeId);
		}
	}

	@Override
	public List<Charges> getChargesByType(String chargeType) {
		try {
		List<Charges> charge1 = dao.getchargesByType(chargeType);
		if (charge1 != null) {
			return charge1;
		} else {
			throw new CustomizePlanException("unable to get charge");
		}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to get charges with type "+chargeType);
		}
	}

	@Override
	public List<Charges> getChargesByPlan(int planId) {
		List<Charges> charge1=null;
		try {
		 charge1 = dao.getchargesByPlan(planId);
		if (charge1 != null) {
			return charge1;
		} else {
			throw new CustomizePlanException("unable to get charge");
		}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to get charges with planID"+planId);
		}
	}

}
