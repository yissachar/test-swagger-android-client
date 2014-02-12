package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Whyline {
  @JsonProperty("id")
  private Long id = null;
  @JsonProperty("whyline")
  private String whyline = null;
  @JsonProperty("username")
  private String username = null;
  @JsonProperty("avatar")
  private String avatar = null;
  @JsonProperty("version")
  private Integer version = null;
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public String getWhyline() {
    return whyline;
  }
  public void setWhyline(String whyline) {
    this.whyline = whyline;
  }

  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  public String getAvatar() {
    return avatar;
  }
  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Whyline {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  whyline: ").append(whyline).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  avatar: ").append(avatar).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

