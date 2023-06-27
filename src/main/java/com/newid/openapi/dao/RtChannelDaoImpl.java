package com.newid.openapi.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newid.openapi.domain.ChannelDto;


@Repository
public class RtChannelDaoImpl implements RtChannelDao {
	
	@Autowired
	SqlSession session;
	
	String namespace = "com.newid.openapi.dao.ChannelMapper.";

	@Override
	public List<ChannelDto> selectAll() throws Exception {
		return session.selectList(namespace + "selectAll");
	}

}
