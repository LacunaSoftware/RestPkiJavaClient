package com.lacunasoftware.client.api;

import com.lacunasoftware.client.ApiClient;

import com.lacunasoftware.client.model.AuthenticationGetResponse;
import com.lacunasoftware.client.model.AuthenticationPostRequest;
import com.lacunasoftware.client.model.AuthenticationPostResponse;
import com.lacunasoftware.client.model.AuthenticationsPostRequest;
import com.lacunasoftware.client.model.AuthenticationsPostResponse;
import com.lacunasoftware.client.model.AuthenticationsPostSignedBytesRequest;
import com.lacunasoftware.client.model.AuthenticationsPostSignedBytesResponse;
import com.lacunasoftware.client.model.CompleteAuthenticationRequest;
import com.lacunasoftware.client.model.CompleteAuthenticationResponse;
import com.lacunasoftware.client.model.PrepareAuthenticationRequest;
import com.lacunasoftware.client.model.PrepareAuthenticationResponse;

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
public class AuthenticationApi {
    private ApiClient apiClient;

    public AuthenticationApi() {
        this(new ApiClient());
    }

    @Autowired
    public AuthenticationApi(ApiClient apiClient) {
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
     * @return AuthenticationGetResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiAuthenticationGetRequestCreation() throws RestClientResponseException {
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

        ParameterizedTypeReference<AuthenticationGetResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/Authentication", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @return AuthenticationGetResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public AuthenticationGetResponse apiAuthenticationGet() throws RestClientResponseException {
        ParameterizedTypeReference<AuthenticationGetResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiAuthenticationGetRequestCreation().body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @return ResponseEntity&lt;AuthenticationGetResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthenticationGetResponse> apiAuthenticationGetWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<AuthenticationGetResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiAuthenticationGetRequestCreation().toEntity(localVarReturnType);
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
    public ResponseSpec apiAuthenticationGetWithResponseSpec() throws RestClientResponseException {
        return apiAuthenticationGetRequestCreation();
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param authenticationPostRequest The authenticationPostRequest parameter
     * @return AuthenticationPostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiAuthenticationPostRequestCreation(AuthenticationPostRequest authenticationPostRequest) throws RestClientResponseException {
        Object postBody = authenticationPostRequest;
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

        ParameterizedTypeReference<AuthenticationPostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/Authentication", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param authenticationPostRequest The authenticationPostRequest parameter
     * @return AuthenticationPostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public AuthenticationPostResponse apiAuthenticationPost(AuthenticationPostRequest authenticationPostRequest) throws RestClientResponseException {
        ParameterizedTypeReference<AuthenticationPostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiAuthenticationPostRequestCreation(authenticationPostRequest).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param authenticationPostRequest The authenticationPostRequest parameter
     * @return ResponseEntity&lt;AuthenticationPostResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthenticationPostResponse> apiAuthenticationPostWithHttpInfo(AuthenticationPostRequest authenticationPostRequest) throws RestClientResponseException {
        ParameterizedTypeReference<AuthenticationPostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiAuthenticationPostRequestCreation(authenticationPostRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param authenticationPostRequest The authenticationPostRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiAuthenticationPostWithResponseSpec(AuthenticationPostRequest authenticationPostRequest) throws RestClientResponseException {
        return apiAuthenticationPostRequestCreation(authenticationPostRequest);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param authenticationsPostRequest The authenticationsPostRequest parameter
     * @return AuthenticationsPostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiAuthenticationsPostRequestCreation(AuthenticationsPostRequest authenticationsPostRequest) throws RestClientResponseException {
        Object postBody = authenticationsPostRequest;
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

        ParameterizedTypeReference<AuthenticationsPostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/Authentications", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param authenticationsPostRequest The authenticationsPostRequest parameter
     * @return AuthenticationsPostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public AuthenticationsPostResponse apiAuthenticationsPost(AuthenticationsPostRequest authenticationsPostRequest) throws RestClientResponseException {
        ParameterizedTypeReference<AuthenticationsPostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiAuthenticationsPostRequestCreation(authenticationsPostRequest).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param authenticationsPostRequest The authenticationsPostRequest parameter
     * @return ResponseEntity&lt;AuthenticationsPostResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthenticationsPostResponse> apiAuthenticationsPostWithHttpInfo(AuthenticationsPostRequest authenticationsPostRequest) throws RestClientResponseException {
        ParameterizedTypeReference<AuthenticationsPostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiAuthenticationsPostRequestCreation(authenticationsPostRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param authenticationsPostRequest The authenticationsPostRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiAuthenticationsPostWithResponseSpec(AuthenticationsPostRequest authenticationsPostRequest) throws RestClientResponseException {
        return apiAuthenticationsPostRequestCreation(authenticationsPostRequest);
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
     * @return AuthenticationPostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiAuthenticationsTokenFinalizePostRequestCreation(String token) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new RestClientResponseException("Missing the required parameter 'token' when calling apiAuthenticationsTokenFinalizePost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("token", token);

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

        ParameterizedTypeReference<AuthenticationPostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/Authentications/{token}/Finalize", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
     * @return AuthenticationPostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public AuthenticationPostResponse apiAuthenticationsTokenFinalizePost(String token) throws RestClientResponseException {
        ParameterizedTypeReference<AuthenticationPostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiAuthenticationsTokenFinalizePostRequestCreation(token).body(localVarReturnType);
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
     * @return ResponseEntity&lt;AuthenticationPostResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthenticationPostResponse> apiAuthenticationsTokenFinalizePostWithHttpInfo(String token) throws RestClientResponseException {
        ParameterizedTypeReference<AuthenticationPostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiAuthenticationsTokenFinalizePostRequestCreation(token).toEntity(localVarReturnType);
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
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiAuthenticationsTokenFinalizePostWithResponseSpec(String token) throws RestClientResponseException {
        return apiAuthenticationsTokenFinalizePostRequestCreation(token);
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
     * @param authenticationsPostSignedBytesRequest The authenticationsPostSignedBytesRequest parameter
     * @return AuthenticationsPostSignedBytesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiAuthenticationsTokenSignedBytesPostRequestCreation(String token, AuthenticationsPostSignedBytesRequest authenticationsPostSignedBytesRequest) throws RestClientResponseException {
        Object postBody = authenticationsPostSignedBytesRequest;
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new RestClientResponseException("Missing the required parameter 'token' when calling apiAuthenticationsTokenSignedBytesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("token", token);

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

        ParameterizedTypeReference<AuthenticationsPostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/Authentications/{token}/SignedBytes", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
     * @param authenticationsPostSignedBytesRequest The authenticationsPostSignedBytesRequest parameter
     * @return AuthenticationsPostSignedBytesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public AuthenticationsPostSignedBytesResponse apiAuthenticationsTokenSignedBytesPost(String token, AuthenticationsPostSignedBytesRequest authenticationsPostSignedBytesRequest) throws RestClientResponseException {
        ParameterizedTypeReference<AuthenticationsPostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiAuthenticationsTokenSignedBytesPostRequestCreation(token, authenticationsPostSignedBytesRequest).body(localVarReturnType);
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
     * @param authenticationsPostSignedBytesRequest The authenticationsPostSignedBytesRequest parameter
     * @return ResponseEntity&lt;AuthenticationsPostSignedBytesResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthenticationsPostSignedBytesResponse> apiAuthenticationsTokenSignedBytesPostWithHttpInfo(String token, AuthenticationsPostSignedBytesRequest authenticationsPostSignedBytesRequest) throws RestClientResponseException {
        ParameterizedTypeReference<AuthenticationsPostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiAuthenticationsTokenSignedBytesPostRequestCreation(token, authenticationsPostSignedBytesRequest).toEntity(localVarReturnType);
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
     * @param authenticationsPostSignedBytesRequest The authenticationsPostSignedBytesRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiAuthenticationsTokenSignedBytesPostWithResponseSpec(String token, AuthenticationsPostSignedBytesRequest authenticationsPostSignedBytesRequest) throws RestClientResponseException {
        return apiAuthenticationsTokenSignedBytesPostRequestCreation(token, authenticationsPostSignedBytesRequest);
    }
    /**
     * Completes a certificate authentication
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param completeAuthenticationRequest The completeAuthenticationRequest parameter
     * @return CompleteAuthenticationResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiV2AuthenticationCompletionPostRequestCreation(CompleteAuthenticationRequest completeAuthenticationRequest) throws RestClientResponseException {
        Object postBody = completeAuthenticationRequest;
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

        ParameterizedTypeReference<CompleteAuthenticationResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/v2/authentication/completion", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Completes a certificate authentication
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param completeAuthenticationRequest The completeAuthenticationRequest parameter
     * @return CompleteAuthenticationResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public CompleteAuthenticationResponse apiV2AuthenticationCompletionPost(CompleteAuthenticationRequest completeAuthenticationRequest) throws RestClientResponseException {
        ParameterizedTypeReference<CompleteAuthenticationResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV2AuthenticationCompletionPostRequestCreation(completeAuthenticationRequest).body(localVarReturnType);
    }

    /**
     * Completes a certificate authentication
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param completeAuthenticationRequest The completeAuthenticationRequest parameter
     * @return ResponseEntity&lt;CompleteAuthenticationResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CompleteAuthenticationResponse> apiV2AuthenticationCompletionPostWithHttpInfo(CompleteAuthenticationRequest completeAuthenticationRequest) throws RestClientResponseException {
        ParameterizedTypeReference<CompleteAuthenticationResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV2AuthenticationCompletionPostRequestCreation(completeAuthenticationRequest).toEntity(localVarReturnType);
    }

    /**
     * Completes a certificate authentication
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param completeAuthenticationRequest The completeAuthenticationRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiV2AuthenticationCompletionPostWithResponseSpec(CompleteAuthenticationRequest completeAuthenticationRequest) throws RestClientResponseException {
        return apiV2AuthenticationCompletionPostRequestCreation(completeAuthenticationRequest);
    }
    /**
     * Prepares for a certificate authentication
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param prepareAuthenticationRequest The prepareAuthenticationRequest parameter
     * @return PrepareAuthenticationResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiV2AuthenticationPostRequestCreation(PrepareAuthenticationRequest prepareAuthenticationRequest) throws RestClientResponseException {
        Object postBody = prepareAuthenticationRequest;
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

        ParameterizedTypeReference<PrepareAuthenticationResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/v2/authentication", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Prepares for a certificate authentication
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param prepareAuthenticationRequest The prepareAuthenticationRequest parameter
     * @return PrepareAuthenticationResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public PrepareAuthenticationResponse apiV2AuthenticationPost(PrepareAuthenticationRequest prepareAuthenticationRequest) throws RestClientResponseException {
        ParameterizedTypeReference<PrepareAuthenticationResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV2AuthenticationPostRequestCreation(prepareAuthenticationRequest).body(localVarReturnType);
    }

    /**
     * Prepares for a certificate authentication
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param prepareAuthenticationRequest The prepareAuthenticationRequest parameter
     * @return ResponseEntity&lt;PrepareAuthenticationResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PrepareAuthenticationResponse> apiV2AuthenticationPostWithHttpInfo(PrepareAuthenticationRequest prepareAuthenticationRequest) throws RestClientResponseException {
        ParameterizedTypeReference<PrepareAuthenticationResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV2AuthenticationPostRequestCreation(prepareAuthenticationRequest).toEntity(localVarReturnType);
    }

    /**
     * Prepares for a certificate authentication
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param prepareAuthenticationRequest The prepareAuthenticationRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiV2AuthenticationPostWithResponseSpec(PrepareAuthenticationRequest prepareAuthenticationRequest) throws RestClientResponseException {
        return apiV2AuthenticationPostRequestCreation(prepareAuthenticationRequest);
    }
}
