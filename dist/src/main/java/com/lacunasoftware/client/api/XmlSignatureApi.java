package com.lacunasoftware.client.api;

import com.lacunasoftware.client.ApiClient;

import com.lacunasoftware.client.model.FullXmlSignaturePostRequest;
import com.lacunasoftware.client.model.OpenXmlSignatureRequestModel;
import com.lacunasoftware.client.model.XmlElementSignaturePostRequest;
import com.lacunasoftware.client.model.XmlSignatureModel;
import com.lacunasoftware.client.model.XmlSignaturePostResponse;
import com.lacunasoftware.client.model.XmlSignaturePostSignedBytesRequest;
import com.lacunasoftware.client.model.XmlSignaturePostSignedBytesResponse;
import com.lacunasoftware.client.model.XmlSignatureResponseModel;

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
public class XmlSignatureApi {
    private ApiClient apiClient;

    public XmlSignatureApi() {
        this(new ApiClient());
    }

    @Autowired
    public XmlSignatureApi(ApiClient apiClient) {
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
     * @param openXmlSignatureRequestModel The openXmlSignatureRequestModel parameter
     * @return XmlSignatureResponseModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiV2XmlSignaturesOpenPostRequestCreation(OpenXmlSignatureRequestModel openXmlSignatureRequestModel) throws RestClientResponseException {
        Object postBody = openXmlSignatureRequestModel;
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

        ParameterizedTypeReference<XmlSignatureResponseModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/v2/XmlSignatures/Open", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param openXmlSignatureRequestModel The openXmlSignatureRequestModel parameter
     * @return XmlSignatureResponseModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public XmlSignatureResponseModel apiV2XmlSignaturesOpenPost(OpenXmlSignatureRequestModel openXmlSignatureRequestModel) throws RestClientResponseException {
        ParameterizedTypeReference<XmlSignatureResponseModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV2XmlSignaturesOpenPostRequestCreation(openXmlSignatureRequestModel).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param openXmlSignatureRequestModel The openXmlSignatureRequestModel parameter
     * @return ResponseEntity&lt;XmlSignatureResponseModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XmlSignatureResponseModel> apiV2XmlSignaturesOpenPostWithHttpInfo(OpenXmlSignatureRequestModel openXmlSignatureRequestModel) throws RestClientResponseException {
        ParameterizedTypeReference<XmlSignatureResponseModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiV2XmlSignaturesOpenPostRequestCreation(openXmlSignatureRequestModel).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param openXmlSignatureRequestModel The openXmlSignatureRequestModel parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiV2XmlSignaturesOpenPostWithResponseSpec(OpenXmlSignatureRequestModel openXmlSignatureRequestModel) throws RestClientResponseException {
        return apiV2XmlSignaturesOpenPostRequestCreation(openXmlSignatureRequestModel);
    }
    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param fullXmlSignaturePostRequest The fullXmlSignaturePostRequest parameter
     * @return XmlSignaturePostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiXmlSignaturesFullXmlSignaturePostRequestCreation(FullXmlSignaturePostRequest fullXmlSignaturePostRequest) throws RestClientResponseException {
        Object postBody = fullXmlSignaturePostRequest;
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

        ParameterizedTypeReference<XmlSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/XmlSignatures/FullXmlSignature", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param fullXmlSignaturePostRequest The fullXmlSignaturePostRequest parameter
     * @return XmlSignaturePostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public XmlSignaturePostResponse apiXmlSignaturesFullXmlSignaturePost(FullXmlSignaturePostRequest fullXmlSignaturePostRequest) throws RestClientResponseException {
        ParameterizedTypeReference<XmlSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiXmlSignaturesFullXmlSignaturePostRequestCreation(fullXmlSignaturePostRequest).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param fullXmlSignaturePostRequest The fullXmlSignaturePostRequest parameter
     * @return ResponseEntity&lt;XmlSignaturePostResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XmlSignaturePostResponse> apiXmlSignaturesFullXmlSignaturePostWithHttpInfo(FullXmlSignaturePostRequest fullXmlSignaturePostRequest) throws RestClientResponseException {
        ParameterizedTypeReference<XmlSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiXmlSignaturesFullXmlSignaturePostRequestCreation(fullXmlSignaturePostRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param fullXmlSignaturePostRequest The fullXmlSignaturePostRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiXmlSignaturesFullXmlSignaturePostWithResponseSpec(FullXmlSignaturePostRequest fullXmlSignaturePostRequest) throws RestClientResponseException {
        return apiXmlSignaturesFullXmlSignaturePostRequestCreation(fullXmlSignaturePostRequest);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param openXmlSignatureRequestModel The openXmlSignatureRequestModel parameter
     * @return List&lt;XmlSignatureModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiXmlSignaturesOpenPostRequestCreation(OpenXmlSignatureRequestModel openXmlSignatureRequestModel) throws RestClientResponseException {
        Object postBody = openXmlSignatureRequestModel;
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

        ParameterizedTypeReference<List<XmlSignatureModel>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/XmlSignatures/Open", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param openXmlSignatureRequestModel The openXmlSignatureRequestModel parameter
     * @return List&lt;XmlSignatureModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<XmlSignatureModel> apiXmlSignaturesOpenPost(OpenXmlSignatureRequestModel openXmlSignatureRequestModel) throws RestClientResponseException {
        ParameterizedTypeReference<List<XmlSignatureModel>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiXmlSignaturesOpenPostRequestCreation(openXmlSignatureRequestModel).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param openXmlSignatureRequestModel The openXmlSignatureRequestModel parameter
     * @return ResponseEntity&lt;List&lt;XmlSignatureModel&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<XmlSignatureModel>> apiXmlSignaturesOpenPostWithHttpInfo(OpenXmlSignatureRequestModel openXmlSignatureRequestModel) throws RestClientResponseException {
        ParameterizedTypeReference<List<XmlSignatureModel>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiXmlSignaturesOpenPostRequestCreation(openXmlSignatureRequestModel).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param openXmlSignatureRequestModel The openXmlSignatureRequestModel parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiXmlSignaturesOpenPostWithResponseSpec(OpenXmlSignatureRequestModel openXmlSignatureRequestModel) throws RestClientResponseException {
        return apiXmlSignaturesOpenPostRequestCreation(openXmlSignatureRequestModel);
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
     * @return XmlSignaturePostSignedBytesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiXmlSignaturesTokenFinalizePostRequestCreation(String token) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new RestClientResponseException("Missing the required parameter 'token' when calling apiXmlSignaturesTokenFinalizePost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<XmlSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/XmlSignatures/{token}/Finalize", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
     * @return XmlSignaturePostSignedBytesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public XmlSignaturePostSignedBytesResponse apiXmlSignaturesTokenFinalizePost(String token) throws RestClientResponseException {
        ParameterizedTypeReference<XmlSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiXmlSignaturesTokenFinalizePostRequestCreation(token).body(localVarReturnType);
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
     * @return ResponseEntity&lt;XmlSignaturePostSignedBytesResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XmlSignaturePostSignedBytesResponse> apiXmlSignaturesTokenFinalizePostWithHttpInfo(String token) throws RestClientResponseException {
        ParameterizedTypeReference<XmlSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiXmlSignaturesTokenFinalizePostRequestCreation(token).toEntity(localVarReturnType);
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
    public ResponseSpec apiXmlSignaturesTokenFinalizePostWithResponseSpec(String token) throws RestClientResponseException {
        return apiXmlSignaturesTokenFinalizePostRequestCreation(token);
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
     * @param xmlSignaturePostSignedBytesRequest The xmlSignaturePostSignedBytesRequest parameter
     * @return XmlSignaturePostSignedBytesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiXmlSignaturesTokenSignedBytesPostRequestCreation(String token, XmlSignaturePostSignedBytesRequest xmlSignaturePostSignedBytesRequest) throws RestClientResponseException {
        Object postBody = xmlSignaturePostSignedBytesRequest;
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new RestClientResponseException("Missing the required parameter 'token' when calling apiXmlSignaturesTokenSignedBytesPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<XmlSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/XmlSignatures/{token}/SignedBytes", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
     * @param xmlSignaturePostSignedBytesRequest The xmlSignaturePostSignedBytesRequest parameter
     * @return XmlSignaturePostSignedBytesResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public XmlSignaturePostSignedBytesResponse apiXmlSignaturesTokenSignedBytesPost(String token, XmlSignaturePostSignedBytesRequest xmlSignaturePostSignedBytesRequest) throws RestClientResponseException {
        ParameterizedTypeReference<XmlSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiXmlSignaturesTokenSignedBytesPostRequestCreation(token, xmlSignaturePostSignedBytesRequest).body(localVarReturnType);
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
     * @param xmlSignaturePostSignedBytesRequest The xmlSignaturePostSignedBytesRequest parameter
     * @return ResponseEntity&lt;XmlSignaturePostSignedBytesResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XmlSignaturePostSignedBytesResponse> apiXmlSignaturesTokenSignedBytesPostWithHttpInfo(String token, XmlSignaturePostSignedBytesRequest xmlSignaturePostSignedBytesRequest) throws RestClientResponseException {
        ParameterizedTypeReference<XmlSignaturePostSignedBytesResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiXmlSignaturesTokenSignedBytesPostRequestCreation(token, xmlSignaturePostSignedBytesRequest).toEntity(localVarReturnType);
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
     * @param xmlSignaturePostSignedBytesRequest The xmlSignaturePostSignedBytesRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiXmlSignaturesTokenSignedBytesPostWithResponseSpec(String token, XmlSignaturePostSignedBytesRequest xmlSignaturePostSignedBytesRequest) throws RestClientResponseException {
        return apiXmlSignaturesTokenSignedBytesPostRequestCreation(token, xmlSignaturePostSignedBytesRequest);
    }
    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param xmlElementSignaturePostRequest The xmlElementSignaturePostRequest parameter
     * @return XmlSignaturePostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiXmlSignaturesXmlElementSignaturePostRequestCreation(XmlElementSignaturePostRequest xmlElementSignaturePostRequest) throws RestClientResponseException {
        Object postBody = xmlElementSignaturePostRequest;
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

        ParameterizedTypeReference<XmlSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/XmlSignatures/XmlElementSignature", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param xmlElementSignaturePostRequest The xmlElementSignaturePostRequest parameter
     * @return XmlSignaturePostResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public XmlSignaturePostResponse apiXmlSignaturesXmlElementSignaturePost(XmlElementSignaturePostRequest xmlElementSignaturePostRequest) throws RestClientResponseException {
        ParameterizedTypeReference<XmlSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiXmlSignaturesXmlElementSignaturePostRequestCreation(xmlElementSignaturePostRequest).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param xmlElementSignaturePostRequest The xmlElementSignaturePostRequest parameter
     * @return ResponseEntity&lt;XmlSignaturePostResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<XmlSignaturePostResponse> apiXmlSignaturesXmlElementSignaturePostWithHttpInfo(XmlElementSignaturePostRequest xmlElementSignaturePostRequest) throws RestClientResponseException {
        ParameterizedTypeReference<XmlSignaturePostResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiXmlSignaturesXmlElementSignaturePostRequestCreation(xmlElementSignaturePostRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param xmlElementSignaturePostRequest The xmlElementSignaturePostRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiXmlSignaturesXmlElementSignaturePostWithResponseSpec(XmlElementSignaturePostRequest xmlElementSignaturePostRequest) throws RestClientResponseException {
        return apiXmlSignaturesXmlElementSignaturePostRequestCreation(xmlElementSignaturePostRequest);
    }
}
