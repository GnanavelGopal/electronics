package com.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.Repository.MobileRepository;
import com.electronics.entity.Mobile;

@Repository
public class MobileDao {
@Autowired
MobileRepository mr;
public String setMobile(Mobile mobile) {
	mr.save(mobile);
	return "save";
}
public String setAllMobile(List<Mobile> mobiles) {
	mr.saveAll(mobiles);
	return "saved all";
}
public List<Mobile> getAllMobile() {
	return mr.findAll();
}
public Mobile getById(int x) {
	return mr.findById(x).get();
}
public List<Mobile> getByBrand(String x) {
	return mr.getByBrand(x);
}
public List<Mobile> getMax() {
	return mr.getMax();
}
public List<Mobile> getMin() {
	return mr.getMin();
}
}
