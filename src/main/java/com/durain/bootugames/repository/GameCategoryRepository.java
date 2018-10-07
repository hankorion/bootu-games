package com.durain.bootugames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.durain.bootugames.dataobject.GameCategory;

public interface GameCategoryRepository extends JpaRepository<GameCategory, Integer>{
	
	List<GameCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
