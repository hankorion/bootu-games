package com.durain.bootugames.service;

import java.util.List;

import com.durain.bootugames.dataobject.GameInfo;

public interface GameService {
	
	/*
	 * Query all in stock games list
	 */

	List<GameInfo> findInStockGames();
}
