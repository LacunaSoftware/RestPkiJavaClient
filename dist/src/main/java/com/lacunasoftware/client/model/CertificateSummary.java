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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CertificateSummary
 */
@JsonPropertyOrder({
  CertificateSummary.JSON_PROPERTY_THUMBPRINT,
  CertificateSummary.JSON_PROPERTY_THUMBPRINT_S_H_A256,
  CertificateSummary.JSON_PROPERTY_SUBJECT_COMMON_NAME,
  CertificateSummary.JSON_PROPERTY_SUBJECT_DISPLAY_NAME,
  CertificateSummary.JSON_PROPERTY_SUBJECT_IDENTIFIER,
  CertificateSummary.JSON_PROPERTY_EMAIL_ADDRESS,
  CertificateSummary.JSON_PROPERTY_ORGANIZATION,
  CertificateSummary.JSON_PROPERTY_ORGANIZATION_IDENTIFIER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class CertificateSummary {
  public static final String JSON_PROPERTY_THUMBPRINT = "thumbprint";
  private JsonNullable<String> thumbprint = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_THUMBPRINT_S_H_A256 = "thumbprintSHA256";
  private JsonNullable<String> thumbprintSHA256 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBJECT_COMMON_NAME = "subjectCommonName";
  private JsonNullable<String> subjectCommonName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBJECT_DISPLAY_NAME = "subjectDisplayName";
  private JsonNullable<String> subjectDisplayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBJECT_IDENTIFIER = "subjectIdentifier";
  private JsonNullable<String> subjectIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
  private JsonNullable<String> emailAddress = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private JsonNullable<String> organization = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORGANIZATION_IDENTIFIER = "organizationIdentifier";
  private JsonNullable<String> organizationIdentifier = JsonNullable.<String>undefined();

  public CertificateSummary() {
  }

  public CertificateSummary thumbprint(String thumbprint) {
    this.thumbprint = JsonNullable.<String>of(thumbprint);
    
    return this;
  }

   /**
   * Get thumbprint
   * @return thumbprint
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getThumbprint() {
        return thumbprint.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_THUMBPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getThumbprint_JsonNullable() {
    return thumbprint;
  }
  
  @JsonProperty(JSON_PROPERTY_THUMBPRINT)
  public void setThumbprint_JsonNullable(JsonNullable<String> thumbprint) {
    this.thumbprint = thumbprint;
  }

  public void setThumbprint(String thumbprint) {
    this.thumbprint = JsonNullable.<String>of(thumbprint);
  }

  public CertificateSummary thumbprintSHA256(String thumbprintSHA256) {
    this.thumbprintSHA256 = JsonNullable.<String>of(thumbprintSHA256);
    
    return this;
  }

   /**
   * Get thumbprintSHA256
   * @return thumbprintSHA256
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getThumbprintSHA256() {
        return thumbprintSHA256.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_THUMBPRINT_S_H_A256)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getThumbprintSHA256_JsonNullable() {
    return thumbprintSHA256;
  }
  
  @JsonProperty(JSON_PROPERTY_THUMBPRINT_S_H_A256)
  public void setThumbprintSHA256_JsonNullable(JsonNullable<String> thumbprintSHA256) {
    this.thumbprintSHA256 = thumbprintSHA256;
  }

  public void setThumbprintSHA256(String thumbprintSHA256) {
    this.thumbprintSHA256 = JsonNullable.<String>of(thumbprintSHA256);
  }

  public CertificateSummary subjectCommonName(String subjectCommonName) {
    this.subjectCommonName = JsonNullable.<String>of(subjectCommonName);
    
    return this;
  }

   /**
   * Get subjectCommonName
   * @return subjectCommonName
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getSubjectCommonName() {
        return subjectCommonName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT_COMMON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSubjectCommonName_JsonNullable() {
    return subjectCommonName;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBJECT_COMMON_NAME)
  public void setSubjectCommonName_JsonNullable(JsonNullable<String> subjectCommonName) {
    this.subjectCommonName = subjectCommonName;
  }

  public void setSubjectCommonName(String subjectCommonName) {
    this.subjectCommonName = JsonNullable.<String>of(subjectCommonName);
  }

  public CertificateSummary subjectDisplayName(String subjectDisplayName) {
    this.subjectDisplayName = JsonNullable.<String>of(subjectDisplayName);
    
    return this;
  }

   /**
   * Get subjectDisplayName
   * @return subjectDisplayName
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getSubjectDisplayName() {
        return subjectDisplayName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSubjectDisplayName_JsonNullable() {
    return subjectDisplayName;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBJECT_DISPLAY_NAME)
  public void setSubjectDisplayName_JsonNullable(JsonNullable<String> subjectDisplayName) {
    this.subjectDisplayName = subjectDisplayName;
  }

  public void setSubjectDisplayName(String subjectDisplayName) {
    this.subjectDisplayName = JsonNullable.<String>of(subjectDisplayName);
  }

  public CertificateSummary subjectIdentifier(String subjectIdentifier) {
    this.subjectIdentifier = JsonNullable.<String>of(subjectIdentifier);
    
    return this;
  }

   /**
   * Get subjectIdentifier
   * @return subjectIdentifier
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getSubjectIdentifier() {
        return subjectIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSubjectIdentifier_JsonNullable() {
    return subjectIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_SUBJECT_IDENTIFIER)
  public void setSubjectIdentifier_JsonNullable(JsonNullable<String> subjectIdentifier) {
    this.subjectIdentifier = subjectIdentifier;
  }

  public void setSubjectIdentifier(String subjectIdentifier) {
    this.subjectIdentifier = JsonNullable.<String>of(subjectIdentifier);
  }

  public CertificateSummary emailAddress(String emailAddress) {
    this.emailAddress = JsonNullable.<String>of(emailAddress);
    
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getEmailAddress() {
        return emailAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmailAddress_JsonNullable() {
    return emailAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  public void setEmailAddress_JsonNullable(JsonNullable<String> emailAddress) {
    this.emailAddress = emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = JsonNullable.<String>of(emailAddress);
  }

  public CertificateSummary organization(String organization) {
    this.organization = JsonNullable.<String>of(organization);
    
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getOrganization() {
        return organization.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOrganization_JsonNullable() {
    return organization;
  }
  
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  public void setOrganization_JsonNullable(JsonNullable<String> organization) {
    this.organization = organization;
  }

  public void setOrganization(String organization) {
    this.organization = JsonNullable.<String>of(organization);
  }

  public CertificateSummary organizationIdentifier(String organizationIdentifier) {
    this.organizationIdentifier = JsonNullable.<String>of(organizationIdentifier);
    
    return this;
  }

   /**
   * Get organizationIdentifier
   * @return organizationIdentifier
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getOrganizationIdentifier() {
        return organizationIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORGANIZATION_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOrganizationIdentifier_JsonNullable() {
    return organizationIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_IDENTIFIER)
  public void setOrganizationIdentifier_JsonNullable(JsonNullable<String> organizationIdentifier) {
    this.organizationIdentifier = organizationIdentifier;
  }

  public void setOrganizationIdentifier(String organizationIdentifier) {
    this.organizationIdentifier = JsonNullable.<String>of(organizationIdentifier);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateSummary certificateSummary = (CertificateSummary) o;
    return equalsNullable(this.thumbprint, certificateSummary.thumbprint) &&
        equalsNullable(this.thumbprintSHA256, certificateSummary.thumbprintSHA256) &&
        equalsNullable(this.subjectCommonName, certificateSummary.subjectCommonName) &&
        equalsNullable(this.subjectDisplayName, certificateSummary.subjectDisplayName) &&
        equalsNullable(this.subjectIdentifier, certificateSummary.subjectIdentifier) &&
        equalsNullable(this.emailAddress, certificateSummary.emailAddress) &&
        equalsNullable(this.organization, certificateSummary.organization) &&
        equalsNullable(this.organizationIdentifier, certificateSummary.organizationIdentifier);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(thumbprint), hashCodeNullable(thumbprintSHA256), hashCodeNullable(subjectCommonName), hashCodeNullable(subjectDisplayName), hashCodeNullable(subjectIdentifier), hashCodeNullable(emailAddress), hashCodeNullable(organization), hashCodeNullable(organizationIdentifier));
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
    sb.append("class CertificateSummary {\n");
    sb.append("    thumbprint: ").append(toIndentedString(thumbprint)).append("\n");
    sb.append("    thumbprintSHA256: ").append(toIndentedString(thumbprintSHA256)).append("\n");
    sb.append("    subjectCommonName: ").append(toIndentedString(subjectCommonName)).append("\n");
    sb.append("    subjectDisplayName: ").append(toIndentedString(subjectDisplayName)).append("\n");
    sb.append("    subjectIdentifier: ").append(toIndentedString(subjectIdentifier)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationIdentifier: ").append(toIndentedString(organizationIdentifier)).append("\n");
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

    private CertificateSummary instance;

    public Builder() {
      this(new CertificateSummary());
    }

    protected Builder(CertificateSummary instance) {
      this.instance = instance;
    }

    public CertificateSummary.Builder thumbprint(String thumbprint) {
      this.instance.thumbprint = JsonNullable.<String>of(thumbprint);
      return this;
    }
    public CertificateSummary.Builder thumbprint(JsonNullable<String> thumbprint) {
      this.instance.thumbprint = thumbprint;
      return this;
    }
    public CertificateSummary.Builder thumbprintSHA256(String thumbprintSHA256) {
      this.instance.thumbprintSHA256 = JsonNullable.<String>of(thumbprintSHA256);
      return this;
    }
    public CertificateSummary.Builder thumbprintSHA256(JsonNullable<String> thumbprintSHA256) {
      this.instance.thumbprintSHA256 = thumbprintSHA256;
      return this;
    }
    public CertificateSummary.Builder subjectCommonName(String subjectCommonName) {
      this.instance.subjectCommonName = JsonNullable.<String>of(subjectCommonName);
      return this;
    }
    public CertificateSummary.Builder subjectCommonName(JsonNullable<String> subjectCommonName) {
      this.instance.subjectCommonName = subjectCommonName;
      return this;
    }
    public CertificateSummary.Builder subjectDisplayName(String subjectDisplayName) {
      this.instance.subjectDisplayName = JsonNullable.<String>of(subjectDisplayName);
      return this;
    }
    public CertificateSummary.Builder subjectDisplayName(JsonNullable<String> subjectDisplayName) {
      this.instance.subjectDisplayName = subjectDisplayName;
      return this;
    }
    public CertificateSummary.Builder subjectIdentifier(String subjectIdentifier) {
      this.instance.subjectIdentifier = JsonNullable.<String>of(subjectIdentifier);
      return this;
    }
    public CertificateSummary.Builder subjectIdentifier(JsonNullable<String> subjectIdentifier) {
      this.instance.subjectIdentifier = subjectIdentifier;
      return this;
    }
    public CertificateSummary.Builder emailAddress(String emailAddress) {
      this.instance.emailAddress = JsonNullable.<String>of(emailAddress);
      return this;
    }
    public CertificateSummary.Builder emailAddress(JsonNullable<String> emailAddress) {
      this.instance.emailAddress = emailAddress;
      return this;
    }
    public CertificateSummary.Builder organization(String organization) {
      this.instance.organization = JsonNullable.<String>of(organization);
      return this;
    }
    public CertificateSummary.Builder organization(JsonNullable<String> organization) {
      this.instance.organization = organization;
      return this;
    }
    public CertificateSummary.Builder organizationIdentifier(String organizationIdentifier) {
      this.instance.organizationIdentifier = JsonNullable.<String>of(organizationIdentifier);
      return this;
    }
    public CertificateSummary.Builder organizationIdentifier(JsonNullable<String> organizationIdentifier) {
      this.instance.organizationIdentifier = organizationIdentifier;
      return this;
    }


    /**
    * returns a built CertificateSummary instance.
    *
    * The builder is not reusable.
    */
    public CertificateSummary build() {
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
  public static CertificateSummary.Builder builder() {
    return new CertificateSummary.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public CertificateSummary.Builder toBuilder() {
    return new CertificateSummary.Builder()
      .thumbprint(getThumbprint())
      .thumbprintSHA256(getThumbprintSHA256())
      .subjectCommonName(getSubjectCommonName())
      .subjectDisplayName(getSubjectDisplayName())
      .subjectIdentifier(getSubjectIdentifier())
      .emailAddress(getEmailAddress())
      .organization(getOrganization())
      .organizationIdentifier(getOrganizationIdentifier());
  }


}

