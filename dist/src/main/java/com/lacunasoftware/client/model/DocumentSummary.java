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
import com.lacunasoftware.client.model.DocumentFileModel;
import com.lacunasoftware.client.model.SignatureTypes;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DocumentSummary
 */
@JsonPropertyOrder({
  DocumentSummary.JSON_PROPERTY_ID,
  DocumentSummary.JSON_PROPERTY_KEY,
  DocumentSummary.JSON_PROPERTY_FORMATTED_KEY,
  DocumentSummary.JSON_PROPERTY_ORIGINAL_FILE,
  DocumentSummary.JSON_PROPERTY_MARKED_FILE,
  DocumentSummary.JSON_PROPERTY_SIGNED_FILE,
  DocumentSummary.JSON_PROPERTY_SIGNATURE_TYPE,
  DocumentSummary.JSON_PROPERTY_AVAILABLE_UNTIL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class DocumentSummary {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_KEY = "key";
  private JsonNullable<String> key = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FORMATTED_KEY = "formattedKey";
  private JsonNullable<String> formattedKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORIGINAL_FILE = "originalFile";
  private DocumentFileModel originalFile;

  public static final String JSON_PROPERTY_MARKED_FILE = "markedFile";
  private DocumentFileModel markedFile;

  public static final String JSON_PROPERTY_SIGNED_FILE = "signedFile";
  private DocumentFileModel signedFile;

  public static final String JSON_PROPERTY_SIGNATURE_TYPE = "signatureType";
  private SignatureTypes signatureType;

  public static final String JSON_PROPERTY_AVAILABLE_UNTIL = "availableUntil";
  private JsonNullable<OffsetDateTime> availableUntil = JsonNullable.<OffsetDateTime>undefined();

  public DocumentSummary() {
  }

  public DocumentSummary id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }

  public DocumentSummary key(String key) {
    this.key = JsonNullable.<String>of(key);
    
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getKey() {
        return key.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getKey_JsonNullable() {
    return key;
  }
  
  @JsonProperty(JSON_PROPERTY_KEY)
  public void setKey_JsonNullable(JsonNullable<String> key) {
    this.key = key;
  }

  public void setKey(String key) {
    this.key = JsonNullable.<String>of(key);
  }

  public DocumentSummary formattedKey(String formattedKey) {
    this.formattedKey = JsonNullable.<String>of(formattedKey);
    
    return this;
  }

   /**
   * Get formattedKey
   * @return formattedKey
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getFormattedKey() {
        return formattedKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FORMATTED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFormattedKey_JsonNullable() {
    return formattedKey;
  }
  
  @JsonProperty(JSON_PROPERTY_FORMATTED_KEY)
  public void setFormattedKey_JsonNullable(JsonNullable<String> formattedKey) {
    this.formattedKey = formattedKey;
  }

  public void setFormattedKey(String formattedKey) {
    this.formattedKey = JsonNullable.<String>of(formattedKey);
  }

  public DocumentSummary originalFile(DocumentFileModel originalFile) {
    
    this.originalFile = originalFile;
    return this;
  }

   /**
   * Get originalFile
   * @return originalFile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentFileModel getOriginalFile() {
    return originalFile;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalFile(DocumentFileModel originalFile) {
    this.originalFile = originalFile;
  }

  public DocumentSummary markedFile(DocumentFileModel markedFile) {
    
    this.markedFile = markedFile;
    return this;
  }

   /**
   * Get markedFile
   * @return markedFile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARKED_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentFileModel getMarkedFile() {
    return markedFile;
  }


  @JsonProperty(JSON_PROPERTY_MARKED_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkedFile(DocumentFileModel markedFile) {
    this.markedFile = markedFile;
  }

  public DocumentSummary signedFile(DocumentFileModel signedFile) {
    
    this.signedFile = signedFile;
    return this;
  }

   /**
   * Get signedFile
   * @return signedFile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNED_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentFileModel getSignedFile() {
    return signedFile;
  }


  @JsonProperty(JSON_PROPERTY_SIGNED_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignedFile(DocumentFileModel signedFile) {
    this.signedFile = signedFile;
  }

  public DocumentSummary signatureType(SignatureTypes signatureType) {
    
    this.signatureType = signatureType;
    return this;
  }

   /**
   * Get signatureType
   * @return signatureType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNATURE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SignatureTypes getSignatureType() {
    return signatureType;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignatureType(SignatureTypes signatureType) {
    this.signatureType = signatureType;
  }

  public DocumentSummary availableUntil(OffsetDateTime availableUntil) {
    this.availableUntil = JsonNullable.<OffsetDateTime>of(availableUntil);
    
    return this;
  }

   /**
   * Get availableUntil
   * @return availableUntil
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getAvailableUntil() {
        return availableUntil.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVAILABLE_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getAvailableUntil_JsonNullable() {
    return availableUntil;
  }
  
  @JsonProperty(JSON_PROPERTY_AVAILABLE_UNTIL)
  public void setAvailableUntil_JsonNullable(JsonNullable<OffsetDateTime> availableUntil) {
    this.availableUntil = availableUntil;
  }

  public void setAvailableUntil(OffsetDateTime availableUntil) {
    this.availableUntil = JsonNullable.<OffsetDateTime>of(availableUntil);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSummary documentSummary = (DocumentSummary) o;
    return Objects.equals(this.id, documentSummary.id) &&
        equalsNullable(this.key, documentSummary.key) &&
        equalsNullable(this.formattedKey, documentSummary.formattedKey) &&
        Objects.equals(this.originalFile, documentSummary.originalFile) &&
        Objects.equals(this.markedFile, documentSummary.markedFile) &&
        Objects.equals(this.signedFile, documentSummary.signedFile) &&
        Objects.equals(this.signatureType, documentSummary.signatureType) &&
        equalsNullable(this.availableUntil, documentSummary.availableUntil);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(key), hashCodeNullable(formattedKey), originalFile, markedFile, signedFile, signatureType, hashCodeNullable(availableUntil));
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
    sb.append("class DocumentSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    formattedKey: ").append(toIndentedString(formattedKey)).append("\n");
    sb.append("    originalFile: ").append(toIndentedString(originalFile)).append("\n");
    sb.append("    markedFile: ").append(toIndentedString(markedFile)).append("\n");
    sb.append("    signedFile: ").append(toIndentedString(signedFile)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("    availableUntil: ").append(toIndentedString(availableUntil)).append("\n");
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

    private DocumentSummary instance;

    public Builder() {
      this(new DocumentSummary());
    }

    protected Builder(DocumentSummary instance) {
      this.instance = instance;
    }

    public DocumentSummary.Builder id(UUID id) {
      this.instance.id = id;
      return this;
    }
    public DocumentSummary.Builder key(String key) {
      this.instance.key = JsonNullable.<String>of(key);
      return this;
    }
    public DocumentSummary.Builder key(JsonNullable<String> key) {
      this.instance.key = key;
      return this;
    }
    public DocumentSummary.Builder formattedKey(String formattedKey) {
      this.instance.formattedKey = JsonNullable.<String>of(formattedKey);
      return this;
    }
    public DocumentSummary.Builder formattedKey(JsonNullable<String> formattedKey) {
      this.instance.formattedKey = formattedKey;
      return this;
    }
    public DocumentSummary.Builder originalFile(DocumentFileModel originalFile) {
      this.instance.originalFile = originalFile;
      return this;
    }
    public DocumentSummary.Builder markedFile(DocumentFileModel markedFile) {
      this.instance.markedFile = markedFile;
      return this;
    }
    public DocumentSummary.Builder signedFile(DocumentFileModel signedFile) {
      this.instance.signedFile = signedFile;
      return this;
    }
    public DocumentSummary.Builder signatureType(SignatureTypes signatureType) {
      this.instance.signatureType = signatureType;
      return this;
    }
    public DocumentSummary.Builder availableUntil(OffsetDateTime availableUntil) {
      this.instance.availableUntil = JsonNullable.<OffsetDateTime>of(availableUntil);
      return this;
    }
    public DocumentSummary.Builder availableUntil(JsonNullable<OffsetDateTime> availableUntil) {
      this.instance.availableUntil = availableUntil;
      return this;
    }


    /**
    * returns a built DocumentSummary instance.
    *
    * The builder is not reusable.
    */
    public DocumentSummary build() {
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
  public static DocumentSummary.Builder builder() {
    return new DocumentSummary.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public DocumentSummary.Builder toBuilder() {
    return new DocumentSummary.Builder()
      .id(getId())
      .key(getKey())
      .formattedKey(getFormattedKey())
      .originalFile(getOriginalFile())
      .markedFile(getMarkedFile())
      .signedFile(getSignedFile())
      .signatureType(getSignatureType())
      .availableUntil(getAvailableUntil());
  }


}

