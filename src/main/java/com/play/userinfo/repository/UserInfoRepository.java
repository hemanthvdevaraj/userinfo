package com.play.userinfo.repository;

import org.springframework.data.repository.CrudRepository;

import com.play.userinfo.entity.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {

}
