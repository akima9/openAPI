package com.newid.openapi.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newid.openapi.domain.ChannelDto;


@Repository
public class ChannelDaoImpl implements ChannelDao {
	
	@Autowired
	SqlSession session;
	
	String namespace = "com.newid.openapi.dao.ChannelMapper.";

	@Override
	public ChannelDto select(String channel_id) throws Exception {
		return session.selectOne(namespace + "select", channel_id);
	}

	@Override
	public List<ChannelDto> selectAll() throws Exception {
		return session.selectList(namespace + "selectAll");
	}

}
