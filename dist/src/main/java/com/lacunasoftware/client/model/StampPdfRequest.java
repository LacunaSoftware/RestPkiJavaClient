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
import com.lacunasoftware.client.model.FileReferenceModel;
import com.lacunasoftware.client.model.PadesVisualRepresentationModel;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * StampPdfRequest
 */
@JsonPropertyOrder({
  StampPdfRequest.JSON_PROPERTY_FILE,
  StampPdfRequest.JSON_PROPERTY_TIMESTAMP_TIER,
  StampPdfRequest.JSON_PROPERTY_CUSTOM_SIGNATURE_FIELD_NAME,
  StampPdfRequest.JSON_PROPERTY_REASON,
  StampPdfRequest.JSON_PROPERTY_FORCE_BLOB_RESULT,
  StampPdfRequest.JSON_PROPERTY_VISUAL_REPRESENTATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class StampPdfRequest {
  public static final String JSON_PROPERTY_FILE = "file";
  private FileReferenceModel _file;

  public static final String JSON_PROPERTY_TIMESTAMP_TIER = "timestampTier";
  private JsonNullable<String> timestampTier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOM_SIGNATURE_FIELD_NAME = "customSignatureFieldName";
  private JsonNullable<String> customSignatureFieldName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REASON = "reason";
  private JsonNullable<String> reason = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FORCE_BLOB_RESULT = "forceBlobResult";
  private Boolean forceBlobResult;

  public static final String JSON_PROPERTY_VISUAL_REPRESENTATION = "visualRepresentation";
  private PadesVisualRepresentationModel visualRepresentation;

  public StampPdfRequest() {
  }

  public StampPdfRequest _file(FileReferenceModel _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileReferenceModel getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFile(FileReferenceModel _file) {
    this._file = _file;
  }

  public StampPdfRequest timestampTier(String timestampTier) {
    this.timestampTier = JsonNullable.<String>of(timestampTier);
    
    return this;
  }

   /**
   * Get timestampTier
   * @return timestampTier
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getTimestampTier() {
        return timestampTier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIMESTAMP_TIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTimestampTier_JsonNullable() {
    return timestampTier;
  }
  
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_TIER)
  public void setTimestampTier_JsonNullable(JsonNullable<String> timestampTier) {
    this.timestampTier = timestampTier;
  }

  public void setTimestampTier(String timestampTier) {
    this.timestampTier = JsonNullable.<String>of(timestampTier);
  }

  public StampPdfRequest customSignatureFieldName(String customSignatureFieldName) {
    this.customSignatureFieldName = JsonNullable.<String>of(customSignatureFieldName);
    
    return this;
  }

   /**
   * Get customSignatureFieldName
   * @return customSignatureFieldName
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getCustomSignatureFieldName() {
        return customSignatureFieldName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_SIGNATURE_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCustomSignatureFieldName_JsonNullable() {
    return customSignatureFieldName;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_SIGNATURE_FIELD_NAME)
  public void setCustomSignatureFieldName_JsonNullable(JsonNullable<String> customSignatureFieldName) {
    this.customSignatureFieldName = customSignatureFieldName;
  }

  public void setCustomSignatureFieldName(String customSignatureFieldName) {
    this.customSignatureFieldName = JsonNullable.<String>of(customSignatureFieldName);
  }

  public StampPdfRequest reason(String reason) {
    this.reason = JsonNullable.<String>of(reason);
    
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getReason() {
        return reason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReason_JsonNullable() {
    return reason;
  }
  
  @JsonProperty(JSON_PROPERTY_REASON)
  public void setReason_JsonNullable(JsonNullable<String> reason) {
    this.reason = reason;
  }

  public void setReason(String reason) {
    this.reason = JsonNullable.<String>of(reason);
  }

  public StampPdfRequest forceBlobResult(Boolean forceBlobResult) {
    
    this.forceBlobResult = forceBlobResult;
    return this;
  }

   /**
   * Get forceBlobResult
   * @return forceBlobResult
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORCE_BLOB_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isForceBlobResult() {
    return forceBlobResult;
  }


  @JsonProperty(JSON_PROPERTY_FORCE_BLOB_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForceBlobResult(Boolean forceBlobResult) {
    this.forceBlobResult = forceBlobResult;
  }

  public StampPdfRequest visualRepresentation(PadesVisualRepresentationModel visualRepresentation) {
    
    this.visualRepresentation = visualRepresentation;
    return this;
  }

   /**
   * Get visualRepresentation
   * @return visualRepresentation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISUAL_REPRESENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PadesVisualRepresentationModel getVisualRepresentation() {
    return visualRepresentation;
  }


  @JsonProperty(JSON_PROPERTY_VISUAL_REPRESENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisualRepresentation(PadesVisualRepresentationModel visualRepresentation) {
    this.visualRepresentation = visualRepresentation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StampPdfRequest stampPdfRequest = (StampPdfRequest) o;
    return Objects.equals(this._file, stampPdfRequest._file) &&
        equalsNullable(this.timestampTier, stampPdfRequest.timestampTier) &&
        equalsNullable(this.customSignatureFieldName, stampPdfRequest.customSignatureFieldName) &&
        equalsNullable(this.reason, stampPdfRequest.reason) &&
        Objects.equals(this.forceBlobResult, stampPdfRequest.forceBlobResult) &&
        Objects.equals(this.visualRepresentation, stampPdfRequest.visualRepresentation);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, hashCodeNullable(timestampTier), hashCodeNullable(customSignatureFieldName), hashCodeNullable(reason), forceBlobResult, visualRepresentation);
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
    sb.append("class StampPdfRequest {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    timestampTier: ").append(toIndentedString(timestampTier)).append("\n");
    sb.append("    customSignatureFieldName: ").append(toIndentedString(customSignatureFieldName)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    forceBlobResult: ").append(toIndentedString(forceBlobResult)).append("\n");
    sb.append("    visualRepresentation: ").append(toIndentedString(visualRepresentation)).append("\n");
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

    private StampPdfRequest instance;

    public Builder() {
      this(new StampPdfRequest());
    }

    protected Builder(StampPdfRequest instance) {
      this.instance = instance;
    }

    public StampPdfRequest.Builder _file(FileReferenceModel _file) {
      this.instance._file = _file;
      return this;
    }
    public StampPdfRequest.Builder timestampTier(String timestampTier) {
      this.instance.timestampTier = JsonNullable.<String>of(timestampTier);
      return this;
    }
    public StampPdfRequest.Builder timestampTier(JsonNullable<String> timestampTier) {
      this.instance.timestampTier = timestampTier;
      return this;
    }
    public StampPdfRequest.Builder customSignatureFieldName(String customSignatureFieldName) {
      this.instance.customSignatureFieldName = JsonNullable.<String>of(customSignatureFieldName);
      return this;
    }
    public StampPdfRequest.Builder customSignatureFieldName(JsonNullable<String> customSignatureFieldName) {
      this.instance.customSignatureFieldName = customSignatureFieldName;
      return this;
    }
    public StampPdfRequest.Builder reason(String reason) {
      this.instance.reason = JsonNullable.<String>of(reason);
      return this;
    }
    public StampPdfRequest.Builder reason(JsonNullable<String> reason) {
      this.instance.reason = reason;
      return this;
    }
    public StampPdfRequest.Builder forceBlobResult(Boolean forceBlobResult) {
      this.instance.forceBlobResult = forceBlobResult;
      return this;
    }
    public StampPdfRequest.Builder visualRepresentation(PadesVisualRepresentationModel visualRepresentation) {
      this.instance.visualRepresentation = visualRepresentation;
      return this;
    }


    /**
    * returns a built StampPdfRequest instance.
    *
    * The builder is not reusable.
    */
    public StampPdfRequest build() {
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
  public static StampPdfRequest.Builder builder() {
    return new StampPdfRequest.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public StampPdfRequest.Builder toBuilder() {
    return new StampPdfRequest.Builder()
      ._file(getFile())
      .timestampTier(getTimestampTier())
      .customSignatureFieldName(getCustomSignatureFieldName())
      .reason(getReason())
      .forceBlobResult(isForceBlobResult())
      .visualRepresentation(getVisualRepresentation());
  }


}

