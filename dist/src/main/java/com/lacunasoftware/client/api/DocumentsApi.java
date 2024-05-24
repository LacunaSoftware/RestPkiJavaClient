package com.lacunasoftware.client.api;

import com.lacunasoftware.client.ApiClient;

import com.lacunasoftware.client.model.DocumentModel;
import com.lacunasoftware.client.model.DocumentQueryResponse;
import com.lacunasoftware.client.model.SignerModel;
import java.util.UUID;

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
public class DocumentsApi {
    private ApiClient apiClient;

    public DocumentsApi() {
        this(new ApiClient());
    }

    @Autowired
    public DocumentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieves a document&#39;s details
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return DocumentModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiDocumentsIdGetRequestCreation(UUID id) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling apiDocumentsIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("id", id);

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

        ParameterizedTypeReference<DocumentModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/documents/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieves a document&#39;s details
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return DocumentModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public DocumentModel apiDocumentsIdGet(UUID id) throws RestClientResponseException {
        ParameterizedTypeReference<DocumentModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiDocumentsIdGetRequestCreation(id).body(localVarReturnType);
    }

    /**
     * Retrieves a document&#39;s details
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return ResponseEntity&lt;DocumentModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentModel> apiDocumentsIdGetWithHttpInfo(UUID id) throws RestClientResponseException {
        ParameterizedTypeReference<DocumentModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiDocumentsIdGetRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieves a document&#39;s details
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiDocumentsIdGetWithResponseSpec(UUID id) throws RestClientResponseException {
        return apiDocumentsIdGetRequestCreation(id);
    }
    /**
     * Retrieves the full information about each of a document&#39;s signers
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return List&lt;SignerModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiDocumentsIdSignersGetRequestCreation(UUID id) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling apiDocumentsIdSignersGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("id", id);

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

        ParameterizedTypeReference<List<SignerModel>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/documents/{id}/signers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieves the full information about each of a document&#39;s signers
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return List&lt;SignerModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<SignerModel> apiDocumentsIdSignersGet(UUID id) throws RestClientResponseException {
        ParameterizedTypeReference<List<SignerModel>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiDocumentsIdSignersGetRequestCreation(id).body(localVarReturnType);
    }

    /**
     * Retrieves the full information about each of a document&#39;s signers
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return ResponseEntity&lt;List&lt;SignerModel&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SignerModel>> apiDocumentsIdSignersGetWithHttpInfo(UUID id) throws RestClientResponseException {
        ParameterizedTypeReference<List<SignerModel>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiDocumentsIdSignersGetRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieves the full information about each of a document&#39;s signers
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiDocumentsIdSignersGetWithResponseSpec(UUID id) throws RestClientResponseException {
        return apiDocumentsIdSignersGetRequestCreation(id);
    }
    /**
     * Finds a document&#39;s details by its key
     * The key may be given either in formatted form (e.g. *XXXX-XXXX-XXXX-XXXX*) or unformatted (e.g. *XXXXXXXXXXXXXXXX*)    If a document with the given key is not found, the response is a &#x60;200 (Success)&#x60; with &#x60;\&quot;found\&quot;: false&#x60;.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param key The key parameter
     * @return DocumentQueryResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiDocumentsKeysKeyGetRequestCreation(String key) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new RestClientResponseException("Missing the required parameter 'key' when calling apiDocumentsKeysKeyGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("key", key);

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

        ParameterizedTypeReference<DocumentQueryResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/documents/keys/{key}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Finds a document&#39;s details by its key
     * The key may be given either in formatted form (e.g. *XXXX-XXXX-XXXX-XXXX*) or unformatted (e.g. *XXXXXXXXXXXXXXXX*)    If a document with the given key is not found, the response is a &#x60;200 (Success)&#x60; with &#x60;\&quot;found\&quot;: false&#x60;.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param key The key parameter
     * @return DocumentQueryResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public DocumentQueryResponse apiDocumentsKeysKeyGet(String key) throws RestClientResponseException {
        ParameterizedTypeReference<DocumentQueryResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiDocumentsKeysKeyGetRequestCreation(key).body(localVarReturnType);
    }

    /**
     * Finds a document&#39;s details by its key
     * The key may be given either in formatted form (e.g. *XXXX-XXXX-XXXX-XXXX*) or unformatted (e.g. *XXXXXXXXXXXXXXXX*)    If a document with the given key is not found, the response is a &#x60;200 (Success)&#x60; with &#x60;\&quot;found\&quot;: false&#x60;.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param key The key parameter
     * @return ResponseEntity&lt;DocumentQueryResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentQueryResponse> apiDocumentsKeysKeyGetWithHttpInfo(String key) throws RestClientResponseException {
        ParameterizedTypeReference<DocumentQueryResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiDocumentsKeysKeyGetRequestCreation(key).toEntity(localVarReturnType);
    }

    /**
     * Finds a document&#39;s details by its key
     * The key may be given either in formatted form (e.g. *XXXX-XXXX-XXXX-XXXX*) or unformatted (e.g. *XXXXXXXXXXXXXXXX*)    If a document with the given key is not found, the response is a &#x60;200 (Success)&#x60; with &#x60;\&quot;found\&quot;: false&#x60;.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param key The key parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiDocumentsKeysKeyGetWithResponseSpec(String key) throws RestClientResponseException {
        return apiDocumentsKeysKeyGetRequestCreation(key);
    }
}
