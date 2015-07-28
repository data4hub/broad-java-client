package com.rest4hub.api;

import com.rest4hub.ApiException;
import com.rest4hub.ApiClient;
import com.rest4hub.Configuration;

import com.rest4hub.model.*;

import java.util.*;

import com.rest4hub.model.Banco;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class BankApi {
  private ApiClient apiClient;

  public BankApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BankApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Encontra uma lista de bancos pelo nome
   * 
   * @param nome Nome a ser localizado
   * @return List<Banco>
   */
  public List<Banco> findByName (String nome) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'nome' is set
    if (nome == null) {
       throw new ApiException(400, "Missing the required parameter 'nome' when calling findByName");
    }
    

    // create path and map variables
    String path = "/v1/bank/name/{nome}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "nome" + "\\}", apiClient.escapeString(nome.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    final String[] accepts = {
      "application/json", "application/xml"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] {  };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (List<Banco>) apiClient.deserialize(response, "array", Banco.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Encontra um banco pelo ISPB ou código do banco
   * 
   * @param ispbOuCodigo ISPB ou código do banco a ser localizado
   * @return Banco
   */
  public Banco find (String ispbOuCodigo) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'ispbOuCodigo' is set
    if (ispbOuCodigo == null) {
       throw new ApiException(400, "Missing the required parameter 'ispbOuCodigo' when calling find");
    }
    

    // create path and map variables
    String path = "/v1/bank/{ispbOuCodigo}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ispbOuCodigo" + "\\}", apiClient.escapeString(ispbOuCodigo.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    final String[] accepts = {
      "application/json", "application/xml"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] {  };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (Banco) apiClient.deserialize(response, "", Banco.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
