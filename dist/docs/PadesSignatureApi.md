# PadesSignatureApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiPadesSignaturesOpenPost**](PadesSignatureApi.md#apiPadesSignaturesOpenPost) | **POST** /Api/PadesSignatures/Open |  |
| [**apiPadesSignaturesPost**](PadesSignatureApi.md#apiPadesSignaturesPost) | **POST** /Api/PadesSignatures |  |
| [**apiPadesSignaturesTokenFinalizePost**](PadesSignatureApi.md#apiPadesSignaturesTokenFinalizePost) | **POST** /Api/PadesSignatures/{token}/Finalize |  |
| [**apiPadesSignaturesTokenSignedBytesPost**](PadesSignatureApi.md#apiPadesSignaturesTokenSignedBytesPost) | **POST** /Api/PadesSignatures/{token}/SignedBytes |  |
| [**apiV2PadesSignaturesPost**](PadesSignatureApi.md#apiV2PadesSignaturesPost) | **POST** /Api/v2/PadesSignatures |  |
| [**apiV2PadesSignaturesTokenSignedBytesPost**](PadesSignatureApi.md#apiV2PadesSignaturesTokenSignedBytesPost) | **POST** /Api/v2/PadesSignatures/{token}/SignedBytes |  |



## apiPadesSignaturesOpenPost

> PadesSignatureModel apiPadesSignaturesOpenPost(openSignatureRequestModel)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.PadesSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PadesSignatureApi apiInstance = new PadesSignatureApi(defaultClient);
        OpenSignatureRequestModel openSignatureRequestModel = new OpenSignatureRequestModel(); // OpenSignatureRequestModel | 
        try {
            PadesSignatureModel result = apiInstance.apiPadesSignaturesOpenPost(openSignatureRequestModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PadesSignatureApi#apiPadesSignaturesOpenPost");
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
| **openSignatureRequestModel** | [**OpenSignatureRequestModel**](OpenSignatureRequestModel.md)|  | [optional] |

### Return type

[**PadesSignatureModel**](PadesSignatureModel.md)

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


## apiPadesSignaturesPost

> PadesSignaturePostResponse apiPadesSignaturesPost(padesSignaturePostRequestV1)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.PadesSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PadesSignatureApi apiInstance = new PadesSignatureApi(defaultClient);
        PadesSignaturePostRequestV1 padesSignaturePostRequestV1 = new PadesSignaturePostRequestV1(); // PadesSignaturePostRequestV1 | 
        try {
            PadesSignaturePostResponse result = apiInstance.apiPadesSignaturesPost(padesSignaturePostRequestV1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PadesSignatureApi#apiPadesSignaturesPost");
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
| **padesSignaturePostRequestV1** | [**PadesSignaturePostRequestV1**](PadesSignaturePostRequestV1.md)|  | [optional] |

### Return type

[**PadesSignaturePostResponse**](PadesSignaturePostResponse.md)

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


## apiPadesSignaturesTokenFinalizePost

> PadesSignaturePostSignedBytesResponse apiPadesSignaturesTokenFinalizePost(token)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.PadesSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PadesSignatureApi apiInstance = new PadesSignatureApi(defaultClient);
        String token = "token_example"; // String | 
        try {
            PadesSignaturePostSignedBytesResponse result = apiInstance.apiPadesSignaturesTokenFinalizePost(token);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PadesSignatureApi#apiPadesSignaturesTokenFinalizePost");
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

[**PadesSignaturePostSignedBytesResponse**](PadesSignaturePostSignedBytesResponse.md)

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


## apiPadesSignaturesTokenSignedBytesPost

> PadesSignaturePostSignedBytesResponse apiPadesSignaturesTokenSignedBytesPost(token, padesSignaturePostSignedBytesRequest)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.PadesSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PadesSignatureApi apiInstance = new PadesSignatureApi(defaultClient);
        String token = "token_example"; // String | 
        PadesSignaturePostSignedBytesRequest padesSignaturePostSignedBytesRequest = new PadesSignaturePostSignedBytesRequest(); // PadesSignaturePostSignedBytesRequest | 
        try {
            PadesSignaturePostSignedBytesResponse result = apiInstance.apiPadesSignaturesTokenSignedBytesPost(token, padesSignaturePostSignedBytesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PadesSignatureApi#apiPadesSignaturesTokenSignedBytesPost");
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
| **padesSignaturePostSignedBytesRequest** | [**PadesSignaturePostSignedBytesRequest**](PadesSignaturePostSignedBytesRequest.md)|  | [optional] |

### Return type

[**PadesSignaturePostSignedBytesResponse**](PadesSignaturePostSignedBytesResponse.md)

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


## apiV2PadesSignaturesPost

> PadesSignaturePostResponse apiV2PadesSignaturesPost(padesSignaturePostRequestV2)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.PadesSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PadesSignatureApi apiInstance = new PadesSignatureApi(defaultClient);
        PadesSignaturePostRequestV2 padesSignaturePostRequestV2 = new PadesSignaturePostRequestV2(); // PadesSignaturePostRequestV2 | 
        try {
            PadesSignaturePostResponse result = apiInstance.apiV2PadesSignaturesPost(padesSignaturePostRequestV2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PadesSignatureApi#apiV2PadesSignaturesPost");
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
| **padesSignaturePostRequestV2** | [**PadesSignaturePostRequestV2**](PadesSignaturePostRequestV2.md)|  | [optional] |

### Return type

[**PadesSignaturePostResponse**](PadesSignaturePostResponse.md)

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


## apiV2PadesSignaturesTokenSignedBytesPost

> SignatureResultModel apiV2PadesSignaturesTokenSignedBytesPost(token, completeSignatureRequest)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.PadesSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PadesSignatureApi apiInstance = new PadesSignatureApi(defaultClient);
        String token = "token_example"; // String | 
        CompleteSignatureRequest completeSignatureRequest = new CompleteSignatureRequest(); // CompleteSignatureRequest | 
        try {
            SignatureResultModel result = apiInstance.apiV2PadesSignaturesTokenSignedBytesPost(token, completeSignatureRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PadesSignatureApi#apiV2PadesSignaturesTokenSignedBytesPost");
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
| **completeSignatureRequest** | [**CompleteSignatureRequest**](CompleteSignatureRequest.md)|  | [optional] |

### Return type

[**SignatureResultModel**](SignatureResultModel.md)

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

