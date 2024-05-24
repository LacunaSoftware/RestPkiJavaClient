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
import com.lacunasoftware.client.model.CertifiedAttributeModel;
import com.lacunasoftware.client.model.GeneralNameModel;
import com.lacunasoftware.client.model.HolderTypes;
import com.lacunasoftware.client.model.NameModel;
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
 * AttributeCertificateModel
 */
@JsonPropertyOrder({
  AttributeCertificateModel.JSON_PROPERTY_HOLDER_TYPE,
  AttributeCertificateModel.JSON_PROPERTY_HOLDER_CERTIFICATE_SERIAL_NUMBER,
  AttributeCertificateModel.JSON_PROPERTY_HOLDER_DISPLAY_NAME,
  AttributeCertificateModel.JSON_PROPERTY_HOLDER_NAME,
  AttributeCertificateModel.JSON_PROPERTY_ISSUER_DISPLAY_NAME,
  AttributeCertificateModel.JSON_PROPERTY_ISSUER,
  AttributeCertificateModel.JSON_PROPERTY_VALIDITY_START,
  AttributeCertificateModel.JSON_PROPERTY_VALIDITY_END,
  AttributeCertificateModel.JSON_PROPERTY_ATTRIBUTES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class AttributeCertificateModel {
  public static final String JSON_PROPERTY_HOLDER_TYPE = "holderType";
  private HolderTypes holderType;

  public static final String JSON_PROPERTY_HOLDER_CERTIFICATE_SERIAL_NUMBER = "holderCertificateSerialNumber";
  private JsonNullable<String> holderCertificateSerialNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HOLDER_DISPLAY_NAME = "holderDisplayName";
  private JsonNullable<String> holderDisplayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HOLDER_NAME = "holderName";
  private GeneralNameModel holderName;

  public static final String JSON_PROPERTY_ISSUER_DISPLAY_NAME = "issuerDisplayName";
  private JsonNullable<String> issuerDisplayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private NameModel issuer;

  public static final String JSON_PROPERTY_VALIDITY_START = "validityStart";
  private OffsetDateTime validityStart;

  public static final String JSON_PROPERTY_VALIDITY_END = "validityEnd";
  private OffsetDateTime validityEnd;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private JsonNullable<List<CertifiedAttributeModel>> attributes = JsonNullable.<List<CertifiedAttributeModel>>undefined();

  public AttributeCertificateModel() {
  }

  public AttributeCertificateModel holderType(HolderTypes holderType) {
    
    this.holderType = holderType;
    return this;
  }

   /**
   * Get holderType
   * @return holderType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HolderTypes getHolderType() {
    return holderType;
  }


  @JsonProperty(JSON_PROPERTY_HOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHolderType(HolderTypes holderType) {
    this.holderType = holderType;
  }

  public AttributeCertificateModel holderCertificateSerialNumber(String holderCertificateSerialNumber) {
    this.holderCertificateSerialNumber = JsonNullable.<String>of(holderCertificateSerialNumber);
    
    return this;
  }

   /**
   * Get holderCertificateSerialNumber
   * @return holderCertificateSerialNumber
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getHolderCertificateSerialNumber() {
        return holderCertificateSerialNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOLDER_CERTIFICATE_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHolderCertificateSerialNumber_JsonNullable() {
    return holderCertificateSerialNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_HOLDER_CERTIFICATE_SERIAL_NUMBER)
  public void setHolderCertificateSerialNumber_JsonNullable(JsonNullable<String> holderCertificateSerialNumber) {
    this.holderCertificateSerialNumber = holderCertificateSerialNumber;
  }

  public void setHolderCertificateSerialNumber(String holderCertificateSerialNumber) {
    this.holderCertificateSerialNumber = JsonNullable.<String>of(holderCertificateSerialNumber);
  }

  public AttributeCertificateModel holderDisplayName(String holderDisplayName) {
    this.holderDisplayName = JsonNullable.<String>of(holderDisplayName);
    
    return this;
  }

   /**
   * Get holderDisplayName
   * @return holderDisplayName
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getHolderDisplayName() {
        return holderDisplayName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOLDER_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getHolderDisplayName_JsonNullable() {
    return holderDisplayName;
  }
  
  @JsonProperty(JSON_PROPERTY_HOLDER_DISPLAY_NAME)
  public void setHolderDisplayName_JsonNullable(JsonNullable<String> holderDisplayName) {
    this.holderDisplayName = holderDisplayName;
  }

  public void setHolderDisplayName(String holderDisplayName) {
    this.holderDisplayName = JsonNullable.<String>of(holderDisplayName);
  }

  public AttributeCertificateModel holderName(GeneralNameModel holderName) {
    
    this.holderName = holderName;
    return this;
  }

   /**
   * Get holderName
   * @return holderName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GeneralNameModel getHolderName() {
    return holderName;
  }


  @JsonProperty(JSON_PROPERTY_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHolderName(GeneralNameModel holderName) {
    this.holderName = holderName;
  }

  public AttributeCertificateModel issuerDisplayName(String issuerDisplayName) {
    this.issuerDisplayName = JsonNullable.<String>of(issuerDisplayName);
    
    return this;
  }

   /**
   * Get issuerDisplayName
   * @return issuerDisplayName
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getIssuerDisplayName() {
        return issuerDisplayName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISSUER_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIssuerDisplayName_JsonNullable() {
    return issuerDisplayName;
  }
  
  @JsonProperty(JSON_PROPERTY_ISSUER_DISPLAY_NAME)
  public void setIssuerDisplayName_JsonNullable(JsonNullable<String> issuerDisplayName) {
    this.issuerDisplayName = issuerDisplayName;
  }

  public void setIssuerDisplayName(String issuerDisplayName) {
    this.issuerDisplayName = JsonNullable.<String>of(issuerDisplayName);
  }

  public AttributeCertificateModel issuer(NameModel issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NameModel getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuer(NameModel issuer) {
    this.issuer = issuer;
  }

  public AttributeCertificateModel validityStart(OffsetDateTime validityStart) {
    
    this.validityStart = validityStart;
    return this;
  }

   /**
   * Get validityStart
   * @return validityStart
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALIDITY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getValidityStart() {
    return validityStart;
  }


  @JsonProperty(JSON_PROPERTY_VALIDITY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidityStart(OffsetDateTime validityStart) {
    this.validityStart = validityStart;
  }

  public AttributeCertificateModel validityEnd(OffsetDateTime validityEnd) {
    
    this.validityEnd = validityEnd;
    return this;
  }

   /**
   * Get validityEnd
   * @return validityEnd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALIDITY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getValidityEnd() {
    return validityEnd;
  }


  @JsonProperty(JSON_PROPERTY_VALIDITY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidityEnd(OffsetDateTime validityEnd) {
    this.validityEnd = validityEnd;
  }

  public AttributeCertificateModel attributes(List<CertifiedAttributeModel> attributes) {
    this.attributes = JsonNullable.<List<CertifiedAttributeModel>>of(attributes);
    
    return this;
  }

  public AttributeCertificateModel addAttributesItem(CertifiedAttributeModel attributesItem) {
    if (this.attributes == null || !this.attributes.isPresent()) {
      this.attributes = JsonNullable.<List<CertifiedAttributeModel>>of(new ArrayList<>());
    }
    try {
      this.attributes.get().add(attributesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<CertifiedAttributeModel> getAttributes() {
        return attributes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<CertifiedAttributeModel>> getAttributes_JsonNullable() {
    return attributes;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  public void setAttributes_JsonNullable(JsonNullable<List<CertifiedAttributeModel>> attributes) {
    this.attributes = attributes;
  }

  public void setAttributes(List<CertifiedAttributeModel> attributes) {
    this.attributes = JsonNullable.<List<CertifiedAttributeModel>>of(attributes);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeCertificateModel attributeCertificateModel = (AttributeCertificateModel) o;
    return Objects.equals(this.holderType, attributeCertificateModel.holderType) &&
        equalsNullable(this.holderCertificateSerialNumber, attributeCertificateModel.holderCertificateSerialNumber) &&
        equalsNullable(this.holderDisplayName, attributeCertificateModel.holderDisplayName) &&
        Objects.equals(this.holderName, attributeCertificateModel.holderName) &&
        equalsNullable(this.issuerDisplayName, attributeCertificateModel.issuerDisplayName) &&
        Objects.equals(this.issuer, attributeCertificateModel.issuer) &&
        Objects.equals(this.validityStart, attributeCertificateModel.validityStart) &&
        Objects.equals(this.validityEnd, attributeCertificateModel.validityEnd) &&
        equalsNullable(this.attributes, attributeCertificateModel.attributes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(holderType, hashCodeNullable(holderCertificateSerialNumber), hashCodeNullable(holderDisplayName), holderName, hashCodeNullable(issuerDisplayName), issuer, validityStart, validityEnd, hashCodeNullable(attributes));
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
    sb.append("class AttributeCertificateModel {\n");
    sb.append("    holderType: ").append(toIndentedString(holderType)).append("\n");
    sb.append("    holderCertificateSerialNumber: ").append(toIndentedString(holderCertificateSerialNumber)).append("\n");
    sb.append("    holderDisplayName: ").append(toIndentedString(holderDisplayName)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    issuerDisplayName: ").append(toIndentedString(issuerDisplayName)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    validityStart: ").append(toIndentedString(validityStart)).append("\n");
    sb.append("    validityEnd: ").append(toIndentedString(validityEnd)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

    private AttributeCertificateModel instance;

    public Builder() {
      this(new AttributeCertificateModel());
    }

    protected Builder(AttributeCertificateModel instance) {
      this.instance = instance;
    }

    public AttributeCertificateModel.Builder holderType(HolderTypes holderType) {
      this.instance.holderType = holderType;
      return this;
    }
    public AttributeCertificateModel.Builder holderCertificateSerialNumber(String holderCertificateSerialNumber) {
      this.instance.holderCertificateSerialNumber = JsonNullable.<String>of(holderCertificateSerialNumber);
      return this;
    }
    public AttributeCertificateModel.Builder holderCertificateSerialNumber(JsonNullable<String> holderCertificateSerialNumber) {
      this.instance.holderCertificateSerialNumber = holderCertificateSerialNumber;
      return this;
    }
    public AttributeCertificateModel.Builder holderDisplayName(String holderDisplayName) {
      this.instance.holderDisplayName = JsonNullable.<String>of(holderDisplayName);
      return this;
    }
    public AttributeCertificateModel.Builder holderDisplayName(JsonNullable<String> holderDisplayName) {
      this.instance.holderDisplayName = holderDisplayName;
      return this;
    }
    public AttributeCertificateModel.Builder holderName(GeneralNameModel holderName) {
      this.instance.holderName = holderName;
      return this;
    }
    public AttributeCertificateModel.Builder issuerDisplayName(String issuerDisplayName) {
      this.instance.issuerDisplayName = JsonNullable.<String>of(issuerDisplayName);
      return this;
    }
    public AttributeCertificateModel.Builder issuerDisplayName(JsonNullable<String> issuerDisplayName) {
      this.instance.issuerDisplayName = issuerDisplayName;
      return this;
    }
    public AttributeCertificateModel.Builder issuer(NameModel issuer) {
      this.instance.issuer = issuer;
      return this;
    }
    public AttributeCertificateModel.Builder validityStart(OffsetDateTime validityStart) {
      this.instance.validityStart = validityStart;
      return this;
    }
    public AttributeCertificateModel.Builder validityEnd(OffsetDateTime validityEnd) {
      this.instance.validityEnd = validityEnd;
      return this;
    }
    public AttributeCertificateModel.Builder attributes(List<CertifiedAttributeModel> attributes) {
      this.instance.attributes = JsonNullable.<List<CertifiedAttributeModel>>of(attributes);
      return this;
    }
    public AttributeCertificateModel.Builder attributes(JsonNullable<List<CertifiedAttributeModel>> attributes) {
      this.instance.attributes = attributes;
      return this;
    }


    /**
    * returns a built AttributeCertificateModel instance.
    *
    * The builder is not reusable.
    */
    public AttributeCertificateModel build() {
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
  public static AttributeCertificateModel.Builder builder() {
    return new AttributeCertificateModel.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public AttributeCertificateModel.Builder toBuilder() {
    return new AttributeCertificateModel.Builder()
      .holderType(getHolderType())
      .holderCertificateSerialNumber(getHolderCertificateSerialNumber())
      .holderDisplayName(getHolderDisplayName())
      .holderName(getHolderName())
      .issuerDisplayName(getIssuerDisplayName())
      .issuer(getIssuer())
      .validityStart(getValidityStart())
      .validityEnd(getValidityEnd())
      .attributes(getAttributes());
  }


}

