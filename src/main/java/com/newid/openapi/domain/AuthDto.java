package com.newid.openapi.domain;

import java.util.Objects;

public class AuthDto {
	private String api_seed;
	private String api_key;
	private String partner;
	private String api_secret;
	private String api_desc;
	private int active;
	private String permission_key;
	private String permission_info;
	private String created_at;
	private String updated_at;
	
	public AuthDto() {
	}

	public String getApi_seed() {
		return api_seed;
	}

	public void setApi_seed(String api_seed) {
		this.api_seed = api_seed;
	}

	public String getApi_key() {
		return api_key;
	}

	public void setApi_key(String api_key) {
		this.api_key = api_key;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getApi_secret() {
		return api_secret;
	}

	public void setApi_secret(String api_secret) {
		this.api_secret = api_secret;
	}

	public String getApi_desc() {
		return api_desc;
	}

	public void setApi_desc(String api_desc) {
		this.api_desc = api_desc;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getPermission_key() {
		return permission_key;
	}

	public void setPermission_key(String permission_key) {
		this.permission_key = permission_key;
	}

	public String getPermission_info() {
		return permission_info;
	}

	public void setPermission_info(String permission_info) {
		this.permission_info = permission_info;
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
		return Objects.hash(active, api_desc, api_key, api_secret, api_seed, created_at, partner, permission_info,
				permission_key, updated_at);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthDto other = (AuthDto) obj;
		return active == other.active && Objects.equals(api_desc, other.api_desc)
				&& Objects.equals(api_key, other.api_key) && Objects.equals(api_secret, other.api_secret)
				&& Objects.equals(api_seed, other.api_seed) && Objects.equals(created_at, other.created_at)
				&& Objects.equals(partner, other.partner) && Objects.equals(permission_info, other.permission_info)
				&& Objects.equals(permission_key, other.permission_key) && Objects.equals(updated_at, other.updated_at);
	}

	@Override
	public String toString() {
		return "AuthDto [api_seed=" + api_seed + ", api_key=" + api_key + ", partner=" + partner + ", api_secret="
				+ api_secret + ", api_desc=" + api_desc + ", active=" + active + ", permission_key=" + permission_key
				+ ", permission_info=" + permission_info + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ "]";
	}
	
	
	
}