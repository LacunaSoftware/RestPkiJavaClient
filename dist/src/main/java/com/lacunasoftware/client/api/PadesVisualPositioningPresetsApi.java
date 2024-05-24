package com.lacunasoftware.client.api;

import com.lacunasoftware.client.ApiClient;

import com.lacunasoftware.client.model.PadesVisualPositioningModel;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestClient.ResponseSpec;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class PadesVisualPositioningPresetsApi {
    private ApiClient apiClient;

    public PadesVisualPositioningPresetsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PadesVisualPositioningPresetsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param pageNumber The pageNumber parameter
     * @return PadesVisualPositioningModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiPadesVisualPositioningPresetsFootnoteBottomUpGetRequestCreation(Integer pageNumber) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        
        final String[] localVarAccepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PadesVisualPositioningModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/PadesVisualPositioningPresets/FootnoteBottomUp", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param pageNumber The pageNumber parameter
     * @return PadesVisualPositioningModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public PadesVisualPositioningModel apiPadesVisualPositioningPresetsFootnoteBottomUpGet(Integer pageNumber) throws RestClientResponseException {
        ParameterizedTypeReference<PadesVisualPositioningModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPadesVisualPositioningPresetsFootnoteBottomUpGetRequestCreation(pageNumber).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param pageNumber The pageNumber parameter
     * @return ResponseEntity&lt;PadesVisualPositioningModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PadesVisualPositioningModel> apiPadesVisualPositioningPresetsFootnoteBottomUpGetWithHttpInfo(Integer pageNumber) throws RestClientResponseException {
        ParameterizedTypeReference<PadesVisualPositioningModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPadesVisualPositioningPresetsFootnoteBottomUpGetRequestCreation(pageNumber).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param pageNumber The pageNumber parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiPadesVisualPositioningPresetsFootnoteBottomUpGetWithResponseSpec(Integer pageNumber) throws RestClientResponseException {
        return apiPadesVisualPositioningPresetsFootnoteBottomUpGetRequestCreation(pageNumber);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param pageNumber The pageNumber parameter
     * @param rows The rows parameter
     * @return PadesVisualPositioningModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiPadesVisualPositioningPresetsFootnoteGetRequestCreation(Integer pageNumber, Integer rows) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "rows", rows));
        
        final String[] localVarAccepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PadesVisualPositioningModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/PadesVisualPositioningPresets/Footnote", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param pageNumber The pageNumber parameter
     * @param rows The rows parameter
     * @return PadesVisualPositioningModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public PadesVisualPositioningModel apiPadesVisualPositioningPresetsFootnoteGet(Integer pageNumber, Integer rows) throws RestClientResponseException {
        ParameterizedTypeReference<PadesVisualPositioningModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPadesVisualPositioningPresetsFootnoteGetRequestCreation(pageNumber, rows).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param pageNumber The pageNumber parameter
     * @param rows The rows parameter
     * @return ResponseEntity&lt;PadesVisualPositioningModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PadesVisualPositioningModel> apiPadesVisualPositioningPresetsFootnoteGetWithHttpInfo(Integer pageNumber, Integer rows) throws RestClientResponseException {
        ParameterizedTypeReference<PadesVisualPositioningModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPadesVisualPositioningPresetsFootnoteGetRequestCreation(pageNumber, rows).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param pageNumber The pageNumber parameter
     * @param rows The rows parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiPadesVisualPositioningPresetsFootnoteGetWithResponseSpec(Integer pageNumber, Integer rows) throws RestClientResponseException {
        return apiPadesVisualPositioningPresetsFootnoteGetRequestCreation(pageNumber, rows);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @return PadesVisualPositioningModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiPadesVisualPositioningPresetsNewPageGetRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PadesVisualPositioningModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/PadesVisualPositioningPresets/NewPage", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @return PadesVisualPositioningModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public PadesVisualPositioningModel apiPadesVisualPositioningPresetsNewPageGet() throws RestClientResponseException {
        ParameterizedTypeReference<PadesVisualPositioningModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPadesVisualPositioningPresetsNewPageGetRequestCreation().body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @return ResponseEntity&lt;PadesVisualPositioningModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PadesVisualPositioningModel> apiPadesVisualPositioningPresetsNewPageGetWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<PadesVisualPositioningModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPadesVisualPositioningPresetsNewPageGetRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiPadesVisualPositioningPresetsNewPageGetWithResponseSpec() throws RestClientResponseException {
        return apiPadesVisualPositioningPresetsNewPageGetRequestCreation();
    }
}
