package com.xi_zz.retrofit;


import com.google.gson.annotations.SerializedName;

public class User {

	@SerializedName("login")
	private String login;
	@SerializedName("id")
	private Integer id;
	@SerializedName("avatar_url")
	private String avatarUrl;
	@SerializedName("gravatar_id")
	private String gravatarId;
	@SerializedName("url")
	private String url;
	@SerializedName("html_url")
	private String htmlUrl;
	@SerializedName("followers_url")
	private String followersUrl;
	@SerializedName("following_url")
	private String followingUrl;
	@SerializedName("gists_url")
	private String gistsUrl;
	@SerializedName("starred_url")
	private String starredUrl;
	@SerializedName("subscriptions_url")
	private String subscriptionsUrl;
	@SerializedName("organizations_url")
	private String organizationsUrl;
	@SerializedName("repos_url")
	private String reposUrl;
	@SerializedName("events_url")
	private String eventsUrl;
	@SerializedName("received_events_url")
	private String receivedEventsUrl;
	@SerializedName("type")
	private String type;
	@SerializedName("site_admin")
	private Boolean siteAdmin;
	@SerializedName("name")
	private String name;
	@SerializedName("company")
	private String company;
	@SerializedName("blog")
	private String blog;
	@SerializedName("location")
	private String location;
	@SerializedName("email")
	private String email;
	@SerializedName("hireable")
	private Boolean hireable;
	@SerializedName("bio")
	private Object bio;
	@SerializedName("public_repos")
	private Integer publicRepos;
	@SerializedName("public_gists")
	private Integer publicGists;
	@SerializedName("followers")
	private Integer followers;
	@SerializedName("following")
	private Integer following;
	@SerializedName("created_at")
	private String createdAt;
	@SerializedName("updated_at")
	private String updatedAt;

	public String getLogin() {
		return login;
	}

	public Integer getId() {
		return id;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public String getGravatarId() {
		return gravatarId;
	}

	public String getUrl() {
		return url;
	}

	public String getHtmlUrl() {
		return htmlUrl;
	}

	public String getFollowersUrl() {
		return followersUrl;
	}

	public String getFollowingUrl() {
		return followingUrl;
	}

	public String getGistsUrl() {
		return gistsUrl;
	}

	public String getStarredUrl() {
		return starredUrl;
	}

	public String getSubscriptionsUrl() {
		return subscriptionsUrl;
	}

	public String getOrganizationsUrl() {
		return organizationsUrl;
	}

	public String getReposUrl() {
		return reposUrl;
	}

	public String getEventsUrl() {
		return eventsUrl;
	}

	public String getReceivedEventsUrl() {
		return receivedEventsUrl;
	}

	public String getType() {
		return type;
	}

	public Boolean getSiteAdmin() {
		return siteAdmin;
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public String getBlog() {
		return blog;
	}

	public String getLocation() {
		return location;
	}

	public String getEmail() {
		return email;
	}

	public Boolean getHireable() {
		return hireable;
	}

	public Object getBio() {
		return bio;
	}

	public Integer getPublicRepos() {
		return publicRepos;
	}

	public Integer getPublicGists() {
		return publicGists;
	}

	public Integer getFollowers() {
		return followers;
	}

	public Integer getFollowing() {
		return following;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	@Override
	public String toString() {
		return "User{" +
				"login='" + login + '\'' +
				", id=" + id +
				", avatarUrl='" + avatarUrl + '\'' +
				", gravatarId='" + gravatarId + '\'' +
				", url='" + url + '\'' +
				", htmlUrl='" + htmlUrl + '\'' +
				", followersUrl='" + followersUrl + '\'' +
				", followingUrl='" + followingUrl + '\'' +
				", gistsUrl='" + gistsUrl + '\'' +
				", starredUrl='" + starredUrl + '\'' +
				", subscriptionsUrl='" + subscriptionsUrl + '\'' +
				", organizationsUrl='" + organizationsUrl + '\'' +
				", reposUrl='" + reposUrl + '\'' +
				", eventsUrl='" + eventsUrl + '\'' +
				", receivedEventsUrl='" + receivedEventsUrl + '\'' +
				", type='" + type + '\'' +
				", siteAdmin=" + siteAdmin +
				", name='" + name + '\'' +
				", company='" + company + '\'' +
				", blog='" + blog + '\'' +
				", location='" + location + '\'' +
				", email='" + email + '\'' +
				", hireable=" + hireable +
				", bio=" + bio +
				", publicRepos=" + publicRepos +
				", publicGists=" + publicGists +
				", followers=" + followers +
				", following=" + following +
				", createdAt='" + createdAt + '\'' +
				", updatedAt='" + updatedAt + '\'' +
				'}';
	}
}
