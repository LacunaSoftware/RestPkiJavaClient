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
import com.lacunasoftware.client.model.CadesSignerModel;
import com.lacunasoftware.client.model.CmsContentTypes;
import com.lacunasoftware.client.model.DigestAlgorithmAndValueModel;
import com.lacunasoftware.client.model.FileModel;
import com.lacunasoftware.client.model.SignatureBStampModel;
import java.time.OffsetDateTime;
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
 * CadesTimestampModel
 */
@JsonPropertyOrder({
  CadesTimestampModel.JSON_PROPERTY_GEN_TIME,
  CadesTimestampModel.JSON_PROPERTY_SERIAL_NUMBER,
  CadesTimestampModel.JSON_PROPERTY_MESSAGE_IMPRINT,
  CadesTimestampModel.JSON_PROPERTY_ENCAPSULATED_CONTENT_TYPE,
  CadesTimestampModel.JSON_PROPERTY_HAS_ENCAPSULATED_CONTENT,
  CadesTimestampModel.JSON_PROPERTY_SIGNERS,
  CadesTimestampModel.JSON_PROPERTY_ENCAPSULATED_CONTENT,
  CadesTimestampModel.JSON_PROPERTY_AUDIT_PACKAGE,
  CadesTimestampModel.JSON_PROPERTY_B_STAMP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class CadesTimestampModel {
  public static final String JSON_PROPERTY_GEN_TIME = "genTime";
  private OffsetDateTime genTime;

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serialNumber";
  private JsonNullable<String> serialNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MESSAGE_IMPRINT = "messageImprint";
  private DigestAlgorithmAndValueModel messageImprint;

  public static final String JSON_PROPERTY_ENCAPSULATED_CONTENT_TYPE = "encapsulatedContentType";
  private CmsContentTypes encapsulatedContentType;

  public static final String JSON_PROPERTY_HAS_ENCAPSULATED_CONTENT = "hasEncapsulatedContent";
  private Boolean hasEncapsulatedContent;

  public static final String JSON_PROPERTY_SIGNERS = "signers";
  private JsonNullable<List<CadesSignerModel>> signers = JsonNullable.<List<CadesSignerModel>>undefined();

  public static final String JSON_PROPERTY_ENCAPSULATED_CONTENT = "encapsulatedContent";
  private FileModel encapsulatedContent;

  public static final String JSON_PROPERTY_AUDIT_PACKAGE = "auditPackage";
  private FileModel auditPackage;

  public static final String JSON_PROPERTY_B_STAMP = "bStamp";
  private SignatureBStampModel bStamp;

  public CadesTimestampModel() {
  }

  public CadesTimestampModel genTime(OffsetDateTime genTime) {
    
    this.genTime = genTime;
    return this;
  }

   /**
   * Get genTime
   * @return genTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getGenTime() {
    return genTime;
  }


  @JsonProperty(JSON_PROPERTY_GEN_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGenTime(OffsetDateTime genTime) {
    this.genTime = genTime;
  }

  public CadesTimestampModel serialNumber(String serialNumber) {
    this.serialNumber = JsonNullable.<String>of(serialNumber);
    
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getSerialNumber() {
        return serialNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSerialNumber_JsonNullable() {
    return serialNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_SERIAL_NUMBER)
  public void setSerialNumber_JsonNullable(JsonNullable<String> serialNumber) {
    this.serialNumber = serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = JsonNullable.<String>of(serialNumber);
  }

  public CadesTimestampModel messageImprint(DigestAlgorithmAndValueModel messageImprint) {
    
    this.messageImprint = messageImprint;
    return this;
  }

   /**
   * Get messageImprint
   * @return messageImprint
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_IMPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DigestAlgorithmAndValueModel getMessageImprint() {
    return messageImprint;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_IMPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageImprint(DigestAlgorithmAndValueModel messageImprint) {
    this.messageImprint = messageImprint;
  }

  public CadesTimestampModel encapsulatedContentType(CmsContentTypes encapsulatedContentType) {
    
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

  public CadesTimestampModel hasEncapsulatedContent(Boolean hasEncapsulatedContent) {
    
    this.hasEncapsulatedContent = hasEncapsulatedContent;
    return this;
  }

   /**
   * Get hasEncapsulatedContent
   * @return hasEncapsulatedContent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_ENCAPSULATED_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isHasEncapsulatedContent() {
    return hasEncapsulatedContent;
  }


  @JsonProperty(JSON_PROPERTY_HAS_ENCAPSULATED_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasEncapsulatedContent(Boolean hasEncapsulatedContent) {
    this.hasEncapsulatedContent = hasEncapsulatedContent;
  }

  public CadesTimestampModel signers(List<CadesSignerModel> signers) {
    this.signers = JsonNullable.<List<CadesSignerModel>>of(signers);
    
    return this;
  }

  public CadesTimestampModel addSignersItem(CadesSignerModel signersItem) {
    if (this.signers == null || !this.signers.isPresent()) {
      this.signers = JsonNullable.<List<CadesSignerModel>>of(new ArrayList<>());
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

  public List<CadesSignerModel> getSigners() {
        return signers.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIGNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<CadesSignerModel>> getSigners_JsonNullable() {
    return signers;
  }
  
  @JsonProperty(JSON_PROPERTY_SIGNERS)
  public void setSigners_JsonNullable(JsonNullable<List<CadesSignerModel>> signers) {
    this.signers = signers;
  }

  public void setSigners(List<CadesSignerModel> signers) {
    this.signers = JsonNullable.<List<CadesSignerModel>>of(signers);
  }

  public CadesTimestampModel encapsulatedContent(FileModel encapsulatedContent) {
    
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

  public FileModel getEncapsulatedContent() {
    return encapsulatedContent;
  }


  @JsonProperty(JSON_PROPERTY_ENCAPSULATED_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncapsulatedContent(FileModel encapsulatedContent) {
    this.encapsulatedContent = encapsulatedContent;
  }

  public CadesTimestampModel auditPackage(FileModel auditPackage) {
    
    this.auditPackage = auditPackage;
    return this;
  }

   /**
   * Get auditPackage
   * @return auditPackage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIT_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FileModel getAuditPackage() {
    return auditPackage;
  }


  @JsonProperty(JSON_PROPERTY_AUDIT_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuditPackage(FileModel auditPackage) {
    this.auditPackage = auditPackage;
  }

  public CadesTimestampModel bStamp(SignatureBStampModel bStamp) {
    
    this.bStamp = bStamp;
    return this;
  }

   /**
   * Get bStamp
   * @return bStamp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_B_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SignatureBStampModel getbStamp() {
    return bStamp;
  }


  @JsonProperty(JSON_PROPERTY_B_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setbStamp(SignatureBStampModel bStamp) {
    this.bStamp = bStamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CadesTimestampModel cadesTimestampModel = (CadesTimestampModel) o;
    return Objects.equals(this.genTime, cadesTimestampModel.genTime) &&
        equalsNullable(this.serialNumber, cadesTimestampModel.serialNumber) &&
        Objects.equals(this.messageImprint, cadesTimestampModel.messageImprint) &&
        Objects.equals(this.encapsulatedContentType, cadesTimestampModel.encapsulatedContentType) &&
        Objects.equals(this.hasEncapsulatedContent, cadesTimestampModel.hasEncapsulatedContent) &&
        equalsNullable(this.signers, cadesTimestampModel.signers) &&
        Objects.equals(this.encapsulatedContent, cadesTimestampModel.encapsulatedContent) &&
        Objects.equals(this.auditPackage, cadesTimestampModel.auditPackage) &&
        Objects.equals(this.bStamp, cadesTimestampModel.bStamp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(genTime, hashCodeNullable(serialNumber), messageImprint, encapsulatedContentType, hasEncapsulatedContent, hashCodeNullable(signers), encapsulatedContent, auditPackage, bStamp);
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
    sb.append("class CadesTimestampModel {\n");
    sb.append("    genTime: ").append(toIndentedString(genTime)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    messageImprint: ").append(toIndentedString(messageImprint)).append("\n");
    sb.append("    encapsulatedContentType: ").append(toIndentedString(encapsulatedContentType)).append("\n");
    sb.append("    hasEncapsulatedContent: ").append(toIndentedString(hasEncapsulatedContent)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    encapsulatedContent: ").append(toIndentedString(encapsulatedContent)).append("\n");
    sb.append("    auditPackage: ").append(toIndentedString(auditPackage)).append("\n");
    sb.append("    bStamp: ").append(toIndentedString(bStamp)).append("\n");
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

    private CadesTimestampModel instance;

    public Builder() {
      this(new CadesTimestampModel());
    }

    protected Builder(CadesTimestampModel instance) {
      this.instance = instance;
    }

    public CadesTimestampModel.Builder genTime(OffsetDateTime genTime) {
      this.instance.genTime = genTime;
      return this;
    }
    public CadesTimestampModel.Builder serialNumber(String serialNumber) {
      this.instance.serialNumber = JsonNullable.<String>of(serialNumber);
      return this;
    }
    public CadesTimestampModel.Builder serialNumber(JsonNullable<String> serialNumber) {
      this.instance.serialNumber = serialNumber;
      return this;
    }
    public CadesTimestampModel.Builder messageImprint(DigestAlgorithmAndValueModel messageImprint) {
      this.instance.messageImprint = messageImprint;
      return this;
    }
    public CadesTimestampModel.Builder encapsulatedContentType(CmsContentTypes encapsulatedContentType) {
      this.instance.encapsulatedContentType = encapsulatedContentType;
      return this;
    }
    public CadesTimestampModel.Builder hasEncapsulatedContent(Boolean hasEncapsulatedContent) {
      this.instance.hasEncapsulatedContent = hasEncapsulatedContent;
      return this;
    }
    public CadesTimestampModel.Builder signers(List<CadesSignerModel> signers) {
      this.instance.signers = JsonNullable.<List<CadesSignerModel>>of(signers);
      return this;
    }
    public CadesTimestampModel.Builder signers(JsonNullable<List<CadesSignerModel>> signers) {
      this.instance.signers = signers;
      return this;
    }
    public CadesTimestampModel.Builder encapsulatedContent(FileModel encapsulatedContent) {
      this.instance.encapsulatedContent = encapsulatedContent;
      return this;
    }
    public CadesTimestampModel.Builder auditPackage(FileModel auditPackage) {
      this.instance.auditPackage = auditPackage;
      return this;
    }
    public CadesTimestampModel.Builder bStamp(SignatureBStampModel bStamp) {
      this.instance.bStamp = bStamp;
      return this;
    }


    /**
    * returns a built CadesTimestampModel instance.
    *
    * The builder is not reusable.
    */
    public CadesTimestampModel build() {
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
  public static CadesTimestampModel.Builder builder() {
    return new CadesTimestampModel.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public CadesTimestampModel.Builder toBuilder() {
    return new CadesTimestampModel.Builder()
      .genTime(getGenTime())
      .serialNumber(getSerialNumber())
      .messageImprint(getMessageImprint())
      .encapsulatedContentType(getEncapsulatedContentType())
      .hasEncapsulatedContent(isHasEncapsulatedContent())
      .signers(getSigners())
      .encapsulatedContent(getEncapsulatedContent())
      .auditPackage(getAuditPackage())
      .bStamp(getbStamp());
  }


}

