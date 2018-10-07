package com.durain.bootugames.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durain.bootugames.dataobject.GameCategory;
import com.durain.bootugames.repository.GameCategoryRepository;
import com.durain.bootugames.service.GameCategoryService;

@Service
public class GameCategoryServiceImpl implements GameCategoryService{

	@Autowired
	GameCategoryRepository gameCategoryRepository;
	
	
	@Override
	public List<GameCategory> findByGameCategoryTypeIn(List<Integer> categoryTypeList) {
		return gameCategoryRepository.findByCategoryTypeIn(categoryTypeList);
	}

}
