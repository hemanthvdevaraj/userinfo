package com.play.userinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.play.userinfo.component.UserInfoComponent;
import com.play.userinfo.dto.UserInfoDTO;

@Service
public class UserInfoService {

	@Autowired
	private UserInfoComponent userInfoComponent;

	public UserInfoDTO getUser(Long id) {
		UserInfoDTO userInfoDto = userInfoComponent.getUser(id);
		return userInfoDto;
	}

}
