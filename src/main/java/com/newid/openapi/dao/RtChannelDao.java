package com.newid.openapi.dao;

import java.util.List;

import com.newid.openapi.domain.ChannelDto;


public interface RtChannelDao {
	
	List<ChannelDto> selectAll() throws Exception;

}
