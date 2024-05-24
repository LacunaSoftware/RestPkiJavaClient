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
import com.lacunasoftware.client.model.PadesTextHorizontalAlign;
import com.lacunasoftware.client.model.PadesVisualRectangleModel;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PadesVisualTextModel
 */
@JsonPropertyOrder({
  PadesVisualTextModel.JSON_PROPERTY_FONT_SIZE,
  PadesVisualTextModel.JSON_PROPERTY_TEXT,
  PadesVisualTextModel.JSON_PROPERTY_INCLUDE_SIGNING_TIME,
  PadesVisualTextModel.JSON_PROPERTY_HORIZONTAL_ALIGN,
  PadesVisualTextModel.JSON_PROPERTY_CONTAINER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class PadesVisualTextModel {
  public static final String JSON_PROPERTY_FONT_SIZE = "fontSize";
  private JsonNullable<Double> fontSize = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_TEXT = "text";
  private JsonNullable<String> text = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INCLUDE_SIGNING_TIME = "includeSigningTime";
  private Boolean includeSigningTime;

  public static final String JSON_PROPERTY_HORIZONTAL_ALIGN = "horizontalAlign";
  private PadesTextHorizontalAlign horizontalAlign;

  public static final String JSON_PROPERTY_CONTAINER = "container";
  private PadesVisualRectangleModel container;

  public PadesVisualTextModel() {
  }

  public PadesVisualTextModel fontSize(Double fontSize) {
    this.fontSize = JsonNullable.<Double>of(fontSize);
    
    return this;
  }

   /**
   * Get fontSize
   * @return fontSize
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Double getFontSize() {
        return fontSize.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getFontSize_JsonNullable() {
    return fontSize;
  }
  
  @JsonProperty(JSON_PROPERTY_FONT_SIZE)
  public void setFontSize_JsonNullable(JsonNullable<Double> fontSize) {
    this.fontSize = fontSize;
  }

  public void setFontSize(Double fontSize) {
    this.fontSize = JsonNullable.<Double>of(fontSize);
  }

  public PadesVisualTextModel text(String text) {
    this.text = JsonNullable.<String>of(text);
    
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getText() {
        return text.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getText_JsonNullable() {
    return text;
  }
  
  @JsonProperty(JSON_PROPERTY_TEXT)
  public void setText_JsonNullable(JsonNullable<String> text) {
    this.text = text;
  }

  public void setText(String text) {
    this.text = JsonNullable.<String>of(text);
  }

  public PadesVisualTextModel includeSigningTime(Boolean includeSigningTime) {
    
    this.includeSigningTime = includeSigningTime;
    return this;
  }

   /**
   * Get includeSigningTime
   * @return includeSigningTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_SIGNING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isIncludeSigningTime() {
    return includeSigningTime;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_SIGNING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeSigningTime(Boolean includeSigningTime) {
    this.includeSigningTime = includeSigningTime;
  }

  public PadesVisualTextModel horizontalAlign(PadesTextHorizontalAlign horizontalAlign) {
    
    this.horizontalAlign = horizontalAlign;
    return this;
  }

   /**
   * Get horizontalAlign
   * @return horizontalAlign
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HORIZONTAL_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PadesTextHorizontalAlign getHorizontalAlign() {
    return horizontalAlign;
  }


  @JsonProperty(JSON_PROPERTY_HORIZONTAL_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHorizontalAlign(PadesTextHorizontalAlign horizontalAlign) {
    this.horizontalAlign = horizontalAlign;
  }

  public PadesVisualTextModel container(PadesVisualRectangleModel container) {
    
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PadesVisualRectangleModel getContainer() {
    return container;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainer(PadesVisualRectangleModel container) {
    this.container = container;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PadesVisualTextModel padesVisualTextModel = (PadesVisualTextModel) o;
    return equalsNullable(this.fontSize, padesVisualTextModel.fontSize) &&
        equalsNullable(this.text, padesVisualTextModel.text) &&
        Objects.equals(this.includeSigningTime, padesVisualTextModel.includeSigningTime) &&
        Objects.equals(this.horizontalAlign, padesVisualTextModel.horizontalAlign) &&
        Objects.equals(this.container, padesVisualTextModel.container);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fontSize), hashCodeNullable(text), includeSigningTime, horizontalAlign, container);
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
    sb.append("class PadesVisualTextModel {\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    includeSigningTime: ").append(toIndentedString(includeSigningTime)).append("\n");
    sb.append("    horizontalAlign: ").append(toIndentedString(horizontalAlign)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
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

    private PadesVisualTextModel instance;

    public Builder() {
      this(new PadesVisualTextModel());
    }

    protected Builder(PadesVisualTextModel instance) {
      this.instance = instance;
    }

    public PadesVisualTextModel.Builder fontSize(Double fontSize) {
      this.instance.fontSize = JsonNullable.<Double>of(fontSize);
      return this;
    }
    public PadesVisualTextModel.Builder fontSize(JsonNullable<Double> fontSize) {
      this.instance.fontSize = fontSize;
      return this;
    }
    public PadesVisualTextModel.Builder text(String text) {
      this.instance.text = JsonNullable.<String>of(text);
      return this;
    }
    public PadesVisualTextModel.Builder text(JsonNullable<String> text) {
      this.instance.text = text;
      return this;
    }
    public PadesVisualTextModel.Builder includeSigningTime(Boolean includeSigningTime) {
      this.instance.includeSigningTime = includeSigningTime;
      return this;
    }
    public PadesVisualTextModel.Builder horizontalAlign(PadesTextHorizontalAlign horizontalAlign) {
      this.instance.horizontalAlign = horizontalAlign;
      return this;
    }
    public PadesVisualTextModel.Builder container(PadesVisualRectangleModel container) {
      this.instance.container = container;
      return this;
    }


    /**
    * returns a built PadesVisualTextModel instance.
    *
    * The builder is not reusable.
    */
    public PadesVisualTextModel build() {
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
  public static PadesVisualTextModel.Builder builder() {
    return new PadesVisualTextModel.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public PadesVisualTextModel.Builder toBuilder() {
    return new PadesVisualTextModel.Builder()
      .fontSize(getFontSize())
      .text(getText())
      .includeSigningTime(isIncludeSigningTime())
      .horizontalAlign(getHorizontalAlign())
      .container(getContainer());
  }


}

