package com.lacunasoftware.client.api;

import com.lacunasoftware.client.ApiClient;

import com.lacunasoftware.client.model.PdfAddMarksRequest;
import com.lacunasoftware.client.model.PdfAddMarksResponse;
import com.lacunasoftware.client.model.StampPdfRequest;
import com.lacunasoftware.client.model.StampPdfResponse;

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
public class PdfApi {
    private ApiClient apiClient;

    public PdfApi() {
        this(new ApiClient());
    }

    @Autowired
    public PdfApi(ApiClient apiClient) {
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
     * @param pdfAddMarksRequest The pdfAddMarksRequest parameter
     * @return PdfAddMarksResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiPdfAddMarksPostRequestCreation(PdfAddMarksRequest pdfAddMarksRequest) throws RestClientResponseException {
        Object postBody = pdfAddMarksRequest;
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

        ParameterizedTypeReference<PdfAddMarksResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/Api/Pdf/AddMarks", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param pdfAddMarksRequest The pdfAddMarksRequest parameter
     * @return PdfAddMarksResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public PdfAddMarksResponse apiPdfAddMarksPost(PdfAddMarksRequest pdfAddMarksRequest) throws RestClientResponseException {
        ParameterizedTypeReference<PdfAddMarksResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPdfAddMarksPostRequestCreation(pdfAddMarksRequest).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param pdfAddMarksRequest The pdfAddMarksRequest parameter
     * @return ResponseEntity&lt;PdfAddMarksResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PdfAddMarksResponse> apiPdfAddMarksPostWithHttpInfo(PdfAddMarksRequest pdfAddMarksRequest) throws RestClientResponseException {
        ParameterizedTypeReference<PdfAddMarksResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPdfAddMarksPostRequestCreation(pdfAddMarksRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param pdfAddMarksRequest The pdfAddMarksRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiPdfAddMarksPostWithResponseSpec(PdfAddMarksRequest pdfAddMarksRequest) throws RestClientResponseException {
        return apiPdfAddMarksPostRequestCreation(pdfAddMarksRequest);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param stampPdfRequest The stampPdfRequest parameter
     * @return StampPdfResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiPdfStampPostRequestCreation(StampPdfRequest stampPdfRequest) throws RestClientResponseException {
        Object postBody = stampPdfRequest;
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

        ParameterizedTypeReference<StampPdfResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/pdf/stamp", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param stampPdfRequest The stampPdfRequest parameter
     * @return StampPdfResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public StampPdfResponse apiPdfStampPost(StampPdfRequest stampPdfRequest) throws RestClientResponseException {
        ParameterizedTypeReference<StampPdfResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPdfStampPostRequestCreation(stampPdfRequest).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param stampPdfRequest The stampPdfRequest parameter
     * @return ResponseEntity&lt;StampPdfResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StampPdfResponse> apiPdfStampPostWithHttpInfo(StampPdfRequest stampPdfRequest) throws RestClientResponseException {
        ParameterizedTypeReference<StampPdfResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiPdfStampPostRequestCreation(stampPdfRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param stampPdfRequest The stampPdfRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiPdfStampPostWithResponseSpec(StampPdfRequest stampPdfRequest) throws RestClientResponseException {
        return apiPdfStampPostRequestCreation(stampPdfRequest);
    }
}
