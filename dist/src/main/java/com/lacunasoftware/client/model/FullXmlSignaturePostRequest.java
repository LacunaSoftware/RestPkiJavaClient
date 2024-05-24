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
import com.lacunasoftware.client.model.XmlElementLocationModel;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FullXmlSignaturePostRequest
 */
@JsonPropertyOrder({
  FullXmlSignaturePostRequest.JSON_PROPERTY_XML,
  FullXmlSignaturePostRequest.JSON_PROPERTY_SIGNATURE_ELEMENT_ID,
  FullXmlSignaturePostRequest.JSON_PROPERTY_SIGNATURE_ELEMENT_LOCATION,
  FullXmlSignaturePostRequest.JSON_PROPERTY_CERTIFICATE,
  FullXmlSignaturePostRequest.JSON_PROPERTY_SIGNATURE_POLICY_ID,
  FullXmlSignaturePostRequest.JSON_PROPERTY_SECURITY_CONTEXT_ID,
  FullXmlSignaturePostRequest.JSON_PROPERTY_CALLBACK_ARGUMENT,
  FullXmlSignaturePostRequest.JSON_PROPERTY_IGNORE_REVOCATION_STATUS_UNKNOWN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class FullXmlSignaturePostRequest {
  public static final String JSON_PROPERTY_XML = "xml";
  private JsonNullable<byte[]> xml = JsonNullable.<byte[]>undefined();

  public static final String JSON_PROPERTY_SIGNATURE_ELEMENT_ID = "signatureElementId";
  private JsonNullable<String> signatureElementId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SIGNATURE_ELEMENT_LOCATION = "signatureElementLocation";
  private XmlElementLocationModel signatureElementLocation;

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

  public FullXmlSignaturePostRequest() {
  }

  public FullXmlSignaturePostRequest xml(byte[] xml) {
    this.xml = JsonNullable.<byte[]>of(xml);
    
    return this;
  }

   /**
   * Get xml
   * @return xml
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public byte[] getXml() {
        return xml.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_XML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<byte[]> getXml_JsonNullable() {
    return xml;
  }
  
  @JsonProperty(JSON_PROPERTY_XML)
  public void setXml_JsonNullable(JsonNullable<byte[]> xml) {
    this.xml = xml;
  }

  public void setXml(byte[] xml) {
    this.xml = JsonNullable.<byte[]>of(xml);
  }

  public FullXmlSignaturePostRequest signatureElementId(String signatureElementId) {
    this.signatureElementId = JsonNullable.<String>of(signatureElementId);
    
    return this;
  }

   /**
   * Get signatureElementId
   * @return signatureElementId
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getSignatureElementId() {
        return signatureElementId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SIGNATURE_ELEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSignatureElementId_JsonNullable() {
    return signatureElementId;
  }
  
  @JsonProperty(JSON_PROPERTY_SIGNATURE_ELEMENT_ID)
  public void setSignatureElementId_JsonNullable(JsonNullable<String> signatureElementId) {
    this.signatureElementId = signatureElementId;
  }

  public void setSignatureElementId(String signatureElementId) {
    this.signatureElementId = JsonNullable.<String>of(signatureElementId);
  }

  public FullXmlSignaturePostRequest signatureElementLocation(XmlElementLocationModel signatureElementLocation) {
    
    this.signatureElementLocation = signatureElementLocation;
    return this;
  }

   /**
   * Get signatureElementLocation
   * @return signatureElementLocation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNATURE_ELEMENT_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XmlElementLocationModel getSignatureElementLocation() {
    return signatureElementLocation;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE_ELEMENT_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignatureElementLocation(XmlElementLocationModel signatureElementLocation) {
    this.signatureElementLocation = signatureElementLocation;
  }

  public FullXmlSignaturePostRequest certificate(byte[] certificate) {
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

  public FullXmlSignaturePostRequest signaturePolicyId(UUID signaturePolicyId) {
    
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

  public FullXmlSignaturePostRequest securityContextId(UUID securityContextId) {
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

  public FullXmlSignaturePostRequest callbackArgument(String callbackArgument) {
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

  public FullXmlSignaturePostRequest ignoreRevocationStatusUnknown(Boolean ignoreRevocationStatusUnknown) {
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
    FullXmlSignaturePostRequest fullXmlSignaturePostRequest = (FullXmlSignaturePostRequest) o;
    return equalsNullable(this.xml, fullXmlSignaturePostRequest.xml) &&
        equalsNullable(this.signatureElementId, fullXmlSignaturePostRequest.signatureElementId) &&
        Objects.equals(this.signatureElementLocation, fullXmlSignaturePostRequest.signatureElementLocation) &&
        equalsNullable(this.certificate, fullXmlSignaturePostRequest.certificate) &&
        Objects.equals(this.signaturePolicyId, fullXmlSignaturePostRequest.signaturePolicyId) &&
        equalsNullable(this.securityContextId, fullXmlSignaturePostRequest.securityContextId) &&
        equalsNullable(this.callbackArgument, fullXmlSignaturePostRequest.callbackArgument) &&
        equalsNullable(this.ignoreRevocationStatusUnknown, fullXmlSignaturePostRequest.ignoreRevocationStatusUnknown);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(xml), hashCodeNullable(signatureElementId), signatureElementLocation, hashCodeNullable(certificate), signaturePolicyId, hashCodeNullable(securityContextId), hashCodeNullable(callbackArgument), hashCodeNullable(ignoreRevocationStatusUnknown));
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
    sb.append("class FullXmlSignaturePostRequest {\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
    sb.append("    signatureElementId: ").append(toIndentedString(signatureElementId)).append("\n");
    sb.append("    signatureElementLocation: ").append(toIndentedString(signatureElementLocation)).append("\n");
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

    private FullXmlSignaturePostRequest instance;

    public Builder() {
      this(new FullXmlSignaturePostRequest());
    }

    protected Builder(FullXmlSignaturePostRequest instance) {
      this.instance = instance;
    }

    public FullXmlSignaturePostRequest.Builder xml(byte[] xml) {
      this.instance.xml = JsonNullable.<byte[]>of(xml);
      return this;
    }
    public FullXmlSignaturePostRequest.Builder xml(JsonNullable<byte[]> xml) {
      this.instance.xml = xml;
      return this;
    }
    public FullXmlSignaturePostRequest.Builder signatureElementId(String signatureElementId) {
      this.instance.signatureElementId = JsonNullable.<String>of(signatureElementId);
      return this;
    }
    public FullXmlSignaturePostRequest.Builder signatureElementId(JsonNullable<String> signatureElementId) {
      this.instance.signatureElementId = signatureElementId;
      return this;
    }
    public FullXmlSignaturePostRequest.Builder signatureElementLocation(XmlElementLocationModel signatureElementLocation) {
      this.instance.signatureElementLocation = signatureElementLocation;
      return this;
    }
    public FullXmlSignaturePostRequest.Builder certificate(byte[] certificate) {
      this.instance.certificate = JsonNullable.<byte[]>of(certificate);
      return this;
    }
    public FullXmlSignaturePostRequest.Builder certificate(JsonNullable<byte[]> certificate) {
      this.instance.certificate = certificate;
      return this;
    }
    public FullXmlSignaturePostRequest.Builder signaturePolicyId(UUID signaturePolicyId) {
      this.instance.signaturePolicyId = signaturePolicyId;
      return this;
    }
    public FullXmlSignaturePostRequest.Builder securityContextId(UUID securityContextId) {
      this.instance.securityContextId = JsonNullable.<UUID>of(securityContextId);
      return this;
    }
    public FullXmlSignaturePostRequest.Builder securityContextId(JsonNullable<UUID> securityContextId) {
      this.instance.securityContextId = securityContextId;
      return this;
    }
    public FullXmlSignaturePostRequest.Builder callbackArgument(String callbackArgument) {
      this.instance.callbackArgument = JsonNullable.<String>of(callbackArgument);
      return this;
    }
    public FullXmlSignaturePostRequest.Builder callbackArgument(JsonNullable<String> callbackArgument) {
      this.instance.callbackArgument = callbackArgument;
      return this;
    }
    public FullXmlSignaturePostRequest.Builder ignoreRevocationStatusUnknown(Boolean ignoreRevocationStatusUnknown) {
      this.instance.ignoreRevocationStatusUnknown = JsonNullable.<Boolean>of(ignoreRevocationStatusUnknown);
      return this;
    }
    public FullXmlSignaturePostRequest.Builder ignoreRevocationStatusUnknown(JsonNullable<Boolean> ignoreRevocationStatusUnknown) {
      this.instance.ignoreRevocationStatusUnknown = ignoreRevocationStatusUnknown;
      return this;
    }


    /**
    * returns a built FullXmlSignaturePostRequest instance.
    *
    * The builder is not reusable.
    */
    public FullXmlSignaturePostRequest build() {
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
  public static FullXmlSignaturePostRequest.Builder builder() {
    return new FullXmlSignaturePostRequest.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public FullXmlSignaturePostRequest.Builder toBuilder() {
    return new FullXmlSignaturePostRequest.Builder()
      .xml(getXml())
      .signatureElementId(getSignatureElementId())
      .signatureElementLocation(getSignatureElementLocation())
      .certificate(getCertificate())
      .signaturePolicyId(getSignaturePolicyId())
      .securityContextId(getSecurityContextId())
      .callbackArgument(getCallbackArgument())
      .ignoreRevocationStatusUnknown(isIgnoreRevocationStatusUnknown());
  }


}

