package com.chenxun.spring.boot.mapper;

import org.apache.ibatis.annotations.Param;

import com.chenxun.spring.boot.common.dao.MyMapper;
import com.chenxun.spring.boot.model.AuthRole;

public interface AuthRoleMapper extends MyMapper<AuthRole> {

	AuthRole queryRoleById(@Param("roleid")Integer roleid);
	
	AuthRole queryByRolename(@Param("rolename") String rolename);
}