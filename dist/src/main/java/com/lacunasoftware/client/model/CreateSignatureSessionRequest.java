/*
 * Rest PKI Core API
 * <b><i>Para Português, <a href=\"https://docs.lacunasoftware.com/pt-br/articles/rest-pki/core/integration/get-started\">clique aqui</a></i></b>  <p>   <a href=\"https://docs.lacunasoftware.com/en-us/articles/rest-pki/core/\">Rest PKI Core</a> is an upcoming version of   <a href=\"https://docs.lacunasoftware.com/en-us/articles/rest-pki/\">Rest PKI</a> that will have extended compatibility with environments and databases.  </p>  <p>   In addition to Windows Server (which is already supported by Rest PKI), Rest PKI Core will also run on <b>Linux</b> (Debian- and RedHat-based distributions)   and on <b>Docker</b>. As for database servers, in addition to SQL Server, <b>PostgreSQL</b> will also be supported.  </p>  <p>   <b>Before getting started, see the integration overview on the <a href=\"https://docs.lacunasoftware.com/en-us/articles/rest-pki/core/integration/\">Integration Guide</a></b>  </p>  <p>   For questions regarding the usage of this API, please reach us at <a href=\"https://lacuna.help/\">lacuna.help</a>  </p>    <h2>Parameters</h2>  <p>   You will need the following parameters:  </p>  <ul>   <li><b>Endpoint</b>: address of the Rest PKI Core instance that will be used</li>   <li><b>API Key</b>: authorization key for using the API</li>  </ul>  <p>   The <span class=\"model\">endpoint</span> must be prefixed to all relative URLs mentioned here. As for the <span class=\"model\">API Key</span>, see how to use it below.  </p>    <h2>Authentication</h2>  <p>   The API key must be sent on the <span class=\"model\">X-Api-Key</span> header on each request:  </p>    <!-- unfortunately, class \"example microlight\" doesn't seem to work here -->  <pre style=\"font-size: 12px; padding: 10px; border-radius: 4px; background: #41444e; font-weight: 600; color: #fff;\">  X-Api-Key: yourapp|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx  </pre>    <h2>HTTP Codes</h2>    <p>   The APIs will return the following HTTP codes:  </p>    <table>   <thead>    <tr>     <th>Code</th>     <th>Description</th>    </tr>   </thead>   <tbody>    <tr>     <td><strong class=\"model-title\">200 (OK)</strong></td>     <td>Request processed successfully. The response is different for each API, please refer to the operation's documentation</td>    </tr>    <tr>     <td><strong class=\"model-title\">400 (Bad Request)</strong></td>     <td>Syntax error. For instance, when a required field was not provided</td>    </tr>    <tr>     <td><strong class=\"model-title\">401 (Unauthorized)</strong></td>     <td>API key not provided or invalid</td>    </tr>    <tr>     <td><strong class=\"model-title\">403 (Forbidden)</strong></td>     <td>API key is valid, but the application has insufficient permissions to complete the requested operation</td>    </tr>    <tr>     <td><strong class=\"model-title\">422 (Unprocessable Entity)</strong></td>     <td>API error. The response body is an <a href=\"#model-ErrorModelV2\" class=\"model\">ErrorModelV2</a>    </tr>    <tr>     <td><strong class=\"model-title\">500 (Internal Server Error)</strong></td>     <td>An unexpected error occurred. The <span class=\"model\">exceptionCode</span> contained on the response body may be of help for our support team during diagnostic.</td>    </tr>   </tbody>  </table>    <h3>Error Codes</h3>    <p>   Some of the error codes returned in the <span class=\"model\">code</span> field of an <a href=\"#model-ErrorModelV2\" class=\"model\">ErrorModelV2</a>   (body of responses with HTTP status code 422) are provided below*:  </p>    <table>   <thead>    <tr>     <th>Code</th>     <th>Description</th>    </tr>   </thead>   <tbody>    <tr>     <td class=\"model\">DocumentNotFound</td>     <td>A referenced document was not found (check the document ID)</td>    </tr>    <tr>     <td class=\"model\">SecurityContextNotFound</td>     <td>A referenced security context was not found (check the security context ID)</td>    </tr>    <tr>     <td class=\"model\">SignatureSessionNotFound</td>     <td>A referenced signature session was not found (check the signature session ID)</td>    </tr>    <tr>     <td class=\"model\">BadSignatureSessionOperation</td>     <td>The operation is invalid for the current signature session or document status. For instance, trying to await the session's completion if it is still <span class=\"model\">Pending</span> results in this error</td>    </tr>    <tr>     <td class=\"model\">BackgroundProcessing</td>     <td>The operation cannot be completed at this time because the resource is being processed in background</td>    </tr>    <tr>     <td class=\"model\">SignatureSessionTokenRequired</td>     <td>The signature session token was not passed on the <span class=\"model\">X-Signature-Session-Token</span> request header</td>    </tr>    <tr>     <td class=\"model\">BadSignatureSessionToken</td>     <td>An invalid signature session token was passed on the <span class=\"model\">X-Signature-Session-Token</span> request header. Check your application for possible corruption of the session token, which may contain characters <span class=\"code\">-</span> (hyphen) and <span class=\"code\">_</span> (underscore)</td>    </tr>    <tr>     <td class=\"model\">ExpiredSignatureSessionToken</td>     <td>An expired signature session token was passed on the <span class=\"model\">X-Signature-Session-Token</span> request header. Signature session tokens are normally valid for 4 hours.</td>    </tr>   </tbody>  </table>    <p style=\"font-size: 0.9em\">   *The codes shown above are the most common error codes. Nonetheless, this list is not comprehensive. New codes may be added anytime without previous warning.  </p>    <h2>Culture / Internationalization (i18n)</h2>  <p>The <span class=\"model\">Accept-Language</span> request header is observed by this API. The following cultures are supported:</p>  <ul>   <li><span class=\"code\">en-US</span> (or simply <span class=\"code\">en</span>)</li>   <li><span class=\"code\">pt-BR</span> (or simply <span class=\"code\">pt</span>)</li>  </ul>  <p><i>Notice: error messages are not affected by this header and therefore should not be displayed to users, being better suited for logging.</i></p>  
 *
 * The version of the OpenAPI document: 2.2.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lacunasoftware.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.lacunasoftware.client.model.CertificateRequirement;
import com.lacunasoftware.client.model.CmsSignatureOptions;
import com.lacunasoftware.client.model.PdfSignatureOptions;
import com.lacunasoftware.client.model.SignatureSessionDocumentData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateSignatureSessionRequest
 */
@JsonPropertyOrder({
  CreateSignatureSessionRequest.JSON_PROPERTY_RETURN_URL,
  CreateSignatureSessionRequest.JSON_PROPERTY_SECURITY_CONTEXT_ID,
  CreateSignatureSessionRequest.JSON_PROPERTY_CALLBACK_ARGUMENT,
  CreateSignatureSessionRequest.JSON_PROPERTY_ENABLE_BACKGROUND_PROCESSING,
  CreateSignatureSessionRequest.JSON_PROPERTY_DISABLE_DOWNLOADS,
  CreateSignatureSessionRequest.JSON_PROPERTY_DOCUMENT_METADATA,
  CreateSignatureSessionRequest.JSON_PROPERTY_DOCUMENTS,
  CreateSignatureSessionRequest.JSON_PROPERTY_CERTIFICATE_REQUIREMENTS,
  CreateSignatureSessionRequest.JSON_PROPERTY_PDF_SIGNATURE_OPTIONS,
  CreateSignatureSessionRequest.JSON_PROPERTY_CMS_SIGNATURE_OPTIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class CreateSignatureSessionRequest {
  public static final String JSON_PROPERTY_RETURN_URL = "returnUrl";
  private JsonNullable<String> returnUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SECURITY_CONTEXT_ID = "securityContextId";
  private JsonNullable<UUID> securityContextId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_CALLBACK_ARGUMENT = "callbackArgument";
  private JsonNullable<String> callbackArgument = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENABLE_BACKGROUND_PROCESSING = "enableBackgroundProcessing";
  private Boolean enableBackgroundProcessing;

  public static final String JSON_PROPERTY_DISABLE_DOWNLOADS = "disableDownloads";
  private Boolean disableDownloads;

  public static final String JSON_PROPERTY_DOCUMENT_METADATA = "documentMetadata";
  private JsonNullable<Map<String, List<String>>> documentMetadata = JsonNullable.<Map<String, List<String>>>undefined();

  public static final String JSON_PROPERTY_DOCUMENTS = "documents";
  private JsonNullable<List<SignatureSessionDocumentData>> documents = JsonNullable.<List<SignatureSessionDocumentData>>undefined();

  public static final String JSON_PROPERTY_CERTIFICATE_REQUIREMENTS = "certificateRequirements";
  private JsonNullable<List<CertificateRequirement>> certificateRequirements = JsonNullable.<List<CertificateRequirement>>undefined();

  public static final String JSON_PROPERTY_PDF_SIGNATURE_OPTIONS = "pdfSignatureOptions";
  private PdfSignatureOptions pdfSignatureOptions;

  public static final String JSON_PROPERTY_CMS_SIGNATURE_OPTIONS = "cmsSignatureOptions";
  private CmsSignatureOptions cmsSignatureOptions;

  public CreateSignatureSessionRequest() {
  }

  public CreateSignatureSessionRequest returnUrl(String returnUrl) {
    this.returnUrl = JsonNullable.<String>of(returnUrl);
    
    return this;
  }

   /**
   * Get returnUrl
   * @return returnUrl
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getReturnUrl() {
        return returnUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReturnUrl_JsonNullable() {
    return returnUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  public void setReturnUrl_JsonNullable(JsonNullable<String> returnUrl) {
    this.returnUrl = returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = JsonNullable.<String>of(returnUrl);
  }

  public CreateSignatureSessionRequest securityContextId(UUID securityContextId) {
    this.securityContextId = JsonNullable.<UUID>of(securityContextId);
    
    return this;
  }

   /**
   * Get securityContextId
   * @return securityContextId
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public UUID getSecurityContextId() {
        return securityContextId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECURITY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getSecurityContextId_JsonNullable() {
    return securityContextId;
  }
  
  @JsonProperty(JSON_PROPERTY_SECURITY_CONTEXT_ID)
  public void setSecurityContextId_JsonNullable(JsonNullable<UUID> securityContextId) {
    this.securityContextId = securityContextId;
  }

  public void setSecurityContextId(UUID securityContextId) {
    this.securityContextId = JsonNullable.<UUID>of(securityContextId);
  }

  public CreateSignatureSessionRequest callbackArgument(String callbackArgument) {
    this.callbackArgument = JsonNullable.<String>of(callbackArgument);
    
    return this;
  }

   /**
   * Get callbackArgument
   * @return callbackArgument
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getCallbackArgument() {
        return callbackArgument.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CALLBACK_ARGUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCallbackArgument_JsonNullable() {
    return callbackArgument;
  }
  
  @JsonProperty(JSON_PROPERTY_CALLBACK_ARGUMENT)
  public void setCallbackArgument_JsonNullable(JsonNullable<String> callbackArgument) {
    this.callbackArgument = callbackArgument;
  }

  public void setCallbackArgument(String callbackArgument) {
    this.callbackArgument = JsonNullable.<String>of(callbackArgument);
  }

  public CreateSignatureSessionRequest enableBackgroundProcessing(Boolean enableBackgroundProcessing) {
    
    this.enableBackgroundProcessing = enableBackgroundProcessing;
    return this;
  }

   /**
   * Get enableBackgroundProcessing
   * @return enableBackgroundProcessing
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_BACKGROUND_PROCESSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isEnableBackgroundProcessing() {
    return enableBackgroundProcessing;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_BACKGROUND_PROCESSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableBackgroundProcessing(Boolean enableBackgroundProcessing) {
    this.enableBackgroundProcessing = enableBackgroundProcessing;
  }

  public CreateSignatureSessionRequest disableDownloads(Boolean disableDownloads) {
    
    this.disableDownloads = disableDownloads;
    return this;
  }

   /**
   * Get disableDownloads
   * @return disableDownloads
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLE_DOWNLOADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isDisableDownloads() {
    return disableDownloads;
  }


  @JsonProperty(JSON_PROPERTY_DISABLE_DOWNLOADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisableDownloads(Boolean disableDownloads) {
    this.disableDownloads = disableDownloads;
  }

  public CreateSignatureSessionRequest documentMetadata(Map<String, List<String>> documentMetadata) {
    this.documentMetadata = JsonNullable.<Map<String, List<String>>>of(documentMetadata);
    
    return this;
  }

  public CreateSignatureSessionRequest putDocumentMetadataItem(String key, List<String> documentMetadataItem) {
    if (this.documentMetadata == null || !this.documentMetadata.isPresent()) {
      this.documentMetadata = JsonNullable.<Map<String, List<String>>>of(new HashMap<>());
    }
    try {
      this.documentMetadata.get().put(key, documentMetadataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get documentMetadata
   * @return documentMetadata
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Map<String, List<String>> getDocumentMetadata() {
        return documentMetadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DOCUMENT_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, List<String>>> getDocumentMetadata_JsonNullable() {
    return documentMetadata;
  }
  
  @JsonProperty(JSON_PROPERTY_DOCUMENT_METADATA)
  public void setDocumentMetadata_JsonNullable(JsonNullable<Map<String, List<String>>> documentMetadata) {
    this.documentMetadata = documentMetadata;
  }

  public void setDocumentMetadata(Map<String, List<String>> documentMetadata) {
    this.documentMetadata = JsonNullable.<Map<String, List<String>>>of(documentMetadata);
  }

  public CreateSignatureSessionRequest documents(List<SignatureSessionDocumentData> documents) {
    this.documents = JsonNullable.<List<SignatureSessionDocumentData>>of(documents);
    
    return this;
  }

  public CreateSignatureSessionRequest addDocumentsItem(SignatureSessionDocumentData documentsItem) {
    if (this.documents == null || !this.documents.isPresent()) {
      this.documents = JsonNullable.<List<SignatureSessionDocumentData>>of(new ArrayList<>());
    }
    try {
      this.documents.get().add(documentsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<SignatureSessionDocumentData> getDocuments() {
        return documents.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<SignatureSessionDocumentData>> getDocuments_JsonNullable() {
    return documents;
  }
  
  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  public void setDocuments_JsonNullable(JsonNullable<List<SignatureSessionDocumentData>> documents) {
    this.documents = documents;
  }

  public void setDocuments(List<SignatureSessionDocumentData> documents) {
    this.documents = JsonNullable.<List<SignatureSessionDocumentData>>of(documents);
  }

  public CreateSignatureSessionRequest certificateRequirements(List<CertificateRequirement> certificateRequirements) {
    this.certificateRequirements = JsonNullable.<List<CertificateRequirement>>of(certificateRequirements);
    
    return this;
  }

  public CreateSignatureSessionRequest addCertificateRequirementsItem(CertificateRequirement certificateRequirementsItem) {
    if (this.certificateRequirements == null || !this.certificateRequirements.isPresent()) {
      this.certificateRequirements = JsonNullable.<List<CertificateRequirement>>of(new ArrayList<>());
    }
    try {
      this.certificateRequirements.get().add(certificateRequirementsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get certificateRequirements
   * @return certificateRequirements
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<CertificateRequirement> getCertificateRequirements() {
        return certificateRequirements.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CERTIFICATE_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<CertificateRequirement>> getCertificateRequirements_JsonNullable() {
    return certificateRequirements;
  }
  
  @JsonProperty(JSON_PROPERTY_CERTIFICATE_REQUIREMENTS)
  public void setCertificateRequirements_JsonNullable(JsonNullable<List<CertificateRequirement>> certificateRequirements) {
    this.certificateRequirements = certificateRequirements;
  }

  public void setCertificateRequirements(List<CertificateRequirement> certificateRequirements) {
    this.certificateRequirements = JsonNullable.<List<CertificateRequirement>>of(certificateRequirements);
  }

  public CreateSignatureSessionRequest pdfSignatureOptions(PdfSignatureOptions pdfSignatureOptions) {
    
    this.pdfSignatureOptions = pdfSignatureOptions;
    return this;
  }

   /**
   * Get pdfSignatureOptions
   * @return pdfSignatureOptions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PDF_SIGNATURE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PdfSignatureOptions getPdfSignatureOptions() {
    return pdfSignatureOptions;
  }


  @JsonProperty(JSON_PROPERTY_PDF_SIGNATURE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPdfSignatureOptions(PdfSignatureOptions pdfSignatureOptions) {
    this.pdfSignatureOptions = pdfSignatureOptions;
  }

  public CreateSignatureSessionRequest cmsSignatureOptions(CmsSignatureOptions cmsSignatureOptions) {
    
    this.cmsSignatureOptions = cmsSignatureOptions;
    return this;
  }

   /**
   * Get cmsSignatureOptions
   * @return cmsSignatureOptions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CMS_SIGNATURE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CmsSignatureOptions getCmsSignatureOptions() {
    return cmsSignatureOptions;
  }


  @JsonProperty(JSON_PROPERTY_CMS_SIGNATURE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCmsSignatureOptions(CmsSignatureOptions cmsSignatureOptions) {
    this.cmsSignatureOptions = cmsSignatureOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSignatureSessionRequest createSignatureSessionRequest = (CreateSignatureSessionRequest) o;
    return equalsNullable(this.returnUrl, createSignatureSessionRequest.returnUrl) &&
        equalsNullable(this.securityContextId, createSignatureSessionRequest.securityContextId) &&
        equalsNullable(this.callbackArgument, createSignatureSessionRequest.callbackArgument) &&
        Objects.equals(this.enableBackgroundProcessing, createSignatureSessionRequest.enableBackgroundProcessing) &&
        Objects.equals(this.disableDownloads, createSignatureSessionRequest.disableDownloads) &&
        equalsNullable(this.documentMetadata, createSignatureSessionRequest.documentMetadata) &&
        equalsNullable(this.documents, createSignatureSessionRequest.documents) &&
        equalsNullable(this.certificateRequirements, createSignatureSessionRequest.certificateRequirements) &&
        Objects.equals(this.pdfSignatureOptions, createSignatureSessionRequest.pdfSignatureOptions) &&
        Objects.equals(this.cmsSignatureOptions, createSignatureSessionRequest.cmsSignatureOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(returnUrl), hashCodeNullable(securityContextId), hashCodeNullable(callbackArgument), enableBackgroundProcessing, disableDownloads, hashCodeNullable(documentMetadata), hashCodeNullable(documents), hashCodeNullable(certificateRequirements), pdfSignatureOptions, cmsSignatureOptions);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSignatureSessionRequest {\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    securityContextId: ").append(toIndentedString(securityContextId)).append("\n");
    sb.append("    callbackArgument: ").append(toIndentedString(callbackArgument)).append("\n");
    sb.append("    enableBackgroundProcessing: ").append(toIndentedString(enableBackgroundProcessing)).append("\n");
    sb.append("    disableDownloads: ").append(toIndentedString(disableDownloads)).append("\n");
    sb.append("    documentMetadata: ").append(toIndentedString(documentMetadata)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    certificateRequirements: ").append(toIndentedString(certificateRequirements)).append("\n");
    sb.append("    pdfSignatureOptions: ").append(toIndentedString(pdfSignatureOptions)).append("\n");
    sb.append("    cmsSignatureOptions: ").append(toIndentedString(cmsSignatureOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static class Builder {

    private CreateSignatureSessionRequest instance;

    public Builder() {
      this(new CreateSignatureSessionRequest());
    }

    protected Builder(CreateSignatureSessionRequest instance) {
      this.instance = instance;
    }

    public CreateSignatureSessionRequest.Builder returnUrl(String returnUrl) {
      this.instance.returnUrl = JsonNullable.<String>of(returnUrl);
      return this;
    }
    public CreateSignatureSessionRequest.Builder returnUrl(JsonNullable<String> returnUrl) {
      this.instance.returnUrl = returnUrl;
      return this;
    }
    public CreateSignatureSessionRequest.Builder securityContextId(UUID securityContextId) {
      this.instance.securityContextId = JsonNullable.<UUID>of(securityContextId);
      return this;
    }
    public CreateSignatureSessionRequest.Builder securityContextId(JsonNullable<UUID> securityContextId) {
      this.instance.securityContextId = securityContextId;
      return this;
    }
    public CreateSignatureSessionRequest.Builder callbackArgument(String callbackArgument) {
      this.instance.callbackArgument = JsonNullable.<String>of(callbackArgument);
      return this;
    }
    public CreateSignatureSessionRequest.Builder callbackArgument(JsonNullable<String> callbackArgument) {
      this.instance.callbackArgument = callbackArgument;
      return this;
    }
    public CreateSignatureSessionRequest.Builder enableBackgroundProcessing(Boolean enableBackgroundProcessing) {
      this.instance.enableBackgroundProcessing = enableBackgroundProcessing;
      return this;
    }
    public CreateSignatureSessionRequest.Builder disableDownloads(Boolean disableDownloads) {
      this.instance.disableDownloads = disableDownloads;
      return this;
    }
    public CreateSignatureSessionRequest.Builder documentMetadata(Map<String, List<String>> documentMetadata) {
      this.instance.documentMetadata = JsonNullable.<Map<String, List<String>>>of(documentMetadata);
      return this;
    }
    public CreateSignatureSessionRequest.Builder documentMetadata(JsonNullable<Map<String, List<String>>> documentMetadata) {
      this.instance.documentMetadata = documentMetadata;
      return this;
    }
    public CreateSignatureSessionRequest.Builder documents(List<SignatureSessionDocumentData> documents) {
      this.instance.documents = JsonNullable.<List<SignatureSessionDocumentData>>of(documents);
      return this;
    }
    public CreateSignatureSessionRequest.Builder documents(JsonNullable<List<SignatureSessionDocumentData>> documents) {
      this.instance.documents = documents;
      return this;
    }
    public CreateSignatureSessionRequest.Builder certificateRequirements(List<CertificateRequirement> certificateRequirements) {
      this.instance.certificateRequirements = JsonNullable.<List<CertificateRequirement>>of(certificateRequirements);
      return this;
    }
    public CreateSignatureSessionRequest.Builder certificateRequirements(JsonNullable<List<CertificateRequirement>> certificateRequirements) {
      this.instance.certificateRequirements = certificateRequirements;
      return this;
    }
    public CreateSignatureSessionRequest.Builder pdfSignatureOptions(PdfSignatureOptions pdfSignatureOptions) {
      this.instance.pdfSignatureOptions = pdfSignatureOptions;
      return this;
    }
    public CreateSignatureSessionRequest.Builder cmsSignatureOptions(CmsSignatureOptions cmsSignatureOptions) {
      this.instance.cmsSignatureOptions = cmsSignatureOptions;
      return this;
    }


    /**
    * returns a built CreateSignatureSessionRequest instance.
    *
    * The builder is not reusable.
    */
    public CreateSignatureSessionRequest build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static CreateSignatureSessionRequest.Builder builder() {
    return new CreateSignatureSessionRequest.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public CreateSignatureSessionRequest.Builder toBuilder() {
    return new CreateSignatureSessionRequest.Builder()
      .returnUrl(getReturnUrl())
      .securityContextId(getSecurityContextId())
      .callbackArgument(getCallbackArgument())
      .enableBackgroundProcessing(isEnableBackgroundProcessing())
      .disableDownloads(isDisableDownloads())
      .documentMetadata(getDocumentMetadata())
      .documents(getDocuments())
      .certificateRequirements(getCertificateRequirements())
      .pdfSignatureOptions(getPdfSignatureOptions())
      .cmsSignatureOptions(getCmsSignatureOptions());
  }


}

