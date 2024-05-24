# SignatureInspectionApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiSignatureInspectionPut**](SignatureInspectionApi.md#apiSignatureInspectionPut) | **PUT** /api/signature-inspection | Inspects a signed file, returning information about its signers and metadata about the corresponding document (if signed on this instance) |



## apiSignatureInspectionPut

> InspectSignatureResponse apiSignatureInspectionPut(inspectSignatureRequest)

Inspects a signed file, returning information about its signers and metadata about the corresponding document (if signed on this instance)

## Overview    The simplest usage of this API is by simply passing the &#x60;file&#x60; to be inspected. If passing a file by its contents, make sure to pass its  &#x60;mimeType&#x60; so that the API can infer the signature type (PDF/PAdES, CMS/CAdES or XML/XmlDSig) from it.    Information about each signer found is returned on the &#x60;signers&#x60; property. If the file was signed on this instance, additional information  about the document is returned on the &#x60;document&#x60; property.    Please note that by default the signatures are not validated. This means that the &#x60;validationResults&#x60; property of each signer will be &#x60;null&#x60;  (unless the file was signed on this instance, in which case the property will be filled).    ## Signature validation    By default, the signed file is only inspected, but not validated. To validate the signatures, pass &#x60;validate &#x3D; true&#x60;. In this case, you may  optionally specify the &#x60;securityContextId&#x60; to be used to validate the certificates. If omitted, your default security context will be used.    Please note that validating the signatures may take several seconds or even longer, depending on the number of signers. If more than 10  signers are found, only the first 10 are validated (this limit may be increased on on-demand instances). If your documents can have a large  number of signers per document, please consider using the signer inspection API to validate each user separately on-demand as the user  interacts with the UI.    ## Validating detached CMS/CAdES signatures     When validating detached CMS/CAdES signatures, the detached data file must be specified on the &#x60;dataFile&#x60; property or its digests must be given  on the &#x60;dataHashes&#x60; property. If passing &#x60;dataHashes&#x60;, make sure to pass at least the SHA-256 digest of the data file (other digests may be necessary  depending on the signature algorithm used by the signers). If your data files can be considerably large, passing the &#x60;dataHashes&#x60; is recommended  since it avoids transmitting the actual data files through the API.    If a CMS/CAdES signature is given with &#x60;validate &#x3D; true&#x60; and without the corresponding data file specified, the API returns a 200 (OK) response with  &#x60;success &#x3D; false&#x60; and &#x60;failure &#x3D; DataFileRequired&#x60;. This allows you to implement a validation form that lets the user submit the signature file and only  requests the data file if necessary.

### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.SignatureInspectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SignatureInspectionApi apiInstance = new SignatureInspectionApi(defaultClient);
        InspectSignatureRequest inspectSignatureRequest = new InspectSignatureRequest(); // InspectSignatureRequest | 
        try {
            InspectSignatureResponse result = apiInstance.apiSignatureInspectionPut(inspectSignatureRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SignatureInspectionApi#apiSignatureInspectionPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inspectSignatureRequest** | [**InspectSignatureRequest**](InspectSignatureRequest.md)|  | [optional] |

### Return type

[**InspectSignatureResponse**](InspectSignatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Syntax error, for instance when a required field is not specified |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Semantic error, for instance when a given entity ID is not found |  -  |

