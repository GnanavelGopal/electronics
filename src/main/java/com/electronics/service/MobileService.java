package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.dao.MobileDao;
import com.electronics.entity.Mobile;

@Service
public class MobileService {
@Autowired
MobileDao md;
public String setMobile(Mobile mobile) {
	return md.setMobile(mobile);
}
public String setAllMobile(List<Mobile> mobiles) {
	return md.setAllMobile(mobiles);
}

public List<Mobile> getAllMobile() {
	return md.getAllMobile();
}
public Mobile getById(int x) {
	return md.getById(x);
}
public List<Mobile> getByBrand(String x) {
	return md.getByBrand(x);
}
public List<Mobile> getMax() {
	return md.getMax();
}
public List<Mobile> getMin() {
	return md.getMin();
}

}
