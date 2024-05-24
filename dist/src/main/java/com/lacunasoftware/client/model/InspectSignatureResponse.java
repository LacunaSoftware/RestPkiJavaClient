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
import com.lacunasoftware.client.model.CmsContentTypes;
import com.lacunasoftware.client.model.DigestAlgorithms;
import com.lacunasoftware.client.model.DocumentSummary;
import com.lacunasoftware.client.model.FileReferenceModel;
import com.lacunasoftware.client.model.InspectSignatureFailures;
import com.lacunasoftware.client.model.SignerModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InspectSignatureResponse
 */
@JsonPropertyOrder({
  InspectSignatureResponse.JSON_PROPERTY_SUCCESS,
  InspectSignatureResponse.JSON_PROPERTY_FAILURE,
  InspectSignatureResponse.JSON_PROPERTY_MISSING_DATA_HASH,
  InspectSignatureResponse.JSON_PROPERTY_SIGNERS,
  InspectSignatureResponse.JSON_PROPERTY_DOCUMENT,
  InspectSignatureResponse.JSON_PROPERTY_HAS_ENCAPSULATED_CONTENT,
  InspectSignatureResponse.JSON_PROPERTY_ENCAPSULATED_CONTENT_TYPE,
  InspectSignatureResponse.JSON_PROPERTY_ENCAPSULATED_CONTENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class InspectSignatureResponse {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_FAILURE = "failure";
  private InspectSignatureFailures failure;

  public static final String JSON_PROPERTY_MISSING_DATA_HASH = "missingDataHash";
  private DigestAlgorithms missingDataHash;

  public static final String JSON_PROPERTY_SIGNERS = "signers";
  private JsonNullable<List<SignerModel>> signers = JsonNullable.<List<SignerModel>>undefined();

  public static final String JSON_PROPERTY_DOCUMENT = "document";
  private DocumentSummary document;

  public static final String JSON_PROPERTY_HAS_ENCAPSULATED_CONTENT = "hasEncapsulatedContent";
  private JsonNullable<Boolean> hasEncapsulatedContent = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_ENCAPSULATED_CONTENT_TYPE = "encapsulatedContentType";
  private CmsContentTypes encapsulatedContentType;

  public static final String JSON_PROPERTY_ENCAPSULATED_CONTENT = "encapsulatedContent";
  private FileReferenceModel encapsulatedContent;

  public InspectSignatureResponse() {
  }

  public InspectSignatureResponse success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public InspectSignatureResponse failure(InspectSignatureFailures failure) {
    
    this.failure = failure;
    return this;
  }

   /**
   * Get failure
   * @return failure
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InspectSignatureFailures getFailure() {
    return failure;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailure(InspectSignatureFailures failure) {
    this.failure = failure;
  }

  public InspectSignatureResponse missingDataHash(DigestAlgorithms missingDataHash) {
    
    this.missingDataHash = missingDataHash;
    return this;
  }

   /**
   * Get missingDataHash
   * @return missingDataHash
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MISSING_DATA_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DigestAlgorithms getMissingDataHash() {
    return missingDataHash;
  }


  @JsonProperty(JSON_PROPERTY_MISSING_DATA_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMissingDataHash(DigestAlgorithms missingDataHash) {
    this.missingDataHash = missingDataHash;
  }

  public InspectSignatureResponse signers(List<SignerModel> signers) {
    this.signers = JsonNullable.<List<SignerModel>>of(signers);
    
    return this;
  }

  public InspectSignatureResponse addSignersItem(SignerModel signersItem) {
    if (this.signers == null || !this.signers.isPresent()) {
      this.signers = JsonNullable.<List<SignerModel>>of(new ArrayList<>());
    }
    try {
      this.signers.get().add(signersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get signers
   * @return signers
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<SignerModel> getSigners() {
        return signers.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIGNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<SignerModel>> getSigners_JsonNullable() {
    return signers;
  }
  
  @JsonProperty(JSON_PROPERTY_SIGNERS)
  public void setSigners_JsonNullable(JsonNullable<List<SignerModel>> signers) {
    this.signers = signers;
  }

  public void setSigners(List<SignerModel> signers) {
    this.signers = JsonNullable.<List<SignerModel>>of(signers);
  }

  public InspectSignatureResponse document(DocumentSummary document) {
    
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentSummary getDocument() {
    return document;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocument(DocumentSummary document) {
    this.document = document;
  }

  public InspectSignatureResponse hasEncapsulatedContent(Boolean hasEncapsulatedContent) {
    this.hasEncapsulatedContent = JsonNullable.<Boolean>of(hasEncapsulatedContent);
    
    return this;
  }

   /**
   * Get hasEncapsulatedContent
   * @return hasEncapsulatedContent
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Boolean isHasEncapsulatedContent() {
        return hasEncapsulatedContent.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HAS_ENCAPSULATED_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> isHasEncapsulatedContent_JsonNullable() {
    return hasEncapsulatedContent;
  }
  
  @JsonProperty(JSON_PROPERTY_HAS_ENCAPSULATED_CONTENT)
  public void setHasEncapsulatedContent_JsonNullable(JsonNullable<Boolean> hasEncapsulatedContent) {
    this.hasEncapsulatedContent = hasEncapsulatedContent;
  }

  public void setHasEncapsulatedContent(Boolean hasEncapsulatedContent) {
    this.hasEncapsulatedContent = JsonNullable.<Boolean>of(hasEncapsulatedContent);
  }

  public InspectSignatureResponse encapsulatedContentType(CmsContentTypes encapsulatedContentType) {
    
    this.encapsulatedContentType = encapsulatedContentType;
    return this;
  }

   /**
   * Get encapsulatedContentType
   * @return encapsulatedContentType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCAPSULATED_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CmsContentTypes getEncapsulatedContentType() {
    return encapsulatedContentType;
  }


  @JsonProperty(JSON_PROPERTY_ENCAPSULATED_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncapsulatedContentType(CmsContentTypes encapsulatedContentType) {
    this.encapsulatedContentType = encapsulatedContentType;
  }

  public InspectSignatureResponse encapsulatedContent(FileReferenceModel encapsulatedContent) {
    
    this.encapsulatedContent = encapsulatedContent;
    return this;
  }

   /**
   * Get encapsulatedContent
   * @return encapsulatedContent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCAPSULATED_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileReferenceModel getEncapsulatedContent() {
    return encapsulatedContent;
  }


  @JsonProperty(JSON_PROPERTY_ENCAPSULATED_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncapsulatedContent(FileReferenceModel encapsulatedContent) {
    this.encapsulatedContent = encapsulatedContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectSignatureResponse inspectSignatureResponse = (InspectSignatureResponse) o;
    return Objects.equals(this.success, inspectSignatureResponse.success) &&
        Objects.equals(this.failure, inspectSignatureResponse.failure) &&
        Objects.equals(this.missingDataHash, inspectSignatureResponse.missingDataHash) &&
        equalsNullable(this.signers, inspectSignatureResponse.signers) &&
        Objects.equals(this.document, inspectSignatureResponse.document) &&
        equalsNullable(this.hasEncapsulatedContent, inspectSignatureResponse.hasEncapsulatedContent) &&
        Objects.equals(this.encapsulatedContentType, inspectSignatureResponse.encapsulatedContentType) &&
        Objects.equals(this.encapsulatedContent, inspectSignatureResponse.encapsulatedContent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, failure, missingDataHash, hashCodeNullable(signers), document, hashCodeNullable(hasEncapsulatedContent), encapsulatedContentType, encapsulatedContent);
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
    sb.append("class InspectSignatureResponse {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
    sb.append("    missingDataHash: ").append(toIndentedString(missingDataHash)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    hasEncapsulatedContent: ").append(toIndentedString(hasEncapsulatedContent)).append("\n");
    sb.append("    encapsulatedContentType: ").append(toIndentedString(encapsulatedContentType)).append("\n");
    sb.append("    encapsulatedContent: ").append(toIndentedString(encapsulatedContent)).append("\n");
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

    private InspectSignatureResponse instance;

    public Builder() {
      this(new InspectSignatureResponse());
    }

    protected Builder(InspectSignatureResponse instance) {
      this.instance = instance;
    }

    public InspectSignatureResponse.Builder success(Boolean success) {
      this.instance.success = success;
      return this;
    }
    public InspectSignatureResponse.Builder failure(InspectSignatureFailures failure) {
      this.instance.failure = failure;
      return this;
    }
    public InspectSignatureResponse.Builder missingDataHash(DigestAlgorithms missingDataHash) {
      this.instance.missingDataHash = missingDataHash;
      return this;
    }
    public InspectSignatureResponse.Builder signers(List<SignerModel> signers) {
      this.instance.signers = JsonNullable.<List<SignerModel>>of(signers);
      return this;
    }
    public InspectSignatureResponse.Builder signers(JsonNullable<List<SignerModel>> signers) {
      this.instance.signers = signers;
      return this;
    }
    public InspectSignatureResponse.Builder document(DocumentSummary document) {
      this.instance.document = document;
      return this;
    }
    public InspectSignatureResponse.Builder hasEncapsulatedContent(Boolean hasEncapsulatedContent) {
      this.instance.hasEncapsulatedContent = JsonNullable.<Boolean>of(hasEncapsulatedContent);
      return this;
    }
    public InspectSignatureResponse.Builder hasEncapsulatedContent(JsonNullable<Boolean> hasEncapsulatedContent) {
      this.instance.hasEncapsulatedContent = hasEncapsulatedContent;
      return this;
    }
    public InspectSignatureResponse.Builder encapsulatedContentType(CmsContentTypes encapsulatedContentType) {
      this.instance.encapsulatedContentType = encapsulatedContentType;
      return this;
    }
    public InspectSignatureResponse.Builder encapsulatedContent(FileReferenceModel encapsulatedContent) {
      this.instance.encapsulatedContent = encapsulatedContent;
      return this;
    }


    /**
    * returns a built InspectSignatureResponse instance.
    *
    * The builder is not reusable.
    */
    public InspectSignatureResponse build() {
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
  public static InspectSignatureResponse.Builder builder() {
    return new InspectSignatureResponse.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public InspectSignatureResponse.Builder toBuilder() {
    return new InspectSignatureResponse.Builder()
      .success(isSuccess())
      .failure(getFailure())
      .missingDataHash(getMissingDataHash())
      .signers(getSigners())
      .document(getDocument())
      .hasEncapsulatedContent(isHasEncapsulatedContent())
      .encapsulatedContentType(getEncapsulatedContentType())
      .encapsulatedContent(getEncapsulatedContent());
  }


}

