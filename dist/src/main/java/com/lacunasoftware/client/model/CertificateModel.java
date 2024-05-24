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
import com.lacunasoftware.client.model.NameModel;
import com.lacunasoftware.client.model.PkiBrazilCertificateModel;
import com.lacunasoftware.client.model.PkiItalyCertificateModel;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CertificateModel
 */
@JsonPropertyOrder({
  CertificateModel.JSON_PROPERTY_SUBJECT_NAME,
  CertificateModel.JSON_PROPERTY_ISSUER_NAME,
  CertificateModel.JSON_PROPERTY_ISSUER_DISPLAY_NAME,
  CertificateModel.JSON_PROPERTY_SERIAL_NUMBER,
  CertificateModel.JSON_PROPERTY_VALIDITY_START,
  CertificateModel.JSON_PROPERTY_VALIDITY_END,
  CertificateModel.JSON_PROPERTY_ISSUER,
  CertificateModel.JSON_PROPERTY_PKI_BRAZIL,
  CertificateModel.JSON_PROPERTY_PKI_ITALY,
  CertificateModel.JSON_PROPERTY_BINARY_THUMBPRINT_S_H_A256,
  CertificateModel.JSON_PROPERTY_THUMBPRINT,
  CertificateModel.JSON_PROPERTY_THUMBPRINT_S_H_A256,
  CertificateModel.JSON_PROPERTY_SUBJECT_COMMON_NAME,
  CertificateModel.JSON_PROPERTY_SUBJECT_DISPLAY_NAME,
  CertificateModel.JSON_PROPERTY_SUBJECT_IDENTIFIER,
  CertificateModel.JSON_PROPERTY_EMAIL_ADDRESS,
  CertificateModel.JSON_PROPERTY_ORGANIZATION,
  CertificateModel.JSON_PROPERTY_ORGANIZATION_IDENTIFIER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class CertificateModel {
  public static final String JSON_PROPERTY_SUBJECT_NAME = "subjectName";
  private NameModel subjectName;

  public static final String JSON_PROPERTY_ISSUER_NAME = "issuerName";
  private NameModel issuerName;

  public static final String JSON_PROPERTY_ISSUER_DISPLAY_NAME = "issuerDisplayName";
  private JsonNullable<String> issuerDisplayName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serialNumber";
  private JsonNullable<String> serialNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALIDITY_START = "validityStart";
  private OffsetDateTime validityStart;

  public static final String JSON_PROPERTY_VALIDITY_END = "validityEnd";
  private OffsetDateTime validityEnd;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private CertificateModel issuer;

  public static final String JSON_PROPERTY_PKI_BRAZIL = "pkiBrazil";
  private PkiBrazilCertificateModel pkiBrazil;

  public static final String JSON_PROPERTY_PKI_ITALY = "pkiItaly";
  private PkiItalyCertificateModel pkiItaly;

  public static final String JSON_PROPERTY_BINARY_THUMBPRINT_S_H_A256 = "binaryThumbprintSHA256";
  private JsonNullable<byte[]> binaryThumbprintSHA256 = JsonNullable.<byte[]>undefined();

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

  public CertificateModel() {
  }

  public CertificateModel subjectName(NameModel subjectName) {
    
    this.subjectName = subjectName;
    return this;
  }

   /**
   * Get subjectName
   * @return subjectName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NameModel getSubjectName() {
    return subjectName;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubjectName(NameModel subjectName) {
    this.subjectName = subjectName;
  }

  public CertificateModel issuerName(NameModel issuerName) {
    
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Get issuerName
   * @return issuerName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NameModel getIssuerName() {
    return issuerName;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuerName(NameModel issuerName) {
    this.issuerName = issuerName;
  }

  public CertificateModel issuerDisplayName(String issuerDisplayName) {
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

  public CertificateModel serialNumber(String serialNumber) {
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

  public CertificateModel validityStart(OffsetDateTime validityStart) {
    
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

  public CertificateModel validityEnd(OffsetDateTime validityEnd) {
    
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

  public CertificateModel issuer(CertificateModel issuer) {
    
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

  public CertificateModel getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuer(CertificateModel issuer) {
    this.issuer = issuer;
  }

  public CertificateModel pkiBrazil(PkiBrazilCertificateModel pkiBrazil) {
    
    this.pkiBrazil = pkiBrazil;
    return this;
  }

   /**
   * Get pkiBrazil
   * @return pkiBrazil
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PKI_BRAZIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PkiBrazilCertificateModel getPkiBrazil() {
    return pkiBrazil;
  }


  @JsonProperty(JSON_PROPERTY_PKI_BRAZIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPkiBrazil(PkiBrazilCertificateModel pkiBrazil) {
    this.pkiBrazil = pkiBrazil;
  }

  public CertificateModel pkiItaly(PkiItalyCertificateModel pkiItaly) {
    
    this.pkiItaly = pkiItaly;
    return this;
  }

   /**
   * Get pkiItaly
   * @return pkiItaly
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PKI_ITALY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PkiItalyCertificateModel getPkiItaly() {
    return pkiItaly;
  }


  @JsonProperty(JSON_PROPERTY_PKI_ITALY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPkiItaly(PkiItalyCertificateModel pkiItaly) {
    this.pkiItaly = pkiItaly;
  }

  public CertificateModel binaryThumbprintSHA256(byte[] binaryThumbprintSHA256) {
    this.binaryThumbprintSHA256 = JsonNullable.<byte[]>of(binaryThumbprintSHA256);
    
    return this;
  }

   /**
   * Get binaryThumbprintSHA256
   * @return binaryThumbprintSHA256
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public byte[] getBinaryThumbprintSHA256() {
        return binaryThumbprintSHA256.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BINARY_THUMBPRINT_S_H_A256)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<byte[]> getBinaryThumbprintSHA256_JsonNullable() {
    return binaryThumbprintSHA256;
  }
  
  @JsonProperty(JSON_PROPERTY_BINARY_THUMBPRINT_S_H_A256)
  public void setBinaryThumbprintSHA256_JsonNullable(JsonNullable<byte[]> binaryThumbprintSHA256) {
    this.binaryThumbprintSHA256 = binaryThumbprintSHA256;
  }

  public void setBinaryThumbprintSHA256(byte[] binaryThumbprintSHA256) {
    this.binaryThumbprintSHA256 = JsonNullable.<byte[]>of(binaryThumbprintSHA256);
  }

  public CertificateModel thumbprint(String thumbprint) {
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

  public CertificateModel thumbprintSHA256(String thumbprintSHA256) {
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

  public CertificateModel subjectCommonName(String subjectCommonName) {
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

  public CertificateModel subjectDisplayName(String subjectDisplayName) {
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

  public CertificateModel subjectIdentifier(String subjectIdentifier) {
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

  public CertificateModel emailAddress(String emailAddress) {
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

  public CertificateModel organization(String organization) {
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

  public CertificateModel organizationIdentifier(String organizationIdentifier) {
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
    CertificateModel certificateModel = (CertificateModel) o;
    return Objects.equals(this.subjectName, certificateModel.subjectName) &&
        Objects.equals(this.issuerName, certificateModel.issuerName) &&
        equalsNullable(this.issuerDisplayName, certificateModel.issuerDisplayName) &&
        equalsNullable(this.serialNumber, certificateModel.serialNumber) &&
        Objects.equals(this.validityStart, certificateModel.validityStart) &&
        Objects.equals(this.validityEnd, certificateModel.validityEnd) &&
        Objects.equals(this.issuer, certificateModel.issuer) &&
        Objects.equals(this.pkiBrazil, certificateModel.pkiBrazil) &&
        Objects.equals(this.pkiItaly, certificateModel.pkiItaly) &&
        equalsNullable(this.binaryThumbprintSHA256, certificateModel.binaryThumbprintSHA256) &&
        equalsNullable(this.thumbprint, certificateModel.thumbprint) &&
        equalsNullable(this.thumbprintSHA256, certificateModel.thumbprintSHA256) &&
        equalsNullable(this.subjectCommonName, certificateModel.subjectCommonName) &&
        equalsNullable(this.subjectDisplayName, certificateModel.subjectDisplayName) &&
        equalsNullable(this.subjectIdentifier, certificateModel.subjectIdentifier) &&
        equalsNullable(this.emailAddress, certificateModel.emailAddress) &&
        equalsNullable(this.organization, certificateModel.organization) &&
        equalsNullable(this.organizationIdentifier, certificateModel.organizationIdentifier);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectName, issuerName, hashCodeNullable(issuerDisplayName), hashCodeNullable(serialNumber), validityStart, validityEnd, issuer, pkiBrazil, pkiItaly, hashCodeNullable(binaryThumbprintSHA256), hashCodeNullable(thumbprint), hashCodeNullable(thumbprintSHA256), hashCodeNullable(subjectCommonName), hashCodeNullable(subjectDisplayName), hashCodeNullable(subjectIdentifier), hashCodeNullable(emailAddress), hashCodeNullable(organization), hashCodeNullable(organizationIdentifier));
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
    sb.append("class CertificateModel {\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    issuerDisplayName: ").append(toIndentedString(issuerDisplayName)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    validityStart: ").append(toIndentedString(validityStart)).append("\n");
    sb.append("    validityEnd: ").append(toIndentedString(validityEnd)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    pkiBrazil: ").append(toIndentedString(pkiBrazil)).append("\n");
    sb.append("    pkiItaly: ").append(toIndentedString(pkiItaly)).append("\n");
    sb.append("    binaryThumbprintSHA256: ").append(toIndentedString(binaryThumbprintSHA256)).append("\n");
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

    private CertificateModel instance;

    public Builder() {
      this(new CertificateModel());
    }

    protected Builder(CertificateModel instance) {
      this.instance = instance;
    }

    public CertificateModel.Builder subjectName(NameModel subjectName) {
      this.instance.subjectName = subjectName;
      return this;
    }
    public CertificateModel.Builder issuerName(NameModel issuerName) {
      this.instance.issuerName = issuerName;
      return this;
    }
    public CertificateModel.Builder issuerDisplayName(String issuerDisplayName) {
      this.instance.issuerDisplayName = JsonNullable.<String>of(issuerDisplayName);
      return this;
    }
    public CertificateModel.Builder issuerDisplayName(JsonNullable<String> issuerDisplayName) {
      this.instance.issuerDisplayName = issuerDisplayName;
      return this;
    }
    public CertificateModel.Builder serialNumber(String serialNumber) {
      this.instance.serialNumber = JsonNullable.<String>of(serialNumber);
      return this;
    }
    public CertificateModel.Builder serialNumber(JsonNullable<String> serialNumber) {
      this.instance.serialNumber = serialNumber;
      return this;
    }
    public CertificateModel.Builder validityStart(OffsetDateTime validityStart) {
      this.instance.validityStart = validityStart;
      return this;
    }
    public CertificateModel.Builder validityEnd(OffsetDateTime validityEnd) {
      this.instance.validityEnd = validityEnd;
      return this;
    }
    public CertificateModel.Builder issuer(CertificateModel issuer) {
      this.instance.issuer = issuer;
      return this;
    }
    public CertificateModel.Builder pkiBrazil(PkiBrazilCertificateModel pkiBrazil) {
      this.instance.pkiBrazil = pkiBrazil;
      return this;
    }
    public CertificateModel.Builder pkiItaly(PkiItalyCertificateModel pkiItaly) {
      this.instance.pkiItaly = pkiItaly;
      return this;
    }
    public CertificateModel.Builder binaryThumbprintSHA256(byte[] binaryThumbprintSHA256) {
      this.instance.binaryThumbprintSHA256 = JsonNullable.<byte[]>of(binaryThumbprintSHA256);
      return this;
    }
    public CertificateModel.Builder binaryThumbprintSHA256(JsonNullable<byte[]> binaryThumbprintSHA256) {
      this.instance.binaryThumbprintSHA256 = binaryThumbprintSHA256;
      return this;
    }
    public CertificateModel.Builder thumbprint(String thumbprint) {
      this.instance.thumbprint = JsonNullable.<String>of(thumbprint);
      return this;
    }
    public CertificateModel.Builder thumbprint(JsonNullable<String> thumbprint) {
      this.instance.thumbprint = thumbprint;
      return this;
    }
    public CertificateModel.Builder thumbprintSHA256(String thumbprintSHA256) {
      this.instance.thumbprintSHA256 = JsonNullable.<String>of(thumbprintSHA256);
      return this;
    }
    public CertificateModel.Builder thumbprintSHA256(JsonNullable<String> thumbprintSHA256) {
      this.instance.thumbprintSHA256 = thumbprintSHA256;
      return this;
    }
    public CertificateModel.Builder subjectCommonName(String subjectCommonName) {
      this.instance.subjectCommonName = JsonNullable.<String>of(subjectCommonName);
      return this;
    }
    public CertificateModel.Builder subjectCommonName(JsonNullable<String> subjectCommonName) {
      this.instance.subjectCommonName = subjectCommonName;
      return this;
    }
    public CertificateModel.Builder subjectDisplayName(String subjectDisplayName) {
      this.instance.subjectDisplayName = JsonNullable.<String>of(subjectDisplayName);
      return this;
    }
    public CertificateModel.Builder subjectDisplayName(JsonNullable<String> subjectDisplayName) {
      this.instance.subjectDisplayName = subjectDisplayName;
      return this;
    }
    public CertificateModel.Builder subjectIdentifier(String subjectIdentifier) {
      this.instance.subjectIdentifier = JsonNullable.<String>of(subjectIdentifier);
      return this;
    }
    public CertificateModel.Builder subjectIdentifier(JsonNullable<String> subjectIdentifier) {
      this.instance.subjectIdentifier = subjectIdentifier;
      return this;
    }
    public CertificateModel.Builder emailAddress(String emailAddress) {
      this.instance.emailAddress = JsonNullable.<String>of(emailAddress);
      return this;
    }
    public CertificateModel.Builder emailAddress(JsonNullable<String> emailAddress) {
      this.instance.emailAddress = emailAddress;
      return this;
    }
    public CertificateModel.Builder organization(String organization) {
      this.instance.organization = JsonNullable.<String>of(organization);
      return this;
    }
    public CertificateModel.Builder organization(JsonNullable<String> organization) {
      this.instance.organization = organization;
      return this;
    }
    public CertificateModel.Builder organizationIdentifier(String organizationIdentifier) {
      this.instance.organizationIdentifier = JsonNullable.<String>of(organizationIdentifier);
      return this;
    }
    public CertificateModel.Builder organizationIdentifier(JsonNullable<String> organizationIdentifier) {
      this.instance.organizationIdentifier = organizationIdentifier;
      return this;
    }


    /**
    * returns a built CertificateModel instance.
    *
    * The builder is not reusable.
    */
    public CertificateModel build() {
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
  public static CertificateModel.Builder builder() {
    return new CertificateModel.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public CertificateModel.Builder toBuilder() {
    return new CertificateModel.Builder()
      .subjectName(getSubjectName())
      .issuerName(getIssuerName())
      .issuerDisplayName(getIssuerDisplayName())
      .serialNumber(getSerialNumber())
      .validityStart(getValidityStart())
      .validityEnd(getValidityEnd())
      .issuer(getIssuer())
      .pkiBrazil(getPkiBrazil())
      .pkiItaly(getPkiItaly())
      .binaryThumbprintSHA256(getBinaryThumbprintSHA256())
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

