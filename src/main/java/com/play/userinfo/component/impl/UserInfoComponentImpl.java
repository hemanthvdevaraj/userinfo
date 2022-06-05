package com.play.userinfo.component.impl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.play.userinfo.component.UserInfoComponent;
import com.play.userinfo.dto.UserInfoDTO;
import com.play.userinfo.entity.UserInfo;
import com.play.userinfo.repository.UserInfoRepository;

@Component
public class UserInfoComponentImpl implements UserInfoComponent {

	@Autowired
	private UserInfoRepository userInfoRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserInfoDTO getUser(Long id) {
		Optional<UserInfo> userInfo = userInfoRepository.findById(id);
		return convertToDTO(userInfo.get());
	}

	private UserInfo convertToEntity(UserInfoDTO userInfoDto) {
		return modelMapper.map(userInfoDto, UserInfo.class);
	}

	private UserInfoDTO convertToDTO(UserInfo userInfo) {
		return modelMapper.map(userInfo, UserInfoDTO.class);
	}
	
}
