package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StringResult {
  @JsonProperty("value")
  private String value = null;
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringResult {\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

