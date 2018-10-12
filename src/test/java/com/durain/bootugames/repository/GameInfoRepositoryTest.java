package com.durain.bootugames.repository;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.durain.bootugames.dataobject.GameInfo;

import junit.framework.Assert;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class GameInfoRepositoryTest {

	@Autowired
	private GameInfoRepository gameInfoRepository;

	@Test
	public void testfindByGameStatus() {
		List<GameInfo> gameList = gameInfoRepository.findByGameStatus(0);
		Assert.assertTrue(gameList.size() > 0);
	}

	@Test
	public void testfindByGameIdList() {
		List<GameInfo> gameList = gameInfoRepository.findByGameIdIn(Arrays.asList("Blizzard Entertainment - World of Warcraft","Blizzard Entertainment - Hearthstone"));
		log.info("gameList --> {}",gameList);
		Assert.assertTrue(gameList.size() > 0);
	}

}
