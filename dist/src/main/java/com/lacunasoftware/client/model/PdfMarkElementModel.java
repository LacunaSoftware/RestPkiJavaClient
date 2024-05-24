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
import com.lacunasoftware.client.model.PadesHorizontalAlign;
import com.lacunasoftware.client.model.PadesVerticalAlign;
import com.lacunasoftware.client.model.PadesVisualRectangleModel;
import com.lacunasoftware.client.model.PdfMarkElementType;
import com.lacunasoftware.client.model.PdfMarkImageModel;
import com.lacunasoftware.client.model.PdfTextSectionModel;
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
 * PdfMarkElementModel
 */
@JsonPropertyOrder({
  PdfMarkElementModel.JSON_PROPERTY_ELEMENT_TYPE,
  PdfMarkElementModel.JSON_PROPERTY_RELATIVE_CONTAINER,
  PdfMarkElementModel.JSON_PROPERTY_ROTATION,
  PdfMarkElementModel.JSON_PROPERTY_TEXT_SECTIONS,
  PdfMarkElementModel.JSON_PROPERTY_IMAGE,
  PdfMarkElementModel.JSON_PROPERTY_QR_CODE_DATA,
  PdfMarkElementModel.JSON_PROPERTY_QR_CODE_DRAW_QUIET_ZONES,
  PdfMarkElementModel.JSON_PROPERTY_ALIGN,
  PdfMarkElementModel.JSON_PROPERTY_VERTICAL_ALIGN,
  PdfMarkElementModel.JSON_PROPERTY_OPACITY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class PdfMarkElementModel {
  public static final String JSON_PROPERTY_ELEMENT_TYPE = "elementType";
  private PdfMarkElementType elementType;

  public static final String JSON_PROPERTY_RELATIVE_CONTAINER = "relativeContainer";
  private PadesVisualRectangleModel relativeContainer;

  public static final String JSON_PROPERTY_ROTATION = "rotation";
  private Integer rotation;

  public static final String JSON_PROPERTY_TEXT_SECTIONS = "textSections";
  private JsonNullable<List<PdfTextSectionModel>> textSections = JsonNullable.<List<PdfTextSectionModel>>undefined();

  public static final String JSON_PROPERTY_IMAGE = "image";
  private PdfMarkImageModel image;

  public static final String JSON_PROPERTY_QR_CODE_DATA = "qrCodeData";
  private JsonNullable<String> qrCodeData = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_QR_CODE_DRAW_QUIET_ZONES = "qrCodeDrawQuietZones";
  private JsonNullable<Boolean> qrCodeDrawQuietZones = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_ALIGN = "align";
  private PadesHorizontalAlign align;

  public static final String JSON_PROPERTY_VERTICAL_ALIGN = "verticalAlign";
  private PadesVerticalAlign verticalAlign;

  public static final String JSON_PROPERTY_OPACITY = "opacity";
  private JsonNullable<Double> opacity = JsonNullable.<Double>undefined();

  public PdfMarkElementModel() {
  }

  public PdfMarkElementModel elementType(PdfMarkElementType elementType) {
    
    this.elementType = elementType;
    return this;
  }

   /**
   * Get elementType
   * @return elementType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELEMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PdfMarkElementType getElementType() {
    return elementType;
  }


  @JsonProperty(JSON_PROPERTY_ELEMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElementType(PdfMarkElementType elementType) {
    this.elementType = elementType;
  }

  public PdfMarkElementModel relativeContainer(PadesVisualRectangleModel relativeContainer) {
    
    this.relativeContainer = relativeContainer;
    return this;
  }

   /**
   * Get relativeContainer
   * @return relativeContainer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIVE_CONTAINER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PadesVisualRectangleModel getRelativeContainer() {
    return relativeContainer;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE_CONTAINER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelativeContainer(PadesVisualRectangleModel relativeContainer) {
    this.relativeContainer = relativeContainer;
  }

  public PdfMarkElementModel rotation(Integer rotation) {
    
    this.rotation = rotation;
    return this;
  }

   /**
   * Get rotation
   * @return rotation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRotation() {
    return rotation;
  }


  @JsonProperty(JSON_PROPERTY_ROTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRotation(Integer rotation) {
    this.rotation = rotation;
  }

  public PdfMarkElementModel textSections(List<PdfTextSectionModel> textSections) {
    this.textSections = JsonNullable.<List<PdfTextSectionModel>>of(textSections);
    
    return this;
  }

  public PdfMarkElementModel addTextSectionsItem(PdfTextSectionModel textSectionsItem) {
    if (this.textSections == null || !this.textSections.isPresent()) {
      this.textSections = JsonNullable.<List<PdfTextSectionModel>>of(new ArrayList<>());
    }
    try {
      this.textSections.get().add(textSectionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get textSections
   * @return textSections
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<PdfTextSectionModel> getTextSections() {
        return textSections.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEXT_SECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<PdfTextSectionModel>> getTextSections_JsonNullable() {
    return textSections;
  }
  
  @JsonProperty(JSON_PROPERTY_TEXT_SECTIONS)
  public void setTextSections_JsonNullable(JsonNullable<List<PdfTextSectionModel>> textSections) {
    this.textSections = textSections;
  }

  public void setTextSections(List<PdfTextSectionModel> textSections) {
    this.textSections = JsonNullable.<List<PdfTextSectionModel>>of(textSections);
  }

  public PdfMarkElementModel image(PdfMarkImageModel image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PdfMarkImageModel getImage() {
    return image;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImage(PdfMarkImageModel image) {
    this.image = image;
  }

  public PdfMarkElementModel qrCodeData(String qrCodeData) {
    this.qrCodeData = JsonNullable.<String>of(qrCodeData);
    
    return this;
  }

   /**
   * Get qrCodeData
   * @return qrCodeData
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getQrCodeData() {
        return qrCodeData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QR_CODE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getQrCodeData_JsonNullable() {
    return qrCodeData;
  }
  
  @JsonProperty(JSON_PROPERTY_QR_CODE_DATA)
  public void setQrCodeData_JsonNullable(JsonNullable<String> qrCodeData) {
    this.qrCodeData = qrCodeData;
  }

  public void setQrCodeData(String qrCodeData) {
    this.qrCodeData = JsonNullable.<String>of(qrCodeData);
  }

  public PdfMarkElementModel qrCodeDrawQuietZones(Boolean qrCodeDrawQuietZones) {
    this.qrCodeDrawQuietZones = JsonNullable.<Boolean>of(qrCodeDrawQuietZones);
    
    return this;
  }

   /**
   * Get qrCodeDrawQuietZones
   * @return qrCodeDrawQuietZones
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Boolean isQrCodeDrawQuietZones() {
        return qrCodeDrawQuietZones.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QR_CODE_DRAW_QUIET_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> isQrCodeDrawQuietZones_JsonNullable() {
    return qrCodeDrawQuietZones;
  }
  
  @JsonProperty(JSON_PROPERTY_QR_CODE_DRAW_QUIET_ZONES)
  public void setQrCodeDrawQuietZones_JsonNullable(JsonNullable<Boolean> qrCodeDrawQuietZones) {
    this.qrCodeDrawQuietZones = qrCodeDrawQuietZones;
  }

  public void setQrCodeDrawQuietZones(Boolean qrCodeDrawQuietZones) {
    this.qrCodeDrawQuietZones = JsonNullable.<Boolean>of(qrCodeDrawQuietZones);
  }

  public PdfMarkElementModel align(PadesHorizontalAlign align) {
    
    this.align = align;
    return this;
  }

   /**
   * Get align
   * @return align
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PadesHorizontalAlign getAlign() {
    return align;
  }


  @JsonProperty(JSON_PROPERTY_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlign(PadesHorizontalAlign align) {
    this.align = align;
  }

  public PdfMarkElementModel verticalAlign(PadesVerticalAlign verticalAlign) {
    
    this.verticalAlign = verticalAlign;
    return this;
  }

   /**
   * Get verticalAlign
   * @return verticalAlign
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERTICAL_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PadesVerticalAlign getVerticalAlign() {
    return verticalAlign;
  }


  @JsonProperty(JSON_PROPERTY_VERTICAL_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerticalAlign(PadesVerticalAlign verticalAlign) {
    this.verticalAlign = verticalAlign;
  }

  public PdfMarkElementModel opacity(Double opacity) {
    this.opacity = JsonNullable.<Double>of(opacity);
    
    return this;
  }

   /**
   * Get opacity
   * @return opacity
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Double getOpacity() {
        return opacity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getOpacity_JsonNullable() {
    return opacity;
  }
  
  @JsonProperty(JSON_PROPERTY_OPACITY)
  public void setOpacity_JsonNullable(JsonNullable<Double> opacity) {
    this.opacity = opacity;
  }

  public void setOpacity(Double opacity) {
    this.opacity = JsonNullable.<Double>of(opacity);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfMarkElementModel pdfMarkElementModel = (PdfMarkElementModel) o;
    return Objects.equals(this.elementType, pdfMarkElementModel.elementType) &&
        Objects.equals(this.relativeContainer, pdfMarkElementModel.relativeContainer) &&
        Objects.equals(this.rotation, pdfMarkElementModel.rotation) &&
        equalsNullable(this.textSections, pdfMarkElementModel.textSections) &&
        Objects.equals(this.image, pdfMarkElementModel.image) &&
        equalsNullable(this.qrCodeData, pdfMarkElementModel.qrCodeData) &&
        equalsNullable(this.qrCodeDrawQuietZones, pdfMarkElementModel.qrCodeDrawQuietZones) &&
        Objects.equals(this.align, pdfMarkElementModel.align) &&
        Objects.equals(this.verticalAlign, pdfMarkElementModel.verticalAlign) &&
        equalsNullable(this.opacity, pdfMarkElementModel.opacity);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementType, relativeContainer, rotation, hashCodeNullable(textSections), image, hashCodeNullable(qrCodeData), hashCodeNullable(qrCodeDrawQuietZones), align, verticalAlign, hashCodeNullable(opacity));
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
    sb.append("class PdfMarkElementModel {\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    relativeContainer: ").append(toIndentedString(relativeContainer)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    textSections: ").append(toIndentedString(textSections)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    qrCodeData: ").append(toIndentedString(qrCodeData)).append("\n");
    sb.append("    qrCodeDrawQuietZones: ").append(toIndentedString(qrCodeDrawQuietZones)).append("\n");
    sb.append("    align: ").append(toIndentedString(align)).append("\n");
    sb.append("    verticalAlign: ").append(toIndentedString(verticalAlign)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
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

    private PdfMarkElementModel instance;

    public Builder() {
      this(new PdfMarkElementModel());
    }

    protected Builder(PdfMarkElementModel instance) {
      this.instance = instance;
    }

    public PdfMarkElementModel.Builder elementType(PdfMarkElementType elementType) {
      this.instance.elementType = elementType;
      return this;
    }
    public PdfMarkElementModel.Builder relativeContainer(PadesVisualRectangleModel relativeContainer) {
      this.instance.relativeContainer = relativeContainer;
      return this;
    }
    public PdfMarkElementModel.Builder rotation(Integer rotation) {
      this.instance.rotation = rotation;
      return this;
    }
    public PdfMarkElementModel.Builder textSections(List<PdfTextSectionModel> textSections) {
      this.instance.textSections = JsonNullable.<List<PdfTextSectionModel>>of(textSections);
      return this;
    }
    public PdfMarkElementModel.Builder textSections(JsonNullable<List<PdfTextSectionModel>> textSections) {
      this.instance.textSections = textSections;
      return this;
    }
    public PdfMarkElementModel.Builder image(PdfMarkImageModel image) {
      this.instance.image = image;
      return this;
    }
    public PdfMarkElementModel.Builder qrCodeData(String qrCodeData) {
      this.instance.qrCodeData = JsonNullable.<String>of(qrCodeData);
      return this;
    }
    public PdfMarkElementModel.Builder qrCodeData(JsonNullable<String> qrCodeData) {
      this.instance.qrCodeData = qrCodeData;
      return this;
    }
    public PdfMarkElementModel.Builder qrCodeDrawQuietZones(Boolean qrCodeDrawQuietZones) {
      this.instance.qrCodeDrawQuietZones = JsonNullable.<Boolean>of(qrCodeDrawQuietZones);
      return this;
    }
    public PdfMarkElementModel.Builder qrCodeDrawQuietZones(JsonNullable<Boolean> qrCodeDrawQuietZones) {
      this.instance.qrCodeDrawQuietZones = qrCodeDrawQuietZones;
      return this;
    }
    public PdfMarkElementModel.Builder align(PadesHorizontalAlign align) {
      this.instance.align = align;
      return this;
    }
    public PdfMarkElementModel.Builder verticalAlign(PadesVerticalAlign verticalAlign) {
      this.instance.verticalAlign = verticalAlign;
      return this;
    }
    public PdfMarkElementModel.Builder opacity(Double opacity) {
      this.instance.opacity = JsonNullable.<Double>of(opacity);
      return this;
    }
    public PdfMarkElementModel.Builder opacity(JsonNullable<Double> opacity) {
      this.instance.opacity = opacity;
      return this;
    }


    /**
    * returns a built PdfMarkElementModel instance.
    *
    * The builder is not reusable.
    */
    public PdfMarkElementModel build() {
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
  public static PdfMarkElementModel.Builder builder() {
    return new PdfMarkElementModel.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public PdfMarkElementModel.Builder toBuilder() {
    return new PdfMarkElementModel.Builder()
      .elementType(getElementType())
      .relativeContainer(getRelativeContainer())
      .rotation(getRotation())
      .textSections(getTextSections())
      .image(getImage())
      .qrCodeData(getQrCodeData())
      .qrCodeDrawQuietZones(isQrCodeDrawQuietZones())
      .align(getAlign())
      .verticalAlign(getVerticalAlign())
      .opacity(getOpacity());
  }


}

