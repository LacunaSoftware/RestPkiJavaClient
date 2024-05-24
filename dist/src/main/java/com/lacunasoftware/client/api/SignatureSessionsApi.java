package com.lacunasoftware.client.api;

import com.lacunasoftware.client.ApiClient;

import com.lacunasoftware.client.model.CreateSignatureSessionRequest;
import com.lacunasoftware.client.model.CreateSignatureSessionResponse;
import com.lacunasoftware.client.model.SessionCompletionStatus;
import com.lacunasoftware.client.model.SignatureSessionModel;
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
public class SignatureSessionsApi {
    private ApiClient apiClient;

    public SignatureSessionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public SignatureSessionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieves a signature session&#39;s details
     * ## Overview    When a user is redirected back to your application at the end of a signature session, a query parameter is appended to the &#x60;returnUrl&#x60; containing the ID of the  signature session, i.e. &#x60;?signatureSessionId&#x3D;...&#x60;. Your app must get this parameter and use it to call this API, which will return information about the session,  mainly its status and documents.    ## Statuses    When a user is redirected back to your app, the session will have one of two possible statuses: &#x60;Completed&#x60; or &#x60;UserCancelled&#x60;. You should always check the status,  since it is perfecly normal for a user to land back on your app by cancelling the session instead of going through the procedure.    ## Statuses (when background processing is enabled)    If you enabled background processing of the session by passing &#x60;EnableBackgroundProcessing &#x3D; true&#x60; when creating the session, then two additional statuses are possible:  &#x60;Processing&#x60; and &#x60;ProcessingError&#x60;.    While a session is still &#x60;Processing&#x60;, some documents will be in status &#x60;Processing&#x60; and cannot be downloaded. Only when the session transitions to the &#x60;Complete&#x60; status  are all documents ready to be downloaded.    The status &#x60;ProcessingError&#x60; is a rare condition that occurrs only in corner cases such as the user&#39;s certificate being revoked during the time between the  start of the session and the completion of the background processing. It is perfectly appropriate for your app to &#x60;throw&#x60; if this status is returned.    ## Downloading signed files    The signed files are not returned on the body of the response. Instead, a &#x60;location&#x60; is given for each file which must be invoked to get the actual files&#39; contents  (see [DocumentFileModel](#model-DocumentFileModel)).
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return SignatureSessionModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiSignatureSessionsIdGetRequestCreation(UUID id) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling apiSignatureSessionsIdGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SignatureSessionModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/signature-sessions/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieves a signature session&#39;s details
     * ## Overview    When a user is redirected back to your application at the end of a signature session, a query parameter is appended to the &#x60;returnUrl&#x60; containing the ID of the  signature session, i.e. &#x60;?signatureSessionId&#x3D;...&#x60;. Your app must get this parameter and use it to call this API, which will return information about the session,  mainly its status and documents.    ## Statuses    When a user is redirected back to your app, the session will have one of two possible statuses: &#x60;Completed&#x60; or &#x60;UserCancelled&#x60;. You should always check the status,  since it is perfecly normal for a user to land back on your app by cancelling the session instead of going through the procedure.    ## Statuses (when background processing is enabled)    If you enabled background processing of the session by passing &#x60;EnableBackgroundProcessing &#x3D; true&#x60; when creating the session, then two additional statuses are possible:  &#x60;Processing&#x60; and &#x60;ProcessingError&#x60;.    While a session is still &#x60;Processing&#x60;, some documents will be in status &#x60;Processing&#x60; and cannot be downloaded. Only when the session transitions to the &#x60;Complete&#x60; status  are all documents ready to be downloaded.    The status &#x60;ProcessingError&#x60; is a rare condition that occurrs only in corner cases such as the user&#39;s certificate being revoked during the time between the  start of the session and the completion of the background processing. It is perfectly appropriate for your app to &#x60;throw&#x60; if this status is returned.    ## Downloading signed files    The signed files are not returned on the body of the response. Instead, a &#x60;location&#x60; is given for each file which must be invoked to get the actual files&#39; contents  (see [DocumentFileModel](#model-DocumentFileModel)).
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return SignatureSessionModel
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public SignatureSessionModel apiSignatureSessionsIdGet(UUID id) throws RestClientResponseException {
        ParameterizedTypeReference<SignatureSessionModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiSignatureSessionsIdGetRequestCreation(id).body(localVarReturnType);
    }

    /**
     * Retrieves a signature session&#39;s details
     * ## Overview    When a user is redirected back to your application at the end of a signature session, a query parameter is appended to the &#x60;returnUrl&#x60; containing the ID of the  signature session, i.e. &#x60;?signatureSessionId&#x3D;...&#x60;. Your app must get this parameter and use it to call this API, which will return information about the session,  mainly its status and documents.    ## Statuses    When a user is redirected back to your app, the session will have one of two possible statuses: &#x60;Completed&#x60; or &#x60;UserCancelled&#x60;. You should always check the status,  since it is perfecly normal for a user to land back on your app by cancelling the session instead of going through the procedure.    ## Statuses (when background processing is enabled)    If you enabled background processing of the session by passing &#x60;EnableBackgroundProcessing &#x3D; true&#x60; when creating the session, then two additional statuses are possible:  &#x60;Processing&#x60; and &#x60;ProcessingError&#x60;.    While a session is still &#x60;Processing&#x60;, some documents will be in status &#x60;Processing&#x60; and cannot be downloaded. Only when the session transitions to the &#x60;Complete&#x60; status  are all documents ready to be downloaded.    The status &#x60;ProcessingError&#x60; is a rare condition that occurrs only in corner cases such as the user&#39;s certificate being revoked during the time between the  start of the session and the completion of the background processing. It is perfectly appropriate for your app to &#x60;throw&#x60; if this status is returned.    ## Downloading signed files    The signed files are not returned on the body of the response. Instead, a &#x60;location&#x60; is given for each file which must be invoked to get the actual files&#39; contents  (see [DocumentFileModel](#model-DocumentFileModel)).
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return ResponseEntity&lt;SignatureSessionModel&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SignatureSessionModel> apiSignatureSessionsIdGetWithHttpInfo(UUID id) throws RestClientResponseException {
        ParameterizedTypeReference<SignatureSessionModel> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiSignatureSessionsIdGetRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieves a signature session&#39;s details
     * ## Overview    When a user is redirected back to your application at the end of a signature session, a query parameter is appended to the &#x60;returnUrl&#x60; containing the ID of the  signature session, i.e. &#x60;?signatureSessionId&#x3D;...&#x60;. Your app must get this parameter and use it to call this API, which will return information about the session,  mainly its status and documents.    ## Statuses    When a user is redirected back to your app, the session will have one of two possible statuses: &#x60;Completed&#x60; or &#x60;UserCancelled&#x60;. You should always check the status,  since it is perfecly normal for a user to land back on your app by cancelling the session instead of going through the procedure.    ## Statuses (when background processing is enabled)    If you enabled background processing of the session by passing &#x60;EnableBackgroundProcessing &#x3D; true&#x60; when creating the session, then two additional statuses are possible:  &#x60;Processing&#x60; and &#x60;ProcessingError&#x60;.    While a session is still &#x60;Processing&#x60;, some documents will be in status &#x60;Processing&#x60; and cannot be downloaded. Only when the session transitions to the &#x60;Complete&#x60; status  are all documents ready to be downloaded.    The status &#x60;ProcessingError&#x60; is a rare condition that occurrs only in corner cases such as the user&#39;s certificate being revoked during the time between the  start of the session and the completion of the background processing. It is perfectly appropriate for your app to &#x60;throw&#x60; if this status is returned.    ## Downloading signed files    The signed files are not returned on the body of the response. Instead, a &#x60;location&#x60; is given for each file which must be invoked to get the actual files&#39; contents  (see [DocumentFileModel](#model-DocumentFileModel)).
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiSignatureSessionsIdGetWithResponseSpec(UUID id) throws RestClientResponseException {
        return apiSignatureSessionsIdGetRequestCreation(id);
    }
    /**
     * Waits for the completion of a signature session
     * This API can be used when background processing is enabled on a signature session to wait for its processing.    The API will hang for a short period (normally 15 seconds) waiting for the session to be completed. If it is completed during that time,  the API returns immediately with &#x60;Completed &#x3D; true&#x60;. If, however, that period elapsed and the session is still not completed, the API  returns with &#x60;Completed &#x3D; false&#x60; and with the current &#x60;Progress&#x60; (0 to 100).    A client app that intends to wait for the session completion indefinitely must therefore implement a loop to call this API until  &#x60;Completed &#x3D; true&#x60; is returned. This might seem like polling (and actually is), but is different because it is a sort of \&quot;smart polling\&quot;  since the API returns immediately once the session is completed, instead of the app having to wait for the next polling interval.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return SessionCompletionStatus
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiSignatureSessionsIdWhenCompletedGetRequestCreation(UUID id) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling apiSignatureSessionsIdWhenCompletedGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SessionCompletionStatus> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/signature-sessions/{id}/when-completed", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Waits for the completion of a signature session
     * This API can be used when background processing is enabled on a signature session to wait for its processing.    The API will hang for a short period (normally 15 seconds) waiting for the session to be completed. If it is completed during that time,  the API returns immediately with &#x60;Completed &#x3D; true&#x60;. If, however, that period elapsed and the session is still not completed, the API  returns with &#x60;Completed &#x3D; false&#x60; and with the current &#x60;Progress&#x60; (0 to 100).    A client app that intends to wait for the session completion indefinitely must therefore implement a loop to call this API until  &#x60;Completed &#x3D; true&#x60; is returned. This might seem like polling (and actually is), but is different because it is a sort of \&quot;smart polling\&quot;  since the API returns immediately once the session is completed, instead of the app having to wait for the next polling interval.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return SessionCompletionStatus
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public SessionCompletionStatus apiSignatureSessionsIdWhenCompletedGet(UUID id) throws RestClientResponseException {
        ParameterizedTypeReference<SessionCompletionStatus> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiSignatureSessionsIdWhenCompletedGetRequestCreation(id).body(localVarReturnType);
    }

    /**
     * Waits for the completion of a signature session
     * This API can be used when background processing is enabled on a signature session to wait for its processing.    The API will hang for a short period (normally 15 seconds) waiting for the session to be completed. If it is completed during that time,  the API returns immediately with &#x60;Completed &#x3D; true&#x60;. If, however, that period elapsed and the session is still not completed, the API  returns with &#x60;Completed &#x3D; false&#x60; and with the current &#x60;Progress&#x60; (0 to 100).    A client app that intends to wait for the session completion indefinitely must therefore implement a loop to call this API until  &#x60;Completed &#x3D; true&#x60; is returned. This might seem like polling (and actually is), but is different because it is a sort of \&quot;smart polling\&quot;  since the API returns immediately once the session is completed, instead of the app having to wait for the next polling interval.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return ResponseEntity&lt;SessionCompletionStatus&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SessionCompletionStatus> apiSignatureSessionsIdWhenCompletedGetWithHttpInfo(UUID id) throws RestClientResponseException {
        ParameterizedTypeReference<SessionCompletionStatus> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiSignatureSessionsIdWhenCompletedGetRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Waits for the completion of a signature session
     * This API can be used when background processing is enabled on a signature session to wait for its processing.    The API will hang for a short period (normally 15 seconds) waiting for the session to be completed. If it is completed during that time,  the API returns immediately with &#x60;Completed &#x3D; true&#x60;. If, however, that period elapsed and the session is still not completed, the API  returns with &#x60;Completed &#x3D; false&#x60; and with the current &#x60;Progress&#x60; (0 to 100).    A client app that intends to wait for the session completion indefinitely must therefore implement a loop to call this API until  &#x60;Completed &#x3D; true&#x60; is returned. This might seem like polling (and actually is), but is different because it is a sort of \&quot;smart polling\&quot;  since the API returns immediately once the session is completed, instead of the app having to wait for the next polling interval.
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param id The id parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiSignatureSessionsIdWhenCompletedGetWithResponseSpec(UUID id) throws RestClientResponseException {
        return apiSignatureSessionsIdWhenCompletedGetRequestCreation(id);
    }
    /**
     * Creates a signature session
     * ## Overview    This API creates a **signature session**, which enables your users to perform digital signatures without requiring you to implement a signature web page on your app.    To create a signature session, your app specifies a &#x60;returnUrl&#x60; and receives back a &#x60;redirectUrl&#x60;. Your app then redirects the user to the &#x60;redirectUrl&#x60;, where he will   digitally sign documents. Once the process is complete, the user will be redirected back to your app on the *returnUrl* you specified when starting the session.  A query parameter will be added to the &#x60;returnUrl&#x60; containing the signature session ID (&#x60;?signatureSessionId&#x3D;...&#x60;). Then, your app parses the signature session ID on  the query string and uses it to call APIs to fetch the documents signed by the user.    The session can either have predefined documents that the user must sign (passed on the &#x60;Documents&#x60; collection) or allow the user to upload his own documents (in this  case, omit the &#x60;Documents&#x60; collection).    ## Showing the signature page on a new tab    The default behavior is for your app to provide a &#x60;returnUrl&#x60;, and then redirect the user to the &#x60;returnUrl&#x60; returned by this API with a HTTP redirection response  (e.g. *303 See Other*) or with a &#x60;location.href &#x3D; ...&#x60; call on Javascript. By the end of the procedure, the user is redirected back to your app, all in a single browser tab.    Alternatively, you may want to display the signature page on a new tab. In this case, omit the &#x60;returnUrl&#x60; parameter when creating the session. Furthermore, you must open  the tab with an HTML anchor tag with &#x60;target&#x3D;\&quot;_blank\&quot;&#x60;, or with the &#x60;window.open()&#x60; function on Javascript. The tab will then be closed by the end of the process.    ## Background processing    By default, users are kept waiting while documents are processed before being redirected back to your application.    If you want to provide your users with a faster experience, turn on background processing by passing &#x60;EnableBackgroundProcessing &#x3D; true&#x60;. In this case, users do not wait  for documents to be processed. However, your application must be ready to handle the case of a signature session whose documents are not yet available for download.    ## Webhooks    You may configure your Rest PKI Core subscription to inform your app of any documents that are signed on signature sessions created by it. This way, you don&#39;t  need to rely on users landing back on your page to detect that documents have been signed. Please refer to the *Webhooks* section for more information.    ## Disabling downloads    If you don&#39;t receive webhook notifications of documents signed, you might feel like the signature session process is not working reliably because some users simply download  the signed documents and don&#39;t bother to stick around while they are redirected back to your app, denying it the chance to detect that documents have been signed.  If you feel this is a problem for your case, you can disable the downloading of signed documents by passing &#x60;DisableDownloads &#x3D; true&#x60;. Then, users will only be able to  download documents through your app, and thus will be far less inclined to quit the process prematurely.    ## File name validation    If you want to validate the file names that are acceptable for users to upload, you can configure the *acceptable file name pattern* on your subscription&#39;s  configuration to a regular expression conforming to your rules.    You can also configure a *file name validation endpoint*, an API implemented by your app that is called for each file selected by the user with the file&#39;s name and  MIME type and returns whether the file should be acceptable or not (and, if not, a reason to be displayed to the user).
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param createSignatureSessionRequest The createSignatureSessionRequest parameter
     * @return CreateSignatureSessionResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec apiSignatureSessionsPostRequestCreation(CreateSignatureSessionRequest createSignatureSessionRequest) throws RestClientResponseException {
        Object postBody = createSignatureSessionRequest;
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

        ParameterizedTypeReference<CreateSignatureSessionResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/signature-sessions", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Creates a signature session
     * ## Overview    This API creates a **signature session**, which enables your users to perform digital signatures without requiring you to implement a signature web page on your app.    To create a signature session, your app specifies a &#x60;returnUrl&#x60; and receives back a &#x60;redirectUrl&#x60;. Your app then redirects the user to the &#x60;redirectUrl&#x60;, where he will   digitally sign documents. Once the process is complete, the user will be redirected back to your app on the *returnUrl* you specified when starting the session.  A query parameter will be added to the &#x60;returnUrl&#x60; containing the signature session ID (&#x60;?signatureSessionId&#x3D;...&#x60;). Then, your app parses the signature session ID on  the query string and uses it to call APIs to fetch the documents signed by the user.    The session can either have predefined documents that the user must sign (passed on the &#x60;Documents&#x60; collection) or allow the user to upload his own documents (in this  case, omit the &#x60;Documents&#x60; collection).    ## Showing the signature page on a new tab    The default behavior is for your app to provide a &#x60;returnUrl&#x60;, and then redirect the user to the &#x60;returnUrl&#x60; returned by this API with a HTTP redirection response  (e.g. *303 See Other*) or with a &#x60;location.href &#x3D; ...&#x60; call on Javascript. By the end of the procedure, the user is redirected back to your app, all in a single browser tab.    Alternatively, you may want to display the signature page on a new tab. In this case, omit the &#x60;returnUrl&#x60; parameter when creating the session. Furthermore, you must open  the tab with an HTML anchor tag with &#x60;target&#x3D;\&quot;_blank\&quot;&#x60;, or with the &#x60;window.open()&#x60; function on Javascript. The tab will then be closed by the end of the process.    ## Background processing    By default, users are kept waiting while documents are processed before being redirected back to your application.    If you want to provide your users with a faster experience, turn on background processing by passing &#x60;EnableBackgroundProcessing &#x3D; true&#x60;. In this case, users do not wait  for documents to be processed. However, your application must be ready to handle the case of a signature session whose documents are not yet available for download.    ## Webhooks    You may configure your Rest PKI Core subscription to inform your app of any documents that are signed on signature sessions created by it. This way, you don&#39;t  need to rely on users landing back on your page to detect that documents have been signed. Please refer to the *Webhooks* section for more information.    ## Disabling downloads    If you don&#39;t receive webhook notifications of documents signed, you might feel like the signature session process is not working reliably because some users simply download  the signed documents and don&#39;t bother to stick around while they are redirected back to your app, denying it the chance to detect that documents have been signed.  If you feel this is a problem for your case, you can disable the downloading of signed documents by passing &#x60;DisableDownloads &#x3D; true&#x60;. Then, users will only be able to  download documents through your app, and thus will be far less inclined to quit the process prematurely.    ## File name validation    If you want to validate the file names that are acceptable for users to upload, you can configure the *acceptable file name pattern* on your subscription&#39;s  configuration to a regular expression conforming to your rules.    You can also configure a *file name validation endpoint*, an API implemented by your app that is called for each file selected by the user with the file&#39;s name and  MIME type and returns whether the file should be acceptable or not (and, if not, a reason to be displayed to the user).
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param createSignatureSessionRequest The createSignatureSessionRequest parameter
     * @return CreateSignatureSessionResponse
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public CreateSignatureSessionResponse apiSignatureSessionsPost(CreateSignatureSessionRequest createSignatureSessionRequest) throws RestClientResponseException {
        ParameterizedTypeReference<CreateSignatureSessionResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiSignatureSessionsPostRequestCreation(createSignatureSessionRequest).body(localVarReturnType);
    }

    /**
     * Creates a signature session
     * ## Overview    This API creates a **signature session**, which enables your users to perform digital signatures without requiring you to implement a signature web page on your app.    To create a signature session, your app specifies a &#x60;returnUrl&#x60; and receives back a &#x60;redirectUrl&#x60;. Your app then redirects the user to the &#x60;redirectUrl&#x60;, where he will   digitally sign documents. Once the process is complete, the user will be redirected back to your app on the *returnUrl* you specified when starting the session.  A query parameter will be added to the &#x60;returnUrl&#x60; containing the signature session ID (&#x60;?signatureSessionId&#x3D;...&#x60;). Then, your app parses the signature session ID on  the query string and uses it to call APIs to fetch the documents signed by the user.    The session can either have predefined documents that the user must sign (passed on the &#x60;Documents&#x60; collection) or allow the user to upload his own documents (in this  case, omit the &#x60;Documents&#x60; collection).    ## Showing the signature page on a new tab    The default behavior is for your app to provide a &#x60;returnUrl&#x60;, and then redirect the user to the &#x60;returnUrl&#x60; returned by this API with a HTTP redirection response  (e.g. *303 See Other*) or with a &#x60;location.href &#x3D; ...&#x60; call on Javascript. By the end of the procedure, the user is redirected back to your app, all in a single browser tab.    Alternatively, you may want to display the signature page on a new tab. In this case, omit the &#x60;returnUrl&#x60; parameter when creating the session. Furthermore, you must open  the tab with an HTML anchor tag with &#x60;target&#x3D;\&quot;_blank\&quot;&#x60;, or with the &#x60;window.open()&#x60; function on Javascript. The tab will then be closed by the end of the process.    ## Background processing    By default, users are kept waiting while documents are processed before being redirected back to your application.    If you want to provide your users with a faster experience, turn on background processing by passing &#x60;EnableBackgroundProcessing &#x3D; true&#x60;. In this case, users do not wait  for documents to be processed. However, your application must be ready to handle the case of a signature session whose documents are not yet available for download.    ## Webhooks    You may configure your Rest PKI Core subscription to inform your app of any documents that are signed on signature sessions created by it. This way, you don&#39;t  need to rely on users landing back on your page to detect that documents have been signed. Please refer to the *Webhooks* section for more information.    ## Disabling downloads    If you don&#39;t receive webhook notifications of documents signed, you might feel like the signature session process is not working reliably because some users simply download  the signed documents and don&#39;t bother to stick around while they are redirected back to your app, denying it the chance to detect that documents have been signed.  If you feel this is a problem for your case, you can disable the downloading of signed documents by passing &#x60;DisableDownloads &#x3D; true&#x60;. Then, users will only be able to  download documents through your app, and thus will be far less inclined to quit the process prematurely.    ## File name validation    If you want to validate the file names that are acceptable for users to upload, you can configure the *acceptable file name pattern* on your subscription&#39;s  configuration to a regular expression conforming to your rules.    You can also configure a *file name validation endpoint*, an API implemented by your app that is called for each file selected by the user with the file&#39;s name and  MIME type and returns whether the file should be acceptable or not (and, if not, a reason to be displayed to the user).
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param createSignatureSessionRequest The createSignatureSessionRequest parameter
     * @return ResponseEntity&lt;CreateSignatureSessionResponse&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateSignatureSessionResponse> apiSignatureSessionsPostWithHttpInfo(CreateSignatureSessionRequest createSignatureSessionRequest) throws RestClientResponseException {
        ParameterizedTypeReference<CreateSignatureSessionResponse> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiSignatureSessionsPostRequestCreation(createSignatureSessionRequest).toEntity(localVarReturnType);
    }

    /**
     * Creates a signature session
     * ## Overview    This API creates a **signature session**, which enables your users to perform digital signatures without requiring you to implement a signature web page on your app.    To create a signature session, your app specifies a &#x60;returnUrl&#x60; and receives back a &#x60;redirectUrl&#x60;. Your app then redirects the user to the &#x60;redirectUrl&#x60;, where he will   digitally sign documents. Once the process is complete, the user will be redirected back to your app on the *returnUrl* you specified when starting the session.  A query parameter will be added to the &#x60;returnUrl&#x60; containing the signature session ID (&#x60;?signatureSessionId&#x3D;...&#x60;). Then, your app parses the signature session ID on  the query string and uses it to call APIs to fetch the documents signed by the user.    The session can either have predefined documents that the user must sign (passed on the &#x60;Documents&#x60; collection) or allow the user to upload his own documents (in this  case, omit the &#x60;Documents&#x60; collection).    ## Showing the signature page on a new tab    The default behavior is for your app to provide a &#x60;returnUrl&#x60;, and then redirect the user to the &#x60;returnUrl&#x60; returned by this API with a HTTP redirection response  (e.g. *303 See Other*) or with a &#x60;location.href &#x3D; ...&#x60; call on Javascript. By the end of the procedure, the user is redirected back to your app, all in a single browser tab.    Alternatively, you may want to display the signature page on a new tab. In this case, omit the &#x60;returnUrl&#x60; parameter when creating the session. Furthermore, you must open  the tab with an HTML anchor tag with &#x60;target&#x3D;\&quot;_blank\&quot;&#x60;, or with the &#x60;window.open()&#x60; function on Javascript. The tab will then be closed by the end of the process.    ## Background processing    By default, users are kept waiting while documents are processed before being redirected back to your application.    If you want to provide your users with a faster experience, turn on background processing by passing &#x60;EnableBackgroundProcessing &#x3D; true&#x60;. In this case, users do not wait  for documents to be processed. However, your application must be ready to handle the case of a signature session whose documents are not yet available for download.    ## Webhooks    You may configure your Rest PKI Core subscription to inform your app of any documents that are signed on signature sessions created by it. This way, you don&#39;t  need to rely on users landing back on your page to detect that documents have been signed. Please refer to the *Webhooks* section for more information.    ## Disabling downloads    If you don&#39;t receive webhook notifications of documents signed, you might feel like the signature session process is not working reliably because some users simply download  the signed documents and don&#39;t bother to stick around while they are redirected back to your app, denying it the chance to detect that documents have been signed.  If you feel this is a problem for your case, you can disable the downloading of signed documents by passing &#x60;DisableDownloads &#x3D; true&#x60;. Then, users will only be able to  download documents through your app, and thus will be far less inclined to quit the process prematurely.    ## File name validation    If you want to validate the file names that are acceptable for users to upload, you can configure the *acceptable file name pattern* on your subscription&#39;s  configuration to a regular expression conforming to your rules.    You can also configure a *file name validation endpoint*, an API implemented by your app that is called for each file selected by the user with the file&#39;s name and  MIME type and returns whether the file should be acceptable or not (and, if not, a reason to be displayed to the user).
     * <p><b>200</b> - Success
     * <p><b>400</b> - Syntax error, for instance when a required field is not specified
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Semantic error, for instance when a given entity ID is not found
     * @param createSignatureSessionRequest The createSignatureSessionRequest parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec apiSignatureSessionsPostWithResponseSpec(CreateSignatureSessionRequest createSignatureSessionRequest) throws RestClientResponseException {
        return apiSignatureSessionsPostRequestCreation(createSignatureSessionRequest);
    }
}
