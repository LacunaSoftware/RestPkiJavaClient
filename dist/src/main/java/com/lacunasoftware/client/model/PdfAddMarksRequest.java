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
import com.lacunasoftware.client.model.FileModel;
import com.lacunasoftware.client.model.PadesMeasurementUnits;
import com.lacunasoftware.client.model.PadesPageOptimizationModel;
import com.lacunasoftware.client.model.PdfMarkModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PdfAddMarksRequest
 */
@JsonPropertyOrder({
  PdfAddMarksRequest.JSON_PROPERTY_FILE,
  PdfAddMarksRequest.JSON_PROPERTY_MARKS,
  PdfAddMarksRequest.JSON_PROPERTY_ABORT_IF_SIGNED,
  PdfAddMarksRequest.JSON_PROPERTY_MEASUREMENT_UNITS,
  PdfAddMarksRequest.JSON_PROPERTY_PAGE_OPTIMIZATION,
  PdfAddMarksRequest.JSON_PROPERTY_FORCE_BLOB_RESULT,
  PdfAddMarksRequest.JSON_PROPERTY_PRESERVE_SIGNATURES_VISUAL_REPRESENTATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class PdfAddMarksRequest {
  public static final String JSON_PROPERTY_FILE = "file";
  private FileModel _file;

  public static final String JSON_PROPERTY_MARKS = "marks";
  private List<PdfMarkModel> marks = new ArrayList<>();

  public static final String JSON_PROPERTY_ABORT_IF_SIGNED = "abortIfSigned";
  private Boolean abortIfSigned;

  public static final String JSON_PROPERTY_MEASUREMENT_UNITS = "measurementUnits";
  private PadesMeasurementUnits measurementUnits;

  public static final String JSON_PROPERTY_PAGE_OPTIMIZATION = "pageOptimization";
  private PadesPageOptimizationModel pageOptimization;

  public static final String JSON_PROPERTY_FORCE_BLOB_RESULT = "forceBlobResult";
  private Boolean forceBlobResult;

  public static final String JSON_PROPERTY_PRESERVE_SIGNATURES_VISUAL_REPRESENTATION = "preserveSignaturesVisualRepresentation";
  private Boolean preserveSignaturesVisualRepresentation;

  public PdfAddMarksRequest() {
  }

  public PdfAddMarksRequest _file(FileModel _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FileModel getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFile(FileModel _file) {
    this._file = _file;
  }

  public PdfAddMarksRequest marks(List<PdfMarkModel> marks) {
    
    this.marks = marks;
    return this;
  }

  public PdfAddMarksRequest addMarksItem(PdfMarkModel marksItem) {
    if (this.marks == null) {
      this.marks = new ArrayList<>();
    }
    this.marks.add(marksItem);
    return this;
  }

   /**
   * Get marks
   * @return marks
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MARKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<PdfMarkModel> getMarks() {
    return marks;
  }


  @JsonProperty(JSON_PROPERTY_MARKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMarks(List<PdfMarkModel> marks) {
    this.marks = marks;
  }

  public PdfAddMarksRequest abortIfSigned(Boolean abortIfSigned) {
    
    this.abortIfSigned = abortIfSigned;
    return this;
  }

   /**
   * Get abortIfSigned
   * @return abortIfSigned
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ABORT_IF_SIGNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isAbortIfSigned() {
    return abortIfSigned;
  }


  @JsonProperty(JSON_PROPERTY_ABORT_IF_SIGNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbortIfSigned(Boolean abortIfSigned) {
    this.abortIfSigned = abortIfSigned;
  }

  public PdfAddMarksRequest measurementUnits(PadesMeasurementUnits measurementUnits) {
    
    this.measurementUnits = measurementUnits;
    return this;
  }

   /**
   * Get measurementUnits
   * @return measurementUnits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEASUREMENT_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PadesMeasurementUnits getMeasurementUnits() {
    return measurementUnits;
  }


  @JsonProperty(JSON_PROPERTY_MEASUREMENT_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeasurementUnits(PadesMeasurementUnits measurementUnits) {
    this.measurementUnits = measurementUnits;
  }

  public PdfAddMarksRequest pageOptimization(PadesPageOptimizationModel pageOptimization) {
    
    this.pageOptimization = pageOptimization;
    return this;
  }

   /**
   * Get pageOptimization
   * @return pageOptimization
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_OPTIMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PadesPageOptimizationModel getPageOptimization() {
    return pageOptimization;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_OPTIMIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageOptimization(PadesPageOptimizationModel pageOptimization) {
    this.pageOptimization = pageOptimization;
  }

  public PdfAddMarksRequest forceBlobResult(Boolean forceBlobResult) {
    
    this.forceBlobResult = forceBlobResult;
    return this;
  }

   /**
   * Get forceBlobResult
   * @return forceBlobResult
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORCE_BLOB_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isForceBlobResult() {
    return forceBlobResult;
  }


  @JsonProperty(JSON_PROPERTY_FORCE_BLOB_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForceBlobResult(Boolean forceBlobResult) {
    this.forceBlobResult = forceBlobResult;
  }

  public PdfAddMarksRequest preserveSignaturesVisualRepresentation(Boolean preserveSignaturesVisualRepresentation) {
    
    this.preserveSignaturesVisualRepresentation = preserveSignaturesVisualRepresentation;
    return this;
  }

   /**
   * Get preserveSignaturesVisualRepresentation
   * @return preserveSignaturesVisualRepresentation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRESERVE_SIGNATURES_VISUAL_REPRESENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isPreserveSignaturesVisualRepresentation() {
    return preserveSignaturesVisualRepresentation;
  }


  @JsonProperty(JSON_PROPERTY_PRESERVE_SIGNATURES_VISUAL_REPRESENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreserveSignaturesVisualRepresentation(Boolean preserveSignaturesVisualRepresentation) {
    this.preserveSignaturesVisualRepresentation = preserveSignaturesVisualRepresentation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfAddMarksRequest pdfAddMarksRequest = (PdfAddMarksRequest) o;
    return Objects.equals(this._file, pdfAddMarksRequest._file) &&
        Objects.equals(this.marks, pdfAddMarksRequest.marks) &&
        Objects.equals(this.abortIfSigned, pdfAddMarksRequest.abortIfSigned) &&
        Objects.equals(this.measurementUnits, pdfAddMarksRequest.measurementUnits) &&
        Objects.equals(this.pageOptimization, pdfAddMarksRequest.pageOptimization) &&
        Objects.equals(this.forceBlobResult, pdfAddMarksRequest.forceBlobResult) &&
        Objects.equals(this.preserveSignaturesVisualRepresentation, pdfAddMarksRequest.preserveSignaturesVisualRepresentation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, marks, abortIfSigned, measurementUnits, pageOptimization, forceBlobResult, preserveSignaturesVisualRepresentation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfAddMarksRequest {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    marks: ").append(toIndentedString(marks)).append("\n");
    sb.append("    abortIfSigned: ").append(toIndentedString(abortIfSigned)).append("\n");
    sb.append("    measurementUnits: ").append(toIndentedString(measurementUnits)).append("\n");
    sb.append("    pageOptimization: ").append(toIndentedString(pageOptimization)).append("\n");
    sb.append("    forceBlobResult: ").append(toIndentedString(forceBlobResult)).append("\n");
    sb.append("    preserveSignaturesVisualRepresentation: ").append(toIndentedString(preserveSignaturesVisualRepresentation)).append("\n");
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

    private PdfAddMarksRequest instance;

    public Builder() {
      this(new PdfAddMarksRequest());
    }

    protected Builder(PdfAddMarksRequest instance) {
      this.instance = instance;
    }

    public PdfAddMarksRequest.Builder _file(FileModel _file) {
      this.instance._file = _file;
      return this;
    }
    public PdfAddMarksRequest.Builder marks(List<PdfMarkModel> marks) {
      this.instance.marks = marks;
      return this;
    }
    public PdfAddMarksRequest.Builder abortIfSigned(Boolean abortIfSigned) {
      this.instance.abortIfSigned = abortIfSigned;
      return this;
    }
    public PdfAddMarksRequest.Builder measurementUnits(PadesMeasurementUnits measurementUnits) {
      this.instance.measurementUnits = measurementUnits;
      return this;
    }
    public PdfAddMarksRequest.Builder pageOptimization(PadesPageOptimizationModel pageOptimization) {
      this.instance.pageOptimization = pageOptimization;
      return this;
    }
    public PdfAddMarksRequest.Builder forceBlobResult(Boolean forceBlobResult) {
      this.instance.forceBlobResult = forceBlobResult;
      return this;
    }
    public PdfAddMarksRequest.Builder preserveSignaturesVisualRepresentation(Boolean preserveSignaturesVisualRepresentation) {
      this.instance.preserveSignaturesVisualRepresentation = preserveSignaturesVisualRepresentation;
      return this;
    }


    /**
    * returns a built PdfAddMarksRequest instance.
    *
    * The builder is not reusable.
    */
    public PdfAddMarksRequest build() {
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
  public static PdfAddMarksRequest.Builder builder() {
    return new PdfAddMarksRequest.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public PdfAddMarksRequest.Builder toBuilder() {
    return new PdfAddMarksRequest.Builder()
      ._file(getFile())
      .marks(getMarks())
      .abortIfSigned(isAbortIfSigned())
      .measurementUnits(getMeasurementUnits())
      .pageOptimization(getPageOptimization())
      .forceBlobResult(isForceBlobResult())
      .preserveSignaturesVisualRepresentation(isPreserveSignaturesVisualRepresentation());
  }


}

