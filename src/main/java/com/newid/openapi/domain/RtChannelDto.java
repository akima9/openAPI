package com.newid.openapi.domain;

import java.util.Date;
import java.util.Objects;

public class RtChannelDto {
	
	private String channel_id;
	private String channel_name;
	private int rt_cp_id;
	private String channel_id_origin;
	private String channel_id_origin_sub;
	private String target_platform_origin;
	private String target_info;
	private int main_company_id;
	private int sub_company_id;
	private Date created_at;
	private Date updated_at;
	
	public RtChannelDto() {
	}

	public String getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}

	public String getChannel_name() {
		return channel_name;
	}

	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}

	public int getRt_cp_id() {
		return rt_cp_id;
	}

	public void setRt_cp_id(int rt_cp_id) {
		this.rt_cp_id = rt_cp_id;
	}

	public String getChannel_id_origin() {
		return channel_id_origin;
	}

	public void setChannel_id_origin(String channel_id_origin) {
		this.channel_id_origin = channel_id_origin;
	}

	public String getChannel_id_origin_sub() {
		return channel_id_origin_sub;
	}

	public void setChannel_id_origin_sub(String channel_id_origin_sub) {
		this.channel_id_origin_sub = channel_id_origin_sub;
	}

	public String getTarget_platform_origin() {
		return target_platform_origin;
	}

	public void setTarget_platform_origin(String target_platform_origin) {
		this.target_platform_origin = target_platform_origin;
	}

	public String getTarget_info() {
		return target_info;
	}

	public void setTarget_info(String target_info) {
		this.target_info = target_info;
	}

	public int getMain_company_id() {
		return main_company_id;
	}

	public void setMain_company_id(int main_company_id) {
		this.main_company_id = main_company_id;
	}

	public int getSub_company_id() {
		return sub_company_id;
	}

	public void setSub_company_id(int sub_company_id) {
		this.sub_company_id = sub_company_id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public int hashCode() {
		return Objects.hash(channel_id, channel_id_origin, channel_id_origin_sub, channel_name, created_at,
				main_company_id, rt_cp_id, sub_company_id, target_info, target_platform_origin, updated_at);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RtChannelDto other = (RtChannelDto) obj;
		return Objects.equals(channel_id, other.channel_id)
				&& Objects.equals(channel_id_origin, other.channel_id_origin)
				&& Objects.equals(channel_id_origin_sub, other.channel_id_origin_sub)
				&& Objects.equals(channel_name, other.channel_name) && Objects.equals(created_at, other.created_at)
				&& main_company_id == other.main_company_id && rt_cp_id == other.rt_cp_id
				&& sub_company_id == other.sub_company_id && Objects.equals(target_info, other.target_info)
				&& Objects.equals(target_platform_origin, other.target_platform_origin)
				&& Objects.equals(updated_at, other.updated_at);
	}

	@Override
	public String toString() {
		return "RtChannelDto [channel_id=" + channel_id + ", channel_name=" + channel_name + ", rt_cp_id=" + rt_cp_id
				+ ", channel_id_origin=" + channel_id_origin + ", channel_id_origin_sub=" + channel_id_origin_sub
				+ ", target_platform_origin=" + target_platform_origin + ", target_info=" + target_info
				+ ", main_company_id=" + main_company_id + ", sub_company_id=" + sub_company_id + ", created_at="
				+ created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	
}