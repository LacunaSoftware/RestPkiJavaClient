package com.lacunasoftware.client.api;

import com.lacunasoftware.client.ApiClient;

import com.lacunasoftware.client.model.CompleteSignatureRequestV2;
import com.lacunasoftware.client.model.DocumentModel;
import com.lacunasoftware.client.model.PrepareSignatureRequest;
import com.lacunasoftware.client.model.PrepareSignatureResponse;

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
public class SignatureApi {
    private ApiClient apiClient;

    public SignatureApi() {
        this(new ApiClient());
    }

    @Autowired
    public SignatureApi(ApiClient apiClient) {
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
     * @param completeSignatureRequestV2 The completeSignatureRequestV2 parameter
     * @return DocumentModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiSignatureCompletionPostRequestCreation(CompleteSignatureRequestV2 completeSignatureRequestV2) throws RestClientResponseException {
        Object postBody = completeSignatureRequestV2;
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
        final String[] localVarContentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/*+json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<DocumentModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/signature/completion", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param completeSignatureRequestV2 The completeSignatureRequestV2 parameter
     * @return DocumentModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public DocumentModel apiSignatureCompletionPost(CompleteSignatureRequestV2 completeSignatureRequestV2) throws RestClientResponseException {
        ParameterizedTypeReference<DocumentModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiSignatureCompletionPostRequestCreation(completeSignatureRequestV2).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param completeSignatureRequestV2 The completeSignatureRequestV2 parameter
     * @return ResponseEntity&lt;DocumentModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentModel> apiSignatureCompletionPostWithHttpInfo(CompleteSignatureRequestV2 completeSignatureRequestV2) throws RestClientResponseException {
        ParameterizedTypeReference<DocumentModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiSignatureCompletionPostRequestCreation(completeSignatureRequestV2).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param completeSignatureRequestV2 The completeSignatureRequestV2 parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiSignatureCompletionPostWithResponseSpec(CompleteSignatureRequestV2 completeSignatureRequestV2) throws RestClientResponseException {
        return apiSignatureCompletionPostRequestCreation(completeSignatureRequestV2);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param prepareSignatureRequest The prepareSignatureRequest parameter
     * @return PrepareSignatureResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiSignaturePostRequestCreation(PrepareSignatureRequest prepareSignatureRequest) throws RestClientResponseException {
        Object postBody = prepareSignatureRequest;
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
        final String[] localVarContentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/*+json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PrepareSignatureResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/signature", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param prepareSignatureRequest The prepareSignatureRequest parameter
     * @return PrepareSignatureResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public PrepareSignatureResponse apiSignaturePost(PrepareSignatureRequest prepareSignatureRequest) throws RestClientResponseException {
        ParameterizedTypeReference<PrepareSignatureResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiSignaturePostRequestCreation(prepareSignatureRequest).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param prepareSignatureRequest The prepareSignatureRequest parameter
     * @return ResponseEntity&lt;PrepareSignatureResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PrepareSignatureResponse> apiSignaturePostWithHttpInfo(PrepareSignatureRequest prepareSignatureRequest) throws RestClientResponseException {
        ParameterizedTypeReference<PrepareSignatureResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiSignaturePostRequestCreation(prepareSignatureRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param prepareSignatureRequest The prepareSignatureRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiSignaturePostWithResponseSpec(PrepareSignatureRequest prepareSignatureRequest) throws RestClientResponseException {
        return apiSignaturePostRequestCreation(prepareSignatureRequest);
    }
}
