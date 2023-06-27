package com.newid.openapi.dao;

import java.util.List;

import com.newid.openapi.domain.ChannelDto;


public interface ChannelDao {
	
	ChannelDto select(String channel_id) throws Exception;
	
	List<ChannelDto> selectAll() throws Exception;
}
