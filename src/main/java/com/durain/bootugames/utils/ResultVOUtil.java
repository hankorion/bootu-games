package com.durain.bootugames.utils;

import com.durain.bootugames.vo.ResultVO;

public class ResultVOUtil {

	public static ResultVO success(Object object) {
		ResultVO resultVO = new ResultVO();
		resultVO.setData(object);
		resultVO.setCode(0);
		resultVO.setMsg("success");
		return resultVO;
	}
}
