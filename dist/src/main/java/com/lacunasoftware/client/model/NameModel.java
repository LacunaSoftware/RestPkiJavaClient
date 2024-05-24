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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NameModel
 */
@JsonPropertyOrder({
  NameModel.JSON_PROPERTY_COUNTRY,
  NameModel.JSON_PROPERTY_ORGANIZATION,
  NameModel.JSON_PROPERTY_ORGANIZATION_UNIT,
  NameModel.JSON_PROPERTY_DN_QUALIFIER,
  NameModel.JSON_PROPERTY_STATE_NAME,
  NameModel.JSON_PROPERTY_COMMON_NAME,
  NameModel.JSON_PROPERTY_SERIAL_NUMBER,
  NameModel.JSON_PROPERTY_LOCALITY,
  NameModel.JSON_PROPERTY_TITLE,
  NameModel.JSON_PROPERTY_SURNAME,
  NameModel.JSON_PROPERTY_GIVEN_NAME,
  NameModel.JSON_PROPERTY_INITIALS,
  NameModel.JSON_PROPERTY_PSEUDONYM,
  NameModel.JSON_PROPERTY_GENERATION_QUALIFIER,
  NameModel.JSON_PROPERTY_EMAIL_ADDRESS,
  NameModel.JSON_PROPERTY_ALL_VALUES,
  NameModel.JSON_PROPERTY_DN_STRING
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class NameModel {
  public static final String JSON_PROPERTY_COUNTRY = "country";
  private JsonNullable<String> country = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private JsonNullable<String> organization = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORGANIZATION_UNIT = "organizationUnit";
  private JsonNullable<String> organizationUnit = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DN_QUALIFIER = "dnQualifier";
  private JsonNullable<String> dnQualifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATE_NAME = "stateName";
  private JsonNullable<String> stateName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMMON_NAME = "commonName";
  private JsonNullable<String> commonName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERIAL_NUMBER = "serialNumber";
  private JsonNullable<String> serialNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOCALITY = "locality";
  private JsonNullable<String> locality = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SURNAME = "surname";
  private JsonNullable<String> surname = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private JsonNullable<String> givenName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INITIALS = "initials";
  private JsonNullable<String> initials = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PSEUDONYM = "pseudonym";
  private JsonNullable<String> pseudonym = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_GENERATION_QUALIFIER = "generationQualifier";
  private JsonNullable<String> generationQualifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
  private JsonNullable<String> emailAddress = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ALL_VALUES = "allValues";
  private JsonNullable<Map<String, List<String>>> allValues = JsonNullable.<Map<String, List<String>>>undefined();

  public static final String JSON_PROPERTY_DN_STRING = "dnString";
  private JsonNullable<String> dnString = JsonNullable.<String>undefined();

  public NameModel() {
  }

  public NameModel country(String country) {
    this.country = JsonNullable.<String>of(country);
    
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getCountry() {
        return country.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCountry_JsonNullable() {
    return country;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  public void setCountry_JsonNullable(JsonNullable<String> country) {
    this.country = country;
  }

  public void setCountry(String country) {
    this.country = JsonNullable.<String>of(country);
  }

  public NameModel organization(String organization) {
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

  public NameModel organizationUnit(String organizationUnit) {
    this.organizationUnit = JsonNullable.<String>of(organizationUnit);
    
    return this;
  }

   /**
   * Get organizationUnit
   * @return organizationUnit
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getOrganizationUnit() {
        return organizationUnit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORGANIZATION_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOrganizationUnit_JsonNullable() {
    return organizationUnit;
  }
  
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_UNIT)
  public void setOrganizationUnit_JsonNullable(JsonNullable<String> organizationUnit) {
    this.organizationUnit = organizationUnit;
  }

  public void setOrganizationUnit(String organizationUnit) {
    this.organizationUnit = JsonNullable.<String>of(organizationUnit);
  }

  public NameModel dnQualifier(String dnQualifier) {
    this.dnQualifier = JsonNullable.<String>of(dnQualifier);
    
    return this;
  }

   /**
   * Get dnQualifier
   * @return dnQualifier
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getDnQualifier() {
        return dnQualifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DN_QUALIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDnQualifier_JsonNullable() {
    return dnQualifier;
  }
  
  @JsonProperty(JSON_PROPERTY_DN_QUALIFIER)
  public void setDnQualifier_JsonNullable(JsonNullable<String> dnQualifier) {
    this.dnQualifier = dnQualifier;
  }

  public void setDnQualifier(String dnQualifier) {
    this.dnQualifier = JsonNullable.<String>of(dnQualifier);
  }

  public NameModel stateName(String stateName) {
    this.stateName = JsonNullable.<String>of(stateName);
    
    return this;
  }

   /**
   * Get stateName
   * @return stateName
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getStateName() {
        return stateName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStateName_JsonNullable() {
    return stateName;
  }
  
  @JsonProperty(JSON_PROPERTY_STATE_NAME)
  public void setStateName_JsonNullable(JsonNullable<String> stateName) {
    this.stateName = stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = JsonNullable.<String>of(stateName);
  }

  public NameModel commonName(String commonName) {
    this.commonName = JsonNullable.<String>of(commonName);
    
    return this;
  }

   /**
   * Get commonName
   * @return commonName
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getCommonName() {
        return commonName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMMON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCommonName_JsonNullable() {
    return commonName;
  }
  
  @JsonProperty(JSON_PROPERTY_COMMON_NAME)
  public void setCommonName_JsonNullable(JsonNullable<String> commonName) {
    this.commonName = commonName;
  }

  public void setCommonName(String commonName) {
    this.commonName = JsonNullable.<String>of(commonName);
  }

  public NameModel serialNumber(String serialNumber) {
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

  public NameModel locality(String locality) {
    this.locality = JsonNullable.<String>of(locality);
    
    return this;
  }

   /**
   * Get locality
   * @return locality
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getLocality() {
        return locality.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLocality_JsonNullable() {
    return locality;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCALITY)
  public void setLocality_JsonNullable(JsonNullable<String> locality) {
    this.locality = locality;
  }

  public void setLocality(String locality) {
    this.locality = JsonNullable.<String>of(locality);
  }

  public NameModel title(String title) {
    this.title = JsonNullable.<String>of(title);
    
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = JsonNullable.<String>of(title);
  }

  public NameModel surname(String surname) {
    this.surname = JsonNullable.<String>of(surname);
    
    return this;
  }

   /**
   * Get surname
   * @return surname
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getSurname() {
        return surname.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SURNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSurname_JsonNullable() {
    return surname;
  }
  
  @JsonProperty(JSON_PROPERTY_SURNAME)
  public void setSurname_JsonNullable(JsonNullable<String> surname) {
    this.surname = surname;
  }

  public void setSurname(String surname) {
    this.surname = JsonNullable.<String>of(surname);
  }

  public NameModel givenName(String givenName) {
    this.givenName = JsonNullable.<String>of(givenName);
    
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getGivenName() {
        return givenName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGivenName_JsonNullable() {
    return givenName;
  }
  
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  public void setGivenName_JsonNullable(JsonNullable<String> givenName) {
    this.givenName = givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = JsonNullable.<String>of(givenName);
  }

  public NameModel initials(String initials) {
    this.initials = JsonNullable.<String>of(initials);
    
    return this;
  }

   /**
   * Get initials
   * @return initials
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getInitials() {
        return initials.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INITIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInitials_JsonNullable() {
    return initials;
  }
  
  @JsonProperty(JSON_PROPERTY_INITIALS)
  public void setInitials_JsonNullable(JsonNullable<String> initials) {
    this.initials = initials;
  }

  public void setInitials(String initials) {
    this.initials = JsonNullable.<String>of(initials);
  }

  public NameModel pseudonym(String pseudonym) {
    this.pseudonym = JsonNullable.<String>of(pseudonym);
    
    return this;
  }

   /**
   * Get pseudonym
   * @return pseudonym
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getPseudonym() {
        return pseudonym.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PSEUDONYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPseudonym_JsonNullable() {
    return pseudonym;
  }
  
  @JsonProperty(JSON_PROPERTY_PSEUDONYM)
  public void setPseudonym_JsonNullable(JsonNullable<String> pseudonym) {
    this.pseudonym = pseudonym;
  }

  public void setPseudonym(String pseudonym) {
    this.pseudonym = JsonNullable.<String>of(pseudonym);
  }

  public NameModel generationQualifier(String generationQualifier) {
    this.generationQualifier = JsonNullable.<String>of(generationQualifier);
    
    return this;
  }

   /**
   * Get generationQualifier
   * @return generationQualifier
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getGenerationQualifier() {
        return generationQualifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GENERATION_QUALIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGenerationQualifier_JsonNullable() {
    return generationQualifier;
  }
  
  @JsonProperty(JSON_PROPERTY_GENERATION_QUALIFIER)
  public void setGenerationQualifier_JsonNullable(JsonNullable<String> generationQualifier) {
    this.generationQualifier = generationQualifier;
  }

  public void setGenerationQualifier(String generationQualifier) {
    this.generationQualifier = JsonNullable.<String>of(generationQualifier);
  }

  public NameModel emailAddress(String emailAddress) {
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

  public NameModel allValues(Map<String, List<String>> allValues) {
    this.allValues = JsonNullable.<Map<String, List<String>>>of(allValues);
    
    return this;
  }

  public NameModel putAllValuesItem(String key, List<String> allValuesItem) {
    if (this.allValues == null || !this.allValues.isPresent()) {
      this.allValues = JsonNullable.<Map<String, List<String>>>of(new HashMap<>());
    }
    try {
      this.allValues.get().put(key, allValuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get allValues
   * @return allValues
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Map<String, List<String>> getAllValues() {
        return allValues.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALL_VALUES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, List<String>>> getAllValues_JsonNullable() {
    return allValues;
  }
  
  @JsonProperty(JSON_PROPERTY_ALL_VALUES)
  public void setAllValues_JsonNullable(JsonNullable<Map<String, List<String>>> allValues) {
    this.allValues = allValues;
  }

  public void setAllValues(Map<String, List<String>> allValues) {
    this.allValues = JsonNullable.<Map<String, List<String>>>of(allValues);
  }

  public NameModel dnString(String dnString) {
    this.dnString = JsonNullable.<String>of(dnString);
    
    return this;
  }

   /**
   * Get dnString
   * @return dnString
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getDnString() {
        return dnString.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DN_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDnString_JsonNullable() {
    return dnString;
  }
  
  @JsonProperty(JSON_PROPERTY_DN_STRING)
  public void setDnString_JsonNullable(JsonNullable<String> dnString) {
    this.dnString = dnString;
  }

  public void setDnString(String dnString) {
    this.dnString = JsonNullable.<String>of(dnString);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameModel nameModel = (NameModel) o;
    return equalsNullable(this.country, nameModel.country) &&
        equalsNullable(this.organization, nameModel.organization) &&
        equalsNullable(this.organizationUnit, nameModel.organizationUnit) &&
        equalsNullable(this.dnQualifier, nameModel.dnQualifier) &&
        equalsNullable(this.stateName, nameModel.stateName) &&
        equalsNullable(this.commonName, nameModel.commonName) &&
        equalsNullable(this.serialNumber, nameModel.serialNumber) &&
        equalsNullable(this.locality, nameModel.locality) &&
        equalsNullable(this.title, nameModel.title) &&
        equalsNullable(this.surname, nameModel.surname) &&
        equalsNullable(this.givenName, nameModel.givenName) &&
        equalsNullable(this.initials, nameModel.initials) &&
        equalsNullable(this.pseudonym, nameModel.pseudonym) &&
        equalsNullable(this.generationQualifier, nameModel.generationQualifier) &&
        equalsNullable(this.emailAddress, nameModel.emailAddress) &&
        equalsNullable(this.allValues, nameModel.allValues) &&
        equalsNullable(this.dnString, nameModel.dnString);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(country), hashCodeNullable(organization), hashCodeNullable(organizationUnit), hashCodeNullable(dnQualifier), hashCodeNullable(stateName), hashCodeNullable(commonName), hashCodeNullable(serialNumber), hashCodeNullable(locality), hashCodeNullable(title), hashCodeNullable(surname), hashCodeNullable(givenName), hashCodeNullable(initials), hashCodeNullable(pseudonym), hashCodeNullable(generationQualifier), hashCodeNullable(emailAddress), hashCodeNullable(allValues), hashCodeNullable(dnString));
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
    sb.append("class NameModel {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationUnit: ").append(toIndentedString(organizationUnit)).append("\n");
    sb.append("    dnQualifier: ").append(toIndentedString(dnQualifier)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    initials: ").append(toIndentedString(initials)).append("\n");
    sb.append("    pseudonym: ").append(toIndentedString(pseudonym)).append("\n");
    sb.append("    generationQualifier: ").append(toIndentedString(generationQualifier)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    allValues: ").append(toIndentedString(allValues)).append("\n");
    sb.append("    dnString: ").append(toIndentedString(dnString)).append("\n");
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

    private NameModel instance;

    public Builder() {
      this(new NameModel());
    }

    protected Builder(NameModel instance) {
      this.instance = instance;
    }

    public NameModel.Builder country(String country) {
      this.instance.country = JsonNullable.<String>of(country);
      return this;
    }
    public NameModel.Builder country(JsonNullable<String> country) {
      this.instance.country = country;
      return this;
    }
    public NameModel.Builder organization(String organization) {
      this.instance.organization = JsonNullable.<String>of(organization);
      return this;
    }
    public NameModel.Builder organization(JsonNullable<String> organization) {
      this.instance.organization = organization;
      return this;
    }
    public NameModel.Builder organizationUnit(String organizationUnit) {
      this.instance.organizationUnit = JsonNullable.<String>of(organizationUnit);
      return this;
    }
    public NameModel.Builder organizationUnit(JsonNullable<String> organizationUnit) {
      this.instance.organizationUnit = organizationUnit;
      return this;
    }
    public NameModel.Builder dnQualifier(String dnQualifier) {
      this.instance.dnQualifier = JsonNullable.<String>of(dnQualifier);
      return this;
    }
    public NameModel.Builder dnQualifier(JsonNullable<String> dnQualifier) {
      this.instance.dnQualifier = dnQualifier;
      return this;
    }
    public NameModel.Builder stateName(String stateName) {
      this.instance.stateName = JsonNullable.<String>of(stateName);
      return this;
    }
    public NameModel.Builder stateName(JsonNullable<String> stateName) {
      this.instance.stateName = stateName;
      return this;
    }
    public NameModel.Builder commonName(String commonName) {
      this.instance.commonName = JsonNullable.<String>of(commonName);
      return this;
    }
    public NameModel.Builder commonName(JsonNullable<String> commonName) {
      this.instance.commonName = commonName;
      return this;
    }
    public NameModel.Builder serialNumber(String serialNumber) {
      this.instance.serialNumber = JsonNullable.<String>of(serialNumber);
      return this;
    }
    public NameModel.Builder serialNumber(JsonNullable<String> serialNumber) {
      this.instance.serialNumber = serialNumber;
      return this;
    }
    public NameModel.Builder locality(String locality) {
      this.instance.locality = JsonNullable.<String>of(locality);
      return this;
    }
    public NameModel.Builder locality(JsonNullable<String> locality) {
      this.instance.locality = locality;
      return this;
    }
    public NameModel.Builder title(String title) {
      this.instance.title = JsonNullable.<String>of(title);
      return this;
    }
    public NameModel.Builder title(JsonNullable<String> title) {
      this.instance.title = title;
      return this;
    }
    public NameModel.Builder surname(String surname) {
      this.instance.surname = JsonNullable.<String>of(surname);
      return this;
    }
    public NameModel.Builder surname(JsonNullable<String> surname) {
      this.instance.surname = surname;
      return this;
    }
    public NameModel.Builder givenName(String givenName) {
      this.instance.givenName = JsonNullable.<String>of(givenName);
      return this;
    }
    public NameModel.Builder givenName(JsonNullable<String> givenName) {
      this.instance.givenName = givenName;
      return this;
    }
    public NameModel.Builder initials(String initials) {
      this.instance.initials = JsonNullable.<String>of(initials);
      return this;
    }
    public NameModel.Builder initials(JsonNullable<String> initials) {
      this.instance.initials = initials;
      return this;
    }
    public NameModel.Builder pseudonym(String pseudonym) {
      this.instance.pseudonym = JsonNullable.<String>of(pseudonym);
      return this;
    }
    public NameModel.Builder pseudonym(JsonNullable<String> pseudonym) {
      this.instance.pseudonym = pseudonym;
      return this;
    }
    public NameModel.Builder generationQualifier(String generationQualifier) {
      this.instance.generationQualifier = JsonNullable.<String>of(generationQualifier);
      return this;
    }
    public NameModel.Builder generationQualifier(JsonNullable<String> generationQualifier) {
      this.instance.generationQualifier = generationQualifier;
      return this;
    }
    public NameModel.Builder emailAddress(String emailAddress) {
      this.instance.emailAddress = JsonNullable.<String>of(emailAddress);
      return this;
    }
    public NameModel.Builder emailAddress(JsonNullable<String> emailAddress) {
      this.instance.emailAddress = emailAddress;
      return this;
    }
    public NameModel.Builder allValues(Map<String, List<String>> allValues) {
      this.instance.allValues = JsonNullable.<Map<String, List<String>>>of(allValues);
      return this;
    }
    public NameModel.Builder allValues(JsonNullable<Map<String, List<String>>> allValues) {
      this.instance.allValues = allValues;
      return this;
    }
    public NameModel.Builder dnString(String dnString) {
      this.instance.dnString = JsonNullable.<String>of(dnString);
      return this;
    }
    public NameModel.Builder dnString(JsonNullable<String> dnString) {
      this.instance.dnString = dnString;
      return this;
    }


    /**
    * returns a built NameModel instance.
    *
    * The builder is not reusable.
    */
    public NameModel build() {
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
  public static NameModel.Builder builder() {
    return new NameModel.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public NameModel.Builder toBuilder() {
    return new NameModel.Builder()
      .country(getCountry())
      .organization(getOrganization())
      .organizationUnit(getOrganizationUnit())
      .dnQualifier(getDnQualifier())
      .stateName(getStateName())
      .commonName(getCommonName())
      .serialNumber(getSerialNumber())
      .locality(getLocality())
      .title(getTitle())
      .surname(getSurname())
      .givenName(getGivenName())
      .initials(getInitials())
      .pseudonym(getPseudonym())
      .generationQualifier(getGenerationQualifier())
      .emailAddress(getEmailAddress())
      .allValues(getAllValues())
      .dnString(getDnString());
  }


}

