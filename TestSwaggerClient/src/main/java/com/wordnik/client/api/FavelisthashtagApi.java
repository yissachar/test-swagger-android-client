package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.client.model.FaveItemCollection;
import java.util.*;

public class FavelisthashtagApi {
  String basePath = "http://host:port/apis";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  public FaveItemCollection getMasterFaveList (String hashtag) throws ApiException {
    // verify required params are set
    if(hashtag == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/favelist{hashtag}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "hashtag" + "\\}", apiInvoker.escapeString(hashtag.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (FaveItemCollection) ApiInvoker.deserialize(response, "", FaveItemCollection.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  }

