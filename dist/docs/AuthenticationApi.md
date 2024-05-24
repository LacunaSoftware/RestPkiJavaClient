# AuthenticationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiAuthenticationGet**](AuthenticationApi.md#apiAuthenticationGet) | **GET** /Api/Authentication |  |
| [**apiAuthenticationPost**](AuthenticationApi.md#apiAuthenticationPost) | **POST** /Api/Authentication |  |
| [**apiAuthenticationsPost**](AuthenticationApi.md#apiAuthenticationsPost) | **POST** /Api/Authentications |  |
| [**apiAuthenticationsTokenFinalizePost**](AuthenticationApi.md#apiAuthenticationsTokenFinalizePost) | **POST** /Api/Authentications/{token}/Finalize |  |
| [**apiAuthenticationsTokenSignedBytesPost**](AuthenticationApi.md#apiAuthenticationsTokenSignedBytesPost) | **POST** /Api/Authentications/{token}/SignedBytes |  |
| [**apiV2AuthenticationCompletionPost**](AuthenticationApi.md#apiV2AuthenticationCompletionPost) | **POST** /api/v2/authentication/completion | Completes a certificate authentication |
| [**apiV2AuthenticationPost**](AuthenticationApi.md#apiV2AuthenticationPost) | **POST** /api/v2/authentication | Prepares for a certificate authentication |



## apiAuthenticationGet

> AuthenticationGetResponse apiAuthenticationGet()



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.AuthenticationApi;

public class Example {
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

### Parameters

This endpoint does not need any parameter.

### Return type

[**AuthenticationGetResponse**](AuthenticationGetResponse.md)

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


## apiAuthenticationPost

> AuthenticationPostResponse apiAuthenticationPost(authenticationPostRequest)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        AuthenticationPostRequest authenticationPostRequest = new AuthenticationPostRequest(); // AuthenticationPostRequest | 
        try {
            AuthenticationPostResponse result = apiInstance.apiAuthenticationPost(authenticationPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#apiAuthenticationPost");
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
| **authenticationPostRequest** | [**AuthenticationPostRequest**](AuthenticationPostRequest.md)|  | [optional] |

### Return type

[**AuthenticationPostResponse**](AuthenticationPostResponse.md)

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


## apiAuthenticationsPost

> AuthenticationsPostResponse apiAuthenticationsPost(authenticationsPostRequest)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        AuthenticationsPostRequest authenticationsPostRequest = new AuthenticationsPostRequest(); // AuthenticationsPostRequest | 
        try {
            AuthenticationsPostResponse result = apiInstance.apiAuthenticationsPost(authenticationsPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#apiAuthenticationsPost");
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
| **authenticationsPostRequest** | [**AuthenticationsPostRequest**](AuthenticationsPostRequest.md)|  | [optional] |

### Return type

[**AuthenticationsPostResponse**](AuthenticationsPostResponse.md)

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


## apiAuthenticationsTokenFinalizePost

> AuthenticationPostResponse apiAuthenticationsTokenFinalizePost(token)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String token = "token_example"; // String | 
        try {
            AuthenticationPostResponse result = apiInstance.apiAuthenticationsTokenFinalizePost(token);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#apiAuthenticationsTokenFinalizePost");
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

[**AuthenticationPostResponse**](AuthenticationPostResponse.md)

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


## apiAuthenticationsTokenSignedBytesPost

> AuthenticationsPostSignedBytesResponse apiAuthenticationsTokenSignedBytesPost(token, authenticationsPostSignedBytesRequest)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String token = "token_example"; // String | 
        AuthenticationsPostSignedBytesRequest authenticationsPostSignedBytesRequest = new AuthenticationsPostSignedBytesRequest(); // AuthenticationsPostSignedBytesRequest | 
        try {
            AuthenticationsPostSignedBytesResponse result = apiInstance.apiAuthenticationsTokenSignedBytesPost(token, authenticationsPostSignedBytesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#apiAuthenticationsTokenSignedBytesPost");
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
| **authenticationsPostSignedBytesRequest** | [**AuthenticationsPostSignedBytesRequest**](AuthenticationsPostSignedBytesRequest.md)|  | [optional] |

### Return type

[**AuthenticationsPostSignedBytesResponse**](AuthenticationsPostSignedBytesResponse.md)

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


## apiV2AuthenticationCompletionPost

> CompleteAuthenticationResponse apiV2AuthenticationCompletionPost(completeAuthenticationRequest)

Completes a certificate authentication

### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        CompleteAuthenticationRequest completeAuthenticationRequest = new CompleteAuthenticationRequest(); // CompleteAuthenticationRequest | 
        try {
            CompleteAuthenticationResponse result = apiInstance.apiV2AuthenticationCompletionPost(completeAuthenticationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#apiV2AuthenticationCompletionPost");
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
| **completeAuthenticationRequest** | [**CompleteAuthenticationRequest**](CompleteAuthenticationRequest.md)|  | [optional] |

### Return type

[**CompleteAuthenticationResponse**](CompleteAuthenticationResponse.md)

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


## apiV2AuthenticationPost

> PrepareAuthenticationResponse apiV2AuthenticationPost(prepareAuthenticationRequest)

Prepares for a certificate authentication

### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        PrepareAuthenticationRequest prepareAuthenticationRequest = new PrepareAuthenticationRequest(); // PrepareAuthenticationRequest | 
        try {
            PrepareAuthenticationResponse result = apiInstance.apiV2AuthenticationPost(prepareAuthenticationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#apiV2AuthenticationPost");
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
| **prepareAuthenticationRequest** | [**PrepareAuthenticationRequest**](PrepareAuthenticationRequest.md)|  | [optional] |

### Return type

[**PrepareAuthenticationResponse**](PrepareAuthenticationResponse.md)

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

