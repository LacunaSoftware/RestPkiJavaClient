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
import com.lacunasoftware.client.model.CadesTimestampModel;
import com.lacunasoftware.client.model.CertificateModel;
import com.lacunasoftware.client.model.CommitmentTypeModel;
import com.lacunasoftware.client.model.DigestAlgorithmAndValueModel;
import com.lacunasoftware.client.model.SignatureAlgorithmAndValueModel;
import com.lacunasoftware.client.model.SignaturePolicyIdentifierModel;
import com.lacunasoftware.client.model.SignerBStampModel;
import com.lacunasoftware.client.model.ValidationResultsModel;
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
 * PadesSignerModel
 */
@JsonPropertyOrder({
  PadesSignerModel.JSON_PROPERTY_IS_DOCUMENT_TIMESTAMP,
  PadesSignerModel.JSON_PROPERTY_SIGNATURE_FIELD_NAME,
  PadesSignerModel.JSON_PROPERTY_HAS_LTV,
  PadesSignerModel.JSON_PROPERTY_MESSAGE_DIGEST,
  PadesSignerModel.JSON_PROPERTY_SIGNATURE,
  PadesSignerModel.JSON_PROPERTY_SIGNATURE_POLICY,
  PadesSignerModel.JSON_PROPERTY_CERTIFICATE,
  PadesSignerModel.JSON_PROPERTY_SIGNING_TIME,
  PadesSignerModel.JSON_PROPERTY_CERTIFIED_DATE_REFERENCE,
  PadesSignerModel.JSON_PROPERTY_TIMESTAMPS,
  PadesSignerModel.JSON_PROPERTY_VALIDATION_RESULTS,
  PadesSignerModel.JSON_PROPERTY_COMMITMENT_TYPE,
  PadesSignerModel.JSON_PROPERTY_B_STAMP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class PadesSignerModel {
  public static final String JSON_PROPERTY_IS_DOCUMENT_TIMESTAMP = "isDocumentTimestamp";
  private Boolean isDocumentTimestamp;

  public static final String JSON_PROPERTY_SIGNATURE_FIELD_NAME = "signatureFieldName";
  private JsonNullable<String> signatureFieldName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HAS_LTV = "hasLtv";
  private Boolean hasLtv;

  public static final String JSON_PROPERTY_MESSAGE_DIGEST = "messageDigest";
  private DigestAlgorithmAndValueModel messageDigest;

  public static final String JSON_PROPERTY_SIGNATURE = "signature";
  private SignatureAlgorithmAndValueModel signature;

  public static final String JSON_PROPERTY_SIGNATURE_POLICY = "signaturePolicy";
  private SignaturePolicyIdentifierModel signaturePolicy;

  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private CertificateModel certificate;

  public static final String JSON_PROPERTY_SIGNING_TIME = "signingTime";
  private JsonNullable<OffsetDateTime> signingTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CERTIFIED_DATE_REFERENCE = "certifiedDateReference";
  private JsonNullable<OffsetDateTime> certifiedDateReference = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_TIMESTAMPS = "timestamps";
  private JsonNullable<List<CadesTimestampModel>> timestamps = JsonNullable.<List<CadesTimestampModel>>undefined();

  public static final String JSON_PROPERTY_VALIDATION_RESULTS = "validationResults";
  private ValidationResultsModel validationResults;

  public static final String JSON_PROPERTY_COMMITMENT_TYPE = "commitmentType";
  private CommitmentTypeModel commitmentType;

  public static final String JSON_PROPERTY_B_STAMP = "bStamp";
  private SignerBStampModel bStamp;

  public PadesSignerModel() {
  }

  public PadesSignerModel isDocumentTimestamp(Boolean isDocumentTimestamp) {
    
    this.isDocumentTimestamp = isDocumentTimestamp;
    return this;
  }

   /**
   * Get isDocumentTimestamp
   * @return isDocumentTimestamp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DOCUMENT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isIsDocumentTimestamp() {
    return isDocumentTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_IS_DOCUMENT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDocumentTimestamp(Boolean isDocumentTimestamp) {
    this.isDocumentTimestamp = isDocumentTimestamp;
  }

  public PadesSignerModel signatureFieldName(String signatureFieldName) {
    this.signatureFieldName = JsonNullable.<String>of(signatureFieldName);
    
    return this;
  }

   /**
   * Get signatureFieldName
   * @return signatureFieldName
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getSignatureFieldName() {
        return signatureFieldName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIGNATURE_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSignatureFieldName_JsonNullable() {
    return signatureFieldName;
  }
  
  @JsonProperty(JSON_PROPERTY_SIGNATURE_FIELD_NAME)
  public void setSignatureFieldName_JsonNullable(JsonNullable<String> signatureFieldName) {
    this.signatureFieldName = signatureFieldName;
  }

  public void setSignatureFieldName(String signatureFieldName) {
    this.signatureFieldName = JsonNullable.<String>of(signatureFieldName);
  }

  public PadesSignerModel hasLtv(Boolean hasLtv) {
    
    this.hasLtv = hasLtv;
    return this;
  }

   /**
   * Get hasLtv
   * @return hasLtv
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_LTV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isHasLtv() {
    return hasLtv;
  }


  @JsonProperty(JSON_PROPERTY_HAS_LTV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasLtv(Boolean hasLtv) {
    this.hasLtv = hasLtv;
  }

  public PadesSignerModel messageDigest(DigestAlgorithmAndValueModel messageDigest) {
    
    this.messageDigest = messageDigest;
    return this;
  }

   /**
   * Get messageDigest
   * @return messageDigest
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_DIGEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DigestAlgorithmAndValueModel getMessageDigest() {
    return messageDigest;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_DIGEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageDigest(DigestAlgorithmAndValueModel messageDigest) {
    this.messageDigest = messageDigest;
  }

  public PadesSignerModel signature(SignatureAlgorithmAndValueModel signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SignatureAlgorithmAndValueModel getSignature() {
    return signature;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignature(SignatureAlgorithmAndValueModel signature) {
    this.signature = signature;
  }

  public PadesSignerModel signaturePolicy(SignaturePolicyIdentifierModel signaturePolicy) {
    
    this.signaturePolicy = signaturePolicy;
    return this;
  }

   /**
   * Get signaturePolicy
   * @return signaturePolicy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNATURE_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SignaturePolicyIdentifierModel getSignaturePolicy() {
    return signaturePolicy;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignaturePolicy(SignaturePolicyIdentifierModel signaturePolicy) {
    this.signaturePolicy = signaturePolicy;
  }

  public PadesSignerModel certificate(CertificateModel certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CertificateModel getCertificate() {
    return certificate;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertificate(CertificateModel certificate) {
    this.certificate = certificate;
  }

  public PadesSignerModel signingTime(OffsetDateTime signingTime) {
    this.signingTime = JsonNullable.<OffsetDateTime>of(signingTime);
    
    return this;
  }

   /**
   * Get signingTime
   * @return signingTime
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getSigningTime() {
        return signingTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIGNING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getSigningTime_JsonNullable() {
    return signingTime;
  }
  
  @JsonProperty(JSON_PROPERTY_SIGNING_TIME)
  public void setSigningTime_JsonNullable(JsonNullable<OffsetDateTime> signingTime) {
    this.signingTime = signingTime;
  }

  public void setSigningTime(OffsetDateTime signingTime) {
    this.signingTime = JsonNullable.<OffsetDateTime>of(signingTime);
  }

  public PadesSignerModel certifiedDateReference(OffsetDateTime certifiedDateReference) {
    this.certifiedDateReference = JsonNullable.<OffsetDateTime>of(certifiedDateReference);
    
    return this;
  }

   /**
   * Get certifiedDateReference
   * @return certifiedDateReference
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getCertifiedDateReference() {
        return certifiedDateReference.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CERTIFIED_DATE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCertifiedDateReference_JsonNullable() {
    return certifiedDateReference;
  }
  
  @JsonProperty(JSON_PROPERTY_CERTIFIED_DATE_REFERENCE)
  public void setCertifiedDateReference_JsonNullable(JsonNullable<OffsetDateTime> certifiedDateReference) {
    this.certifiedDateReference = certifiedDateReference;
  }

  public void setCertifiedDateReference(OffsetDateTime certifiedDateReference) {
    this.certifiedDateReference = JsonNullable.<OffsetDateTime>of(certifiedDateReference);
  }

  public PadesSignerModel timestamps(List<CadesTimestampModel> timestamps) {
    this.timestamps = JsonNullable.<List<CadesTimestampModel>>of(timestamps);
    
    return this;
  }

  public PadesSignerModel addTimestampsItem(CadesTimestampModel timestampsItem) {
    if (this.timestamps == null || !this.timestamps.isPresent()) {
      this.timestamps = JsonNullable.<List<CadesTimestampModel>>of(new ArrayList<>());
    }
    try {
      this.timestamps.get().add(timestampsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get timestamps
   * @return timestamps
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<CadesTimestampModel> getTimestamps() {
        return timestamps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIMESTAMPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<CadesTimestampModel>> getTimestamps_JsonNullable() {
    return timestamps;
  }
  
  @JsonProperty(JSON_PROPERTY_TIMESTAMPS)
  public void setTimestamps_JsonNullable(JsonNullable<List<CadesTimestampModel>> timestamps) {
    this.timestamps = timestamps;
  }

  public void setTimestamps(List<CadesTimestampModel> timestamps) {
    this.timestamps = JsonNullable.<List<CadesTimestampModel>>of(timestamps);
  }

  public PadesSignerModel validationResults(ValidationResultsModel validationResults) {
    
    this.validationResults = validationResults;
    return this;
  }

   /**
   * Get validationResults
   * @return validationResults
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALIDATION_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ValidationResultsModel getValidationResults() {
    return validationResults;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidationResults(ValidationResultsModel validationResults) {
    this.validationResults = validationResults;
  }

  public PadesSignerModel commitmentType(CommitmentTypeModel commitmentType) {
    
    this.commitmentType = commitmentType;
    return this;
  }

   /**
   * Get commitmentType
   * @return commitmentType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMITMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CommitmentTypeModel getCommitmentType() {
    return commitmentType;
  }


  @JsonProperty(JSON_PROPERTY_COMMITMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommitmentType(CommitmentTypeModel commitmentType) {
    this.commitmentType = commitmentType;
  }

  public PadesSignerModel bStamp(SignerBStampModel bStamp) {
    
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

  public SignerBStampModel getbStamp() {
    return bStamp;
  }


  @JsonProperty(JSON_PROPERTY_B_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setbStamp(SignerBStampModel bStamp) {
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
    PadesSignerModel padesSignerModel = (PadesSignerModel) o;
    return Objects.equals(this.isDocumentTimestamp, padesSignerModel.isDocumentTimestamp) &&
        equalsNullable(this.signatureFieldName, padesSignerModel.signatureFieldName) &&
        Objects.equals(this.hasLtv, padesSignerModel.hasLtv) &&
        Objects.equals(this.messageDigest, padesSignerModel.messageDigest) &&
        Objects.equals(this.signature, padesSignerModel.signature) &&
        Objects.equals(this.signaturePolicy, padesSignerModel.signaturePolicy) &&
        Objects.equals(this.certificate, padesSignerModel.certificate) &&
        equalsNullable(this.signingTime, padesSignerModel.signingTime) &&
        equalsNullable(this.certifiedDateReference, padesSignerModel.certifiedDateReference) &&
        equalsNullable(this.timestamps, padesSignerModel.timestamps) &&
        Objects.equals(this.validationResults, padesSignerModel.validationResults) &&
        Objects.equals(this.commitmentType, padesSignerModel.commitmentType) &&
        Objects.equals(this.bStamp, padesSignerModel.bStamp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDocumentTimestamp, hashCodeNullable(signatureFieldName), hasLtv, messageDigest, signature, signaturePolicy, certificate, hashCodeNullable(signingTime), hashCodeNullable(certifiedDateReference), hashCodeNullable(timestamps), validationResults, commitmentType, bStamp);
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
    sb.append("class PadesSignerModel {\n");
    sb.append("    isDocumentTimestamp: ").append(toIndentedString(isDocumentTimestamp)).append("\n");
    sb.append("    signatureFieldName: ").append(toIndentedString(signatureFieldName)).append("\n");
    sb.append("    hasLtv: ").append(toIndentedString(hasLtv)).append("\n");
    sb.append("    messageDigest: ").append(toIndentedString(messageDigest)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    signaturePolicy: ").append(toIndentedString(signaturePolicy)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    signingTime: ").append(toIndentedString(signingTime)).append("\n");
    sb.append("    certifiedDateReference: ").append(toIndentedString(certifiedDateReference)).append("\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
    sb.append("    validationResults: ").append(toIndentedString(validationResults)).append("\n");
    sb.append("    commitmentType: ").append(toIndentedString(commitmentType)).append("\n");
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

    private PadesSignerModel instance;

    public Builder() {
      this(new PadesSignerModel());
    }

    protected Builder(PadesSignerModel instance) {
      this.instance = instance;
    }

    public PadesSignerModel.Builder isDocumentTimestamp(Boolean isDocumentTimestamp) {
      this.instance.isDocumentTimestamp = isDocumentTimestamp;
      return this;
    }
    public PadesSignerModel.Builder signatureFieldName(String signatureFieldName) {
      this.instance.signatureFieldName = JsonNullable.<String>of(signatureFieldName);
      return this;
    }
    public PadesSignerModel.Builder signatureFieldName(JsonNullable<String> signatureFieldName) {
      this.instance.signatureFieldName = signatureFieldName;
      return this;
    }
    public PadesSignerModel.Builder hasLtv(Boolean hasLtv) {
      this.instance.hasLtv = hasLtv;
      return this;
    }
    public PadesSignerModel.Builder messageDigest(DigestAlgorithmAndValueModel messageDigest) {
      this.instance.messageDigest = messageDigest;
      return this;
    }
    public PadesSignerModel.Builder signature(SignatureAlgorithmAndValueModel signature) {
      this.instance.signature = signature;
      return this;
    }
    public PadesSignerModel.Builder signaturePolicy(SignaturePolicyIdentifierModel signaturePolicy) {
      this.instance.signaturePolicy = signaturePolicy;
      return this;
    }
    public PadesSignerModel.Builder certificate(CertificateModel certificate) {
      this.instance.certificate = certificate;
      return this;
    }
    public PadesSignerModel.Builder signingTime(OffsetDateTime signingTime) {
      this.instance.signingTime = JsonNullable.<OffsetDateTime>of(signingTime);
      return this;
    }
    public PadesSignerModel.Builder signingTime(JsonNullable<OffsetDateTime> signingTime) {
      this.instance.signingTime = signingTime;
      return this;
    }
    public PadesSignerModel.Builder certifiedDateReference(OffsetDateTime certifiedDateReference) {
      this.instance.certifiedDateReference = JsonNullable.<OffsetDateTime>of(certifiedDateReference);
      return this;
    }
    public PadesSignerModel.Builder certifiedDateReference(JsonNullable<OffsetDateTime> certifiedDateReference) {
      this.instance.certifiedDateReference = certifiedDateReference;
      return this;
    }
    public PadesSignerModel.Builder timestamps(List<CadesTimestampModel> timestamps) {
      this.instance.timestamps = JsonNullable.<List<CadesTimestampModel>>of(timestamps);
      return this;
    }
    public PadesSignerModel.Builder timestamps(JsonNullable<List<CadesTimestampModel>> timestamps) {
      this.instance.timestamps = timestamps;
      return this;
    }
    public PadesSignerModel.Builder validationResults(ValidationResultsModel validationResults) {
      this.instance.validationResults = validationResults;
      return this;
    }
    public PadesSignerModel.Builder commitmentType(CommitmentTypeModel commitmentType) {
      this.instance.commitmentType = commitmentType;
      return this;
    }
    public PadesSignerModel.Builder bStamp(SignerBStampModel bStamp) {
      this.instance.bStamp = bStamp;
      return this;
    }


    /**
    * returns a built PadesSignerModel instance.
    *
    * The builder is not reusable.
    */
    public PadesSignerModel build() {
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
  public static PadesSignerModel.Builder builder() {
    return new PadesSignerModel.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public PadesSignerModel.Builder toBuilder() {
    return new PadesSignerModel.Builder()
      .isDocumentTimestamp(isIsDocumentTimestamp())
      .signatureFieldName(getSignatureFieldName())
      .hasLtv(isHasLtv())
      .messageDigest(getMessageDigest())
      .signature(getSignature())
      .signaturePolicy(getSignaturePolicy())
      .certificate(getCertificate())
      .signingTime(getSigningTime())
      .certifiedDateReference(getCertifiedDateReference())
      .timestamps(getTimestamps())
      .validationResults(getValidationResults())
      .commitmentType(getCommitmentType())
      .bStamp(getbStamp());
  }


}

