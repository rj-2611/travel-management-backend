package com.s2.travelmgt.repository;
import org.springframework.data.repository.CrudRepository;


import com.s2.travelmgt.model.TripDetails;

public interface TripInfoRepo extends CrudRepository<TripDetails, Long>  {
	
}