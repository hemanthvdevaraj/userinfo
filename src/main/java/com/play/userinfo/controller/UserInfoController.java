package com.play.userinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.play.userinfo.dto.UserInfoDTO;
import com.play.userinfo.service.UserInfoService;

@RestController
public class UserInfoController {

	private final UserInfoService userInfoService;

	@Autowired
	public UserInfoController(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	@PostMapping("getuser")
	public UserInfoDTO loadInventory(@RequestBody Long userId) {
		return userInfoService.getUser(userId);
	}

}
