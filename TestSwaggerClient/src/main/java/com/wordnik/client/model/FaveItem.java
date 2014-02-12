package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FaveItem {
  /* The song name */
  @JsonProperty("song")
  private String song = null;
  @JsonProperty("artist")
  private String artist = null;
  @JsonProperty("songID")
  private String songID = null;
  @JsonProperty("whyline")
  private String whyline = null;
  @JsonProperty("id")
  private String id = null;
  public String getSong() {
    return song;
  }
  public void setSong(String song) {
    this.song = song;
  }

  public String getArtist() {
    return artist;
  }
  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getSongID() {
    return songID;
  }
  public void setSongID(String songID) {
    this.songID = songID;
  }

  public String getWhyline() {
    return whyline;
  }
  public void setWhyline(String whyline) {
    this.whyline = whyline;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaveItem {\n");
    sb.append("  song: ").append(song).append("\n");
    sb.append("  artist: ").append(artist).append("\n");
    sb.append("  songID: ").append(songID).append("\n");
    sb.append("  whyline: ").append(whyline).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

