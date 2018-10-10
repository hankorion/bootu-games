package com.durain.bootugames.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameServerController {

	@GetMapping("/msg")
	public String msg() {
		return "GameServerController msg";
	}
}
