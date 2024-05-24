# CadesSignatureApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiCadesSignaturesOpenPost**](CadesSignatureApi.md#apiCadesSignaturesOpenPost) | **POST** /Api/CadesSignatures/Open |  |
| [**apiCadesSignaturesPost**](CadesSignatureApi.md#apiCadesSignaturesPost) | **POST** /Api/CadesSignatures |  |
| [**apiCadesSignaturesRequiredHashesPost**](CadesSignatureApi.md#apiCadesSignaturesRequiredHashesPost) | **POST** /Api/CadesSignatures/RequiredHashes |  |
| [**apiCadesSignaturesTokenFinalizePost**](CadesSignatureApi.md#apiCadesSignaturesTokenFinalizePost) | **POST** /Api/CadesSignatures/{token}/Finalize |  |
| [**apiCadesSignaturesTokenSignedBytesPost**](CadesSignatureApi.md#apiCadesSignaturesTokenSignedBytesPost) | **POST** /Api/CadesSignatures/{token}/SignedBytes |  |
| [**apiV2CadesSignaturesPost**](CadesSignatureApi.md#apiV2CadesSignaturesPost) | **POST** /Api/v2/CadesSignatures |  |
| [**apiV2CadesSignaturesTokenSignedBytesPost**](CadesSignatureApi.md#apiV2CadesSignaturesTokenSignedBytesPost) | **POST** /Api/v2/CadesSignatures/{token}/SignedBytes |  |
| [**apiV3CadesSignaturesPost**](CadesSignatureApi.md#apiV3CadesSignaturesPost) | **POST** /Api/v3/CadesSignatures |  |



## apiCadesSignaturesOpenPost

> CadesSignatureModel apiCadesSignaturesOpenPost(openCadesSignatureRequestModel)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.CadesSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CadesSignatureApi apiInstance = new CadesSignatureApi(defaultClient);
        OpenCadesSignatureRequestModel openCadesSignatureRequestModel = new OpenCadesSignatureRequestModel(); // OpenCadesSignatureRequestModel | 
        try {
            CadesSignatureModel result = apiInstance.apiCadesSignaturesOpenPost(openCadesSignatureRequestModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CadesSignatureApi#apiCadesSignaturesOpenPost");
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
| **openCadesSignatureRequestModel** | [**OpenCadesSignatureRequestModel**](OpenCadesSignatureRequestModel.md)|  | [optional] |

### Return type

[**CadesSignatureModel**](CadesSignatureModel.md)

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


## apiCadesSignaturesPost

> CadesSignaturePostResponse apiCadesSignaturesPost(cadesSignaturePostRequestV1)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.CadesSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CadesSignatureApi apiInstance = new CadesSignatureApi(defaultClient);
        CadesSignaturePostRequestV1 cadesSignaturePostRequestV1 = new CadesSignaturePostRequestV1(); // CadesSignaturePostRequestV1 | 
        try {
            CadesSignaturePostResponse result = apiInstance.apiCadesSignaturesPost(cadesSignaturePostRequestV1);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CadesSignatureApi#apiCadesSignaturesPost");
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
| **cadesSignaturePostRequestV1** | [**CadesSignaturePostRequestV1**](CadesSignaturePostRequestV1.md)|  | [optional] |

### Return type

[**CadesSignaturePostResponse**](CadesSignaturePostResponse.md)

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


## apiCadesSignaturesRequiredHashesPost

> List&lt;DigestAlgorithms&gt; apiCadesSignaturesRequiredHashesPost(fileModel)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.CadesSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CadesSignatureApi apiInstance = new CadesSignatureApi(defaultClient);
        FileModel fileModel = new FileModel(); // FileModel | 
        try {
            List<DigestAlgorithms> result = apiInstance.apiCadesSignaturesRequiredHashesPost(fileModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CadesSignatureApi#apiCadesSignaturesRequiredHashesPost");
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
| **fileModel** | [**FileModel**](FileModel.md)|  | [optional] |

### Return type

[**List&lt;DigestAlgorithms&gt;**](DigestAlgorithms.md)

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


## apiCadesSignaturesTokenFinalizePost

> CadesSignaturePostSignedBytesResponse apiCadesSignaturesTokenFinalizePost(token)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.CadesSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CadesSignatureApi apiInstance = new CadesSignatureApi(defaultClient);
        String token = "token_example"; // String | 
        try {
            CadesSignaturePostSignedBytesResponse result = apiInstance.apiCadesSignaturesTokenFinalizePost(token);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CadesSignatureApi#apiCadesSignaturesTokenFinalizePost");
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

[**CadesSignaturePostSignedBytesResponse**](CadesSignaturePostSignedBytesResponse.md)

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


## apiCadesSignaturesTokenSignedBytesPost

> CadesSignaturePostSignedBytesResponse apiCadesSignaturesTokenSignedBytesPost(token, cadesSignaturePostSignedBytesRequest)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.CadesSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CadesSignatureApi apiInstance = new CadesSignatureApi(defaultClient);
        String token = "token_example"; // String | 
        CadesSignaturePostSignedBytesRequest cadesSignaturePostSignedBytesRequest = new CadesSignaturePostSignedBytesRequest(); // CadesSignaturePostSignedBytesRequest | 
        try {
            CadesSignaturePostSignedBytesResponse result = apiInstance.apiCadesSignaturesTokenSignedBytesPost(token, cadesSignaturePostSignedBytesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CadesSignatureApi#apiCadesSignaturesTokenSignedBytesPost");
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
| **cadesSignaturePostSignedBytesRequest** | [**CadesSignaturePostSignedBytesRequest**](CadesSignaturePostSignedBytesRequest.md)|  | [optional] |

### Return type

[**CadesSignaturePostSignedBytesResponse**](CadesSignaturePostSignedBytesResponse.md)

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


## apiV2CadesSignaturesPost

> CadesSignaturePostResponse apiV2CadesSignaturesPost(cadesSignaturePostRequestV2)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.CadesSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CadesSignatureApi apiInstance = new CadesSignatureApi(defaultClient);
        CadesSignaturePostRequestV2 cadesSignaturePostRequestV2 = new CadesSignaturePostRequestV2(); // CadesSignaturePostRequestV2 | 
        try {
            CadesSignaturePostResponse result = apiInstance.apiV2CadesSignaturesPost(cadesSignaturePostRequestV2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CadesSignatureApi#apiV2CadesSignaturesPost");
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
| **cadesSignaturePostRequestV2** | [**CadesSignaturePostRequestV2**](CadesSignaturePostRequestV2.md)|  | [optional] |

### Return type

[**CadesSignaturePostResponse**](CadesSignaturePostResponse.md)

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


## apiV2CadesSignaturesTokenSignedBytesPost

> SignatureResultModel apiV2CadesSignaturesTokenSignedBytesPost(token, completeSignatureRequest)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.CadesSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CadesSignatureApi apiInstance = new CadesSignatureApi(defaultClient);
        String token = "token_example"; // String | 
        CompleteSignatureRequest completeSignatureRequest = new CompleteSignatureRequest(); // CompleteSignatureRequest | 
        try {
            SignatureResultModel result = apiInstance.apiV2CadesSignaturesTokenSignedBytesPost(token, completeSignatureRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CadesSignatureApi#apiV2CadesSignaturesTokenSignedBytesPost");
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


## apiV3CadesSignaturesPost

> CadesSignaturePostResponse apiV3CadesSignaturesPost(cadesSignaturePostRequestV3)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.CadesSignatureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CadesSignatureApi apiInstance = new CadesSignatureApi(defaultClient);
        CadesSignaturePostRequestV3 cadesSignaturePostRequestV3 = new CadesSignaturePostRequestV3(); // CadesSignaturePostRequestV3 | 
        try {
            CadesSignaturePostResponse result = apiInstance.apiV3CadesSignaturesPost(cadesSignaturePostRequestV3);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CadesSignatureApi#apiV3CadesSignaturesPost");
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
| **cadesSignaturePostRequestV3** | [**CadesSignaturePostRequestV3**](CadesSignaturePostRequestV3.md)|  | [optional] |

### Return type

[**CadesSignaturePostResponse**](CadesSignaturePostResponse.md)

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

