package com.durain.bootugames.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durain.bootugames.DTO.CartDTO;
import com.durain.bootugames.dataobject.GameInfo;
import com.durain.bootugames.enums.GameStatusEnum;
import com.durain.bootugames.enums.ResultEnum;
import com.durain.bootugames.exception.GameException;
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

	@Override
	public List<GameInfo> findGamesByIds(List<String> gameIdList) {
		return gameInfoRepository.findByGameIdIn(gameIdList);
	}

	@Override
	@Transactional
	public void decreaseGameStock(List<CartDTO> cartDTOList) {
		for (CartDTO cartdto : cartDTOList) {
			Optional<GameInfo> gameInfoOptional = gameInfoRepository.findById(cartdto.getGameId());
			// Check the game exists
			if (!gameInfoOptional.isPresent()) {
				throw new GameException(ResultEnum.GAME_NOT_FOUND);
			}
			GameInfo gameInfo = gameInfoOptional.get();
			Integer result = gameInfo.getGameStock() - cartdto.getGameQuantity();
			// Check game stock
			if (result < 0) {
				throw new GameException(ResultEnum.GAME_STOCK_ERROR);
			}
			gameInfo.setGameStock(result);
			gameInfoRepository.save(gameInfo);
		}
	}

}
