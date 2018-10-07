package com.durain.bootugames.service;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.durain.bootugames.dataobject.GameCategory;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GameCategoryServiceTest {

	@Autowired
	GameCategoryService gameCategoryService;
	
	@Test
	public void testFindByGameCategoryTypeIn() {
		List<GameCategory> gameCategoryList = gameCategoryService.findByGameCategoryTypeIn(Arrays.asList(1,2));
		Assert.assertTrue(gameCategoryList.size() > 0);
	}

}
