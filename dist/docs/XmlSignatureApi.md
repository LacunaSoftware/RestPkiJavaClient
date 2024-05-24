# XmlSignatureApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2XmlSignaturesOpenPost**](XmlSignatureApi.md#apiV2XmlSignaturesOpenPost) | **POST** /Api/v2/XmlSignatures/Open |  |
| [**apiXmlSignaturesFullXmlSignaturePost**](XmlSignatureApi.md#apiXmlSignaturesFullXmlSignaturePost) | **POST** /Api/XmlSignatures/FullXmlSignature |  |
| [**apiXmlSignaturesOpenPost**](XmlSignatureApi.md#apiXmlSignaturesOpenPost) | **POST** /Api/XmlSignatures/Open |  |
| [**apiXmlSignaturesTokenFinalizePost**](XmlSignatureApi.md#apiXmlSignaturesTokenFinalizePost) | **POST** /Api/XmlSignatures/{token}/Finalize |  |
| [**apiXmlSignaturesTokenSignedBytesPost**](XmlSignatureApi.md#apiXmlSignaturesTokenSignedBytesPost) | **POST** /Api/XmlSignatures/{token}/SignedBytes |  |
| [**apiXmlSignaturesXmlElementSignaturePost**](XmlSignatureApi.md#apiXmlSignaturesXmlElementSignaturePost) | **POST** /Api/XmlSignatures/XmlElementSignature |  |



## apiV2XmlSignaturesOpenPost

> XmlSignatureResponseModel apiV2XmlSignaturesOpenPost(openXmlSignatureRequestModel)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.XmlSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        XmlSignatureApi apiInstance = new XmlSignatureApi(defaultClient);
        OpenXmlSignatureRequestModel openXmlSignatureRequestModel = new OpenXmlSignatureRequestModel(); // OpenXmlSignatureRequestModel | 
        try {
            XmlSignatureResponseModel result = apiInstance.apiV2XmlSignaturesOpenPost(openXmlSignatureRequestModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XmlSignatureApi#apiV2XmlSignaturesOpenPost");
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
| **openXmlSignatureRequestModel** | [**OpenXmlSignatureRequestModel**](OpenXmlSignatureRequestModel.md)|  | [optional] |

### Return type

[**XmlSignatureResponseModel**](XmlSignatureResponseModel.md)

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


## apiXmlSignaturesFullXmlSignaturePost

> XmlSignaturePostResponse apiXmlSignaturesFullXmlSignaturePost(fullXmlSignaturePostRequest)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.XmlSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        XmlSignatureApi apiInstance = new XmlSignatureApi(defaultClient);
        FullXmlSignaturePostRequest fullXmlSignaturePostRequest = new FullXmlSignaturePostRequest(); // FullXmlSignaturePostRequest | 
        try {
            XmlSignaturePostResponse result = apiInstance.apiXmlSignaturesFullXmlSignaturePost(fullXmlSignaturePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XmlSignatureApi#apiXmlSignaturesFullXmlSignaturePost");
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
| **fullXmlSignaturePostRequest** | [**FullXmlSignaturePostRequest**](FullXmlSignaturePostRequest.md)|  | [optional] |

### Return type

[**XmlSignaturePostResponse**](XmlSignaturePostResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Syntax error, for instance when a required field is not specified |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Semantic error, for instance when a given entity ID is not found |  -  |


## apiXmlSignaturesOpenPost

> List&lt;XmlSignatureModel&gt; apiXmlSignaturesOpenPost(openXmlSignatureRequestModel)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.XmlSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        XmlSignatureApi apiInstance = new XmlSignatureApi(defaultClient);
        OpenXmlSignatureRequestModel openXmlSignatureRequestModel = new OpenXmlSignatureRequestModel(); // OpenXmlSignatureRequestModel | 
        try {
            List<XmlSignatureModel> result = apiInstance.apiXmlSignaturesOpenPost(openXmlSignatureRequestModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XmlSignatureApi#apiXmlSignaturesOpenPost");
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
| **openXmlSignatureRequestModel** | [**OpenXmlSignatureRequestModel**](OpenXmlSignatureRequestModel.md)|  | [optional] |

### Return type

[**List&lt;XmlSignatureModel&gt;**](XmlSignatureModel.md)

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


## apiXmlSignaturesTokenFinalizePost

> XmlSignaturePostSignedBytesResponse apiXmlSignaturesTokenFinalizePost(token)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.XmlSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        XmlSignatureApi apiInstance = new XmlSignatureApi(defaultClient);
        String token = "token_example"; // String | 
        try {
            XmlSignaturePostSignedBytesResponse result = apiInstance.apiXmlSignaturesTokenFinalizePost(token);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XmlSignatureApi#apiXmlSignaturesTokenFinalizePost");
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

### Return type

[**XmlSignaturePostSignedBytesResponse**](XmlSignaturePostSignedBytesResponse.md)

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


## apiXmlSignaturesTokenSignedBytesPost

> XmlSignaturePostSignedBytesResponse apiXmlSignaturesTokenSignedBytesPost(token, xmlSignaturePostSignedBytesRequest)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.XmlSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        XmlSignatureApi apiInstance = new XmlSignatureApi(defaultClient);
        String token = "token_example"; // String | 
        XmlSignaturePostSignedBytesRequest xmlSignaturePostSignedBytesRequest = new XmlSignaturePostSignedBytesRequest(); // XmlSignaturePostSignedBytesRequest | 
        try {
            XmlSignaturePostSignedBytesResponse result = apiInstance.apiXmlSignaturesTokenSignedBytesPost(token, xmlSignaturePostSignedBytesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XmlSignatureApi#apiXmlSignaturesTokenSignedBytesPost");
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
| **xmlSignaturePostSignedBytesRequest** | [**XmlSignaturePostSignedBytesRequest**](XmlSignaturePostSignedBytesRequest.md)|  | [optional] |

### Return type

[**XmlSignaturePostSignedBytesResponse**](XmlSignaturePostSignedBytesResponse.md)

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


## apiXmlSignaturesXmlElementSignaturePost

> XmlSignaturePostResponse apiXmlSignaturesXmlElementSignaturePost(xmlElementSignaturePostRequest)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.XmlSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        XmlSignatureApi apiInstance = new XmlSignatureApi(defaultClient);
        XmlElementSignaturePostRequest xmlElementSignaturePostRequest = new XmlElementSignaturePostRequest(); // XmlElementSignaturePostRequest | 
        try {
            XmlSignaturePostResponse result = apiInstance.apiXmlSignaturesXmlElementSignaturePost(xmlElementSignaturePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XmlSignatureApi#apiXmlSignaturesXmlElementSignaturePost");
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
| **xmlElementSignaturePostRequest** | [**XmlElementSignaturePostRequest**](XmlElementSignaturePostRequest.md)|  | [optional] |

### Return type

[**XmlSignaturePostResponse**](XmlSignaturePostResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Syntax error, for instance when a required field is not specified |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Semantic error, for instance when a given entity ID is not found |  -  |

