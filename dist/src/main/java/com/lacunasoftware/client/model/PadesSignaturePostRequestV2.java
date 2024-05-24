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
import com.lacunasoftware.client.model.FileModel;
import com.lacunasoftware.client.model.PadesCertificationLevel;
import com.lacunasoftware.client.model.PadesMeasurementUnits;
import com.lacunasoftware.client.model.PadesPageOptimizationModel;
import com.lacunasoftware.client.model.PadesVisualRepresentationModel;
import com.lacunasoftware.client.model.PdfMarkModel;
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
 * PadesSignaturePostRequestV2
 */
@JsonPropertyOrder({
  PadesSignaturePostRequestV2.JSON_PROPERTY_PDF_TO_SIGN,
  PadesSignaturePostRequestV2.JSON_PROPERTY_VISUAL_REPRESENTATION,
  PadesSignaturePostRequestV2.JSON_PROPERTY_PDF_MARKS,
  PadesSignaturePostRequestV2.JSON_PROPERTY_BYPASS_MARKS_IF_SIGNED,
  PadesSignaturePostRequestV2.JSON_PROPERTY_MEASUREMENT_UNITS,
  PadesSignaturePostRequestV2.JSON_PROPERTY_PAGE_OPTIMIZATION,
  PadesSignaturePostRequestV2.JSON_PROPERTY_CUSTOM_SIGNATURE_FIELD_NAME,
  PadesSignaturePostRequestV2.JSON_PROPERTY_CERTIFICATION_LEVEL,
  PadesSignaturePostRequestV2.JSON_PROPERTY_REASON,
  PadesSignaturePostRequestV2.JSON_PROPERTY_CERTIFICATE,
  PadesSignaturePostRequestV2.JSON_PROPERTY_SIGNATURE_POLICY_ID,
  PadesSignaturePostRequestV2.JSON_PROPERTY_SECURITY_CONTEXT_ID,
  PadesSignaturePostRequestV2.JSON_PROPERTY_CALLBACK_ARGUMENT,
  PadesSignaturePostRequestV2.JSON_PROPERTY_IGNORE_REVOCATION_STATUS_UNKNOWN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class PadesSignaturePostRequestV2 {
  public static final String JSON_PROPERTY_PDF_TO_SIGN = "pdfToSign";
  private FileModel pdfToSign;

  public static final String JSON_PROPERTY_VISUAL_REPRESENTATION = "visualRepresentation";
  private PadesVisualRepresentationModel visualRepresentation;

  public static final String JSON_PROPERTY_PDF_MARKS = "pdfMarks";
  private JsonNullable<List<PdfMarkModel>> pdfMarks = JsonNullable.<List<PdfMarkModel>>undefined();

  public static final String JSON_PROPERTY_BYPASS_MARKS_IF_SIGNED = "bypassMarksIfSigned";
  private Boolean bypassMarksIfSigned;

  public static final String JSON_PROPERTY_MEASUREMENT_UNITS = "measurementUnits";
  private PadesMeasurementUnits measurementUnits;

  public static final String JSON_PROPERTY_PAGE_OPTIMIZATION = "pageOptimization";
  private PadesPageOptimizationModel pageOptimization;

  public static final String JSON_PROPERTY_CUSTOM_SIGNATURE_FIELD_NAME = "customSignatureFieldName";
  private JsonNullable<String> customSignatureFieldName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CERTIFICATION_LEVEL = "certificationLevel";
  private PadesCertificationLevel certificationLevel;

  public static final String JSON_PROPERTY_REASON = "reason";
  private JsonNullable<String> reason = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private JsonNullable<byte[]> certificate = JsonNullable.<byte[]>undefined();

  public static final String JSON_PROPERTY_SIGNATURE_POLICY_ID = "signaturePolicyId";
  private UUID signaturePolicyId;

  public static final String JSON_PROPERTY_SECURITY_CONTEXT_ID = "securityContextId";
  private JsonNullable<UUID> securityContextId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_CALLBACK_ARGUMENT = "callbackArgument";
  private JsonNullable<String> callbackArgument = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IGNORE_REVOCATION_STATUS_UNKNOWN = "ignoreRevocationStatusUnknown";
  private JsonNullable<Boolean> ignoreRevocationStatusUnknown = JsonNullable.<Boolean>undefined();

  public PadesSignaturePostRequestV2() {
  }

  public PadesSignaturePostRequestV2 pdfToSign(FileModel pdfToSign) {
    
    this.pdfToSign = pdfToSign;
    return this;
  }

   /**
   * Get pdfToSign
   * @return pdfToSign
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PDF_TO_SIGN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileModel getPdfToSign() {
    return pdfToSign;
  }


  @JsonProperty(JSON_PROPERTY_PDF_TO_SIGN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPdfToSign(FileModel pdfToSign) {
    this.pdfToSign = pdfToSign;
  }

  public PadesSignaturePostRequestV2 visualRepresentation(PadesVisualRepresentationModel visualRepresentation) {
    
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

  public PadesSignaturePostRequestV2 pdfMarks(List<PdfMarkModel> pdfMarks) {
    this.pdfMarks = JsonNullable.<List<PdfMarkModel>>of(pdfMarks);
    
    return this;
  }

  public PadesSignaturePostRequestV2 addPdfMarksItem(PdfMarkModel pdfMarksItem) {
    if (this.pdfMarks == null || !this.pdfMarks.isPresent()) {
      this.pdfMarks = JsonNullable.<List<PdfMarkModel>>of(new ArrayList<>());
    }
    try {
      this.pdfMarks.get().add(pdfMarksItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get pdfMarks
   * @return pdfMarks
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<PdfMarkModel> getPdfMarks() {
        return pdfMarks.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PDF_MARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<PdfMarkModel>> getPdfMarks_JsonNullable() {
    return pdfMarks;
  }
  
  @JsonProperty(JSON_PROPERTY_PDF_MARKS)
  public void setPdfMarks_JsonNullable(JsonNullable<List<PdfMarkModel>> pdfMarks) {
    this.pdfMarks = pdfMarks;
  }

  public void setPdfMarks(List<PdfMarkModel> pdfMarks) {
    this.pdfMarks = JsonNullable.<List<PdfMarkModel>>of(pdfMarks);
  }

  public PadesSignaturePostRequestV2 bypassMarksIfSigned(Boolean bypassMarksIfSigned) {
    
    this.bypassMarksIfSigned = bypassMarksIfSigned;
    return this;
  }

   /**
   * Get bypassMarksIfSigned
   * @return bypassMarksIfSigned
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BYPASS_MARKS_IF_SIGNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isBypassMarksIfSigned() {
    return bypassMarksIfSigned;
  }


  @JsonProperty(JSON_PROPERTY_BYPASS_MARKS_IF_SIGNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBypassMarksIfSigned(Boolean bypassMarksIfSigned) {
    this.bypassMarksIfSigned = bypassMarksIfSigned;
  }

  public PadesSignaturePostRequestV2 measurementUnits(PadesMeasurementUnits measurementUnits) {
    
    this.measurementUnits = measurementUnits;
    return this;
  }

   /**
   * Get measurementUnits
   * @return measurementUnits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEASUREMENT_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PadesMeasurementUnits getMeasurementUnits() {
    return measurementUnits;
  }


  @JsonProperty(JSON_PROPERTY_MEASUREMENT_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeasurementUnits(PadesMeasurementUnits measurementUnits) {
    this.measurementUnits = measurementUnits;
  }

  public PadesSignaturePostRequestV2 pageOptimization(PadesPageOptimizationModel pageOptimization) {
    
    this.pageOptimization = pageOptimization;
    return this;
  }

   /**
   * Get pageOptimization
   * @return pageOptimization
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_OPTIMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PadesPageOptimizationModel getPageOptimization() {
    return pageOptimization;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_OPTIMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageOptimization(PadesPageOptimizationModel pageOptimization) {
    this.pageOptimization = pageOptimization;
  }

  public PadesSignaturePostRequestV2 customSignatureFieldName(String customSignatureFieldName) {
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

  public PadesSignaturePostRequestV2 certificationLevel(PadesCertificationLevel certificationLevel) {
    
    this.certificationLevel = certificationLevel;
    return this;
  }

   /**
   * Get certificationLevel
   * @return certificationLevel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CERTIFICATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PadesCertificationLevel getCertificationLevel() {
    return certificationLevel;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertificationLevel(PadesCertificationLevel certificationLevel) {
    this.certificationLevel = certificationLevel;
  }

  public PadesSignaturePostRequestV2 reason(String reason) {
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

  public PadesSignaturePostRequestV2 certificate(byte[] certificate) {
    this.certificate = JsonNullable.<byte[]>of(certificate);
    
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public byte[] getCertificate() {
        return certificate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<byte[]> getCertificate_JsonNullable() {
    return certificate;
  }
  
  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  public void setCertificate_JsonNullable(JsonNullable<byte[]> certificate) {
    this.certificate = certificate;
  }

  public void setCertificate(byte[] certificate) {
    this.certificate = JsonNullable.<byte[]>of(certificate);
  }

  public PadesSignaturePostRequestV2 signaturePolicyId(UUID signaturePolicyId) {
    
    this.signaturePolicyId = signaturePolicyId;
    return this;
  }

   /**
   * Get signaturePolicyId
   * @return signaturePolicyId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNATURE_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSignaturePolicyId() {
    return signaturePolicyId;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignaturePolicyId(UUID signaturePolicyId) {
    this.signaturePolicyId = signaturePolicyId;
  }

  public PadesSignaturePostRequestV2 securityContextId(UUID securityContextId) {
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

  public PadesSignaturePostRequestV2 callbackArgument(String callbackArgument) {
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

  public PadesSignaturePostRequestV2 ignoreRevocationStatusUnknown(Boolean ignoreRevocationStatusUnknown) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PadesSignaturePostRequestV2 padesSignaturePostRequestV2 = (PadesSignaturePostRequestV2) o;
    return Objects.equals(this.pdfToSign, padesSignaturePostRequestV2.pdfToSign) &&
        Objects.equals(this.visualRepresentation, padesSignaturePostRequestV2.visualRepresentation) &&
        equalsNullable(this.pdfMarks, padesSignaturePostRequestV2.pdfMarks) &&
        Objects.equals(this.bypassMarksIfSigned, padesSignaturePostRequestV2.bypassMarksIfSigned) &&
        Objects.equals(this.measurementUnits, padesSignaturePostRequestV2.measurementUnits) &&
        Objects.equals(this.pageOptimization, padesSignaturePostRequestV2.pageOptimization) &&
        equalsNullable(this.customSignatureFieldName, padesSignaturePostRequestV2.customSignatureFieldName) &&
        Objects.equals(this.certificationLevel, padesSignaturePostRequestV2.certificationLevel) &&
        equalsNullable(this.reason, padesSignaturePostRequestV2.reason) &&
        equalsNullable(this.certificate, padesSignaturePostRequestV2.certificate) &&
        Objects.equals(this.signaturePolicyId, padesSignaturePostRequestV2.signaturePolicyId) &&
        equalsNullable(this.securityContextId, padesSignaturePostRequestV2.securityContextId) &&
        equalsNullable(this.callbackArgument, padesSignaturePostRequestV2.callbackArgument) &&
        equalsNullable(this.ignoreRevocationStatusUnknown, padesSignaturePostRequestV2.ignoreRevocationStatusUnknown);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pdfToSign, visualRepresentation, hashCodeNullable(pdfMarks), bypassMarksIfSigned, measurementUnits, pageOptimization, hashCodeNullable(customSignatureFieldName), certificationLevel, hashCodeNullable(reason), hashCodeNullable(certificate), signaturePolicyId, hashCodeNullable(securityContextId), hashCodeNullable(callbackArgument), hashCodeNullable(ignoreRevocationStatusUnknown));
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
    sb.append("class PadesSignaturePostRequestV2 {\n");
    sb.append("    pdfToSign: ").append(toIndentedString(pdfToSign)).append("\n");
    sb.append("    visualRepresentation: ").append(toIndentedString(visualRepresentation)).append("\n");
    sb.append("    pdfMarks: ").append(toIndentedString(pdfMarks)).append("\n");
    sb.append("    bypassMarksIfSigned: ").append(toIndentedString(bypassMarksIfSigned)).append("\n");
    sb.append("    measurementUnits: ").append(toIndentedString(measurementUnits)).append("\n");
    sb.append("    pageOptimization: ").append(toIndentedString(pageOptimization)).append("\n");
    sb.append("    customSignatureFieldName: ").append(toIndentedString(customSignatureFieldName)).append("\n");
    sb.append("    certificationLevel: ").append(toIndentedString(certificationLevel)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    signaturePolicyId: ").append(toIndentedString(signaturePolicyId)).append("\n");
    sb.append("    securityContextId: ").append(toIndentedString(securityContextId)).append("\n");
    sb.append("    callbackArgument: ").append(toIndentedString(callbackArgument)).append("\n");
    sb.append("    ignoreRevocationStatusUnknown: ").append(toIndentedString(ignoreRevocationStatusUnknown)).append("\n");
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

    private PadesSignaturePostRequestV2 instance;

    public Builder() {
      this(new PadesSignaturePostRequestV2());
    }

    protected Builder(PadesSignaturePostRequestV2 instance) {
      this.instance = instance;
    }

    public PadesSignaturePostRequestV2.Builder pdfToSign(FileModel pdfToSign) {
      this.instance.pdfToSign = pdfToSign;
      return this;
    }
    public PadesSignaturePostRequestV2.Builder visualRepresentation(PadesVisualRepresentationModel visualRepresentation) {
      this.instance.visualRepresentation = visualRepresentation;
      return this;
    }
    public PadesSignaturePostRequestV2.Builder pdfMarks(List<PdfMarkModel> pdfMarks) {
      this.instance.pdfMarks = JsonNullable.<List<PdfMarkModel>>of(pdfMarks);
      return this;
    }
    public PadesSignaturePostRequestV2.Builder pdfMarks(JsonNullable<List<PdfMarkModel>> pdfMarks) {
      this.instance.pdfMarks = pdfMarks;
      return this;
    }
    public PadesSignaturePostRequestV2.Builder bypassMarksIfSigned(Boolean bypassMarksIfSigned) {
      this.instance.bypassMarksIfSigned = bypassMarksIfSigned;
      return this;
    }
    public PadesSignaturePostRequestV2.Builder measurementUnits(PadesMeasurementUnits measurementUnits) {
      this.instance.measurementUnits = measurementUnits;
      return this;
    }
    public PadesSignaturePostRequestV2.Builder pageOptimization(PadesPageOptimizationModel pageOptimization) {
      this.instance.pageOptimization = pageOptimization;
      return this;
    }
    public PadesSignaturePostRequestV2.Builder customSignatureFieldName(String customSignatureFieldName) {
      this.instance.customSignatureFieldName = JsonNullable.<String>of(customSignatureFieldName);
      return this;
    }
    public PadesSignaturePostRequestV2.Builder customSignatureFieldName(JsonNullable<String> customSignatureFieldName) {
      this.instance.customSignatureFieldName = customSignatureFieldName;
      return this;
    }
    public PadesSignaturePostRequestV2.Builder certificationLevel(PadesCertificationLevel certificationLevel) {
      this.instance.certificationLevel = certificationLevel;
      return this;
    }
    public PadesSignaturePostRequestV2.Builder reason(String reason) {
      this.instance.reason = JsonNullable.<String>of(reason);
      return this;
    }
    public PadesSignaturePostRequestV2.Builder reason(JsonNullable<String> reason) {
      this.instance.reason = reason;
      return this;
    }
    public PadesSignaturePostRequestV2.Builder certificate(byte[] certificate) {
      this.instance.certificate = JsonNullable.<byte[]>of(certificate);
      return this;
    }
    public PadesSignaturePostRequestV2.Builder certificate(JsonNullable<byte[]> certificate) {
      this.instance.certificate = certificate;
      return this;
    }
    public PadesSignaturePostRequestV2.Builder signaturePolicyId(UUID signaturePolicyId) {
      this.instance.signaturePolicyId = signaturePolicyId;
      return this;
    }
    public PadesSignaturePostRequestV2.Builder securityContextId(UUID securityContextId) {
      this.instance.securityContextId = JsonNullable.<UUID>of(securityContextId);
      return this;
    }
    public PadesSignaturePostRequestV2.Builder securityContextId(JsonNullable<UUID> securityContextId) {
      this.instance.securityContextId = securityContextId;
      return this;
    }
    public PadesSignaturePostRequestV2.Builder callbackArgument(String callbackArgument) {
      this.instance.callbackArgument = JsonNullable.<String>of(callbackArgument);
      return this;
    }
    public PadesSignaturePostRequestV2.Builder callbackArgument(JsonNullable<String> callbackArgument) {
      this.instance.callbackArgument = callbackArgument;
      return this;
    }
    public PadesSignaturePostRequestV2.Builder ignoreRevocationStatusUnknown(Boolean ignoreRevocationStatusUnknown) {
      this.instance.ignoreRevocationStatusUnknown = JsonNullable.<Boolean>of(ignoreRevocationStatusUnknown);
      return this;
    }
    public PadesSignaturePostRequestV2.Builder ignoreRevocationStatusUnknown(JsonNullable<Boolean> ignoreRevocationStatusUnknown) {
      this.instance.ignoreRevocationStatusUnknown = ignoreRevocationStatusUnknown;
      return this;
    }


    /**
    * returns a built PadesSignaturePostRequestV2 instance.
    *
    * The builder is not reusable.
    */
    public PadesSignaturePostRequestV2 build() {
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
  public static PadesSignaturePostRequestV2.Builder builder() {
    return new PadesSignaturePostRequestV2.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public PadesSignaturePostRequestV2.Builder toBuilder() {
    return new PadesSignaturePostRequestV2.Builder()
      .pdfToSign(getPdfToSign())
      .visualRepresentation(getVisualRepresentation())
      .pdfMarks(getPdfMarks())
      .bypassMarksIfSigned(isBypassMarksIfSigned())
      .measurementUnits(getMeasurementUnits())
      .pageOptimization(getPageOptimization())
      .customSignatureFieldName(getCustomSignatureFieldName())
      .certificationLevel(getCertificationLevel())
      .reason(getReason())
      .certificate(getCertificate())
      .signaturePolicyId(getSignaturePolicyId())
      .securityContextId(getSecurityContextId())
      .callbackArgument(getCallbackArgument())
      .ignoreRevocationStatusUnknown(isIgnoreRevocationStatusUnknown());
  }


}

