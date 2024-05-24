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
import com.lacunasoftware.client.model.ValidationResultsModel;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ErrorModelV2
 */
@JsonPropertyOrder({
  ErrorModelV2.JSON_PROPERTY_VALIDATION_RESULTS,
  ErrorModelV2.JSON_PROPERTY_DETAIL,
  ErrorModelV2.JSON_PROPERTY_CODE,
  ErrorModelV2.JSON_PROPERTY_MESSAGE,
  ErrorModelV2.JSON_PROPERTY_DETAILS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class ErrorModelV2 {
  public static final String JSON_PROPERTY_VALIDATION_RESULTS = "validationResults";
  private ValidationResultsModel validationResults;

  public static final String JSON_PROPERTY_DETAIL = "detail";
  private JsonNullable<String> detail = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DETAILS = "details";
  private JsonNullable<Map<String, String>> details = JsonNullable.<Map<String, String>>undefined();

  public ErrorModelV2() {
  }

  public ErrorModelV2 validationResults(ValidationResultsModel validationResults) {
    
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

  public ErrorModelV2 detail(String detail) {
    this.detail = JsonNullable.<String>of(detail);
    
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getDetail() {
        return detail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDetail_JsonNullable() {
    return detail;
  }
  
  @JsonProperty(JSON_PROPERTY_DETAIL)
  public void setDetail_JsonNullable(JsonNullable<String> detail) {
    this.detail = detail;
  }

  public void setDetail(String detail) {
    this.detail = JsonNullable.<String>of(detail);
  }

  public ErrorModelV2 code(String code) {
    this.code = JsonNullable.<String>of(code);
    
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getCode() {
        return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<String> code) {
    this.code = code;
  }

  public void setCode(String code) {
    this.code = JsonNullable.<String>of(code);
  }

  public ErrorModelV2 message(String message) {
    this.message = JsonNullable.<String>of(message);
    
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getMessage() {
        return message.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMessage_JsonNullable() {
    return message;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  public void setMessage_JsonNullable(JsonNullable<String> message) {
    this.message = message;
  }

  public void setMessage(String message) {
    this.message = JsonNullable.<String>of(message);
  }

  public ErrorModelV2 details(Map<String, String> details) {
    this.details = JsonNullable.<Map<String, String>>of(details);
    
    return this;
  }

  public ErrorModelV2 putDetailsItem(String key, String detailsItem) {
    if (this.details == null || !this.details.isPresent()) {
      this.details = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.details.get().put(key, detailsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Map<String, String> getDetails() {
        return details.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getDetails_JsonNullable() {
    return details;
  }
  
  @JsonProperty(JSON_PROPERTY_DETAILS)
  public void setDetails_JsonNullable(JsonNullable<Map<String, String>> details) {
    this.details = details;
  }

  public void setDetails(Map<String, String> details) {
    this.details = JsonNullable.<Map<String, String>>of(details);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModelV2 errorModelV2 = (ErrorModelV2) o;
    return Objects.equals(this.validationResults, errorModelV2.validationResults) &&
        equalsNullable(this.detail, errorModelV2.detail) &&
        equalsNullable(this.code, errorModelV2.code) &&
        equalsNullable(this.message, errorModelV2.message) &&
        equalsNullable(this.details, errorModelV2.details);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationResults, hashCodeNullable(detail), hashCodeNullable(code), hashCodeNullable(message), hashCodeNullable(details));
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
    sb.append("class ErrorModelV2 {\n");
    sb.append("    validationResults: ").append(toIndentedString(validationResults)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

    private ErrorModelV2 instance;

    public Builder() {
      this(new ErrorModelV2());
    }

    protected Builder(ErrorModelV2 instance) {
      this.instance = instance;
    }

    public ErrorModelV2.Builder validationResults(ValidationResultsModel validationResults) {
      this.instance.validationResults = validationResults;
      return this;
    }
    public ErrorModelV2.Builder detail(String detail) {
      this.instance.detail = JsonNullable.<String>of(detail);
      return this;
    }
    public ErrorModelV2.Builder detail(JsonNullable<String> detail) {
      this.instance.detail = detail;
      return this;
    }
    public ErrorModelV2.Builder code(String code) {
      this.instance.code = JsonNullable.<String>of(code);
      return this;
    }
    public ErrorModelV2.Builder code(JsonNullable<String> code) {
      this.instance.code = code;
      return this;
    }
    public ErrorModelV2.Builder message(String message) {
      this.instance.message = JsonNullable.<String>of(message);
      return this;
    }
    public ErrorModelV2.Builder message(JsonNullable<String> message) {
      this.instance.message = message;
      return this;
    }
    public ErrorModelV2.Builder details(Map<String, String> details) {
      this.instance.details = JsonNullable.<Map<String, String>>of(details);
      return this;
    }
    public ErrorModelV2.Builder details(JsonNullable<Map<String, String>> details) {
      this.instance.details = details;
      return this;
    }


    /**
    * returns a built ErrorModelV2 instance.
    *
    * The builder is not reusable.
    */
    public ErrorModelV2 build() {
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
  public static ErrorModelV2.Builder builder() {
    return new ErrorModelV2.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public ErrorModelV2.Builder toBuilder() {
    return new ErrorModelV2.Builder()
      .validationResults(getValidationResults())
      .detail(getDetail())
      .code(getCode())
      .message(getMessage())
      .details(getDetails());
  }


}

