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
 * PadesVisualRectangleModel
 */
@JsonPropertyOrder({
  PadesVisualRectangleModel.JSON_PROPERTY_LEFT,
  PadesVisualRectangleModel.JSON_PROPERTY_TOP,
  PadesVisualRectangleModel.JSON_PROPERTY_RIGHT,
  PadesVisualRectangleModel.JSON_PROPERTY_BOTTOM,
  PadesVisualRectangleModel.JSON_PROPERTY_WIDTH,
  PadesVisualRectangleModel.JSON_PROPERTY_HEIGHT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class PadesVisualRectangleModel {
  public static final String JSON_PROPERTY_LEFT = "left";
  private JsonNullable<Double> left = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_TOP = "top";
  private JsonNullable<Double> top = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_RIGHT = "right";
  private JsonNullable<Double> right = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_BOTTOM = "bottom";
  private JsonNullable<Double> bottom = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_WIDTH = "width";
  private JsonNullable<Double> width = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private JsonNullable<Double> height = JsonNullable.<Double>undefined();

  public PadesVisualRectangleModel() {
  }

  public PadesVisualRectangleModel left(Double left) {
    this.left = JsonNullable.<Double>of(left);
    
    return this;
  }

   /**
   * Get left
   * @return left
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Double getLeft() {
        return left.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getLeft_JsonNullable() {
    return left;
  }
  
  @JsonProperty(JSON_PROPERTY_LEFT)
  public void setLeft_JsonNullable(JsonNullable<Double> left) {
    this.left = left;
  }

  public void setLeft(Double left) {
    this.left = JsonNullable.<Double>of(left);
  }

  public PadesVisualRectangleModel top(Double top) {
    this.top = JsonNullable.<Double>of(top);
    
    return this;
  }

   /**
   * Get top
   * @return top
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Double getTop() {
        return top.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getTop_JsonNullable() {
    return top;
  }
  
  @JsonProperty(JSON_PROPERTY_TOP)
  public void setTop_JsonNullable(JsonNullable<Double> top) {
    this.top = top;
  }

  public void setTop(Double top) {
    this.top = JsonNullable.<Double>of(top);
  }

  public PadesVisualRectangleModel right(Double right) {
    this.right = JsonNullable.<Double>of(right);
    
    return this;
  }

   /**
   * Get right
   * @return right
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Double getRight() {
        return right.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getRight_JsonNullable() {
    return right;
  }
  
  @JsonProperty(JSON_PROPERTY_RIGHT)
  public void setRight_JsonNullable(JsonNullable<Double> right) {
    this.right = right;
  }

  public void setRight(Double right) {
    this.right = JsonNullable.<Double>of(right);
  }

  public PadesVisualRectangleModel bottom(Double bottom) {
    this.bottom = JsonNullable.<Double>of(bottom);
    
    return this;
  }

   /**
   * Get bottom
   * @return bottom
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Double getBottom() {
        return bottom.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BOTTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getBottom_JsonNullable() {
    return bottom;
  }
  
  @JsonProperty(JSON_PROPERTY_BOTTOM)
  public void setBottom_JsonNullable(JsonNullable<Double> bottom) {
    this.bottom = bottom;
  }

  public void setBottom(Double bottom) {
    this.bottom = JsonNullable.<Double>of(bottom);
  }

  public PadesVisualRectangleModel width(Double width) {
    this.width = JsonNullable.<Double>of(width);
    
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Double getWidth() {
        return width.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getWidth_JsonNullable() {
    return width;
  }
  
  @JsonProperty(JSON_PROPERTY_WIDTH)
  public void setWidth_JsonNullable(JsonNullable<Double> width) {
    this.width = width;
  }

  public void setWidth(Double width) {
    this.width = JsonNullable.<Double>of(width);
  }

  public PadesVisualRectangleModel height(Double height) {
    this.height = JsonNullable.<Double>of(height);
    
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Double getHeight() {
        return height.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getHeight_JsonNullable() {
    return height;
  }
  
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  public void setHeight_JsonNullable(JsonNullable<Double> height) {
    this.height = height;
  }

  public void setHeight(Double height) {
    this.height = JsonNullable.<Double>of(height);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PadesVisualRectangleModel padesVisualRectangleModel = (PadesVisualRectangleModel) o;
    return equalsNullable(this.left, padesVisualRectangleModel.left) &&
        equalsNullable(this.top, padesVisualRectangleModel.top) &&
        equalsNullable(this.right, padesVisualRectangleModel.right) &&
        equalsNullable(this.bottom, padesVisualRectangleModel.bottom) &&
        equalsNullable(this.width, padesVisualRectangleModel.width) &&
        equalsNullable(this.height, padesVisualRectangleModel.height);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(left), hashCodeNullable(top), hashCodeNullable(right), hashCodeNullable(bottom), hashCodeNullable(width), hashCodeNullable(height));
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
    sb.append("class PadesVisualRectangleModel {\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

    private PadesVisualRectangleModel instance;

    public Builder() {
      this(new PadesVisualRectangleModel());
    }

    protected Builder(PadesVisualRectangleModel instance) {
      this.instance = instance;
    }

    public PadesVisualRectangleModel.Builder left(Double left) {
      this.instance.left = JsonNullable.<Double>of(left);
      return this;
    }
    public PadesVisualRectangleModel.Builder left(JsonNullable<Double> left) {
      this.instance.left = left;
      return this;
    }
    public PadesVisualRectangleModel.Builder top(Double top) {
      this.instance.top = JsonNullable.<Double>of(top);
      return this;
    }
    public PadesVisualRectangleModel.Builder top(JsonNullable<Double> top) {
      this.instance.top = top;
      return this;
    }
    public PadesVisualRectangleModel.Builder right(Double right) {
      this.instance.right = JsonNullable.<Double>of(right);
      return this;
    }
    public PadesVisualRectangleModel.Builder right(JsonNullable<Double> right) {
      this.instance.right = right;
      return this;
    }
    public PadesVisualRectangleModel.Builder bottom(Double bottom) {
      this.instance.bottom = JsonNullable.<Double>of(bottom);
      return this;
    }
    public PadesVisualRectangleModel.Builder bottom(JsonNullable<Double> bottom) {
      this.instance.bottom = bottom;
      return this;
    }
    public PadesVisualRectangleModel.Builder width(Double width) {
      this.instance.width = JsonNullable.<Double>of(width);
      return this;
    }
    public PadesVisualRectangleModel.Builder width(JsonNullable<Double> width) {
      this.instance.width = width;
      return this;
    }
    public PadesVisualRectangleModel.Builder height(Double height) {
      this.instance.height = JsonNullable.<Double>of(height);
      return this;
    }
    public PadesVisualRectangleModel.Builder height(JsonNullable<Double> height) {
      this.instance.height = height;
      return this;
    }


    /**
    * returns a built PadesVisualRectangleModel instance.
    *
    * The builder is not reusable.
    */
    public PadesVisualRectangleModel build() {
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
  public static PadesVisualRectangleModel.Builder builder() {
    return new PadesVisualRectangleModel.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public PadesVisualRectangleModel.Builder toBuilder() {
    return new PadesVisualRectangleModel.Builder()
      .left(getLeft())
      .top(getTop())
      .right(getRight())
      .bottom(getBottom())
      .width(getWidth())
      .height(getHeight());
  }


}

