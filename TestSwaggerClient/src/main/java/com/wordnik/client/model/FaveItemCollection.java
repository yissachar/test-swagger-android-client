package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
import com.wordnik.client.model.FaveItem;
public class FaveItemCollection {
  /* A list of FaveItems */
  @JsonProperty("items")
  private List<FaveItem> items = new ArrayList<FaveItem>();
  public List<FaveItem> getItems() {
    return items;
  }
  public void setItems(List<FaveItem> items) {
    this.items = items;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaveItemCollection {\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

