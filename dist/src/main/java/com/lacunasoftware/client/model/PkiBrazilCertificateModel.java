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
import com.lacunasoftware.client.model.PkiBrazilCertificateTypes;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PkiBrazilCertificateModel
 */
@JsonPropertyOrder({
  PkiBrazilCertificateModel.JSON_PROPERTY_CERTIFICATE_TYPE,
  PkiBrazilCertificateModel.JSON_PROPERTY_CPF,
  PkiBrazilCertificateModel.JSON_PROPERTY_CNPJ,
  PkiBrazilCertificateModel.JSON_PROPERTY_RESPONSAVEL,
  PkiBrazilCertificateModel.JSON_PROPERTY_DATE_OF_BIRTH,
  PkiBrazilCertificateModel.JSON_PROPERTY_COMPANY_NAME,
  PkiBrazilCertificateModel.JSON_PROPERTY_OAB_U_F,
  PkiBrazilCertificateModel.JSON_PROPERTY_OAB_NUMERO,
  PkiBrazilCertificateModel.JSON_PROPERTY_RG_EMISSOR,
  PkiBrazilCertificateModel.JSON_PROPERTY_RG_EMISSOR_U_F,
  PkiBrazilCertificateModel.JSON_PROPERTY_RG_NUMERO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class PkiBrazilCertificateModel {
  public static final String JSON_PROPERTY_CERTIFICATE_TYPE = "certificateType";
  private PkiBrazilCertificateTypes certificateType;

  public static final String JSON_PROPERTY_CPF = "cpf";
  private JsonNullable<String> cpf = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CNPJ = "cnpj";
  private JsonNullable<String> cnpj = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RESPONSAVEL = "responsavel";
  private JsonNullable<String> responsavel = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private JsonNullable<String> dateOfBirth = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private JsonNullable<String> companyName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OAB_U_F = "oabUF";
  private JsonNullable<String> oabUF = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OAB_NUMERO = "oabNumero";
  private JsonNullable<String> oabNumero = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RG_EMISSOR = "rgEmissor";
  private JsonNullable<String> rgEmissor = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RG_EMISSOR_U_F = "rgEmissorUF";
  private JsonNullable<String> rgEmissorUF = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RG_NUMERO = "rgNumero";
  private JsonNullable<String> rgNumero = JsonNullable.<String>undefined();

  public PkiBrazilCertificateModel() {
  }

  public PkiBrazilCertificateModel certificateType(PkiBrazilCertificateTypes certificateType) {
    
    this.certificateType = certificateType;
    return this;
  }

   /**
   * Get certificateType
   * @return certificateType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CERTIFICATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PkiBrazilCertificateTypes getCertificateType() {
    return certificateType;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertificateType(PkiBrazilCertificateTypes certificateType) {
    this.certificateType = certificateType;
  }

  public PkiBrazilCertificateModel cpf(String cpf) {
    this.cpf = JsonNullable.<String>of(cpf);
    
    return this;
  }

   /**
   * Get cpf
   * @return cpf
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getCpf() {
        return cpf.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CPF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCpf_JsonNullable() {
    return cpf;
  }
  
  @JsonProperty(JSON_PROPERTY_CPF)
  public void setCpf_JsonNullable(JsonNullable<String> cpf) {
    this.cpf = cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = JsonNullable.<String>of(cpf);
  }

  public PkiBrazilCertificateModel cnpj(String cnpj) {
    this.cnpj = JsonNullable.<String>of(cnpj);
    
    return this;
  }

   /**
   * Get cnpj
   * @return cnpj
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getCnpj() {
        return cnpj.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CNPJ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCnpj_JsonNullable() {
    return cnpj;
  }
  
  @JsonProperty(JSON_PROPERTY_CNPJ)
  public void setCnpj_JsonNullable(JsonNullable<String> cnpj) {
    this.cnpj = cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = JsonNullable.<String>of(cnpj);
  }

  public PkiBrazilCertificateModel responsavel(String responsavel) {
    this.responsavel = JsonNullable.<String>of(responsavel);
    
    return this;
  }

   /**
   * Get responsavel
   * @return responsavel
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getResponsavel() {
        return responsavel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESPONSAVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getResponsavel_JsonNullable() {
    return responsavel;
  }
  
  @JsonProperty(JSON_PROPERTY_RESPONSAVEL)
  public void setResponsavel_JsonNullable(JsonNullable<String> responsavel) {
    this.responsavel = responsavel;
  }

  public void setResponsavel(String responsavel) {
    this.responsavel = JsonNullable.<String>of(responsavel);
  }

  public PkiBrazilCertificateModel dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = JsonNullable.<String>of(dateOfBirth);
    
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getDateOfBirth() {
        return dateOfBirth.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDateOfBirth_JsonNullable() {
    return dateOfBirth;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  public void setDateOfBirth_JsonNullable(JsonNullable<String> dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = JsonNullable.<String>of(dateOfBirth);
  }

  public PkiBrazilCertificateModel companyName(String companyName) {
    this.companyName = JsonNullable.<String>of(companyName);
    
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getCompanyName() {
        return companyName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCompanyName_JsonNullable() {
    return companyName;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  public void setCompanyName_JsonNullable(JsonNullable<String> companyName) {
    this.companyName = companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = JsonNullable.<String>of(companyName);
  }

  public PkiBrazilCertificateModel oabUF(String oabUF) {
    this.oabUF = JsonNullable.<String>of(oabUF);
    
    return this;
  }

   /**
   * Get oabUF
   * @return oabUF
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getOabUF() {
        return oabUF.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OAB_U_F)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOabUF_JsonNullable() {
    return oabUF;
  }
  
  @JsonProperty(JSON_PROPERTY_OAB_U_F)
  public void setOabUF_JsonNullable(JsonNullable<String> oabUF) {
    this.oabUF = oabUF;
  }

  public void setOabUF(String oabUF) {
    this.oabUF = JsonNullable.<String>of(oabUF);
  }

  public PkiBrazilCertificateModel oabNumero(String oabNumero) {
    this.oabNumero = JsonNullable.<String>of(oabNumero);
    
    return this;
  }

   /**
   * Get oabNumero
   * @return oabNumero
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getOabNumero() {
        return oabNumero.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OAB_NUMERO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOabNumero_JsonNullable() {
    return oabNumero;
  }
  
  @JsonProperty(JSON_PROPERTY_OAB_NUMERO)
  public void setOabNumero_JsonNullable(JsonNullable<String> oabNumero) {
    this.oabNumero = oabNumero;
  }

  public void setOabNumero(String oabNumero) {
    this.oabNumero = JsonNullable.<String>of(oabNumero);
  }

  public PkiBrazilCertificateModel rgEmissor(String rgEmissor) {
    this.rgEmissor = JsonNullable.<String>of(rgEmissor);
    
    return this;
  }

   /**
   * Get rgEmissor
   * @return rgEmissor
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getRgEmissor() {
        return rgEmissor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RG_EMISSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRgEmissor_JsonNullable() {
    return rgEmissor;
  }
  
  @JsonProperty(JSON_PROPERTY_RG_EMISSOR)
  public void setRgEmissor_JsonNullable(JsonNullable<String> rgEmissor) {
    this.rgEmissor = rgEmissor;
  }

  public void setRgEmissor(String rgEmissor) {
    this.rgEmissor = JsonNullable.<String>of(rgEmissor);
  }

  public PkiBrazilCertificateModel rgEmissorUF(String rgEmissorUF) {
    this.rgEmissorUF = JsonNullable.<String>of(rgEmissorUF);
    
    return this;
  }

   /**
   * Get rgEmissorUF
   * @return rgEmissorUF
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getRgEmissorUF() {
        return rgEmissorUF.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RG_EMISSOR_U_F)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRgEmissorUF_JsonNullable() {
    return rgEmissorUF;
  }
  
  @JsonProperty(JSON_PROPERTY_RG_EMISSOR_U_F)
  public void setRgEmissorUF_JsonNullable(JsonNullable<String> rgEmissorUF) {
    this.rgEmissorUF = rgEmissorUF;
  }

  public void setRgEmissorUF(String rgEmissorUF) {
    this.rgEmissorUF = JsonNullable.<String>of(rgEmissorUF);
  }

  public PkiBrazilCertificateModel rgNumero(String rgNumero) {
    this.rgNumero = JsonNullable.<String>of(rgNumero);
    
    return this;
  }

   /**
   * Get rgNumero
   * @return rgNumero
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getRgNumero() {
        return rgNumero.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RG_NUMERO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRgNumero_JsonNullable() {
    return rgNumero;
  }
  
  @JsonProperty(JSON_PROPERTY_RG_NUMERO)
  public void setRgNumero_JsonNullable(JsonNullable<String> rgNumero) {
    this.rgNumero = rgNumero;
  }

  public void setRgNumero(String rgNumero) {
    this.rgNumero = JsonNullable.<String>of(rgNumero);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PkiBrazilCertificateModel pkiBrazilCertificateModel = (PkiBrazilCertificateModel) o;
    return Objects.equals(this.certificateType, pkiBrazilCertificateModel.certificateType) &&
        equalsNullable(this.cpf, pkiBrazilCertificateModel.cpf) &&
        equalsNullable(this.cnpj, pkiBrazilCertificateModel.cnpj) &&
        equalsNullable(this.responsavel, pkiBrazilCertificateModel.responsavel) &&
        equalsNullable(this.dateOfBirth, pkiBrazilCertificateModel.dateOfBirth) &&
        equalsNullable(this.companyName, pkiBrazilCertificateModel.companyName) &&
        equalsNullable(this.oabUF, pkiBrazilCertificateModel.oabUF) &&
        equalsNullable(this.oabNumero, pkiBrazilCertificateModel.oabNumero) &&
        equalsNullable(this.rgEmissor, pkiBrazilCertificateModel.rgEmissor) &&
        equalsNullable(this.rgEmissorUF, pkiBrazilCertificateModel.rgEmissorUF) &&
        equalsNullable(this.rgNumero, pkiBrazilCertificateModel.rgNumero);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateType, hashCodeNullable(cpf), hashCodeNullable(cnpj), hashCodeNullable(responsavel), hashCodeNullable(dateOfBirth), hashCodeNullable(companyName), hashCodeNullable(oabUF), hashCodeNullable(oabNumero), hashCodeNullable(rgEmissor), hashCodeNullable(rgEmissorUF), hashCodeNullable(rgNumero));
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
    sb.append("class PkiBrazilCertificateModel {\n");
    sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    responsavel: ").append(toIndentedString(responsavel)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    oabUF: ").append(toIndentedString(oabUF)).append("\n");
    sb.append("    oabNumero: ").append(toIndentedString(oabNumero)).append("\n");
    sb.append("    rgEmissor: ").append(toIndentedString(rgEmissor)).append("\n");
    sb.append("    rgEmissorUF: ").append(toIndentedString(rgEmissorUF)).append("\n");
    sb.append("    rgNumero: ").append(toIndentedString(rgNumero)).append("\n");
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

    private PkiBrazilCertificateModel instance;

    public Builder() {
      this(new PkiBrazilCertificateModel());
    }

    protected Builder(PkiBrazilCertificateModel instance) {
      this.instance = instance;
    }

    public PkiBrazilCertificateModel.Builder certificateType(PkiBrazilCertificateTypes certificateType) {
      this.instance.certificateType = certificateType;
      return this;
    }
    public PkiBrazilCertificateModel.Builder cpf(String cpf) {
      this.instance.cpf = JsonNullable.<String>of(cpf);
      return this;
    }
    public PkiBrazilCertificateModel.Builder cpf(JsonNullable<String> cpf) {
      this.instance.cpf = cpf;
      return this;
    }
    public PkiBrazilCertificateModel.Builder cnpj(String cnpj) {
      this.instance.cnpj = JsonNullable.<String>of(cnpj);
      return this;
    }
    public PkiBrazilCertificateModel.Builder cnpj(JsonNullable<String> cnpj) {
      this.instance.cnpj = cnpj;
      return this;
    }
    public PkiBrazilCertificateModel.Builder responsavel(String responsavel) {
      this.instance.responsavel = JsonNullable.<String>of(responsavel);
      return this;
    }
    public PkiBrazilCertificateModel.Builder responsavel(JsonNullable<String> responsavel) {
      this.instance.responsavel = responsavel;
      return this;
    }
    public PkiBrazilCertificateModel.Builder dateOfBirth(String dateOfBirth) {
      this.instance.dateOfBirth = JsonNullable.<String>of(dateOfBirth);
      return this;
    }
    public PkiBrazilCertificateModel.Builder dateOfBirth(JsonNullable<String> dateOfBirth) {
      this.instance.dateOfBirth = dateOfBirth;
      return this;
    }
    public PkiBrazilCertificateModel.Builder companyName(String companyName) {
      this.instance.companyName = JsonNullable.<String>of(companyName);
      return this;
    }
    public PkiBrazilCertificateModel.Builder companyName(JsonNullable<String> companyName) {
      this.instance.companyName = companyName;
      return this;
    }
    public PkiBrazilCertificateModel.Builder oabUF(String oabUF) {
      this.instance.oabUF = JsonNullable.<String>of(oabUF);
      return this;
    }
    public PkiBrazilCertificateModel.Builder oabUF(JsonNullable<String> oabUF) {
      this.instance.oabUF = oabUF;
      return this;
    }
    public PkiBrazilCertificateModel.Builder oabNumero(String oabNumero) {
      this.instance.oabNumero = JsonNullable.<String>of(oabNumero);
      return this;
    }
    public PkiBrazilCertificateModel.Builder oabNumero(JsonNullable<String> oabNumero) {
      this.instance.oabNumero = oabNumero;
      return this;
    }
    public PkiBrazilCertificateModel.Builder rgEmissor(String rgEmissor) {
      this.instance.rgEmissor = JsonNullable.<String>of(rgEmissor);
      return this;
    }
    public PkiBrazilCertificateModel.Builder rgEmissor(JsonNullable<String> rgEmissor) {
      this.instance.rgEmissor = rgEmissor;
      return this;
    }
    public PkiBrazilCertificateModel.Builder rgEmissorUF(String rgEmissorUF) {
      this.instance.rgEmissorUF = JsonNullable.<String>of(rgEmissorUF);
      return this;
    }
    public PkiBrazilCertificateModel.Builder rgEmissorUF(JsonNullable<String> rgEmissorUF) {
      this.instance.rgEmissorUF = rgEmissorUF;
      return this;
    }
    public PkiBrazilCertificateModel.Builder rgNumero(String rgNumero) {
      this.instance.rgNumero = JsonNullable.<String>of(rgNumero);
      return this;
    }
    public PkiBrazilCertificateModel.Builder rgNumero(JsonNullable<String> rgNumero) {
      this.instance.rgNumero = rgNumero;
      return this;
    }


    /**
    * returns a built PkiBrazilCertificateModel instance.
    *
    * The builder is not reusable.
    */
    public PkiBrazilCertificateModel build() {
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
  public static PkiBrazilCertificateModel.Builder builder() {
    return new PkiBrazilCertificateModel.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public PkiBrazilCertificateModel.Builder toBuilder() {
    return new PkiBrazilCertificateModel.Builder()
      .certificateType(getCertificateType())
      .cpf(getCpf())
      .cnpj(getCnpj())
      .responsavel(getResponsavel())
      .dateOfBirth(getDateOfBirth())
      .companyName(getCompanyName())
      .oabUF(getOabUF())
      .oabNumero(getOabNumero())
      .rgEmissor(getRgEmissor())
      .rgEmissorUF(getRgEmissorUF())
      .rgNumero(getRgNumero());
  }


}

