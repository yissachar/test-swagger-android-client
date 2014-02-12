package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
import com.wordnik.client.model.StringResult;
public class StringResultCollection {
  @JsonProperty("items")
  private List<StringResult> items = new ArrayList<StringResult>();
  public List<StringResult> getItems() {
    return items;
  }
  public void setItems(List<StringResult> items) {
    this.items = items;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringResultCollection {\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

