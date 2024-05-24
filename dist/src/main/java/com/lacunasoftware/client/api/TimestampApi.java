package com.lacunasoftware.client.api;

import com.lacunasoftware.client.ApiClient;

import com.lacunasoftware.client.model.DigestAlgorithmAndValueModel;
import com.lacunasoftware.client.model.TimestampIssueResponse;

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
public class TimestampApi {
    private ApiClient apiClient;

    public TimestampApi() {
        this(new ApiClient());
    }

    @Autowired
    public TimestampApi(ApiClient apiClient) {
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
     * @param identifier The identifier parameter
     * @param digestAlgorithmAndValueModel The digestAlgorithmAndValueModel parameter
     * @return TimestampIssueResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiTimestampPlansIdentifierIssuePostRequestCreation(String identifier, DigestAlgorithmAndValueModel digestAlgorithmAndValueModel) throws RestClientResponseException {
        Object postBody = digestAlgorithmAndValueModel;
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new RestClientResponseException("Missing the required parameter 'identifier' when calling apiTimestampPlansIdentifierIssuePost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("identifier", identifier);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/*+json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<TimestampIssueResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/TimestampPlans/{identifier}/Issue", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param identifier The identifier parameter
     * @param digestAlgorithmAndValueModel The digestAlgorithmAndValueModel parameter
     * @return TimestampIssueResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public TimestampIssueResponse apiTimestampPlansIdentifierIssuePost(String identifier, DigestAlgorithmAndValueModel digestAlgorithmAndValueModel) throws RestClientResponseException {
        ParameterizedTypeReference<TimestampIssueResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiTimestampPlansIdentifierIssuePostRequestCreation(identifier, digestAlgorithmAndValueModel).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param identifier The identifier parameter
     * @param digestAlgorithmAndValueModel The digestAlgorithmAndValueModel parameter
     * @return ResponseEntity&lt;TimestampIssueResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TimestampIssueResponse> apiTimestampPlansIdentifierIssuePostWithHttpInfo(String identifier, DigestAlgorithmAndValueModel digestAlgorithmAndValueModel) throws RestClientResponseException {
        ParameterizedTypeReference<TimestampIssueResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiTimestampPlansIdentifierIssuePostRequestCreation(identifier, digestAlgorithmAndValueModel).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param identifier The identifier parameter
     * @param digestAlgorithmAndValueModel The digestAlgorithmAndValueModel parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiTimestampPlansIdentifierIssuePostWithResponseSpec(String identifier, DigestAlgorithmAndValueModel digestAlgorithmAndValueModel) throws RestClientResponseException {
        return apiTimestampPlansIdentifierIssuePostRequestCreation(identifier, digestAlgorithmAndValueModel);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param identifier The identifier parameter
     * @param digestAlgorithmAndValueModel The digestAlgorithmAndValueModel parameter
     * @return TimestampIssueResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiTspIdentifierPostRequestCreation(String identifier, DigestAlgorithmAndValueModel digestAlgorithmAndValueModel) throws RestClientResponseException {
        Object postBody = digestAlgorithmAndValueModel;
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new RestClientResponseException("Missing the required parameter 'identifier' when calling apiTspIdentifierPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("identifier", identifier);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/*+json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<TimestampIssueResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/tsp/{identifier}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param identifier The identifier parameter
     * @param digestAlgorithmAndValueModel The digestAlgorithmAndValueModel parameter
     * @return TimestampIssueResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public TimestampIssueResponse apiTspIdentifierPost(String identifier, DigestAlgorithmAndValueModel digestAlgorithmAndValueModel) throws RestClientResponseException {
        ParameterizedTypeReference<TimestampIssueResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiTspIdentifierPostRequestCreation(identifier, digestAlgorithmAndValueModel).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param identifier The identifier parameter
     * @param digestAlgorithmAndValueModel The digestAlgorithmAndValueModel parameter
     * @return ResponseEntity&lt;TimestampIssueResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TimestampIssueResponse> apiTspIdentifierPostWithHttpInfo(String identifier, DigestAlgorithmAndValueModel digestAlgorithmAndValueModel) throws RestClientResponseException {
        ParameterizedTypeReference<TimestampIssueResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiTspIdentifierPostRequestCreation(identifier, digestAlgorithmAndValueModel).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param identifier The identifier parameter
     * @param digestAlgorithmAndValueModel The digestAlgorithmAndValueModel parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiTspIdentifierPostWithResponseSpec(String identifier, DigestAlgorithmAndValueModel digestAlgorithmAndValueModel) throws RestClientResponseException {
        return apiTspIdentifierPostRequestCreation(identifier, digestAlgorithmAndValueModel);
    }
}
