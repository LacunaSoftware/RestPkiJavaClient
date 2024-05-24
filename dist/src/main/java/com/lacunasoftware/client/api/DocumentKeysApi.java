package com.lacunasoftware.client.api;

import com.lacunasoftware.client.ApiClient;

import com.lacunasoftware.client.model.AllocateDocumentKeyBatchRequest;
import com.lacunasoftware.client.model.AllocateDocumentKeyRequest;
import com.lacunasoftware.client.model.DocumentKeyModel;
import com.lacunasoftware.client.model.DocumentKeyQueryResponse;
import com.lacunasoftware.client.model.DocumentKeySummary;

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
public class DocumentKeysApi {
    private ApiClient apiClient;

    public DocumentKeysApi() {
        this(new ApiClient());
    }

    @Autowired
    public DocumentKeysApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Allocates a batch of document keys to be used later on document signatures
     * At most 100 keys may be allocated on each request. Limitations on the total number of unused document keys allocated may apply.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param allocateDocumentKeyBatchRequest The allocateDocumentKeyBatchRequest parameter
     * @return List&lt;DocumentKeyModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiDocumentKeysBatchPostRequestCreation(AllocateDocumentKeyBatchRequest allocateDocumentKeyBatchRequest) throws RestClientResponseException {
        Object postBody = allocateDocumentKeyBatchRequest;
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

        ParameterizedTypeReference<List<DocumentKeyModel>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/document-keys/batch", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Allocates a batch of document keys to be used later on document signatures
     * At most 100 keys may be allocated on each request. Limitations on the total number of unused document keys allocated may apply.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param allocateDocumentKeyBatchRequest The allocateDocumentKeyBatchRequest parameter
     * @return List&lt;DocumentKeyModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<DocumentKeyModel> apiDocumentKeysBatchPost(AllocateDocumentKeyBatchRequest allocateDocumentKeyBatchRequest) throws RestClientResponseException {
        ParameterizedTypeReference<List<DocumentKeyModel>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiDocumentKeysBatchPostRequestCreation(allocateDocumentKeyBatchRequest).body(localVarReturnType);
    }

    /**
     * Allocates a batch of document keys to be used later on document signatures
     * At most 100 keys may be allocated on each request. Limitations on the total number of unused document keys allocated may apply.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param allocateDocumentKeyBatchRequest The allocateDocumentKeyBatchRequest parameter
     * @return ResponseEntity&lt;List&lt;DocumentKeyModel&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<DocumentKeyModel>> apiDocumentKeysBatchPostWithHttpInfo(AllocateDocumentKeyBatchRequest allocateDocumentKeyBatchRequest) throws RestClientResponseException {
        ParameterizedTypeReference<List<DocumentKeyModel>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiDocumentKeysBatchPostRequestCreation(allocateDocumentKeyBatchRequest).toEntity(localVarReturnType);
    }

    /**
     * Allocates a batch of document keys to be used later on document signatures
     * At most 100 keys may be allocated on each request. Limitations on the total number of unused document keys allocated may apply.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param allocateDocumentKeyBatchRequest The allocateDocumentKeyBatchRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiDocumentKeysBatchPostWithResponseSpec(AllocateDocumentKeyBatchRequest allocateDocumentKeyBatchRequest) throws RestClientResponseException {
        return apiDocumentKeysBatchPostRequestCreation(allocateDocumentKeyBatchRequest);
    }
    /**
     * Queries documents by key
     * The key may be given either in formatted form (e.g. *XXXX-XXXX-XXXX-XXXX*) or unformatted (e.g. *XXXXXXXXXXXXXXXX*)    If a document with the given key is not found, the response is a &#x60;200 (Success)&#x60; with &#x60;\&quot;found\&quot;: false&#x60;.    If the given key has been allocated in advance but is not yet associated with a document, the response is a &#x60;200 (Success)&#x60;  with &#x60;\&quot;found\&quot;: true&#x60; and &#x60;\&quot;hasDocument\&quot;: false&#x60;. In this case, the field &#x60;provisionalMetadata&#x60; contains any provisional metadata  passed during the document key allocation, which serves as an indicative of the metadata that a future document will likely have.    Only if &#x60;\&quot;found\&quot;: true&#x60; **and** &#x60;\&quot;hasDocument\&quot;: true&#x60; is the field &#x60;document&#x60; filled. In this case, &#x60;provisionalMetadata&#x60; is not filled.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param key The key parameter
     * @return DocumentKeyQueryResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiDocumentKeysKeyGetRequestCreation(String key) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new RestClientResponseException("Missing the required parameter 'key' when calling apiDocumentKeysKeyGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentKeyQueryResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/document-keys/{key}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Queries documents by key
     * The key may be given either in formatted form (e.g. *XXXX-XXXX-XXXX-XXXX*) or unformatted (e.g. *XXXXXXXXXXXXXXXX*)    If a document with the given key is not found, the response is a &#x60;200 (Success)&#x60; with &#x60;\&quot;found\&quot;: false&#x60;.    If the given key has been allocated in advance but is not yet associated with a document, the response is a &#x60;200 (Success)&#x60;  with &#x60;\&quot;found\&quot;: true&#x60; and &#x60;\&quot;hasDocument\&quot;: false&#x60;. In this case, the field &#x60;provisionalMetadata&#x60; contains any provisional metadata  passed during the document key allocation, which serves as an indicative of the metadata that a future document will likely have.    Only if &#x60;\&quot;found\&quot;: true&#x60; **and** &#x60;\&quot;hasDocument\&quot;: true&#x60; is the field &#x60;document&#x60; filled. In this case, &#x60;provisionalMetadata&#x60; is not filled.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param key The key parameter
     * @return DocumentKeyQueryResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public DocumentKeyQueryResponse apiDocumentKeysKeyGet(String key) throws RestClientResponseException {
        ParameterizedTypeReference<DocumentKeyQueryResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiDocumentKeysKeyGetRequestCreation(key).body(localVarReturnType);
    }

    /**
     * Queries documents by key
     * The key may be given either in formatted form (e.g. *XXXX-XXXX-XXXX-XXXX*) or unformatted (e.g. *XXXXXXXXXXXXXXXX*)    If a document with the given key is not found, the response is a &#x60;200 (Success)&#x60; with &#x60;\&quot;found\&quot;: false&#x60;.    If the given key has been allocated in advance but is not yet associated with a document, the response is a &#x60;200 (Success)&#x60;  with &#x60;\&quot;found\&quot;: true&#x60; and &#x60;\&quot;hasDocument\&quot;: false&#x60;. In this case, the field &#x60;provisionalMetadata&#x60; contains any provisional metadata  passed during the document key allocation, which serves as an indicative of the metadata that a future document will likely have.    Only if &#x60;\&quot;found\&quot;: true&#x60; **and** &#x60;\&quot;hasDocument\&quot;: true&#x60; is the field &#x60;document&#x60; filled. In this case, &#x60;provisionalMetadata&#x60; is not filled.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param key The key parameter
     * @return ResponseEntity&lt;DocumentKeyQueryResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentKeyQueryResponse> apiDocumentKeysKeyGetWithHttpInfo(String key) throws RestClientResponseException {
        ParameterizedTypeReference<DocumentKeyQueryResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiDocumentKeysKeyGetRequestCreation(key).toEntity(localVarReturnType);
    }

    /**
     * Queries documents by key
     * The key may be given either in formatted form (e.g. *XXXX-XXXX-XXXX-XXXX*) or unformatted (e.g. *XXXXXXXXXXXXXXXX*)    If a document with the given key is not found, the response is a &#x60;200 (Success)&#x60; with &#x60;\&quot;found\&quot;: false&#x60;.    If the given key has been allocated in advance but is not yet associated with a document, the response is a &#x60;200 (Success)&#x60;  with &#x60;\&quot;found\&quot;: true&#x60; and &#x60;\&quot;hasDocument\&quot;: false&#x60;. In this case, the field &#x60;provisionalMetadata&#x60; contains any provisional metadata  passed during the document key allocation, which serves as an indicative of the metadata that a future document will likely have.    Only if &#x60;\&quot;found\&quot;: true&#x60; **and** &#x60;\&quot;hasDocument\&quot;: true&#x60; is the field &#x60;document&#x60; filled. In this case, &#x60;provisionalMetadata&#x60; is not filled.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param key The key parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiDocumentKeysKeyGetWithResponseSpec(String key) throws RestClientResponseException {
        return apiDocumentKeysKeyGetRequestCreation(key);
    }
    /**
     * Allocates a document key to be used later on a document signature
     * To allocate a number of document keys at once, use the &#x60;POST /api/document-keys/batch&#x60; API instead. Limitations on the total number of unused document keys allocated may apply.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param allocateDocumentKeyRequest The allocateDocumentKeyRequest parameter
     * @return DocumentKeyModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiDocumentKeysPostRequestCreation(AllocateDocumentKeyRequest allocateDocumentKeyRequest) throws RestClientResponseException {
        Object postBody = allocateDocumentKeyRequest;
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

        ParameterizedTypeReference<DocumentKeyModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/document-keys", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Allocates a document key to be used later on a document signature
     * To allocate a number of document keys at once, use the &#x60;POST /api/document-keys/batch&#x60; API instead. Limitations on the total number of unused document keys allocated may apply.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param allocateDocumentKeyRequest The allocateDocumentKeyRequest parameter
     * @return DocumentKeyModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public DocumentKeyModel apiDocumentKeysPost(AllocateDocumentKeyRequest allocateDocumentKeyRequest) throws RestClientResponseException {
        ParameterizedTypeReference<DocumentKeyModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiDocumentKeysPostRequestCreation(allocateDocumentKeyRequest).body(localVarReturnType);
    }

    /**
     * Allocates a document key to be used later on a document signature
     * To allocate a number of document keys at once, use the &#x60;POST /api/document-keys/batch&#x60; API instead. Limitations on the total number of unused document keys allocated may apply.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param allocateDocumentKeyRequest The allocateDocumentKeyRequest parameter
     * @return ResponseEntity&lt;DocumentKeyModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DocumentKeyModel> apiDocumentKeysPostWithHttpInfo(AllocateDocumentKeyRequest allocateDocumentKeyRequest) throws RestClientResponseException {
        ParameterizedTypeReference<DocumentKeyModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiDocumentKeysPostRequestCreation(allocateDocumentKeyRequest).toEntity(localVarReturnType);
    }

    /**
     * Allocates a document key to be used later on a document signature
     * To allocate a number of document keys at once, use the &#x60;POST /api/document-keys/batch&#x60; API instead. Limitations on the total number of unused document keys allocated may apply.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param allocateDocumentKeyRequest The allocateDocumentKeyRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiDocumentKeysPostWithResponseSpec(AllocateDocumentKeyRequest allocateDocumentKeyRequest) throws RestClientResponseException {
        return apiDocumentKeysPostRequestCreation(allocateDocumentKeyRequest);
    }
    /**
     * Queries unused document keys
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param metadataName The metadataName parameter
     * @param metadataValue The metadataValue parameter
     * @return List&lt;DocumentKeySummary&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiDocumentKeysUnusedGetRequestCreation(String metadataName, String metadataValue) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "metadataName", metadataName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "metadataValue", metadataValue));
        
        final String[] localVarAccepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<DocumentKeySummary>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/document-keys/unused", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Queries unused document keys
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param metadataName The metadataName parameter
     * @param metadataValue The metadataValue parameter
     * @return List&lt;DocumentKeySummary&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<DocumentKeySummary> apiDocumentKeysUnusedGet(String metadataName, String metadataValue) throws RestClientResponseException {
        ParameterizedTypeReference<List<DocumentKeySummary>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiDocumentKeysUnusedGetRequestCreation(metadataName, metadataValue).body(localVarReturnType);
    }

    /**
     * Queries unused document keys
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param metadataName The metadataName parameter
     * @param metadataValue The metadataValue parameter
     * @return ResponseEntity&lt;List&lt;DocumentKeySummary&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<DocumentKeySummary>> apiDocumentKeysUnusedGetWithHttpInfo(String metadataName, String metadataValue) throws RestClientResponseException {
        ParameterizedTypeReference<List<DocumentKeySummary>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiDocumentKeysUnusedGetRequestCreation(metadataName, metadataValue).toEntity(localVarReturnType);
    }

    /**
     * Queries unused document keys
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param metadataName The metadataName parameter
     * @param metadataValue The metadataValue parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiDocumentKeysUnusedGetWithResponseSpec(String metadataName, String metadataValue) throws RestClientResponseException {
        return apiDocumentKeysUnusedGetRequestCreation(metadataName, metadataValue);
    }
}
