# restpki-ng-client-java

Rest PKI Core API

- API version: 2.2.2

- Generator version: 7.6.0

<b><i>Para Português, <a href=\"https://docs.lacunasoftware.com/pt-br/articles/rest-pki/core/integration/get-started\">clique aqui</a></i></b>
<p>
 <a href=\"https://docs.lacunasoftware.com/en-us/articles/rest-pki/core/\">Rest PKI Core</a> is an upcoming version of
 <a href=\"https://docs.lacunasoftware.com/en-us/articles/rest-pki/\">Rest PKI</a> that will have extended compatibility with environments and databases.
</p>
<p>
 In addition to Windows Server (which is already supported by Rest PKI), Rest PKI Core will also run on <b>Linux</b> (Debian- and RedHat-based distributions)
 and on <b>Docker</b>. As for database servers, in addition to SQL Server, <b>PostgreSQL</b> will also be supported.
</p>
<p>
 <b>Before getting started, see the integration overview on the <a href=\"https://docs.lacunasoftware.com/en-us/articles/rest-pki/core/integration/\">Integration Guide</a></b>
</p>
<p>
 For questions regarding the usage of this API, please reach us at <a href=\"https://lacuna.help/\">lacuna.help</a>
</p>

<h2>Parameters</h2>
<p>
 You will need the following parameters:
</p>
<ul>
 <li><b>Endpoint</b>: address of the Rest PKI Core instance that will be used</li>
 <li><b>API Key</b>: authorization key for using the API</li>
</ul>
<p>
 The <span class=\"model\">endpoint</span> must be prefixed to all relative URLs mentioned here. As for the <span class=\"model\">API Key</span>, see how to use it below.
</p>

<h2>Authentication</h2>
<p>
 The API key must be sent on the <span class=\"model\">X-Api-Key</span> header on each request:
</p>

<!-- unfortunately, class \"example microlight\" doesn't seem to work here -->
<pre style=\"font-size: 12px; padding: 10px; border-radius: 4px; background: #41444e; font-weight: 600; color: #fff;\">
X-Api-Key: yourapp|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
</pre>

<h2>HTTP Codes</h2>

<p>
 The APIs will return the following HTTP codes:
</p>

<table>
 <thead>
  <tr>
   <th>Code</th>
   <th>Description</th>
  </tr>
 </thead>
 <tbody>
  <tr>
   <td><strong class=\"model-title\">200 (OK)</strong></td>
   <td>Request processed successfully. The response is different for each API, please refer to the operation's documentation</td>
  </tr>
  <tr>
   <td><strong class=\"model-title\">400 (Bad Request)</strong></td>
   <td>Syntax error. For instance, when a required field was not provided</td>
  </tr>
  <tr>
   <td><strong class=\"model-title\">401 (Unauthorized)</strong></td>
   <td>API key not provided or invalid</td>
  </tr>
  <tr>
   <td><strong class=\"model-title\">403 (Forbidden)</strong></td>
   <td>API key is valid, but the application has insufficient permissions to complete the requested operation</td>
  </tr>
  <tr>
   <td><strong class=\"model-title\">422 (Unprocessable Entity)</strong></td>
   <td>API error. The response body is an <a href=\"#model-ErrorModelV2\" class=\"model\">ErrorModelV2</a>
  </tr>
  <tr>
   <td><strong class=\"model-title\">500 (Internal Server Error)</strong></td>
   <td>An unexpected error occurred. The <span class=\"model\">exceptionCode</span> contained on the response body may be of help for our support team during diagnostic.</td>
  </tr>
 </tbody>
</table>

<h3>Error Codes</h3>

<p>
 Some of the error codes returned in the <span class=\"model\">code</span> field of an <a href=\"#model-ErrorModelV2\" class=\"model\">ErrorModelV2</a>
 (body of responses with HTTP status code 422) are provided below*:
</p>

<table>
 <thead>
  <tr>
   <th>Code</th>
   <th>Description</th>
  </tr>
 </thead>
 <tbody>
  <tr>
   <td class=\"model\">DocumentNotFound</td>
   <td>A referenced document was not found (check the document ID)</td>
  </tr>
  <tr>
   <td class=\"model\">SecurityContextNotFound</td>
   <td>A referenced security context was not found (check the security context ID)</td>
  </tr>
  <tr>
   <td class=\"model\">SignatureSessionNotFound</td>
   <td>A referenced signature session was not found (check the signature session ID)</td>
  </tr>
  <tr>
   <td class=\"model\">BadSignatureSessionOperation</td>
   <td>The operation is invalid for the current signature session or document status. For instance, trying to await the session's completion if it is still <span class=\"model\">Pending</span> results in this error</td>
  </tr>
  <tr>
   <td class=\"model\">BackgroundProcessing</td>
   <td>The operation cannot be completed at this time because the resource is being processed in background</td>
  </tr>
  <tr>
   <td class=\"model\">SignatureSessionTokenRequired</td>
   <td>The signature session token was not passed on the <span class=\"model\">X-Signature-Session-Token</span> request header</td>
  </tr>
  <tr>
   <td class=\"model\">BadSignatureSessionToken</td>
   <td>An invalid signature session token was passed on the <span class=\"model\">X-Signature-Session-Token</span> request header. Check your application for possible corruption of the session token, which may contain characters <span class=\"code\">-</span> (hyphen) and <span class=\"code\">_</span> (underscore)</td>
  </tr>
  <tr>
   <td class=\"model\">ExpiredSignatureSessionToken</td>
   <td>An expired signature session token was passed on the <span class=\"model\">X-Signature-Session-Token</span> request header. Signature session tokens are normally valid for 4 hours.</td>
  </tr>
 </tbody>
</table>

<p style=\"font-size: 0.9em\">
 *The codes shown above are the most common error codes. Nonetheless, this list is not comprehensive. New codes may be added anytime without previous warning.
</p>

<h2>Culture / Internationalization (i18n)</h2>
<p>The <span class=\"model\">Accept-Language</span> request header is observed by this API. The following cultures are supported:</p>
<ul>
 <li><span class=\"code\">en-US</span> (or simply <span class=\"code\">en</span>)</li>
 <li><span class=\"code\">pt-BR</span> (or simply <span class=\"code\">pt</span>)</li>
</ul>
<p><i>Notice: error messages are not affected by this header and therefore should not be displayed to users, being better suited for logging.</i></p>



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 17+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.lacunasoftware</groupId>
  <artifactId>restpki-ng-client-java</artifactId>
  <version>0.9.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'restpki-ng-client-java' jar has been published to maven central.
    mavenLocal()       // Needed if the 'restpki-ng-client-java' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.lacunasoftware:restpki-ng-client-java:0.9.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/restpki-ng-client-java-0.9.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.lacunasoftware.client.*;
import com.lacunasoftware.client.auth.*;
import com.lacunasoftware.client.model.*;
import com.lacunasoftware.client.api.AuthenticationApi;

public class AuthenticationApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        try {
            AuthenticationGetResponse result = apiInstance.apiAuthenticationGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#apiAuthenticationGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**apiAuthenticationGet**](docs/AuthenticationApi.md#apiAuthenticationGet) | **GET** /Api/Authentication | 
*AuthenticationApi* | [**apiAuthenticationPost**](docs/AuthenticationApi.md#apiAuthenticationPost) | **POST** /Api/Authentication | 
*AuthenticationApi* | [**apiAuthenticationsPost**](docs/AuthenticationApi.md#apiAuthenticationsPost) | **POST** /Api/Authentications | 
*AuthenticationApi* | [**apiAuthenticationsTokenFinalizePost**](docs/AuthenticationApi.md#apiAuthenticationsTokenFinalizePost) | **POST** /Api/Authentications/{token}/Finalize | 
*AuthenticationApi* | [**apiAuthenticationsTokenSignedBytesPost**](docs/AuthenticationApi.md#apiAuthenticationsTokenSignedBytesPost) | **POST** /Api/Authentications/{token}/SignedBytes | 
*AuthenticationApi* | [**apiV2AuthenticationCompletionPost**](docs/AuthenticationApi.md#apiV2AuthenticationCompletionPost) | **POST** /api/v2/authentication/completion | Completes a certificate authentication
*AuthenticationApi* | [**apiV2AuthenticationPost**](docs/AuthenticationApi.md#apiV2AuthenticationPost) | **POST** /api/v2/authentication | Prepares for a certificate authentication
*CadesSignatureApi* | [**apiCadesSignaturesOpenPost**](docs/CadesSignatureApi.md#apiCadesSignaturesOpenPost) | **POST** /Api/CadesSignatures/Open | 
*CadesSignatureApi* | [**apiCadesSignaturesPost**](docs/CadesSignatureApi.md#apiCadesSignaturesPost) | **POST** /Api/CadesSignatures | 
*CadesSignatureApi* | [**apiCadesSignaturesRequiredHashesPost**](docs/CadesSignatureApi.md#apiCadesSignaturesRequiredHashesPost) | **POST** /Api/CadesSignatures/RequiredHashes | 
*CadesSignatureApi* | [**apiCadesSignaturesTokenFinalizePost**](docs/CadesSignatureApi.md#apiCadesSignaturesTokenFinalizePost) | **POST** /Api/CadesSignatures/{token}/Finalize | 
*CadesSignatureApi* | [**apiCadesSignaturesTokenSignedBytesPost**](docs/CadesSignatureApi.md#apiCadesSignaturesTokenSignedBytesPost) | **POST** /Api/CadesSignatures/{token}/SignedBytes | 
*CadesSignatureApi* | [**apiV2CadesSignaturesPost**](docs/CadesSignatureApi.md#apiV2CadesSignaturesPost) | **POST** /Api/v2/CadesSignatures | 
*CadesSignatureApi* | [**apiV2CadesSignaturesTokenSignedBytesPost**](docs/CadesSignatureApi.md#apiV2CadesSignaturesTokenSignedBytesPost) | **POST** /Api/v2/CadesSignatures/{token}/SignedBytes | 
*CadesSignatureApi* | [**apiV3CadesSignaturesPost**](docs/CadesSignatureApi.md#apiV3CadesSignaturesPost) | **POST** /Api/v3/CadesSignatures | 
*DocumentKeysApi* | [**apiDocumentKeysBatchPost**](docs/DocumentKeysApi.md#apiDocumentKeysBatchPost) | **POST** /api/document-keys/batch | Allocates a batch of document keys to be used later on document signatures
*DocumentKeysApi* | [**apiDocumentKeysKeyGet**](docs/DocumentKeysApi.md#apiDocumentKeysKeyGet) | **GET** /api/document-keys/{key} | Queries documents by key
*DocumentKeysApi* | [**apiDocumentKeysPost**](docs/DocumentKeysApi.md#apiDocumentKeysPost) | **POST** /api/document-keys | Allocates a document key to be used later on a document signature
*DocumentKeysApi* | [**apiDocumentKeysUnusedGet**](docs/DocumentKeysApi.md#apiDocumentKeysUnusedGet) | **GET** /api/document-keys/unused | Queries unused document keys
*DocumentsApi* | [**apiDocumentsIdGet**](docs/DocumentsApi.md#apiDocumentsIdGet) | **GET** /api/documents/{id} | Retrieves a document&#39;s details
*DocumentsApi* | [**apiDocumentsIdSignersGet**](docs/DocumentsApi.md#apiDocumentsIdSignersGet) | **GET** /api/documents/{id}/signers | Retrieves the full information about each of a document&#39;s signers
*DocumentsApi* | [**apiDocumentsKeysKeyGet**](docs/DocumentsApi.md#apiDocumentsKeysKeyGet) | **GET** /api/documents/keys/{key} | Finds a document&#39;s details by its key
*PadesSignatureApi* | [**apiPadesSignaturesOpenPost**](docs/PadesSignatureApi.md#apiPadesSignaturesOpenPost) | **POST** /Api/PadesSignatures/Open | 
*PadesSignatureApi* | [**apiPadesSignaturesPost**](docs/PadesSignatureApi.md#apiPadesSignaturesPost) | **POST** /Api/PadesSignatures | 
*PadesSignatureApi* | [**apiPadesSignaturesTokenFinalizePost**](docs/PadesSignatureApi.md#apiPadesSignaturesTokenFinalizePost) | **POST** /Api/PadesSignatures/{token}/Finalize | 
*PadesSignatureApi* | [**apiPadesSignaturesTokenSignedBytesPost**](docs/PadesSignatureApi.md#apiPadesSignaturesTokenSignedBytesPost) | **POST** /Api/PadesSignatures/{token}/SignedBytes | 
*PadesSignatureApi* | [**apiV2PadesSignaturesPost**](docs/PadesSignatureApi.md#apiV2PadesSignaturesPost) | **POST** /Api/v2/PadesSignatures | 
*PadesSignatureApi* | [**apiV2PadesSignaturesTokenSignedBytesPost**](docs/PadesSignatureApi.md#apiV2PadesSignaturesTokenSignedBytesPost) | **POST** /Api/v2/PadesSignatures/{token}/SignedBytes | 
*PadesVisualPositioningPresetsApi* | [**apiPadesVisualPositioningPresetsFootnoteBottomUpGet**](docs/PadesVisualPositioningPresetsApi.md#apiPadesVisualPositioningPresetsFootnoteBottomUpGet) | **GET** /Api/PadesVisualPositioningPresets/FootnoteBottomUp | 
*PadesVisualPositioningPresetsApi* | [**apiPadesVisualPositioningPresetsFootnoteGet**](docs/PadesVisualPositioningPresetsApi.md#apiPadesVisualPositioningPresetsFootnoteGet) | **GET** /Api/PadesVisualPositioningPresets/Footnote | 
*PadesVisualPositioningPresetsApi* | [**apiPadesVisualPositioningPresetsNewPageGet**](docs/PadesVisualPositioningPresetsApi.md#apiPadesVisualPositioningPresetsNewPageGet) | **GET** /Api/PadesVisualPositioningPresets/NewPage | 
*PdfApi* | [**apiPdfAddMarksPost**](docs/PdfApi.md#apiPdfAddMarksPost) | **POST** /Api/Pdf/AddMarks | 
*PdfApi* | [**apiPdfStampPost**](docs/PdfApi.md#apiPdfStampPost) | **POST** /api/pdf/stamp | 
*SignatureApi* | [**apiSignatureCompletionPost**](docs/SignatureApi.md#apiSignatureCompletionPost) | **POST** /api/signature/completion | 
*SignatureApi* | [**apiSignaturePost**](docs/SignatureApi.md#apiSignaturePost) | **POST** /api/signature | 
*SignatureInspectionApi* | [**apiSignatureInspectionPut**](docs/SignatureInspectionApi.md#apiSignatureInspectionPut) | **PUT** /api/signature-inspection | Inspects a signed file, returning information about its signers and metadata about the corresponding document (if signed on this instance)
*SignatureSessionsApi* | [**apiSignatureSessionsIdGet**](docs/SignatureSessionsApi.md#apiSignatureSessionsIdGet) | **GET** /api/signature-sessions/{id} | Retrieves a signature session&#39;s details
*SignatureSessionsApi* | [**apiSignatureSessionsIdWhenCompletedGet**](docs/SignatureSessionsApi.md#apiSignatureSessionsIdWhenCompletedGet) | **GET** /api/signature-sessions/{id}/when-completed | Waits for the completion of a signature session
*SignatureSessionsApi* | [**apiSignatureSessionsPost**](docs/SignatureSessionsApi.md#apiSignatureSessionsPost) | **POST** /api/signature-sessions | Creates a signature session
*TimestampApi* | [**apiTimestampPlansIdentifierIssuePost**](docs/TimestampApi.md#apiTimestampPlansIdentifierIssuePost) | **POST** /Api/TimestampPlans/{identifier}/Issue | 
*TimestampApi* | [**apiTspIdentifierPost**](docs/TimestampApi.md#apiTspIdentifierPost) | **POST** /api/tsp/{identifier} | 
*UploadApi* | [**apiMultipartUploadsPost**](docs/UploadApi.md#apiMultipartUploadsPost) | **POST** /Api/MultipartUploads | 
*UploadApi* | [**apiMultipartUploadsTokenPartNumberPost**](docs/UploadApi.md#apiMultipartUploadsTokenPartNumberPost) | **POST** /Api/MultipartUploads/{token}/{partNumber} | 
*UploadApi* | [**apiMultipartUploadsTokenPost**](docs/UploadApi.md#apiMultipartUploadsTokenPost) | **POST** /Api/MultipartUploads/{token} | 
*UploadApi* | [**apiPlainUploadsPost**](docs/UploadApi.md#apiPlainUploadsPost) | **POST** /api/plain-uploads | 
*XmlSignatureApi* | [**apiV2XmlSignaturesOpenPost**](docs/XmlSignatureApi.md#apiV2XmlSignaturesOpenPost) | **POST** /Api/v2/XmlSignatures/Open | 
*XmlSignatureApi* | [**apiXmlSignaturesFullXmlSignaturePost**](docs/XmlSignatureApi.md#apiXmlSignaturesFullXmlSignaturePost) | **POST** /Api/XmlSignatures/FullXmlSignature | 
*XmlSignatureApi* | [**apiXmlSignaturesOpenPost**](docs/XmlSignatureApi.md#apiXmlSignaturesOpenPost) | **POST** /Api/XmlSignatures/Open | 
*XmlSignatureApi* | [**apiXmlSignaturesTokenFinalizePost**](docs/XmlSignatureApi.md#apiXmlSignaturesTokenFinalizePost) | **POST** /Api/XmlSignatures/{token}/Finalize | 
*XmlSignatureApi* | [**apiXmlSignaturesTokenSignedBytesPost**](docs/XmlSignatureApi.md#apiXmlSignaturesTokenSignedBytesPost) | **POST** /Api/XmlSignatures/{token}/SignedBytes | 
*XmlSignatureApi* | [**apiXmlSignaturesXmlElementSignaturePost**](docs/XmlSignatureApi.md#apiXmlSignaturesXmlElementSignaturePost) | **POST** /Api/XmlSignatures/XmlElementSignature | 


## Documentation for Models

 - [AllocateDocumentKeyBatchRequest](docs/AllocateDocumentKeyBatchRequest.md)
 - [AllocateDocumentKeyRequest](docs/AllocateDocumentKeyRequest.md)
 - [AttributeCertificateModel](docs/AttributeCertificateModel.md)
 - [AuditPackageOptions](docs/AuditPackageOptions.md)
 - [AuthenticationFailures](docs/AuthenticationFailures.md)
 - [AuthenticationGetResponse](docs/AuthenticationGetResponse.md)
 - [AuthenticationPostRequest](docs/AuthenticationPostRequest.md)
 - [AuthenticationPostResponse](docs/AuthenticationPostResponse.md)
 - [AuthenticationsPostRequest](docs/AuthenticationsPostRequest.md)
 - [AuthenticationsPostResponse](docs/AuthenticationsPostResponse.md)
 - [AuthenticationsPostSignedBytesRequest](docs/AuthenticationsPostSignedBytesRequest.md)
 - [AuthenticationsPostSignedBytesResponse](docs/AuthenticationsPostSignedBytesResponse.md)
 - [AutoPositioningHorizontalDirections](docs/AutoPositioningHorizontalDirections.md)
 - [AutoPositioningVerticalDirections](docs/AutoPositioningVerticalDirections.md)
 - [Blockchains](docs/Blockchains.md)
 - [CadesSignatureModel](docs/CadesSignatureModel.md)
 - [CadesSignaturePostRequestV1](docs/CadesSignaturePostRequestV1.md)
 - [CadesSignaturePostRequestV2](docs/CadesSignaturePostRequestV2.md)
 - [CadesSignaturePostRequestV3](docs/CadesSignaturePostRequestV3.md)
 - [CadesSignaturePostResponse](docs/CadesSignaturePostResponse.md)
 - [CadesSignaturePostSignedBytesRequest](docs/CadesSignaturePostSignedBytesRequest.md)
 - [CadesSignaturePostSignedBytesResponse](docs/CadesSignaturePostSignedBytesResponse.md)
 - [CadesSignerModel](docs/CadesSignerModel.md)
 - [CadesTimestampModel](docs/CadesTimestampModel.md)
 - [CertificateModel](docs/CertificateModel.md)
 - [CertificateReferenceModel](docs/CertificateReferenceModel.md)
 - [CertificateRequirement](docs/CertificateRequirement.md)
 - [CertificateRequirementTypes](docs/CertificateRequirementTypes.md)
 - [CertificateSummary](docs/CertificateSummary.md)
 - [CertifiedAttributeModel](docs/CertifiedAttributeModel.md)
 - [CertifiedAttributeTypes](docs/CertifiedAttributeTypes.md)
 - [CmsContentTypes](docs/CmsContentTypes.md)
 - [CmsSignatureOptions](docs/CmsSignatureOptions.md)
 - [ColorModel](docs/ColorModel.md)
 - [CommitmentTypeModel](docs/CommitmentTypeModel.md)
 - [CompleteAuthenticationRequest](docs/CompleteAuthenticationRequest.md)
 - [CompleteAuthenticationResponse](docs/CompleteAuthenticationResponse.md)
 - [CompleteSignatureRequest](docs/CompleteSignatureRequest.md)
 - [CompleteSignatureRequestV2](docs/CompleteSignatureRequestV2.md)
 - [CreateSignatureSessionRequest](docs/CreateSignatureSessionRequest.md)
 - [CreateSignatureSessionResponse](docs/CreateSignatureSessionResponse.md)
 - [DigestAlgorithmAndValueModel](docs/DigestAlgorithmAndValueModel.md)
 - [DigestAlgorithms](docs/DigestAlgorithms.md)
 - [DocumentFileModel](docs/DocumentFileModel.md)
 - [DocumentKeyModel](docs/DocumentKeyModel.md)
 - [DocumentKeyQueryResponse](docs/DocumentKeyQueryResponse.md)
 - [DocumentKeySummary](docs/DocumentKeySummary.md)
 - [DocumentModel](docs/DocumentModel.md)
 - [DocumentQueryResponse](docs/DocumentQueryResponse.md)
 - [DocumentStatus](docs/DocumentStatus.md)
 - [DocumentSummary](docs/DocumentSummary.md)
 - [ErrorModelV2](docs/ErrorModelV2.md)
 - [FileModel](docs/FileModel.md)
 - [FileReferenceModel](docs/FileReferenceModel.md)
 - [FullXmlSignaturePostRequest](docs/FullXmlSignaturePostRequest.md)
 - [GeneralNameChoices](docs/GeneralNameChoices.md)
 - [GeneralNameModel](docs/GeneralNameModel.md)
 - [HolderTypes](docs/HolderTypes.md)
 - [InspectSignatureFailures](docs/InspectSignatureFailures.md)
 - [InspectSignatureRequest](docs/InspectSignatureRequest.md)
 - [InspectSignatureResponse](docs/InspectSignatureResponse.md)
 - [MultipartUploadBeginResponse](docs/MultipartUploadBeginResponse.md)
 - [MultipartUploadEndRequest](docs/MultipartUploadEndRequest.md)
 - [NameModel](docs/NameModel.md)
 - [NamespaceModel](docs/NamespaceModel.md)
 - [OpenCadesSignatureRequestModel](docs/OpenCadesSignatureRequestModel.md)
 - [OpenSignatureRequestModel](docs/OpenSignatureRequestModel.md)
 - [OpenXmlSignatureRequestModel](docs/OpenXmlSignatureRequestModel.md)
 - [OtherNameModel](docs/OtherNameModel.md)
 - [PadesCertificationLevel](docs/PadesCertificationLevel.md)
 - [PadesHorizontalAlign](docs/PadesHorizontalAlign.md)
 - [PadesMeasurementUnits](docs/PadesMeasurementUnits.md)
 - [PadesPageOptimizationModel](docs/PadesPageOptimizationModel.md)
 - [PadesSignatureModel](docs/PadesSignatureModel.md)
 - [PadesSignaturePostRequestV1](docs/PadesSignaturePostRequestV1.md)
 - [PadesSignaturePostRequestV2](docs/PadesSignaturePostRequestV2.md)
 - [PadesSignaturePostResponse](docs/PadesSignaturePostResponse.md)
 - [PadesSignaturePostSignedBytesRequest](docs/PadesSignaturePostSignedBytesRequest.md)
 - [PadesSignaturePostSignedBytesResponse](docs/PadesSignaturePostSignedBytesResponse.md)
 - [PadesSignerModel](docs/PadesSignerModel.md)
 - [PadesSizeModel](docs/PadesSizeModel.md)
 - [PadesTextHorizontalAlign](docs/PadesTextHorizontalAlign.md)
 - [PadesVerticalAlign](docs/PadesVerticalAlign.md)
 - [PadesVisualAutoPositioningModel](docs/PadesVisualAutoPositioningModel.md)
 - [PadesVisualImageModel](docs/PadesVisualImageModel.md)
 - [PadesVisualPositioningModel](docs/PadesVisualPositioningModel.md)
 - [PadesVisualRectangleModel](docs/PadesVisualRectangleModel.md)
 - [PadesVisualRepresentationModel](docs/PadesVisualRepresentationModel.md)
 - [PadesVisualTextModel](docs/PadesVisualTextModel.md)
 - [PageOrientations](docs/PageOrientations.md)
 - [PaperSizes](docs/PaperSizes.md)
 - [PdfAddMarksRequest](docs/PdfAddMarksRequest.md)
 - [PdfAddMarksResponse](docs/PdfAddMarksResponse.md)
 - [PdfMarkElementModel](docs/PdfMarkElementModel.md)
 - [PdfMarkElementType](docs/PdfMarkElementType.md)
 - [PdfMarkImageModel](docs/PdfMarkImageModel.md)
 - [PdfMarkModel](docs/PdfMarkModel.md)
 - [PdfMarkPageOptions](docs/PdfMarkPageOptions.md)
 - [PdfSignatureOptions](docs/PdfSignatureOptions.md)
 - [PdfTextSectionModel](docs/PdfTextSectionModel.md)
 - [PdfTextStyle](docs/PdfTextStyle.md)
 - [PkiBrazilCertificateModel](docs/PkiBrazilCertificateModel.md)
 - [PkiBrazilCertificateTypes](docs/PkiBrazilCertificateTypes.md)
 - [PkiItalyCertificateModel](docs/PkiItalyCertificateModel.md)
 - [PkiItalyCertificateTypes](docs/PkiItalyCertificateTypes.md)
 - [PrepareAuthenticationRequest](docs/PrepareAuthenticationRequest.md)
 - [PrepareAuthenticationResponse](docs/PrepareAuthenticationResponse.md)
 - [PrepareSignatureFailures](docs/PrepareSignatureFailures.md)
 - [PrepareSignatureRequest](docs/PrepareSignatureRequest.md)
 - [PrepareSignatureResponse](docs/PrepareSignatureResponse.md)
 - [ResourceContentOrReference](docs/ResourceContentOrReference.md)
 - [RoleAttributeModel](docs/RoleAttributeModel.md)
 - [SessionCompletionStatus](docs/SessionCompletionStatus.md)
 - [SignatureAlgorithmAndValueModel](docs/SignatureAlgorithmAndValueModel.md)
 - [SignatureAlgorithmIdentifier](docs/SignatureAlgorithmIdentifier.md)
 - [SignatureAlgorithms](docs/SignatureAlgorithms.md)
 - [SignatureBStampModel](docs/SignatureBStampModel.md)
 - [SignaturePolicyIdentifierModel](docs/SignaturePolicyIdentifierModel.md)
 - [SignatureResultModel](docs/SignatureResultModel.md)
 - [SignatureSessionDocumentData](docs/SignatureSessionDocumentData.md)
 - [SignatureSessionDocumentSummary](docs/SignatureSessionDocumentSummary.md)
 - [SignatureSessionModel](docs/SignatureSessionModel.md)
 - [SignatureSessionStatus](docs/SignatureSessionStatus.md)
 - [SignatureTypes](docs/SignatureTypes.md)
 - [SignerBStampModel](docs/SignerBStampModel.md)
 - [SignerModel](docs/SignerModel.md)
 - [SignerSummary](docs/SignerSummary.md)
 - [StampPdfRequest](docs/StampPdfRequest.md)
 - [StampPdfResponse](docs/StampPdfResponse.md)
 - [TimestampIssueResponse](docs/TimestampIssueResponse.md)
 - [ValidationItemModel](docs/ValidationItemModel.md)
 - [ValidationItemTypes](docs/ValidationItemTypes.md)
 - [ValidationResultsModel](docs/ValidationResultsModel.md)
 - [WebhookEventModel](docs/WebhookEventModel.md)
 - [WebhookEventTypes](docs/WebhookEventTypes.md)
 - [XmlAttributeModel](docs/XmlAttributeModel.md)
 - [XmlElementLocationModel](docs/XmlElementLocationModel.md)
 - [XmlElementModel](docs/XmlElementModel.md)
 - [XmlElementSignaturePostRequest](docs/XmlElementSignaturePostRequest.md)
 - [XmlIdAttributeModel](docs/XmlIdAttributeModel.md)
 - [XmlIdResolutionTableModel](docs/XmlIdResolutionTableModel.md)
 - [XmlInsertionOptions](docs/XmlInsertionOptions.md)
 - [XmlNodeNameModel](docs/XmlNodeNameModel.md)
 - [XmlSignatureModel](docs/XmlSignatureModel.md)
 - [XmlSignatureOptions](docs/XmlSignatureOptions.md)
 - [XmlSignaturePostResponse](docs/XmlSignaturePostResponse.md)
 - [XmlSignaturePostSignedBytesRequest](docs/XmlSignaturePostSignedBytesRequest.md)
 - [XmlSignaturePostSignedBytesResponse](docs/XmlSignaturePostSignedBytesResponse.md)
 - [XmlSignatureResponseModel](docs/XmlSignatureResponseModel.md)
 - [XmlSignatureTypes](docs/XmlSignatureTypes.md)
 - [XmlSignedEntityTypes](docs/XmlSignedEntityTypes.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



