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
import com.lacunasoftware.client.model.AuditPackageOptions;
import com.lacunasoftware.client.model.DigestAlgorithmAndValueModel;
import com.lacunasoftware.client.model.FileModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OpenSignatureRequestModel
 */
@JsonPropertyOrder({
  OpenSignatureRequestModel.JSON_PROPERTY_FILE,
  OpenSignatureRequestModel.JSON_PROPERTY_VALIDATE,
  OpenSignatureRequestModel.JSON_PROPERTY_AUDIT_PACKAGE,
  OpenSignatureRequestModel.JSON_PROPERTY_DEFAULT_SIGNATURE_POLICY_ID,
  OpenSignatureRequestModel.JSON_PROPERTY_ACCEPTABLE_EXPLICIT_POLICIES,
  OpenSignatureRequestModel.JSON_PROPERTY_SECURITY_CONTEXT_ID,
  OpenSignatureRequestModel.JSON_PROPERTY_IGNORE_REVOCATION_STATUS_UNKNOWN,
  OpenSignatureRequestModel.JSON_PROPERTY_TRUST_UNCERTIFIED_SIGNING_TIME,
  OpenSignatureRequestModel.JSON_PROPERTY_DATA_HASHES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class OpenSignatureRequestModel {
  public static final String JSON_PROPERTY_FILE = "file";
  private FileModel _file;

  public static final String JSON_PROPERTY_VALIDATE = "validate";
  private Boolean validate;

  public static final String JSON_PROPERTY_AUDIT_PACKAGE = "auditPackage";
  private AuditPackageOptions auditPackage;

  public static final String JSON_PROPERTY_DEFAULT_SIGNATURE_POLICY_ID = "defaultSignaturePolicyId";
  private JsonNullable<UUID> defaultSignaturePolicyId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_ACCEPTABLE_EXPLICIT_POLICIES = "acceptableExplicitPolicies";
  private JsonNullable<List<UUID>> acceptableExplicitPolicies = JsonNullable.<List<UUID>>undefined();

  public static final String JSON_PROPERTY_SECURITY_CONTEXT_ID = "securityContextId";
  private JsonNullable<UUID> securityContextId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_IGNORE_REVOCATION_STATUS_UNKNOWN = "ignoreRevocationStatusUnknown";
  private JsonNullable<Boolean> ignoreRevocationStatusUnknown = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TRUST_UNCERTIFIED_SIGNING_TIME = "trustUncertifiedSigningTime";
  private Boolean trustUncertifiedSigningTime;

  public static final String JSON_PROPERTY_DATA_HASHES = "dataHashes";
  private JsonNullable<List<DigestAlgorithmAndValueModel>> dataHashes = JsonNullable.<List<DigestAlgorithmAndValueModel>>undefined();

  public OpenSignatureRequestModel() {
  }

  public OpenSignatureRequestModel _file(FileModel _file) {
    
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

  public FileModel getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFile(FileModel _file) {
    this._file = _file;
  }

  public OpenSignatureRequestModel validate(Boolean validate) {
    
    this.validate = validate;
    return this;
  }

   /**
   * Get validate
   * @return validate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALIDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isValidate() {
    return validate;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidate(Boolean validate) {
    this.validate = validate;
  }

  public OpenSignatureRequestModel auditPackage(AuditPackageOptions auditPackage) {
    
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

  public AuditPackageOptions getAuditPackage() {
    return auditPackage;
  }


  @JsonProperty(JSON_PROPERTY_AUDIT_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuditPackage(AuditPackageOptions auditPackage) {
    this.auditPackage = auditPackage;
  }

  public OpenSignatureRequestModel defaultSignaturePolicyId(UUID defaultSignaturePolicyId) {
    this.defaultSignaturePolicyId = JsonNullable.<UUID>of(defaultSignaturePolicyId);
    
    return this;
  }

   /**
   * Get defaultSignaturePolicyId
   * @return defaultSignaturePolicyId
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public UUID getDefaultSignaturePolicyId() {
        return defaultSignaturePolicyId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_SIGNATURE_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getDefaultSignaturePolicyId_JsonNullable() {
    return defaultSignaturePolicyId;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_SIGNATURE_POLICY_ID)
  public void setDefaultSignaturePolicyId_JsonNullable(JsonNullable<UUID> defaultSignaturePolicyId) {
    this.defaultSignaturePolicyId = defaultSignaturePolicyId;
  }

  public void setDefaultSignaturePolicyId(UUID defaultSignaturePolicyId) {
    this.defaultSignaturePolicyId = JsonNullable.<UUID>of(defaultSignaturePolicyId);
  }

  public OpenSignatureRequestModel acceptableExplicitPolicies(List<UUID> acceptableExplicitPolicies) {
    this.acceptableExplicitPolicies = JsonNullable.<List<UUID>>of(acceptableExplicitPolicies);
    
    return this;
  }

  public OpenSignatureRequestModel addAcceptableExplicitPoliciesItem(UUID acceptableExplicitPoliciesItem) {
    if (this.acceptableExplicitPolicies == null || !this.acceptableExplicitPolicies.isPresent()) {
      this.acceptableExplicitPolicies = JsonNullable.<List<UUID>>of(new ArrayList<>());
    }
    try {
      this.acceptableExplicitPolicies.get().add(acceptableExplicitPoliciesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get acceptableExplicitPolicies
   * @return acceptableExplicitPolicies
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<UUID> getAcceptableExplicitPolicies() {
        return acceptableExplicitPolicies.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCEPTABLE_EXPLICIT_POLICIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<UUID>> getAcceptableExplicitPolicies_JsonNullable() {
    return acceptableExplicitPolicies;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCEPTABLE_EXPLICIT_POLICIES)
  public void setAcceptableExplicitPolicies_JsonNullable(JsonNullable<List<UUID>> acceptableExplicitPolicies) {
    this.acceptableExplicitPolicies = acceptableExplicitPolicies;
  }

  public void setAcceptableExplicitPolicies(List<UUID> acceptableExplicitPolicies) {
    this.acceptableExplicitPolicies = JsonNullable.<List<UUID>>of(acceptableExplicitPolicies);
  }

  public OpenSignatureRequestModel securityContextId(UUID securityContextId) {
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

  public OpenSignatureRequestModel ignoreRevocationStatusUnknown(Boolean ignoreRevocationStatusUnknown) {
    this.ignoreRevocationStatusUnknown = JsonNullable.<Boolean>of(ignoreRevocationStatusUnknown);
    
    return this;
  }

   /**
   * Get ignoreRevocationStatusUnknown
   * @return ignoreRevocationStatusUnknown
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Boolean isIgnoreRevocationStatusUnknown() {
        return ignoreRevocationStatusUnknown.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IGNORE_REVOCATION_STATUS_UNKNOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> isIgnoreRevocationStatusUnknown_JsonNullable() {
    return ignoreRevocationStatusUnknown;
  }
  
  @JsonProperty(JSON_PROPERTY_IGNORE_REVOCATION_STATUS_UNKNOWN)
  public void setIgnoreRevocationStatusUnknown_JsonNullable(JsonNullable<Boolean> ignoreRevocationStatusUnknown) {
    this.ignoreRevocationStatusUnknown = ignoreRevocationStatusUnknown;
  }

  public void setIgnoreRevocationStatusUnknown(Boolean ignoreRevocationStatusUnknown) {
    this.ignoreRevocationStatusUnknown = JsonNullable.<Boolean>of(ignoreRevocationStatusUnknown);
  }

  public OpenSignatureRequestModel trustUncertifiedSigningTime(Boolean trustUncertifiedSigningTime) {
    
    this.trustUncertifiedSigningTime = trustUncertifiedSigningTime;
    return this;
  }

   /**
   * Get trustUncertifiedSigningTime
   * @return trustUncertifiedSigningTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRUST_UNCERTIFIED_SIGNING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isTrustUncertifiedSigningTime() {
    return trustUncertifiedSigningTime;
  }


  @JsonProperty(JSON_PROPERTY_TRUST_UNCERTIFIED_SIGNING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrustUncertifiedSigningTime(Boolean trustUncertifiedSigningTime) {
    this.trustUncertifiedSigningTime = trustUncertifiedSigningTime;
  }

  public OpenSignatureRequestModel dataHashes(List<DigestAlgorithmAndValueModel> dataHashes) {
    this.dataHashes = JsonNullable.<List<DigestAlgorithmAndValueModel>>of(dataHashes);
    
    return this;
  }

  public OpenSignatureRequestModel addDataHashesItem(DigestAlgorithmAndValueModel dataHashesItem) {
    if (this.dataHashes == null || !this.dataHashes.isPresent()) {
      this.dataHashes = JsonNullable.<List<DigestAlgorithmAndValueModel>>of(new ArrayList<>());
    }
    try {
      this.dataHashes.get().add(dataHashesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get dataHashes
   * @return dataHashes
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<DigestAlgorithmAndValueModel> getDataHashes() {
        return dataHashes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA_HASHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<DigestAlgorithmAndValueModel>> getDataHashes_JsonNullable() {
    return dataHashes;
  }
  
  @JsonProperty(JSON_PROPERTY_DATA_HASHES)
  public void setDataHashes_JsonNullable(JsonNullable<List<DigestAlgorithmAndValueModel>> dataHashes) {
    this.dataHashes = dataHashes;
  }

  public void setDataHashes(List<DigestAlgorithmAndValueModel> dataHashes) {
    this.dataHashes = JsonNullable.<List<DigestAlgorithmAndValueModel>>of(dataHashes);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenSignatureRequestModel openSignatureRequestModel = (OpenSignatureRequestModel) o;
    return Objects.equals(this._file, openSignatureRequestModel._file) &&
        Objects.equals(this.validate, openSignatureRequestModel.validate) &&
        Objects.equals(this.auditPackage, openSignatureRequestModel.auditPackage) &&
        equalsNullable(this.defaultSignaturePolicyId, openSignatureRequestModel.defaultSignaturePolicyId) &&
        equalsNullable(this.acceptableExplicitPolicies, openSignatureRequestModel.acceptableExplicitPolicies) &&
        equalsNullable(this.securityContextId, openSignatureRequestModel.securityContextId) &&
        equalsNullable(this.ignoreRevocationStatusUnknown, openSignatureRequestModel.ignoreRevocationStatusUnknown) &&
        Objects.equals(this.trustUncertifiedSigningTime, openSignatureRequestModel.trustUncertifiedSigningTime) &&
        equalsNullable(this.dataHashes, openSignatureRequestModel.dataHashes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, validate, auditPackage, hashCodeNullable(defaultSignaturePolicyId), hashCodeNullable(acceptableExplicitPolicies), hashCodeNullable(securityContextId), hashCodeNullable(ignoreRevocationStatusUnknown), trustUncertifiedSigningTime, hashCodeNullable(dataHashes));
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
    sb.append("class OpenSignatureRequestModel {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    validate: ").append(toIndentedString(validate)).append("\n");
    sb.append("    auditPackage: ").append(toIndentedString(auditPackage)).append("\n");
    sb.append("    defaultSignaturePolicyId: ").append(toIndentedString(defaultSignaturePolicyId)).append("\n");
    sb.append("    acceptableExplicitPolicies: ").append(toIndentedString(acceptableExplicitPolicies)).append("\n");
    sb.append("    securityContextId: ").append(toIndentedString(securityContextId)).append("\n");
    sb.append("    ignoreRevocationStatusUnknown: ").append(toIndentedString(ignoreRevocationStatusUnknown)).append("\n");
    sb.append("    trustUncertifiedSigningTime: ").append(toIndentedString(trustUncertifiedSigningTime)).append("\n");
    sb.append("    dataHashes: ").append(toIndentedString(dataHashes)).append("\n");
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

    private OpenSignatureRequestModel instance;

    public Builder() {
      this(new OpenSignatureRequestModel());
    }

    protected Builder(OpenSignatureRequestModel instance) {
      this.instance = instance;
    }

    public OpenSignatureRequestModel.Builder _file(FileModel _file) {
      this.instance._file = _file;
      return this;
    }
    public OpenSignatureRequestModel.Builder validate(Boolean validate) {
      this.instance.validate = validate;
      return this;
    }
    public OpenSignatureRequestModel.Builder auditPackage(AuditPackageOptions auditPackage) {
      this.instance.auditPackage = auditPackage;
      return this;
    }
    public OpenSignatureRequestModel.Builder defaultSignaturePolicyId(UUID defaultSignaturePolicyId) {
      this.instance.defaultSignaturePolicyId = JsonNullable.<UUID>of(defaultSignaturePolicyId);
      return this;
    }
    public OpenSignatureRequestModel.Builder defaultSignaturePolicyId(JsonNullable<UUID> defaultSignaturePolicyId) {
      this.instance.defaultSignaturePolicyId = defaultSignaturePolicyId;
      return this;
    }
    public OpenSignatureRequestModel.Builder acceptableExplicitPolicies(List<UUID> acceptableExplicitPolicies) {
      this.instance.acceptableExplicitPolicies = JsonNullable.<List<UUID>>of(acceptableExplicitPolicies);
      return this;
    }
    public OpenSignatureRequestModel.Builder acceptableExplicitPolicies(JsonNullable<List<UUID>> acceptableExplicitPolicies) {
      this.instance.acceptableExplicitPolicies = acceptableExplicitPolicies;
      return this;
    }
    public OpenSignatureRequestModel.Builder securityContextId(UUID securityContextId) {
      this.instance.securityContextId = JsonNullable.<UUID>of(securityContextId);
      return this;
    }
    public OpenSignatureRequestModel.Builder securityContextId(JsonNullable<UUID> securityContextId) {
      this.instance.securityContextId = securityContextId;
      return this;
    }
    public OpenSignatureRequestModel.Builder ignoreRevocationStatusUnknown(Boolean ignoreRevocationStatusUnknown) {
      this.instance.ignoreRevocationStatusUnknown = JsonNullable.<Boolean>of(ignoreRevocationStatusUnknown);
      return this;
    }
    public OpenSignatureRequestModel.Builder ignoreRevocationStatusUnknown(JsonNullable<Boolean> ignoreRevocationStatusUnknown) {
      this.instance.ignoreRevocationStatusUnknown = ignoreRevocationStatusUnknown;
      return this;
    }
    public OpenSignatureRequestModel.Builder trustUncertifiedSigningTime(Boolean trustUncertifiedSigningTime) {
      this.instance.trustUncertifiedSigningTime = trustUncertifiedSigningTime;
      return this;
    }
    public OpenSignatureRequestModel.Builder dataHashes(List<DigestAlgorithmAndValueModel> dataHashes) {
      this.instance.dataHashes = JsonNullable.<List<DigestAlgorithmAndValueModel>>of(dataHashes);
      return this;
    }
    public OpenSignatureRequestModel.Builder dataHashes(JsonNullable<List<DigestAlgorithmAndValueModel>> dataHashes) {
      this.instance.dataHashes = dataHashes;
      return this;
    }


    /**
    * returns a built OpenSignatureRequestModel instance.
    *
    * The builder is not reusable.
    */
    public OpenSignatureRequestModel build() {
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
  public static OpenSignatureRequestModel.Builder builder() {
    return new OpenSignatureRequestModel.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public OpenSignatureRequestModel.Builder toBuilder() {
    return new OpenSignatureRequestModel.Builder()
      ._file(getFile())
      .validate(isValidate())
      .auditPackage(getAuditPackage())
      .defaultSignaturePolicyId(getDefaultSignaturePolicyId())
      .acceptableExplicitPolicies(getAcceptableExplicitPolicies())
      .securityContextId(getSecurityContextId())
      .ignoreRevocationStatusUnknown(isIgnoreRevocationStatusUnknown())
      .trustUncertifiedSigningTime(isTrustUncertifiedSigningTime())
      .dataHashes(getDataHashes());
  }


}

