package com.stock.ipo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.ipo.domain.Ipo;

public interface IpoRepository extends JpaRepository<Ipo, String> {
	
	@Override
	List<Ipo> findAll();
	
	Ipo findByEmail(final String email);
}
