package com.chenxun.spring.boot.mapper;

import java.util.List;

import com.chenxun.spring.boot.common.dao.MyMapper;
import com.chenxun.spring.boot.model.AuthRoleOperation;

public interface AuthRoleOperationMapper extends MyMapper<AuthRoleOperation> {

	void batchInsert(List<AuthRoleOperation> list);

	void delRoleOpers(List<AuthRoleOperation> list);
}