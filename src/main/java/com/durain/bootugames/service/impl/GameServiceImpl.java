package com.durain.bootugames.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durain.bootugames.dataobject.GameInfo;
import com.durain.bootugames.enums.GameStatusEnum;
import com.durain.bootugames.repository.GameInfoRepository;
import com.durain.bootugames.service.GameService;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private GameInfoRepository gameInfoRepository;

	@Override
	public List<GameInfo> findInStockGames() {
		return gameInfoRepository.findByGameStatus(GameStatusEnum.IN_STOCK.getCode());
	}

}
