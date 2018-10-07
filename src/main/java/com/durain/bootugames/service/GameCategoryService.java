package com.durain.bootugames.service;

import java.util.List;

import com.durain.bootugames.dataobject.GameCategory;

public interface GameCategoryService {
	List<GameCategory> findByGameCategoryTypeIn(List<Integer> categoryTypeList);
}
