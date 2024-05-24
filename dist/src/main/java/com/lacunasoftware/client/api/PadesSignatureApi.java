package com.lacunasoftware.client.api;

import com.lacunasoftware.client.ApiClient;

import com.lacunasoftware.client.model.CompleteSignatureRequest;
import com.lacunasoftware.client.model.OpenSignatureRequestModel;
import com.lacunasoftware.client.model.PadesSignatureModel;
import com.lacunasoftware.client.model.PadesSignaturePostRequestV1;
import com.lacunasoftware.client.model.PadesSignaturePostRequestV2;
import com.lacunasoftware.client.model.PadesSignaturePostResponse;
import com.lacunasoftware.client.model.PadesSignaturePostSignedBytesRequest;
import com.lacunasoftware.client.model.PadesSignaturePostSignedBytesResponse;
import com.lacunasoftware.client.model.SignatureResultModel;

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
public class PadesSignatureApi {
    private ApiClient apiClient;

    public PadesSignatureApi() {
        this(new ApiClient());
    }

    @Autowired
    public PadesSignatureApi(ApiClient apiClient) {
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
     * @param openSignatureRequestModel The openSignatureRequestModel parameter
     * @return PadesSignatureModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiPadesSignaturesOpenPostRequestCreation(OpenSignatureRequestModel openSignatureRequestModel) throws RestClientResponseException {
        Object postBody = openSignatureRequestModel;
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

        ParameterizedTypeReference<PadesSignatureModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/PadesSignatures/Open", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param openSignatureRequestModel The openSignatureRequestModel parameter
     * @return PadesSignatureModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public PadesSignatureModel apiPadesSignaturesOpenPost(OpenSignatureRequestModel openSignatureRequestModel) throws RestClientResponseException {
        ParameterizedTypeReference<PadesSignatureModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPadesSignaturesOpenPostRequestCreation(openSignatureRequestModel).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param openSignatureRequestModel The openSignatureRequestModel parameter
     * @return ResponseEntity&lt;PadesSignatureModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PadesSignatureModel> apiPadesSignaturesOpenPostWithHttpInfo(OpenSignatureRequestModel openSignatureRequestModel) throws RestClientResponseException {
        ParameterizedTypeReference<PadesSignatureModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPadesSignaturesOpenPostRequestCreation(openSignatureRequestModel).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param openSignatureRequestModel The openSignatureRequestModel parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiPadesSignaturesOpenPostWithResponseSpec(OpenSignatureRequestModel openSignatureRequestModel) throws RestClientResponseException {
        return apiPadesSignaturesOpenPostRequestCreation(openSignatureRequestModel);
    }
    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param padesSignaturePostRequestV1 The padesSignaturePostRequestV1 parameter
     * @return PadesSignaturePostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiPadesSignaturesPostRequestCreation(PadesSignaturePostRequestV1 padesSignaturePostRequestV1) throws RestClientResponseException {
        Object postBody = padesSignaturePostRequestV1;
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

        ParameterizedTypeReference<PadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/PadesSignatures", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param padesSignaturePostRequestV1 The padesSignaturePostRequestV1 parameter
     * @return PadesSignaturePostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public PadesSignaturePostResponse apiPadesSignaturesPost(PadesSignaturePostRequestV1 padesSignaturePostRequestV1) throws RestClientResponseException {
        ParameterizedTypeReference<PadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPadesSignaturesPostRequestCreation(padesSignaturePostRequestV1).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param padesSignaturePostRequestV1 The padesSignaturePostRequestV1 parameter
     * @return ResponseEntity&lt;PadesSignaturePostResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PadesSignaturePostResponse> apiPadesSignaturesPostWithHttpInfo(PadesSignaturePostRequestV1 padesSignaturePostRequestV1) throws RestClientResponseException {
        ParameterizedTypeReference<PadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPadesSignaturesPostRequestCreation(padesSignaturePostRequestV1).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param padesSignaturePostRequestV1 The padesSignaturePostRequestV1 parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiPadesSignaturesPostWithResponseSpec(PadesSignaturePostRequestV1 padesSignaturePostRequestV1) throws RestClientResponseException {
        return apiPadesSignaturesPostRequestCreation(padesSignaturePostRequestV1);
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
     * @return PadesSignaturePostSignedBytesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiPadesSignaturesTokenFinalizePostRequestCreation(String token) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new RestClientResponseException("Missing the required parameter 'token' when calling apiPadesSignaturesTokenFinalizePost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PadesSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/PadesSignatures/{token}/Finalize", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
     * @return PadesSignaturePostSignedBytesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public PadesSignaturePostSignedBytesResponse apiPadesSignaturesTokenFinalizePost(String token) throws RestClientResponseException {
        ParameterizedTypeReference<PadesSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPadesSignaturesTokenFinalizePostRequestCreation(token).body(localVarReturnType);
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
     * @return ResponseEntity&lt;PadesSignaturePostSignedBytesResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PadesSignaturePostSignedBytesResponse> apiPadesSignaturesTokenFinalizePostWithHttpInfo(String token) throws RestClientResponseException {
        ParameterizedTypeReference<PadesSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPadesSignaturesTokenFinalizePostRequestCreation(token).toEntity(localVarReturnType);
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
    public ResponseSpec apiPadesSignaturesTokenFinalizePostWithResponseSpec(String token) throws RestClientResponseException {
        return apiPadesSignaturesTokenFinalizePostRequestCreation(token);
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
     * @param padesSignaturePostSignedBytesRequest The padesSignaturePostSignedBytesRequest parameter
     * @return PadesSignaturePostSignedBytesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiPadesSignaturesTokenSignedBytesPostRequestCreation(String token, PadesSignaturePostSignedBytesRequest padesSignaturePostSignedBytesRequest) throws RestClientResponseException {
        Object postBody = padesSignaturePostSignedBytesRequest;
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new RestClientResponseException("Missing the required parameter 'token' when calling apiPadesSignaturesTokenSignedBytesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PadesSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/PadesSignatures/{token}/SignedBytes", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
     * @param padesSignaturePostSignedBytesRequest The padesSignaturePostSignedBytesRequest parameter
     * @return PadesSignaturePostSignedBytesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public PadesSignaturePostSignedBytesResponse apiPadesSignaturesTokenSignedBytesPost(String token, PadesSignaturePostSignedBytesRequest padesSignaturePostSignedBytesRequest) throws RestClientResponseException {
        ParameterizedTypeReference<PadesSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPadesSignaturesTokenSignedBytesPostRequestCreation(token, padesSignaturePostSignedBytesRequest).body(localVarReturnType);
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
     * @param padesSignaturePostSignedBytesRequest The padesSignaturePostSignedBytesRequest parameter
     * @return ResponseEntity&lt;PadesSignaturePostSignedBytesResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PadesSignaturePostSignedBytesResponse> apiPadesSignaturesTokenSignedBytesPostWithHttpInfo(String token, PadesSignaturePostSignedBytesRequest padesSignaturePostSignedBytesRequest) throws RestClientResponseException {
        ParameterizedTypeReference<PadesSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPadesSignaturesTokenSignedBytesPostRequestCreation(token, padesSignaturePostSignedBytesRequest).toEntity(localVarReturnType);
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
     * @param padesSignaturePostSignedBytesRequest The padesSignaturePostSignedBytesRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiPadesSignaturesTokenSignedBytesPostWithResponseSpec(String token, PadesSignaturePostSignedBytesRequest padesSignaturePostSignedBytesRequest) throws RestClientResponseException {
        return apiPadesSignaturesTokenSignedBytesPostRequestCreation(token, padesSignaturePostSignedBytesRequest);
    }
    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param padesSignaturePostRequestV2 The padesSignaturePostRequestV2 parameter
     * @return PadesSignaturePostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiV2PadesSignaturesPostRequestCreation(PadesSignaturePostRequestV2 padesSignaturePostRequestV2) throws RestClientResponseException {
        Object postBody = padesSignaturePostRequestV2;
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

        ParameterizedTypeReference<PadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/v2/PadesSignatures", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param padesSignaturePostRequestV2 The padesSignaturePostRequestV2 parameter
     * @return PadesSignaturePostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public PadesSignaturePostResponse apiV2PadesSignaturesPost(PadesSignaturePostRequestV2 padesSignaturePostRequestV2) throws RestClientResponseException {
        ParameterizedTypeReference<PadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV2PadesSignaturesPostRequestCreation(padesSignaturePostRequestV2).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param padesSignaturePostRequestV2 The padesSignaturePostRequestV2 parameter
     * @return ResponseEntity&lt;PadesSignaturePostResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PadesSignaturePostResponse> apiV2PadesSignaturesPostWithHttpInfo(PadesSignaturePostRequestV2 padesSignaturePostRequestV2) throws RestClientResponseException {
        ParameterizedTypeReference<PadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV2PadesSignaturesPostRequestCreation(padesSignaturePostRequestV2).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param padesSignaturePostRequestV2 The padesSignaturePostRequestV2 parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiV2PadesSignaturesPostWithResponseSpec(PadesSignaturePostRequestV2 padesSignaturePostRequestV2) throws RestClientResponseException {
        return apiV2PadesSignaturesPostRequestCreation(padesSignaturePostRequestV2);
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
     * @param completeSignatureRequest The completeSignatureRequest parameter
     * @return SignatureResultModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiV2PadesSignaturesTokenSignedBytesPostRequestCreation(String token, CompleteSignatureRequest completeSignatureRequest) throws RestClientResponseException {
        Object postBody = completeSignatureRequest;
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new RestClientResponseException("Missing the required parameter 'token' when calling apiV2PadesSignaturesTokenSignedBytesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SignatureResultModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/v2/PadesSignatures/{token}/SignedBytes", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
     * @param completeSignatureRequest The completeSignatureRequest parameter
     * @return SignatureResultModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public SignatureResultModel apiV2PadesSignaturesTokenSignedBytesPost(String token, CompleteSignatureRequest completeSignatureRequest) throws RestClientResponseException {
        ParameterizedTypeReference<SignatureResultModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV2PadesSignaturesTokenSignedBytesPostRequestCreation(token, completeSignatureRequest).body(localVarReturnType);
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
     * @param completeSignatureRequest The completeSignatureRequest parameter
     * @return ResponseEntity&lt;SignatureResultModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SignatureResultModel> apiV2PadesSignaturesTokenSignedBytesPostWithHttpInfo(String token, CompleteSignatureRequest completeSignatureRequest) throws RestClientResponseException {
        ParameterizedTypeReference<SignatureResultModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV2PadesSignaturesTokenSignedBytesPostRequestCreation(token, completeSignatureRequest).toEntity(localVarReturnType);
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
     * @param completeSignatureRequest The completeSignatureRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiV2PadesSignaturesTokenSignedBytesPostWithResponseSpec(String token, CompleteSignatureRequest completeSignatureRequest) throws RestClientResponseException {
        return apiV2PadesSignaturesTokenSignedBytesPostRequestCreation(token, completeSignatureRequest);
    }
}
