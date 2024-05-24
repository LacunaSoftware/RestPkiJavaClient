# DocumentKeysApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiDocumentKeysBatchPost**](DocumentKeysApi.md#apiDocumentKeysBatchPost) | **POST** /api/document-keys/batch | Allocates a batch of document keys to be used later on document signatures |
| [**apiDocumentKeysKeyGet**](DocumentKeysApi.md#apiDocumentKeysKeyGet) | **GET** /api/document-keys/{key} | Queries documents by key |
| [**apiDocumentKeysPost**](DocumentKeysApi.md#apiDocumentKeysPost) | **POST** /api/document-keys | Allocates a document key to be used later on a document signature |
| [**apiDocumentKeysUnusedGet**](DocumentKeysApi.md#apiDocumentKeysUnusedGet) | **GET** /api/document-keys/unused | Queries unused document keys |



## apiDocumentKeysBatchPost

> List&lt;DocumentKeyModel&gt; apiDocumentKeysBatchPost(allocateDocumentKeyBatchRequest)

Allocates a batch of document keys to be used later on document signatures

At most 100 keys may be allocated on each request. Limitations on the total number of unused document keys allocated may apply.

### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.DocumentKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DocumentKeysApi apiInstance = new DocumentKeysApi(defaultClient);
        AllocateDocumentKeyBatchRequest allocateDocumentKeyBatchRequest = new AllocateDocumentKeyBatchRequest(); // AllocateDocumentKeyBatchRequest | 
        try {
            List<DocumentKeyModel> result = apiInstance.apiDocumentKeysBatchPost(allocateDocumentKeyBatchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentKeysApi#apiDocumentKeysBatchPost");
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
| **allocateDocumentKeyBatchRequest** | [**AllocateDocumentKeyBatchRequest**](AllocateDocumentKeyBatchRequest.md)|  | [optional] |

### Return type

[**List&lt;DocumentKeyModel&gt;**](DocumentKeyModel.md)

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


## apiDocumentKeysKeyGet

> DocumentKeyQueryResponse apiDocumentKeysKeyGet(key)

Queries documents by key

The key may be given either in formatted form (e.g. *XXXX-XXXX-XXXX-XXXX*) or unformatted (e.g. *XXXXXXXXXXXXXXXX*)    If a document with the given key is not found, the response is a &#x60;200 (Success)&#x60; with &#x60;\&quot;found\&quot;: false&#x60;.    If the given key has been allocated in advance but is not yet associated with a document, the response is a &#x60;200 (Success)&#x60;  with &#x60;\&quot;found\&quot;: true&#x60; and &#x60;\&quot;hasDocument\&quot;: false&#x60;. In this case, the field &#x60;provisionalMetadata&#x60; contains any provisional metadata  passed during the document key allocation, which serves as an indicative of the metadata that a future document will likely have.    Only if &#x60;\&quot;found\&quot;: true&#x60; **and** &#x60;\&quot;hasDocument\&quot;: true&#x60; is the field &#x60;document&#x60; filled. In this case, &#x60;provisionalMetadata&#x60; is not filled.

### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.DocumentKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DocumentKeysApi apiInstance = new DocumentKeysApi(defaultClient);
        String key = "key_example"; // String | 
        try {
            DocumentKeyQueryResponse result = apiInstance.apiDocumentKeysKeyGet(key);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentKeysApi#apiDocumentKeysKeyGet");
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
| **key** | **String**|  | |

### Return type

[**DocumentKeyQueryResponse**](DocumentKeyQueryResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Syntax error, for instance when a required field is not specified |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Semantic error, for instance when a given entity ID is not found |  -  |


## apiDocumentKeysPost

> DocumentKeyModel apiDocumentKeysPost(allocateDocumentKeyRequest)

Allocates a document key to be used later on a document signature

To allocate a number of document keys at once, use the &#x60;POST /api/document-keys/batch&#x60; API instead. Limitations on the total number of unused document keys allocated may apply.

### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.DocumentKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DocumentKeysApi apiInstance = new DocumentKeysApi(defaultClient);
        AllocateDocumentKeyRequest allocateDocumentKeyRequest = new AllocateDocumentKeyRequest(); // AllocateDocumentKeyRequest | 
        try {
            DocumentKeyModel result = apiInstance.apiDocumentKeysPost(allocateDocumentKeyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentKeysApi#apiDocumentKeysPost");
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
| **allocateDocumentKeyRequest** | [**AllocateDocumentKeyRequest**](AllocateDocumentKeyRequest.md)|  | [optional] |

### Return type

[**DocumentKeyModel**](DocumentKeyModel.md)

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


## apiDocumentKeysUnusedGet

> List&lt;DocumentKeySummary&gt; apiDocumentKeysUnusedGet(metadataName, metadataValue)

Queries unused document keys

### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.DocumentKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DocumentKeysApi apiInstance = new DocumentKeysApi(defaultClient);
        String metadataName = "metadataName_example"; // String | 
        String metadataValue = "metadataValue_example"; // String | 
        try {
            List<DocumentKeySummary> result = apiInstance.apiDocumentKeysUnusedGet(metadataName, metadataValue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentKeysApi#apiDocumentKeysUnusedGet");
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
| **metadataName** | **String**|  | [optional] |
| **metadataValue** | **String**|  | [optional] |

### Return type

[**List&lt;DocumentKeySummary&gt;**](DocumentKeySummary.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Syntax error, for instance when a required field is not specified |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Semantic error, for instance when a given entity ID is not found |  -  |

