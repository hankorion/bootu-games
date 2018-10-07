package com.durain.bootugames.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.durain.bootugames.dataobject.GameInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GameServiceTest {

	@Autowired
	GameService gameService;

	@Test
	public void testGameService() {
		List<GameInfo> gameList = gameService.findInStockGames();
		Assert.assertTrue(gameList.size() > 0);
	}

}
