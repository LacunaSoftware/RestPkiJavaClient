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
 * FileReferenceModel
 */
@JsonPropertyOrder({
  FileReferenceModel.JSON_PROPERTY_MIME_TYPE,
  FileReferenceModel.JSON_PROPERTY_CONTENT,
  FileReferenceModel.JSON_PROPERTY_BLOB_TOKEN,
  FileReferenceModel.JSON_PROPERTY_URL,
  FileReferenceModel.JSON_PROPERTY_NAME,
  FileReferenceModel.JSON_PROPERTY_LENGTH,
  FileReferenceModel.JSON_PROPERTY_CONTENT_TYPE,
  FileReferenceModel.JSON_PROPERTY_LOCATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class FileReferenceModel {
  public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
  private JsonNullable<String> mimeType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONTENT = "content";
  private JsonNullable<byte[]> content = JsonNullable.<byte[]>undefined();

  public static final String JSON_PROPERTY_BLOB_TOKEN = "blobToken";
  private JsonNullable<String> blobToken = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  private JsonNullable<String> url = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LENGTH = "length";
  private Long length;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "contentType";
  private JsonNullable<String> contentType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOCATION = "location";
  private JsonNullable<String> location = JsonNullable.<String>undefined();

  public FileReferenceModel() {
  }

  public FileReferenceModel mimeType(String mimeType) {
    this.mimeType = JsonNullable.<String>of(mimeType);
    
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getMimeType() {
        return mimeType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMimeType_JsonNullable() {
    return mimeType;
  }
  
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  public void setMimeType_JsonNullable(JsonNullable<String> mimeType) {
    this.mimeType = mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = JsonNullable.<String>of(mimeType);
  }

  public FileReferenceModel content(byte[] content) {
    this.content = JsonNullable.<byte[]>of(content);
    
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public byte[] getContent() {
        return content.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<byte[]> getContent_JsonNullable() {
    return content;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENT)
  public void setContent_JsonNullable(JsonNullable<byte[]> content) {
    this.content = content;
  }

  public void setContent(byte[] content) {
    this.content = JsonNullable.<byte[]>of(content);
  }

  public FileReferenceModel blobToken(String blobToken) {
    this.blobToken = JsonNullable.<String>of(blobToken);
    
    return this;
  }

   /**
   * Get blobToken
   * @return blobToken
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getBlobToken() {
        return blobToken.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BLOB_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBlobToken_JsonNullable() {
    return blobToken;
  }
  
  @JsonProperty(JSON_PROPERTY_BLOB_TOKEN)
  public void setBlobToken_JsonNullable(JsonNullable<String> blobToken) {
    this.blobToken = blobToken;
  }

  public void setBlobToken(String blobToken) {
    this.blobToken = JsonNullable.<String>of(blobToken);
  }

  public FileReferenceModel url(String url) {
    this.url = JsonNullable.<String>of(url);
    
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<String> url) {
    this.url = url;
  }

  public void setUrl(String url) {
    this.url = JsonNullable.<String>of(url);
  }

  public FileReferenceModel name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public FileReferenceModel length(Long length) {
    
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLength() {
    return length;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLength(Long length) {
    this.length = length;
  }

  public FileReferenceModel contentType(String contentType) {
    this.contentType = JsonNullable.<String>of(contentType);
    
    return this;
  }

   /**
   * Get contentType
   * @return contentType
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getContentType() {
        return contentType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getContentType_JsonNullable() {
    return contentType;
  }
  
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  public void setContentType_JsonNullable(JsonNullable<String> contentType) {
    this.contentType = contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = JsonNullable.<String>of(contentType);
  }

  public FileReferenceModel location(String location) {
    this.location = JsonNullable.<String>of(location);
    
    return this;
  }

   /**
   * Get location
   * @return location
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getLocation() {
        return location.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLocation_JsonNullable() {
    return location;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCATION)
  public void setLocation_JsonNullable(JsonNullable<String> location) {
    this.location = location;
  }

  public void setLocation(String location) {
    this.location = JsonNullable.<String>of(location);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileReferenceModel fileReferenceModel = (FileReferenceModel) o;
    return equalsNullable(this.mimeType, fileReferenceModel.mimeType) &&
        equalsNullable(this.content, fileReferenceModel.content) &&
        equalsNullable(this.blobToken, fileReferenceModel.blobToken) &&
        equalsNullable(this.url, fileReferenceModel.url) &&
        equalsNullable(this.name, fileReferenceModel.name) &&
        Objects.equals(this.length, fileReferenceModel.length) &&
        equalsNullable(this.contentType, fileReferenceModel.contentType) &&
        equalsNullable(this.location, fileReferenceModel.location);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(mimeType), hashCodeNullable(content), hashCodeNullable(blobToken), hashCodeNullable(url), hashCodeNullable(name), length, hashCodeNullable(contentType), hashCodeNullable(location));
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
    sb.append("class FileReferenceModel {\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    blobToken: ").append(toIndentedString(blobToken)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

    private FileReferenceModel instance;

    public Builder() {
      this(new FileReferenceModel());
    }

    protected Builder(FileReferenceModel instance) {
      this.instance = instance;
    }

    public FileReferenceModel.Builder mimeType(String mimeType) {
      this.instance.mimeType = JsonNullable.<String>of(mimeType);
      return this;
    }
    public FileReferenceModel.Builder mimeType(JsonNullable<String> mimeType) {
      this.instance.mimeType = mimeType;
      return this;
    }
    public FileReferenceModel.Builder content(byte[] content) {
      this.instance.content = JsonNullable.<byte[]>of(content);
      return this;
    }
    public FileReferenceModel.Builder content(JsonNullable<byte[]> content) {
      this.instance.content = content;
      return this;
    }
    public FileReferenceModel.Builder blobToken(String blobToken) {
      this.instance.blobToken = JsonNullable.<String>of(blobToken);
      return this;
    }
    public FileReferenceModel.Builder blobToken(JsonNullable<String> blobToken) {
      this.instance.blobToken = blobToken;
      return this;
    }
    public FileReferenceModel.Builder url(String url) {
      this.instance.url = JsonNullable.<String>of(url);
      return this;
    }
    public FileReferenceModel.Builder url(JsonNullable<String> url) {
      this.instance.url = url;
      return this;
    }
    public FileReferenceModel.Builder name(String name) {
      this.instance.name = JsonNullable.<String>of(name);
      return this;
    }
    public FileReferenceModel.Builder name(JsonNullable<String> name) {
      this.instance.name = name;
      return this;
    }
    public FileReferenceModel.Builder length(Long length) {
      this.instance.length = length;
      return this;
    }
    public FileReferenceModel.Builder contentType(String contentType) {
      this.instance.contentType = JsonNullable.<String>of(contentType);
      return this;
    }
    public FileReferenceModel.Builder contentType(JsonNullable<String> contentType) {
      this.instance.contentType = contentType;
      return this;
    }
    public FileReferenceModel.Builder location(String location) {
      this.instance.location = JsonNullable.<String>of(location);
      return this;
    }
    public FileReferenceModel.Builder location(JsonNullable<String> location) {
      this.instance.location = location;
      return this;
    }


    /**
    * returns a built FileReferenceModel instance.
    *
    * The builder is not reusable.
    */
    public FileReferenceModel build() {
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
  public static FileReferenceModel.Builder builder() {
    return new FileReferenceModel.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public FileReferenceModel.Builder toBuilder() {
    return new FileReferenceModel.Builder()
      .mimeType(getMimeType())
      .content(getContent())
      .blobToken(getBlobToken())
      .url(getUrl())
      .name(getName())
      .length(getLength())
      .contentType(getContentType())
      .location(getLocation());
  }


}

