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
import com.lacunasoftware.client.model.CmsSignatureOptions;
import com.lacunasoftware.client.model.FileReferenceModel;
import com.lacunasoftware.client.model.PdfSignatureOptions;
import com.lacunasoftware.client.model.SignatureTypes;
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
 * SignatureSessionDocumentData
 */
@JsonPropertyOrder({
  SignatureSessionDocumentData.JSON_PROPERTY_ID,
  SignatureSessionDocumentData.JSON_PROPERTY_FILE,
  SignatureSessionDocumentData.JSON_PROPERTY_METADATA,
  SignatureSessionDocumentData.JSON_PROPERTY_DOCUMENT_KEY,
  SignatureSessionDocumentData.JSON_PROPERTY_SIGNATURE_TYPE,
  SignatureSessionDocumentData.JSON_PROPERTY_PDF_SIGNATURE_OPTIONS,
  SignatureSessionDocumentData.JSON_PROPERTY_CMS_SIGNATURE_OPTIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class SignatureSessionDocumentData {
  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<UUID> id = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_FILE = "file";
  private FileReferenceModel _file;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Map<String, List<String>>> metadata = JsonNullable.<Map<String, List<String>>>undefined();

  public static final String JSON_PROPERTY_DOCUMENT_KEY = "documentKey";
  private JsonNullable<String> documentKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SIGNATURE_TYPE = "signatureType";
  private SignatureTypes signatureType;

  public static final String JSON_PROPERTY_PDF_SIGNATURE_OPTIONS = "pdfSignatureOptions";
  private PdfSignatureOptions pdfSignatureOptions;

  public static final String JSON_PROPERTY_CMS_SIGNATURE_OPTIONS = "cmsSignatureOptions";
  private CmsSignatureOptions cmsSignatureOptions;

  public SignatureSessionDocumentData() {
  }

  public SignatureSessionDocumentData id(UUID id) {
    this.id = JsonNullable.<UUID>of(id);
    
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public UUID getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<UUID> id) {
    this.id = id;
  }

  public void setId(UUID id) {
    this.id = JsonNullable.<UUID>of(id);
  }

  public SignatureSessionDocumentData _file(FileReferenceModel _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileReferenceModel getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFile(FileReferenceModel _file) {
    this._file = _file;
  }

  public SignatureSessionDocumentData metadata(Map<String, List<String>> metadata) {
    this.metadata = JsonNullable.<Map<String, List<String>>>of(metadata);
    
    return this;
  }

  public SignatureSessionDocumentData putMetadataItem(String key, List<String> metadataItem) {
    if (this.metadata == null || !this.metadata.isPresent()) {
      this.metadata = JsonNullable.<Map<String, List<String>>>of(new HashMap<>());
    }
    try {
      this.metadata.get().put(key, metadataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Map<String, List<String>> getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, List<String>>> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Map<String, List<String>>> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Map<String, List<String>> metadata) {
    this.metadata = JsonNullable.<Map<String, List<String>>>of(metadata);
  }

  public SignatureSessionDocumentData documentKey(String documentKey) {
    this.documentKey = JsonNullable.<String>of(documentKey);
    
    return this;
  }

   /**
   * Get documentKey
   * @return documentKey
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getDocumentKey() {
        return documentKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DOCUMENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDocumentKey_JsonNullable() {
    return documentKey;
  }
  
  @JsonProperty(JSON_PROPERTY_DOCUMENT_KEY)
  public void setDocumentKey_JsonNullable(JsonNullable<String> documentKey) {
    this.documentKey = documentKey;
  }

  public void setDocumentKey(String documentKey) {
    this.documentKey = JsonNullable.<String>of(documentKey);
  }

  public SignatureSessionDocumentData signatureType(SignatureTypes signatureType) {
    
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

  public SignatureSessionDocumentData pdfSignatureOptions(PdfSignatureOptions pdfSignatureOptions) {
    
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

  public SignatureSessionDocumentData cmsSignatureOptions(CmsSignatureOptions cmsSignatureOptions) {
    
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
    SignatureSessionDocumentData signatureSessionDocumentData = (SignatureSessionDocumentData) o;
    return equalsNullable(this.id, signatureSessionDocumentData.id) &&
        Objects.equals(this._file, signatureSessionDocumentData._file) &&
        equalsNullable(this.metadata, signatureSessionDocumentData.metadata) &&
        equalsNullable(this.documentKey, signatureSessionDocumentData.documentKey) &&
        Objects.equals(this.signatureType, signatureSessionDocumentData.signatureType) &&
        Objects.equals(this.pdfSignatureOptions, signatureSessionDocumentData.pdfSignatureOptions) &&
        Objects.equals(this.cmsSignatureOptions, signatureSessionDocumentData.cmsSignatureOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), _file, hashCodeNullable(metadata), hashCodeNullable(documentKey), signatureType, pdfSignatureOptions, cmsSignatureOptions);
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
    sb.append("class SignatureSessionDocumentData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    documentKey: ").append(toIndentedString(documentKey)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
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

    private SignatureSessionDocumentData instance;

    public Builder() {
      this(new SignatureSessionDocumentData());
    }

    protected Builder(SignatureSessionDocumentData instance) {
      this.instance = instance;
    }

    public SignatureSessionDocumentData.Builder id(UUID id) {
      this.instance.id = JsonNullable.<UUID>of(id);
      return this;
    }
    public SignatureSessionDocumentData.Builder id(JsonNullable<UUID> id) {
      this.instance.id = id;
      return this;
    }
    public SignatureSessionDocumentData.Builder _file(FileReferenceModel _file) {
      this.instance._file = _file;
      return this;
    }
    public SignatureSessionDocumentData.Builder metadata(Map<String, List<String>> metadata) {
      this.instance.metadata = JsonNullable.<Map<String, List<String>>>of(metadata);
      return this;
    }
    public SignatureSessionDocumentData.Builder metadata(JsonNullable<Map<String, List<String>>> metadata) {
      this.instance.metadata = metadata;
      return this;
    }
    public SignatureSessionDocumentData.Builder documentKey(String documentKey) {
      this.instance.documentKey = JsonNullable.<String>of(documentKey);
      return this;
    }
    public SignatureSessionDocumentData.Builder documentKey(JsonNullable<String> documentKey) {
      this.instance.documentKey = documentKey;
      return this;
    }
    public SignatureSessionDocumentData.Builder signatureType(SignatureTypes signatureType) {
      this.instance.signatureType = signatureType;
      return this;
    }
    public SignatureSessionDocumentData.Builder pdfSignatureOptions(PdfSignatureOptions pdfSignatureOptions) {
      this.instance.pdfSignatureOptions = pdfSignatureOptions;
      return this;
    }
    public SignatureSessionDocumentData.Builder cmsSignatureOptions(CmsSignatureOptions cmsSignatureOptions) {
      this.instance.cmsSignatureOptions = cmsSignatureOptions;
      return this;
    }


    /**
    * returns a built SignatureSessionDocumentData instance.
    *
    * The builder is not reusable.
    */
    public SignatureSessionDocumentData build() {
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
  public static SignatureSessionDocumentData.Builder builder() {
    return new SignatureSessionDocumentData.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public SignatureSessionDocumentData.Builder toBuilder() {
    return new SignatureSessionDocumentData.Builder()
      .id(getId())
      ._file(getFile())
      .metadata(getMetadata())
      .documentKey(getDocumentKey())
      .signatureType(getSignatureType())
      .pdfSignatureOptions(getPdfSignatureOptions())
      .cmsSignatureOptions(getCmsSignatureOptions());
  }


}

