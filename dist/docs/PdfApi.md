# PdfApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiPdfAddMarksPost**](PdfApi.md#apiPdfAddMarksPost) | **POST** /Api/Pdf/AddMarks |  |
| [**apiPdfStampPost**](PdfApi.md#apiPdfStampPost) | **POST** /api/pdf/stamp |  |



## apiPdfAddMarksPost

> PdfAddMarksResponse apiPdfAddMarksPost(pdfAddMarksRequest)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.PdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PdfApi apiInstance = new PdfApi(defaultClient);
        PdfAddMarksRequest pdfAddMarksRequest = new PdfAddMarksRequest(); // PdfAddMarksRequest | 
        try {
            PdfAddMarksResponse result = apiInstance.apiPdfAddMarksPost(pdfAddMarksRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PdfApi#apiPdfAddMarksPost");
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
| **pdfAddMarksRequest** | [**PdfAddMarksRequest**](PdfAddMarksRequest.md)|  | [optional] |

### Return type

[**PdfAddMarksResponse**](PdfAddMarksResponse.md)

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


## apiPdfStampPost

> StampPdfResponse apiPdfStampPost(stampPdfRequest)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.PdfApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PdfApi apiInstance = new PdfApi(defaultClient);
        StampPdfRequest stampPdfRequest = new StampPdfRequest(); // StampPdfRequest | 
        try {
            StampPdfResponse result = apiInstance.apiPdfStampPost(stampPdfRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PdfApi#apiPdfStampPost");
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
| **stampPdfRequest** | [**StampPdfRequest**](StampPdfRequest.md)|  | [optional] |

### Return type

[**StampPdfResponse**](StampPdfResponse.md)

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

