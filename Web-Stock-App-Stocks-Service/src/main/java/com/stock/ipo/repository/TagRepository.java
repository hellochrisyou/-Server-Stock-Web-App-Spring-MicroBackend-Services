package com.stock.ipo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.ipo.domain.Tag;

public interface TagRepository extends JpaRepository<Tag, String> {
	
	@Override
	List<Tag> findAll();
	
	Tag findByEmail(final String email);
}
