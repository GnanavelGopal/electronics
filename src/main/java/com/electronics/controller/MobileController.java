package com.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.entity.Mobile;
import com.electronics.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileController {
	@Autowired
	MobileService ms;

	@PostMapping(value = "setMobile")
	public String setMobile(@RequestBody Mobile mobile) {
		return ms.setMobile(mobile);
	}

	@PostMapping(value = "setAllMobile")
	public String setAllMobile(@RequestBody List<Mobile> mobiles) {
		return ms.setAllMobile(mobiles);
	}

	@GetMapping(value = "getAllMobile")
	public List<Mobile> getAllMobile() {
		return ms.getAllMobile();
	}

	@GetMapping(value = "getById/{x}")
	public Mobile getById(@PathVariable int x) {
		return ms.getById(x);
	}
	@GetMapping(value="getByBrand/{x}")
	public List<Mobile> getByBrand(@PathVariable String x) {
		return ms.getByBrand(x);
	}
	@GetMapping(value="getByMax")
	public List<Mobile> getMax() {
		return ms.getMax();
	}
	@GetMapping(value="getMin")
	public List<Mobile> getMin() {
		return ms.getMin();
	}
}
