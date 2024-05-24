package com.lacunasoftware.client.api;

import com.lacunasoftware.client.ApiClient;

import com.lacunasoftware.client.model.CadesSignatureModel;
import com.lacunasoftware.client.model.CadesSignaturePostRequestV1;
import com.lacunasoftware.client.model.CadesSignaturePostRequestV2;
import com.lacunasoftware.client.model.CadesSignaturePostRequestV3;
import com.lacunasoftware.client.model.CadesSignaturePostResponse;
import com.lacunasoftware.client.model.CadesSignaturePostSignedBytesRequest;
import com.lacunasoftware.client.model.CadesSignaturePostSignedBytesResponse;
import com.lacunasoftware.client.model.CompleteSignatureRequest;
import com.lacunasoftware.client.model.DigestAlgorithms;
import com.lacunasoftware.client.model.FileModel;
import com.lacunasoftware.client.model.OpenCadesSignatureRequestModel;
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
public class CadesSignatureApi {
    private ApiClient apiClient;

    public CadesSignatureApi() {
        this(new ApiClient());
    }

    @Autowired
    public CadesSignatureApi(ApiClient apiClient) {
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
     * @param openCadesSignatureRequestModel The openCadesSignatureRequestModel parameter
     * @return CadesSignatureModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiCadesSignaturesOpenPostRequestCreation(OpenCadesSignatureRequestModel openCadesSignatureRequestModel) throws RestClientResponseException {
        Object postBody = openCadesSignatureRequestModel;
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

        ParameterizedTypeReference<CadesSignatureModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/CadesSignatures/Open", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param openCadesSignatureRequestModel The openCadesSignatureRequestModel parameter
     * @return CadesSignatureModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public CadesSignatureModel apiCadesSignaturesOpenPost(OpenCadesSignatureRequestModel openCadesSignatureRequestModel) throws RestClientResponseException {
        ParameterizedTypeReference<CadesSignatureModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiCadesSignaturesOpenPostRequestCreation(openCadesSignatureRequestModel).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param openCadesSignatureRequestModel The openCadesSignatureRequestModel parameter
     * @return ResponseEntity&lt;CadesSignatureModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CadesSignatureModel> apiCadesSignaturesOpenPostWithHttpInfo(OpenCadesSignatureRequestModel openCadesSignatureRequestModel) throws RestClientResponseException {
        ParameterizedTypeReference<CadesSignatureModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiCadesSignaturesOpenPostRequestCreation(openCadesSignatureRequestModel).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param openCadesSignatureRequestModel The openCadesSignatureRequestModel parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiCadesSignaturesOpenPostWithResponseSpec(OpenCadesSignatureRequestModel openCadesSignatureRequestModel) throws RestClientResponseException {
        return apiCadesSignaturesOpenPostRequestCreation(openCadesSignatureRequestModel);
    }
    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param cadesSignaturePostRequestV1 The cadesSignaturePostRequestV1 parameter
     * @return CadesSignaturePostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiCadesSignaturesPostRequestCreation(CadesSignaturePostRequestV1 cadesSignaturePostRequestV1) throws RestClientResponseException {
        Object postBody = cadesSignaturePostRequestV1;
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

        ParameterizedTypeReference<CadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/CadesSignatures", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param cadesSignaturePostRequestV1 The cadesSignaturePostRequestV1 parameter
     * @return CadesSignaturePostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public CadesSignaturePostResponse apiCadesSignaturesPost(CadesSignaturePostRequestV1 cadesSignaturePostRequestV1) throws RestClientResponseException {
        ParameterizedTypeReference<CadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiCadesSignaturesPostRequestCreation(cadesSignaturePostRequestV1).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param cadesSignaturePostRequestV1 The cadesSignaturePostRequestV1 parameter
     * @return ResponseEntity&lt;CadesSignaturePostResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CadesSignaturePostResponse> apiCadesSignaturesPostWithHttpInfo(CadesSignaturePostRequestV1 cadesSignaturePostRequestV1) throws RestClientResponseException {
        ParameterizedTypeReference<CadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiCadesSignaturesPostRequestCreation(cadesSignaturePostRequestV1).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param cadesSignaturePostRequestV1 The cadesSignaturePostRequestV1 parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiCadesSignaturesPostWithResponseSpec(CadesSignaturePostRequestV1 cadesSignaturePostRequestV1) throws RestClientResponseException {
        return apiCadesSignaturesPostRequestCreation(cadesSignaturePostRequestV1);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param fileModel The fileModel parameter
     * @return List&lt;DigestAlgorithms&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiCadesSignaturesRequiredHashesPostRequestCreation(FileModel fileModel) throws RestClientResponseException {
        Object postBody = fileModel;
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

        ParameterizedTypeReference<List<DigestAlgorithms>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/CadesSignatures/RequiredHashes", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param fileModel The fileModel parameter
     * @return List&lt;DigestAlgorithms&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<DigestAlgorithms> apiCadesSignaturesRequiredHashesPost(FileModel fileModel) throws RestClientResponseException {
        ParameterizedTypeReference<List<DigestAlgorithms>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiCadesSignaturesRequiredHashesPostRequestCreation(fileModel).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param fileModel The fileModel parameter
     * @return ResponseEntity&lt;List&lt;DigestAlgorithms&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<DigestAlgorithms>> apiCadesSignaturesRequiredHashesPostWithHttpInfo(FileModel fileModel) throws RestClientResponseException {
        ParameterizedTypeReference<List<DigestAlgorithms>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiCadesSignaturesRequiredHashesPostRequestCreation(fileModel).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param fileModel The fileModel parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiCadesSignaturesRequiredHashesPostWithResponseSpec(FileModel fileModel) throws RestClientResponseException {
        return apiCadesSignaturesRequiredHashesPostRequestCreation(fileModel);
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
     * @return CadesSignaturePostSignedBytesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiCadesSignaturesTokenFinalizePostRequestCreation(String token) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new RestClientResponseException("Missing the required parameter 'token' when calling apiCadesSignaturesTokenFinalizePost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CadesSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/CadesSignatures/{token}/Finalize", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
     * @return CadesSignaturePostSignedBytesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public CadesSignaturePostSignedBytesResponse apiCadesSignaturesTokenFinalizePost(String token) throws RestClientResponseException {
        ParameterizedTypeReference<CadesSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiCadesSignaturesTokenFinalizePostRequestCreation(token).body(localVarReturnType);
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
     * @return ResponseEntity&lt;CadesSignaturePostSignedBytesResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CadesSignaturePostSignedBytesResponse> apiCadesSignaturesTokenFinalizePostWithHttpInfo(String token) throws RestClientResponseException {
        ParameterizedTypeReference<CadesSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiCadesSignaturesTokenFinalizePostRequestCreation(token).toEntity(localVarReturnType);
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
    public ResponseSpec apiCadesSignaturesTokenFinalizePostWithResponseSpec(String token) throws RestClientResponseException {
        return apiCadesSignaturesTokenFinalizePostRequestCreation(token);
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
     * @param cadesSignaturePostSignedBytesRequest The cadesSignaturePostSignedBytesRequest parameter
     * @return CadesSignaturePostSignedBytesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiCadesSignaturesTokenSignedBytesPostRequestCreation(String token, CadesSignaturePostSignedBytesRequest cadesSignaturePostSignedBytesRequest) throws RestClientResponseException {
        Object postBody = cadesSignaturePostSignedBytesRequest;
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new RestClientResponseException("Missing the required parameter 'token' when calling apiCadesSignaturesTokenSignedBytesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CadesSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/CadesSignatures/{token}/SignedBytes", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
     * @param cadesSignaturePostSignedBytesRequest The cadesSignaturePostSignedBytesRequest parameter
     * @return CadesSignaturePostSignedBytesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public CadesSignaturePostSignedBytesResponse apiCadesSignaturesTokenSignedBytesPost(String token, CadesSignaturePostSignedBytesRequest cadesSignaturePostSignedBytesRequest) throws RestClientResponseException {
        ParameterizedTypeReference<CadesSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiCadesSignaturesTokenSignedBytesPostRequestCreation(token, cadesSignaturePostSignedBytesRequest).body(localVarReturnType);
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
     * @param cadesSignaturePostSignedBytesRequest The cadesSignaturePostSignedBytesRequest parameter
     * @return ResponseEntity&lt;CadesSignaturePostSignedBytesResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CadesSignaturePostSignedBytesResponse> apiCadesSignaturesTokenSignedBytesPostWithHttpInfo(String token, CadesSignaturePostSignedBytesRequest cadesSignaturePostSignedBytesRequest) throws RestClientResponseException {
        ParameterizedTypeReference<CadesSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiCadesSignaturesTokenSignedBytesPostRequestCreation(token, cadesSignaturePostSignedBytesRequest).toEntity(localVarReturnType);
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
     * @param cadesSignaturePostSignedBytesRequest The cadesSignaturePostSignedBytesRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiCadesSignaturesTokenSignedBytesPostWithResponseSpec(String token, CadesSignaturePostSignedBytesRequest cadesSignaturePostSignedBytesRequest) throws RestClientResponseException {
        return apiCadesSignaturesTokenSignedBytesPostRequestCreation(token, cadesSignaturePostSignedBytesRequest);
    }
    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param cadesSignaturePostRequestV2 The cadesSignaturePostRequestV2 parameter
     * @return CadesSignaturePostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiV2CadesSignaturesPostRequestCreation(CadesSignaturePostRequestV2 cadesSignaturePostRequestV2) throws RestClientResponseException {
        Object postBody = cadesSignaturePostRequestV2;
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

        ParameterizedTypeReference<CadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/v2/CadesSignatures", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param cadesSignaturePostRequestV2 The cadesSignaturePostRequestV2 parameter
     * @return CadesSignaturePostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public CadesSignaturePostResponse apiV2CadesSignaturesPost(CadesSignaturePostRequestV2 cadesSignaturePostRequestV2) throws RestClientResponseException {
        ParameterizedTypeReference<CadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV2CadesSignaturesPostRequestCreation(cadesSignaturePostRequestV2).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param cadesSignaturePostRequestV2 The cadesSignaturePostRequestV2 parameter
     * @return ResponseEntity&lt;CadesSignaturePostResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CadesSignaturePostResponse> apiV2CadesSignaturesPostWithHttpInfo(CadesSignaturePostRequestV2 cadesSignaturePostRequestV2) throws RestClientResponseException {
        ParameterizedTypeReference<CadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV2CadesSignaturesPostRequestCreation(cadesSignaturePostRequestV2).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param cadesSignaturePostRequestV2 The cadesSignaturePostRequestV2 parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiV2CadesSignaturesPostWithResponseSpec(CadesSignaturePostRequestV2 cadesSignaturePostRequestV2) throws RestClientResponseException {
        return apiV2CadesSignaturesPostRequestCreation(cadesSignaturePostRequestV2);
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
    private ResponseSpec apiV2CadesSignaturesTokenSignedBytesPostRequestCreation(String token, CompleteSignatureRequest completeSignatureRequest) throws RestClientResponseException {
        Object postBody = completeSignatureRequest;
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new RestClientResponseException("Missing the required parameter 'token' when calling apiV2CadesSignaturesTokenSignedBytesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/Api/v2/CadesSignatures/{token}/SignedBytes", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
    public SignatureResultModel apiV2CadesSignaturesTokenSignedBytesPost(String token, CompleteSignatureRequest completeSignatureRequest) throws RestClientResponseException {
        ParameterizedTypeReference<SignatureResultModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV2CadesSignaturesTokenSignedBytesPostRequestCreation(token, completeSignatureRequest).body(localVarReturnType);
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
    public ResponseEntity<SignatureResultModel> apiV2CadesSignaturesTokenSignedBytesPostWithHttpInfo(String token, CompleteSignatureRequest completeSignatureRequest) throws RestClientResponseException {
        ParameterizedTypeReference<SignatureResultModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV2CadesSignaturesTokenSignedBytesPostRequestCreation(token, completeSignatureRequest).toEntity(localVarReturnType);
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
    public ResponseSpec apiV2CadesSignaturesTokenSignedBytesPostWithResponseSpec(String token, CompleteSignatureRequest completeSignatureRequest) throws RestClientResponseException {
        return apiV2CadesSignaturesTokenSignedBytesPostRequestCreation(token, completeSignatureRequest);
    }
    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param cadesSignaturePostRequestV3 The cadesSignaturePostRequestV3 parameter
     * @return CadesSignaturePostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiV3CadesSignaturesPostRequestCreation(CadesSignaturePostRequestV3 cadesSignaturePostRequestV3) throws RestClientResponseException {
        Object postBody = cadesSignaturePostRequestV3;
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

        ParameterizedTypeReference<CadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/v3/CadesSignatures", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param cadesSignaturePostRequestV3 The cadesSignaturePostRequestV3 parameter
     * @return CadesSignaturePostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public CadesSignaturePostResponse apiV3CadesSignaturesPost(CadesSignaturePostRequestV3 cadesSignaturePostRequestV3) throws RestClientResponseException {
        ParameterizedTypeReference<CadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV3CadesSignaturesPostRequestCreation(cadesSignaturePostRequestV3).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param cadesSignaturePostRequestV3 The cadesSignaturePostRequestV3 parameter
     * @return ResponseEntity&lt;CadesSignaturePostResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CadesSignaturePostResponse> apiV3CadesSignaturesPostWithHttpInfo(CadesSignaturePostRequestV3 cadesSignaturePostRequestV3) throws RestClientResponseException {
        ParameterizedTypeReference<CadesSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV3CadesSignaturesPostRequestCreation(cadesSignaturePostRequestV3).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param cadesSignaturePostRequestV3 The cadesSignaturePostRequestV3 parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiV3CadesSignaturesPostWithResponseSpec(CadesSignaturePostRequestV3 cadesSignaturePostRequestV3) throws RestClientResponseException {
        return apiV3CadesSignaturesPostRequestCreation(cadesSignaturePostRequestV3);
    }
}
