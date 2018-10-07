package com.durain.bootugames.repository;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.durain.bootugames.dataobject.GameCategory;

import junit.framework.Assert;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GameCategoryRepositoryTest {

	@Autowired
	private GameCategoryRepository gameCategoryRepository;
	
	@Test
	public void testFindByCategoryTypeIn() {
		List<GameCategory> gameCategoryList = gameCategoryRepository.findByCategoryTypeIn(Arrays.asList(1,2));
		Assert.assertTrue(gameCategoryList.size() > 0);
	}

}
