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
import com.lacunasoftware.client.model.AttributeCertificateModel;
import com.lacunasoftware.client.model.CadesTimestampModel;
import com.lacunasoftware.client.model.CertificateModel;
import com.lacunasoftware.client.model.DigestAlgorithmAndValueModel;
import com.lacunasoftware.client.model.SignatureAlgorithmAndValueModel;
import com.lacunasoftware.client.model.SignaturePolicyIdentifierModel;
import com.lacunasoftware.client.model.ValidationResultsModel;
import com.lacunasoftware.client.model.XmlElementModel;
import com.lacunasoftware.client.model.XmlSignedEntityTypes;
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
 * SignerModel
 */
@JsonPropertyOrder({
  SignerModel.JSON_PROPERTY_MESSAGE_DIGEST,
  SignerModel.JSON_PROPERTY_SIGNATURE,
  SignerModel.JSON_PROPERTY_SIGNATURE_POLICY,
  SignerModel.JSON_PROPERTY_SIGNING_TIME,
  SignerModel.JSON_PROPERTY_CERTIFIED_DATE_REFERENCE,
  SignerModel.JSON_PROPERTY_TIMESTAMPS,
  SignerModel.JSON_PROPERTY_IS_DOCUMENT_TIMESTAMP,
  SignerModel.JSON_PROPERTY_SIGNATURE_FIELD_NAME,
  SignerModel.JSON_PROPERTY_VALIDATION_RESULTS,
  SignerModel.JSON_PROPERTY_HAS_LTV,
  SignerModel.JSON_PROPERTY_XML_SIGNED_ENTITY_TYPE,
  SignerModel.JSON_PROPERTY_XML_SIGNED_ELEMENT,
  SignerModel.JSON_PROPERTY_ATTRIBUTE_CERTIFICATES,
  SignerModel.JSON_PROPERTY_CERTIFICATE,
  SignerModel.JSON_PROPERTY_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class SignerModel {
  public static final String JSON_PROPERTY_MESSAGE_DIGEST = "messageDigest";
  private DigestAlgorithmAndValueModel messageDigest;

  public static final String JSON_PROPERTY_SIGNATURE = "signature";
  private SignatureAlgorithmAndValueModel signature;

  public static final String JSON_PROPERTY_SIGNATURE_POLICY = "signaturePolicy";
  private SignaturePolicyIdentifierModel signaturePolicy;

  public static final String JSON_PROPERTY_SIGNING_TIME = "signingTime";
  private JsonNullable<OffsetDateTime> signingTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CERTIFIED_DATE_REFERENCE = "certifiedDateReference";
  private JsonNullable<OffsetDateTime> certifiedDateReference = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_TIMESTAMPS = "timestamps";
  private JsonNullable<List<CadesTimestampModel>> timestamps = JsonNullable.<List<CadesTimestampModel>>undefined();

  public static final String JSON_PROPERTY_IS_DOCUMENT_TIMESTAMP = "isDocumentTimestamp";
  private Boolean isDocumentTimestamp;

  public static final String JSON_PROPERTY_SIGNATURE_FIELD_NAME = "signatureFieldName";
  private JsonNullable<String> signatureFieldName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALIDATION_RESULTS = "validationResults";
  private ValidationResultsModel validationResults;

  public static final String JSON_PROPERTY_HAS_LTV = "hasLtv";
  private JsonNullable<Boolean> hasLtv = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_XML_SIGNED_ENTITY_TYPE = "xmlSignedEntityType";
  private XmlSignedEntityTypes xmlSignedEntityType;

  public static final String JSON_PROPERTY_XML_SIGNED_ELEMENT = "xmlSignedElement";
  private XmlElementModel xmlSignedElement;

  public static final String JSON_PROPERTY_ATTRIBUTE_CERTIFICATES = "attributeCertificates";
  private JsonNullable<List<AttributeCertificateModel>> attributeCertificates = JsonNullable.<List<AttributeCertificateModel>>undefined();

  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private CertificateModel certificate;

  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public SignerModel() {
  }

  public SignerModel messageDigest(DigestAlgorithmAndValueModel messageDigest) {
    
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

  public SignerModel signature(SignatureAlgorithmAndValueModel signature) {
    
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

  public SignerModel signaturePolicy(SignaturePolicyIdentifierModel signaturePolicy) {
    
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

  public SignerModel signingTime(OffsetDateTime signingTime) {
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

  public SignerModel certifiedDateReference(OffsetDateTime certifiedDateReference) {
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

  public SignerModel timestamps(List<CadesTimestampModel> timestamps) {
    this.timestamps = JsonNullable.<List<CadesTimestampModel>>of(timestamps);
    
    return this;
  }

  public SignerModel addTimestampsItem(CadesTimestampModel timestampsItem) {
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

  public SignerModel isDocumentTimestamp(Boolean isDocumentTimestamp) {
    
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

  public SignerModel signatureFieldName(String signatureFieldName) {
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

  public SignerModel validationResults(ValidationResultsModel validationResults) {
    
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

  public SignerModel hasLtv(Boolean hasLtv) {
    this.hasLtv = JsonNullable.<Boolean>of(hasLtv);
    
    return this;
  }

   /**
   * Get hasLtv
   * @return hasLtv
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Boolean isHasLtv() {
        return hasLtv.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HAS_LTV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> isHasLtv_JsonNullable() {
    return hasLtv;
  }
  
  @JsonProperty(JSON_PROPERTY_HAS_LTV)
  public void setHasLtv_JsonNullable(JsonNullable<Boolean> hasLtv) {
    this.hasLtv = hasLtv;
  }

  public void setHasLtv(Boolean hasLtv) {
    this.hasLtv = JsonNullable.<Boolean>of(hasLtv);
  }

  public SignerModel xmlSignedEntityType(XmlSignedEntityTypes xmlSignedEntityType) {
    
    this.xmlSignedEntityType = xmlSignedEntityType;
    return this;
  }

   /**
   * Get xmlSignedEntityType
   * @return xmlSignedEntityType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_XML_SIGNED_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XmlSignedEntityTypes getXmlSignedEntityType() {
    return xmlSignedEntityType;
  }


  @JsonProperty(JSON_PROPERTY_XML_SIGNED_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setXmlSignedEntityType(XmlSignedEntityTypes xmlSignedEntityType) {
    this.xmlSignedEntityType = xmlSignedEntityType;
  }

  public SignerModel xmlSignedElement(XmlElementModel xmlSignedElement) {
    
    this.xmlSignedElement = xmlSignedElement;
    return this;
  }

   /**
   * Get xmlSignedElement
   * @return xmlSignedElement
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_XML_SIGNED_ELEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XmlElementModel getXmlSignedElement() {
    return xmlSignedElement;
  }


  @JsonProperty(JSON_PROPERTY_XML_SIGNED_ELEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setXmlSignedElement(XmlElementModel xmlSignedElement) {
    this.xmlSignedElement = xmlSignedElement;
  }

  public SignerModel attributeCertificates(List<AttributeCertificateModel> attributeCertificates) {
    this.attributeCertificates = JsonNullable.<List<AttributeCertificateModel>>of(attributeCertificates);
    
    return this;
  }

  public SignerModel addAttributeCertificatesItem(AttributeCertificateModel attributeCertificatesItem) {
    if (this.attributeCertificates == null || !this.attributeCertificates.isPresent()) {
      this.attributeCertificates = JsonNullable.<List<AttributeCertificateModel>>of(new ArrayList<>());
    }
    try {
      this.attributeCertificates.get().add(attributeCertificatesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get attributeCertificates
   * @return attributeCertificates
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<AttributeCertificateModel> getAttributeCertificates() {
        return attributeCertificates.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_CERTIFICATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AttributeCertificateModel>> getAttributeCertificates_JsonNullable() {
    return attributeCertificates;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_CERTIFICATES)
  public void setAttributeCertificates_JsonNullable(JsonNullable<List<AttributeCertificateModel>> attributeCertificates) {
    this.attributeCertificates = attributeCertificates;
  }

  public void setAttributeCertificates(List<AttributeCertificateModel> attributeCertificates) {
    this.attributeCertificates = JsonNullable.<List<AttributeCertificateModel>>of(attributeCertificates);
  }

  public SignerModel certificate(CertificateModel certificate) {
    
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

  public SignerModel date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignerModel signerModel = (SignerModel) o;
    return Objects.equals(this.messageDigest, signerModel.messageDigest) &&
        Objects.equals(this.signature, signerModel.signature) &&
        Objects.equals(this.signaturePolicy, signerModel.signaturePolicy) &&
        equalsNullable(this.signingTime, signerModel.signingTime) &&
        equalsNullable(this.certifiedDateReference, signerModel.certifiedDateReference) &&
        equalsNullable(this.timestamps, signerModel.timestamps) &&
        Objects.equals(this.isDocumentTimestamp, signerModel.isDocumentTimestamp) &&
        equalsNullable(this.signatureFieldName, signerModel.signatureFieldName) &&
        Objects.equals(this.validationResults, signerModel.validationResults) &&
        equalsNullable(this.hasLtv, signerModel.hasLtv) &&
        Objects.equals(this.xmlSignedEntityType, signerModel.xmlSignedEntityType) &&
        Objects.equals(this.xmlSignedElement, signerModel.xmlSignedElement) &&
        equalsNullable(this.attributeCertificates, signerModel.attributeCertificates) &&
        Objects.equals(this.certificate, signerModel.certificate) &&
        Objects.equals(this.date, signerModel.date);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageDigest, signature, signaturePolicy, hashCodeNullable(signingTime), hashCodeNullable(certifiedDateReference), hashCodeNullable(timestamps), isDocumentTimestamp, hashCodeNullable(signatureFieldName), validationResults, hashCodeNullable(hasLtv), xmlSignedEntityType, xmlSignedElement, hashCodeNullable(attributeCertificates), certificate, date);
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
    sb.append("class SignerModel {\n");
    sb.append("    messageDigest: ").append(toIndentedString(messageDigest)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    signaturePolicy: ").append(toIndentedString(signaturePolicy)).append("\n");
    sb.append("    signingTime: ").append(toIndentedString(signingTime)).append("\n");
    sb.append("    certifiedDateReference: ").append(toIndentedString(certifiedDateReference)).append("\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
    sb.append("    isDocumentTimestamp: ").append(toIndentedString(isDocumentTimestamp)).append("\n");
    sb.append("    signatureFieldName: ").append(toIndentedString(signatureFieldName)).append("\n");
    sb.append("    validationResults: ").append(toIndentedString(validationResults)).append("\n");
    sb.append("    hasLtv: ").append(toIndentedString(hasLtv)).append("\n");
    sb.append("    xmlSignedEntityType: ").append(toIndentedString(xmlSignedEntityType)).append("\n");
    sb.append("    xmlSignedElement: ").append(toIndentedString(xmlSignedElement)).append("\n");
    sb.append("    attributeCertificates: ").append(toIndentedString(attributeCertificates)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

    private SignerModel instance;

    public Builder() {
      this(new SignerModel());
    }

    protected Builder(SignerModel instance) {
      this.instance = instance;
    }

    public SignerModel.Builder messageDigest(DigestAlgorithmAndValueModel messageDigest) {
      this.instance.messageDigest = messageDigest;
      return this;
    }
    public SignerModel.Builder signature(SignatureAlgorithmAndValueModel signature) {
      this.instance.signature = signature;
      return this;
    }
    public SignerModel.Builder signaturePolicy(SignaturePolicyIdentifierModel signaturePolicy) {
      this.instance.signaturePolicy = signaturePolicy;
      return this;
    }
    public SignerModel.Builder signingTime(OffsetDateTime signingTime) {
      this.instance.signingTime = JsonNullable.<OffsetDateTime>of(signingTime);
      return this;
    }
    public SignerModel.Builder signingTime(JsonNullable<OffsetDateTime> signingTime) {
      this.instance.signingTime = signingTime;
      return this;
    }
    public SignerModel.Builder certifiedDateReference(OffsetDateTime certifiedDateReference) {
      this.instance.certifiedDateReference = JsonNullable.<OffsetDateTime>of(certifiedDateReference);
      return this;
    }
    public SignerModel.Builder certifiedDateReference(JsonNullable<OffsetDateTime> certifiedDateReference) {
      this.instance.certifiedDateReference = certifiedDateReference;
      return this;
    }
    public SignerModel.Builder timestamps(List<CadesTimestampModel> timestamps) {
      this.instance.timestamps = JsonNullable.<List<CadesTimestampModel>>of(timestamps);
      return this;
    }
    public SignerModel.Builder timestamps(JsonNullable<List<CadesTimestampModel>> timestamps) {
      this.instance.timestamps = timestamps;
      return this;
    }
    public SignerModel.Builder isDocumentTimestamp(Boolean isDocumentTimestamp) {
      this.instance.isDocumentTimestamp = isDocumentTimestamp;
      return this;
    }
    public SignerModel.Builder signatureFieldName(String signatureFieldName) {
      this.instance.signatureFieldName = JsonNullable.<String>of(signatureFieldName);
      return this;
    }
    public SignerModel.Builder signatureFieldName(JsonNullable<String> signatureFieldName) {
      this.instance.signatureFieldName = signatureFieldName;
      return this;
    }
    public SignerModel.Builder validationResults(ValidationResultsModel validationResults) {
      this.instance.validationResults = validationResults;
      return this;
    }
    public SignerModel.Builder hasLtv(Boolean hasLtv) {
      this.instance.hasLtv = JsonNullable.<Boolean>of(hasLtv);
      return this;
    }
    public SignerModel.Builder hasLtv(JsonNullable<Boolean> hasLtv) {
      this.instance.hasLtv = hasLtv;
      return this;
    }
    public SignerModel.Builder xmlSignedEntityType(XmlSignedEntityTypes xmlSignedEntityType) {
      this.instance.xmlSignedEntityType = xmlSignedEntityType;
      return this;
    }
    public SignerModel.Builder xmlSignedElement(XmlElementModel xmlSignedElement) {
      this.instance.xmlSignedElement = xmlSignedElement;
      return this;
    }
    public SignerModel.Builder attributeCertificates(List<AttributeCertificateModel> attributeCertificates) {
      this.instance.attributeCertificates = JsonNullable.<List<AttributeCertificateModel>>of(attributeCertificates);
      return this;
    }
    public SignerModel.Builder attributeCertificates(JsonNullable<List<AttributeCertificateModel>> attributeCertificates) {
      this.instance.attributeCertificates = attributeCertificates;
      return this;
    }
    public SignerModel.Builder certificate(CertificateModel certificate) {
      this.instance.certificate = certificate;
      return this;
    }
    public SignerModel.Builder date(OffsetDateTime date) {
      this.instance.date = date;
      return this;
    }


    /**
    * returns a built SignerModel instance.
    *
    * The builder is not reusable.
    */
    public SignerModel build() {
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
  public static SignerModel.Builder builder() {
    return new SignerModel.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public SignerModel.Builder toBuilder() {
    return new SignerModel.Builder()
      .messageDigest(getMessageDigest())
      .signature(getSignature())
      .signaturePolicy(getSignaturePolicy())
      .signingTime(getSigningTime())
      .certifiedDateReference(getCertifiedDateReference())
      .timestamps(getTimestamps())
      .isDocumentTimestamp(isIsDocumentTimestamp())
      .signatureFieldName(getSignatureFieldName())
      .validationResults(getValidationResults())
      .hasLtv(isHasLtv())
      .xmlSignedEntityType(getXmlSignedEntityType())
      .xmlSignedElement(getXmlSignedElement())
      .attributeCertificates(getAttributeCertificates())
      .certificate(getCertificate())
      .date(getDate());
  }


}

