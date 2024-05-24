package com.lacunasoftware.client.api;

import com.lacunasoftware.client.ApiClient;

import com.lacunasoftware.client.model.FileReferenceModel;
import com.lacunasoftware.client.model.MultipartUploadBeginResponse;
import com.lacunasoftware.client.model.MultipartUploadEndRequest;

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
public class UploadApi {
    private ApiClient apiClient;

    public UploadApi() {
        this(new ApiClient());
    }

    @Autowired
    public UploadApi(ApiClient apiClient) {
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
     * @return MultipartUploadBeginResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiMultipartUploadsPostRequestCreation() throws RestClientResponseException {
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

        ParameterizedTypeReference<MultipartUploadBeginResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/MultipartUploads", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @return MultipartUploadBeginResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public MultipartUploadBeginResponse apiMultipartUploadsPost() throws RestClientResponseException {
        ParameterizedTypeReference<MultipartUploadBeginResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiMultipartUploadsPostRequestCreation().body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @return ResponseEntity&lt;MultipartUploadBeginResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MultipartUploadBeginResponse> apiMultipartUploadsPostWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<MultipartUploadBeginResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiMultipartUploadsPostRequestCreation().toEntity(localVarReturnType);
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
    public ResponseSpec apiMultipartUploadsPostWithResponseSpec() throws RestClientResponseException {
        return apiMultipartUploadsPostRequestCreation();
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param token The token parameter
     * @param partNumber The partNumber parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiMultipartUploadsTokenPartNumberPostRequestCreation(String token, Integer partNumber) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new RestClientResponseException("Missing the required parameter 'token' when calling apiMultipartUploadsTokenPartNumberPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'partNumber' is set
        if (partNumber == null) {
            throw new RestClientResponseException("Missing the required parameter 'partNumber' when calling apiMultipartUploadsTokenPartNumberPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("token", token);
        pathParams.put("partNumber", partNumber);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/MultipartUploads/{token}/{partNumber}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param token The token parameter
     * @param partNumber The partNumber parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void apiMultipartUploadsTokenPartNumberPost(String token, Integer partNumber) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        apiMultipartUploadsTokenPartNumberPostRequestCreation(token, partNumber).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param token The token parameter
     * @param partNumber The partNumber parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiMultipartUploadsTokenPartNumberPostWithHttpInfo(String token, Integer partNumber) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiMultipartUploadsTokenPartNumberPostRequestCreation(token, partNumber).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param token The token parameter
     * @param partNumber The partNumber parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiMultipartUploadsTokenPartNumberPostWithResponseSpec(String token, Integer partNumber) throws RestClientResponseException {
        return apiMultipartUploadsTokenPartNumberPostRequestCreation(token, partNumber);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param token The token parameter
     * @param multipartUploadEndRequest The multipartUploadEndRequest parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiMultipartUploadsTokenPostRequestCreation(String token, MultipartUploadEndRequest multipartUploadEndRequest) throws RestClientResponseException {
        Object postBody = multipartUploadEndRequest;
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new RestClientResponseException("Missing the required parameter 'token' when calling apiMultipartUploadsTokenPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("token", token);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json-patch+json", "application/json", "text/json", "application/*+json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/MultipartUploads/{token}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param token The token parameter
     * @param multipartUploadEndRequest The multipartUploadEndRequest parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void apiMultipartUploadsTokenPost(String token, MultipartUploadEndRequest multipartUploadEndRequest) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        apiMultipartUploadsTokenPostRequestCreation(token, multipartUploadEndRequest).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param token The token parameter
     * @param multipartUploadEndRequest The multipartUploadEndRequest parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiMultipartUploadsTokenPostWithHttpInfo(String token, MultipartUploadEndRequest multipartUploadEndRequest) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiMultipartUploadsTokenPostRequestCreation(token, multipartUploadEndRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param token The token parameter
     * @param multipartUploadEndRequest The multipartUploadEndRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiMultipartUploadsTokenPostWithResponseSpec(String token, MultipartUploadEndRequest multipartUploadEndRequest) throws RestClientResponseException {
        return apiMultipartUploadsTokenPostRequestCreation(token, multipartUploadEndRequest);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @return FileReferenceModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiPlainUploadsPostRequestCreation() throws RestClientResponseException {
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

        ParameterizedTypeReference<FileReferenceModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/plain-uploads", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @return FileReferenceModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public FileReferenceModel apiPlainUploadsPost() throws RestClientResponseException {
        ParameterizedTypeReference<FileReferenceModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPlainUploadsPostRequestCreation().body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @return ResponseEntity&lt;FileReferenceModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FileReferenceModel> apiPlainUploadsPostWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<FileReferenceModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPlainUploadsPostRequestCreation().toEntity(localVarReturnType);
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
    public ResponseSpec apiPlainUploadsPostWithResponseSpec() throws RestClientResponseException {
        return apiPlainUploadsPostRequestCreation();
    }
}
