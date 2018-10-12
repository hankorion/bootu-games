package com.durain.bootugames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.durain.bootugames.dataobject.GameInfo;

public interface GameInfoRepository extends JpaRepository<GameInfo, String>{

	List<GameInfo> findByGameStatus(Integer gameStatus);
	
	List<GameInfo> findByGameIdIn(List<String> gameIdList);
}
