package com.example.travel.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.travel.models.Expense;





@Repository
public interface TravelRepository extends CrudRepository<Expense, Long>{
	List<Expense> findAll();
}
