# SignatureApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiSignatureCompletionPost**](SignatureApi.md#apiSignatureCompletionPost) | **POST** /api/signature/completion |  |
| [**apiSignaturePost**](SignatureApi.md#apiSignaturePost) | **POST** /api/signature |  |



## apiSignatureCompletionPost

> DocumentModel apiSignatureCompletionPost(completeSignatureRequestV2)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.SignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SignatureApi apiInstance = new SignatureApi(defaultClient);
        CompleteSignatureRequestV2 completeSignatureRequestV2 = new CompleteSignatureRequestV2(); // CompleteSignatureRequestV2 | 
        try {
            DocumentModel result = apiInstance.apiSignatureCompletionPost(completeSignatureRequestV2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SignatureApi#apiSignatureCompletionPost");
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
| **completeSignatureRequestV2** | [**CompleteSignatureRequestV2**](CompleteSignatureRequestV2.md)|  | [optional] |

### Return type

[**DocumentModel**](DocumentModel.md)

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


## apiSignaturePost

> PrepareSignatureResponse apiSignaturePost(prepareSignatureRequest)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.SignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SignatureApi apiInstance = new SignatureApi(defaultClient);
        PrepareSignatureRequest prepareSignatureRequest = new PrepareSignatureRequest(); // PrepareSignatureRequest | 
        try {
            PrepareSignatureResponse result = apiInstance.apiSignaturePost(prepareSignatureRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SignatureApi#apiSignaturePost");
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
| **prepareSignatureRequest** | [**PrepareSignatureRequest**](PrepareSignatureRequest.md)|  | [optional] |

### Return type

[**PrepareSignatureResponse**](PrepareSignatureResponse.md)

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

