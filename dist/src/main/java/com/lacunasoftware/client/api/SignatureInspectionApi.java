package com.lacunasoftware.client.api;

import com.lacunasoftware.client.ApiClient;

import com.lacunasoftware.client.model.InspectSignatureRequest;
import com.lacunasoftware.client.model.InspectSignatureResponse;

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
public class SignatureInspectionApi {
    private ApiClient apiClient;

    public SignatureInspectionApi() {
        this(new ApiClient());
    }

    @Autowired
    public SignatureInspectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Inspects a signed file, returning information about its signers and metadata about the corresponding document (if signed on this instance)
     * ## Overview    The simplest usage of this API is by simply passing the &#x60;file&#x60; to be inspected. If passing a file by its contents, make sure to pass its  &#x60;mimeType&#x60; so that the API can infer the signature type (PDF/PAdES, CMS/CAdES or XML/XmlDSig) from it.    Information about each signer found is returned on the &#x60;signers&#x60; property. If the file was signed on this instance, additional information  about the document is returned on the &#x60;document&#x60; property.    Please note that by default the signatures are not validated. This means that the &#x60;validationResults&#x60; property of each signer will be &#x60;null&#x60;  (unless the file was signed on this instance, in which case the property will be filled).    ## Signature validation    By default, the signed file is only inspected, but not validated. To validate the signatures, pass &#x60;validate &#x3D; true&#x60;. In this case, you may  optionally specify the &#x60;securityContextId&#x60; to be used to validate the certificates. If omitted, your default security context will be used.    Please note that validating the signatures may take several seconds or even longer, depending on the number of signers. If more than 10  signers are found, only the first 10 are validated (this limit may be increased on on-demand instances). If your documents can have a large  number of signers per document, please consider using the signer inspection API to validate each user separately on-demand as the user  interacts with the UI.    ## Validating detached CMS/CAdES signatures     When validating detached CMS/CAdES signatures, the detached data file must be specified on the &#x60;dataFile&#x60; property or its digests must be given  on the &#x60;dataHashes&#x60; property. If passing &#x60;dataHashes&#x60;, make sure to pass at least the SHA-256 digest of the data file (other digests may be necessary  depending on the signature algorithm used by the signers). If your data files can be considerably large, passing the &#x60;dataHashes&#x60; is recommended  since it avoids transmitting the actual data files through the API.    If a CMS/CAdES signature is given with &#x60;validate &#x3D; true&#x60; and without the corresponding data file specified, the API returns a 200 (OK) response with  &#x60;success &#x3D; false&#x60; and &#x60;failure &#x3D; DataFileRequired&#x60;. This allows you to implement a validation form that lets the user submit the signature file and only  requests the data file if necessary.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param inspectSignatureRequest The inspectSignatureRequest parameter
     * @return InspectSignatureResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiSignatureInspectionPutRequestCreation(InspectSignatureRequest inspectSignatureRequest) throws RestClientResponseException {
        Object postBody = inspectSignatureRequest;
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

        ParameterizedTypeReference<InspectSignatureResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/signature-inspection", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Inspects a signed file, returning information about its signers and metadata about the corresponding document (if signed on this instance)
     * ## Overview    The simplest usage of this API is by simply passing the &#x60;file&#x60; to be inspected. If passing a file by its contents, make sure to pass its  &#x60;mimeType&#x60; so that the API can infer the signature type (PDF/PAdES, CMS/CAdES or XML/XmlDSig) from it.    Information about each signer found is returned on the &#x60;signers&#x60; property. If the file was signed on this instance, additional information  about the document is returned on the &#x60;document&#x60; property.    Please note that by default the signatures are not validated. This means that the &#x60;validationResults&#x60; property of each signer will be &#x60;null&#x60;  (unless the file was signed on this instance, in which case the property will be filled).    ## Signature validation    By default, the signed file is only inspected, but not validated. To validate the signatures, pass &#x60;validate &#x3D; true&#x60;. In this case, you may  optionally specify the &#x60;securityContextId&#x60; to be used to validate the certificates. If omitted, your default security context will be used.    Please note that validating the signatures may take several seconds or even longer, depending on the number of signers. If more than 10  signers are found, only the first 10 are validated (this limit may be increased on on-demand instances). If your documents can have a large  number of signers per document, please consider using the signer inspection API to validate each user separately on-demand as the user  interacts with the UI.    ## Validating detached CMS/CAdES signatures     When validating detached CMS/CAdES signatures, the detached data file must be specified on the &#x60;dataFile&#x60; property or its digests must be given  on the &#x60;dataHashes&#x60; property. If passing &#x60;dataHashes&#x60;, make sure to pass at least the SHA-256 digest of the data file (other digests may be necessary  depending on the signature algorithm used by the signers). If your data files can be considerably large, passing the &#x60;dataHashes&#x60; is recommended  since it avoids transmitting the actual data files through the API.    If a CMS/CAdES signature is given with &#x60;validate &#x3D; true&#x60; and without the corresponding data file specified, the API returns a 200 (OK) response with  &#x60;success &#x3D; false&#x60; and &#x60;failure &#x3D; DataFileRequired&#x60;. This allows you to implement a validation form that lets the user submit the signature file and only  requests the data file if necessary.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param inspectSignatureRequest The inspectSignatureRequest parameter
     * @return InspectSignatureResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public InspectSignatureResponse apiSignatureInspectionPut(InspectSignatureRequest inspectSignatureRequest) throws RestClientResponseException {
        ParameterizedTypeReference<InspectSignatureResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiSignatureInspectionPutRequestCreation(inspectSignatureRequest).body(localVarReturnType);
    }

    /**
     * Inspects a signed file, returning information about its signers and metadata about the corresponding document (if signed on this instance)
     * ## Overview    The simplest usage of this API is by simply passing the &#x60;file&#x60; to be inspected. If passing a file by its contents, make sure to pass its  &#x60;mimeType&#x60; so that the API can infer the signature type (PDF/PAdES, CMS/CAdES or XML/XmlDSig) from it.    Information about each signer found is returned on the &#x60;signers&#x60; property. If the file was signed on this instance, additional information  about the document is returned on the &#x60;document&#x60; property.    Please note that by default the signatures are not validated. This means that the &#x60;validationResults&#x60; property of each signer will be &#x60;null&#x60;  (unless the file was signed on this instance, in which case the property will be filled).    ## Signature validation    By default, the signed file is only inspected, but not validated. To validate the signatures, pass &#x60;validate &#x3D; true&#x60;. In this case, you may  optionally specify the &#x60;securityContextId&#x60; to be used to validate the certificates. If omitted, your default security context will be used.    Please note that validating the signatures may take several seconds or even longer, depending on the number of signers. If more than 10  signers are found, only the first 10 are validated (this limit may be increased on on-demand instances). If your documents can have a large  number of signers per document, please consider using the signer inspection API to validate each user separately on-demand as the user  interacts with the UI.    ## Validating detached CMS/CAdES signatures     When validating detached CMS/CAdES signatures, the detached data file must be specified on the &#x60;dataFile&#x60; property or its digests must be given  on the &#x60;dataHashes&#x60; property. If passing &#x60;dataHashes&#x60;, make sure to pass at least the SHA-256 digest of the data file (other digests may be necessary  depending on the signature algorithm used by the signers). If your data files can be considerably large, passing the &#x60;dataHashes&#x60; is recommended  since it avoids transmitting the actual data files through the API.    If a CMS/CAdES signature is given with &#x60;validate &#x3D; true&#x60; and without the corresponding data file specified, the API returns a 200 (OK) response with  &#x60;success &#x3D; false&#x60; and &#x60;failure &#x3D; DataFileRequired&#x60;. This allows you to implement a validation form that lets the user submit the signature file and only  requests the data file if necessary.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param inspectSignatureRequest The inspectSignatureRequest parameter
     * @return ResponseEntity&lt;InspectSignatureResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InspectSignatureResponse> apiSignatureInspectionPutWithHttpInfo(InspectSignatureRequest inspectSignatureRequest) throws RestClientResponseException {
        ParameterizedTypeReference<InspectSignatureResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiSignatureInspectionPutRequestCreation(inspectSignatureRequest).toEntity(localVarReturnType);
    }

    /**
     * Inspects a signed file, returning information about its signers and metadata about the corresponding document (if signed on this instance)
     * ## Overview    The simplest usage of this API is by simply passing the &#x60;file&#x60; to be inspected. If passing a file by its contents, make sure to pass its  &#x60;mimeType&#x60; so that the API can infer the signature type (PDF/PAdES, CMS/CAdES or XML/XmlDSig) from it.    Information about each signer found is returned on the &#x60;signers&#x60; property. If the file was signed on this instance, additional information  about the document is returned on the &#x60;document&#x60; property.    Please note that by default the signatures are not validated. This means that the &#x60;validationResults&#x60; property of each signer will be &#x60;null&#x60;  (unless the file was signed on this instance, in which case the property will be filled).    ## Signature validation    By default, the signed file is only inspected, but not validated. To validate the signatures, pass &#x60;validate &#x3D; true&#x60;. In this case, you may  optionally specify the &#x60;securityContextId&#x60; to be used to validate the certificates. If omitted, your default security context will be used.    Please note that validating the signatures may take several seconds or even longer, depending on the number of signers. If more than 10  signers are found, only the first 10 are validated (this limit may be increased on on-demand instances). If your documents can have a large  number of signers per document, please consider using the signer inspection API to validate each user separately on-demand as the user  interacts with the UI.    ## Validating detached CMS/CAdES signatures     When validating detached CMS/CAdES signatures, the detached data file must be specified on the &#x60;dataFile&#x60; property or its digests must be given  on the &#x60;dataHashes&#x60; property. If passing &#x60;dataHashes&#x60;, make sure to pass at least the SHA-256 digest of the data file (other digests may be necessary  depending on the signature algorithm used by the signers). If your data files can be considerably large, passing the &#x60;dataHashes&#x60; is recommended  since it avoids transmitting the actual data files through the API.    If a CMS/CAdES signature is given with &#x60;validate &#x3D; true&#x60; and without the corresponding data file specified, the API returns a 200 (OK) response with  &#x60;success &#x3D; false&#x60; and &#x60;failure &#x3D; DataFileRequired&#x60;. This allows you to implement a validation form that lets the user submit the signature file and only  requests the data file if necessary.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param inspectSignatureRequest The inspectSignatureRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiSignatureInspectionPutWithResponseSpec(InspectSignatureRequest inspectSignatureRequest) throws RestClientResponseException {
        return apiSignatureInspectionPutRequestCreation(inspectSignatureRequest);
    }
}
