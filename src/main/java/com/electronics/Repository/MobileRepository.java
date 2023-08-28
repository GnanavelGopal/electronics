package com.electronics.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.electronics.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer>{
@Query(value="select * from mobile_details where brand like ?",nativeQuery=true)
	List<Mobile> getByBrand(String x);
@Query(value="select * from mobile_details where price=(select max(price) from mobile_details)",nativeQuery=true)
List<Mobile> getMax();
@Query(value="select * from mobile_details where price=(select min(price) from mobile_details)",nativeQuery=true)
List<Mobile> getMin();
	
}
