package net.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.springmvc.dao.RechargeDAO;
import net.springmvc.entity.Recharge;

@Service
public class RechargeService 
{
	@Autowired
	private RechargeDAO rechargedao;
	
	public void saveRecharge(Recharge theRecharge) 
	{
		rechargedao.saveRecharge(theRecharge);
	}
	
	public List<Recharge> getRecharge() {
		return rechargedao.getRecharge();
	}
}
