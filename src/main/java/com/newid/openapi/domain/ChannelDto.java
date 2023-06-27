package com.newid.openapi.domain;

import java.util.Objects;

public class ChannelDto {
	
	private String channel_id;
	private String channel_name;
	private String channel_type;
	private String target_info;
	private String advanced_info;
	private int main_company_id;
	private int sub_company_id;
	private String created_at;
	private String updated_at;
	
	public ChannelDto() {
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

	public String getChannel_type() {
		return channel_type;
	}

	public void setChannel_type(String channel_type) {
		this.channel_type = channel_type;
	}

	public String getTarget_info() {
		return target_info;
	}

	public void setTarget_info(String target_info) {
		this.target_info = target_info;
	}

	public String getAdvanced_info() {
		return advanced_info;
	}

	public void setAdvanced_info(String advanced_info) {
		this.advanced_info = advanced_info;
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

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public int hashCode() {
		return Objects.hash(advanced_info, channel_id, channel_name, channel_type, created_at, main_company_id,
				sub_company_id, target_info, updated_at);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChannelDto other = (ChannelDto) obj;
		return Objects.equals(advanced_info, other.advanced_info) && Objects.equals(channel_id, other.channel_id)
				&& Objects.equals(channel_name, other.channel_name) && Objects.equals(channel_type, other.channel_type)
				&& Objects.equals(created_at, other.created_at) && main_company_id == other.main_company_id
				&& sub_company_id == other.sub_company_id && Objects.equals(target_info, other.target_info)
				&& Objects.equals(updated_at, other.updated_at);
	}

	@Override
	public String toString() {
		return "ChannelDto [channel_id=" + channel_id + ", channel_name=" + channel_name + ", channel_type="
				+ channel_type + ", target_info=" + target_info + ", advanced_info=" + advanced_info
				+ ", main_company_id=" + main_company_id + ", sub_company_id=" + sub_company_id + ", created_at="
				+ created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	
}
