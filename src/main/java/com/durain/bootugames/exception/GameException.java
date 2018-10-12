package com.durain.bootugames.exception;

import com.durain.bootugames.enums.ResultEnum;

public class GameException extends RuntimeException {
	private Integer code;

	public GameException(Integer code, String message) {
		super(message);
		this.code = code;
	}

	public GameException(ResultEnum resumtEnum) {
		super(resumtEnum.getMessage());
		this.code = resumtEnum.getCode();
	}
}
