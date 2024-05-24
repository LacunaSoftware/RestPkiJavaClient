# UploadApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiMultipartUploadsPost**](UploadApi.md#apiMultipartUploadsPost) | **POST** /Api/MultipartUploads |  |
| [**apiMultipartUploadsTokenPartNumberPost**](UploadApi.md#apiMultipartUploadsTokenPartNumberPost) | **POST** /Api/MultipartUploads/{token}/{partNumber} |  |
| [**apiMultipartUploadsTokenPost**](UploadApi.md#apiMultipartUploadsTokenPost) | **POST** /Api/MultipartUploads/{token} |  |
| [**apiPlainUploadsPost**](UploadApi.md#apiPlainUploadsPost) | **POST** /api/plain-uploads |  |



## apiMultipartUploadsPost

> MultipartUploadBeginResponse apiMultipartUploadsPost()



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UploadApi apiInstance = new UploadApi(defaultClient);
        try {
            MultipartUploadBeginResponse result = apiInstance.apiMultipartUploadsPost();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#apiMultipartUploadsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**MultipartUploadBeginResponse**](MultipartUploadBeginResponse.md)

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


## apiMultipartUploadsTokenPartNumberPost

> apiMultipartUploadsTokenPartNumberPost(token, partNumber)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UploadApi apiInstance = new UploadApi(defaultClient);
        String token = "token_example"; // String | 
        Integer partNumber = 56; // Integer | 
        try {
            apiInstance.apiMultipartUploadsTokenPartNumberPost(token, partNumber);
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#apiMultipartUploadsTokenPartNumberPost");
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
| **token** | **String**|  | |
| **partNumber** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Syntax error, for instance when a required field is not specified |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Semantic error, for instance when a given entity ID is not found |  -  |


## apiMultipartUploadsTokenPost

> apiMultipartUploadsTokenPost(token, multipartUploadEndRequest)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UploadApi apiInstance = new UploadApi(defaultClient);
        String token = "token_example"; // String | 
        MultipartUploadEndRequest multipartUploadEndRequest = new MultipartUploadEndRequest(); // MultipartUploadEndRequest | 
        try {
            apiInstance.apiMultipartUploadsTokenPost(token, multipartUploadEndRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#apiMultipartUploadsTokenPost");
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
| **token** | **String**|  | |
| **multipartUploadEndRequest** | [**MultipartUploadEndRequest**](MultipartUploadEndRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Syntax error, for instance when a required field is not specified |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Semantic error, for instance when a given entity ID is not found |  -  |


## apiPlainUploadsPost

> FileReferenceModel apiPlainUploadsPost()



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.UploadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UploadApi apiInstance = new UploadApi(defaultClient);
        try {
            FileReferenceModel result = apiInstance.apiPlainUploadsPost();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UploadApi#apiPlainUploadsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**FileReferenceModel**](FileReferenceModel.md)

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

