package com.chenxun.spring.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chenxun.spring.boot.common.dao.MyMapper;
import com.chenxun.spring.boot.model.AuthUser;

public interface AuthUserMapper extends MyMapper<AuthUser> {

	AuthUser queryByUsername(@Param("username") String username);

	List<AuthUser> queryList(@Param("user")AuthUser user);

	List<Integer> queryRoleUids(@Param("roleid")int roleid);
}