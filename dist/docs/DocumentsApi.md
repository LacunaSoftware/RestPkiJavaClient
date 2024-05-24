# DocumentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiDocumentsIdGet**](DocumentsApi.md#apiDocumentsIdGet) | **GET** /api/documents/{id} | Retrieves a document&#39;s details |
| [**apiDocumentsIdSignersGet**](DocumentsApi.md#apiDocumentsIdSignersGet) | **GET** /api/documents/{id}/signers | Retrieves the full information about each of a document&#39;s signers |
| [**apiDocumentsKeysKeyGet**](DocumentsApi.md#apiDocumentsKeysKeyGet) | **GET** /api/documents/keys/{key} | Finds a document&#39;s details by its key |



## apiDocumentsIdGet

> DocumentModel apiDocumentsIdGet(id)

Retrieves a document&#39;s details

### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.DocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            DocumentModel result = apiInstance.apiDocumentsIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#apiDocumentsIdGet");
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
| **id** | **UUID**|  | |

### Return type

[**DocumentModel**](DocumentModel.md)

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


## apiDocumentsIdSignersGet

> List&lt;SignerModel&gt; apiDocumentsIdSignersGet(id)

Retrieves the full information about each of a document&#39;s signers

### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.DocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            List<SignerModel> result = apiInstance.apiDocumentsIdSignersGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#apiDocumentsIdSignersGet");
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
| **id** | **UUID**|  | |

### Return type

[**List&lt;SignerModel&gt;**](SignerModel.md)

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


## apiDocumentsKeysKeyGet

> DocumentQueryResponse apiDocumentsKeysKeyGet(key)

Finds a document&#39;s details by its key

The key may be given either in formatted form (e.g. *XXXX-XXXX-XXXX-XXXX*) or unformatted (e.g. *XXXXXXXXXXXXXXXX*)    If a document with the given key is not found, the response is a &#x60;200 (Success)&#x60; with &#x60;\&quot;found\&quot;: false&#x60;.

### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.DocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        String key = "key_example"; // String | 
        try {
            DocumentQueryResponse result = apiInstance.apiDocumentsKeysKeyGet(key);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#apiDocumentsKeysKeyGet");
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

[**DocumentQueryResponse**](DocumentQueryResponse.md)

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

