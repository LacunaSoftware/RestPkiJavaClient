# PadesVisualPositioningPresetsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiPadesVisualPositioningPresetsFootnoteBottomUpGet**](PadesVisualPositioningPresetsApi.md#apiPadesVisualPositioningPresetsFootnoteBottomUpGet) | **GET** /Api/PadesVisualPositioningPresets/FootnoteBottomUp |  |
| [**apiPadesVisualPositioningPresetsFootnoteGet**](PadesVisualPositioningPresetsApi.md#apiPadesVisualPositioningPresetsFootnoteGet) | **GET** /Api/PadesVisualPositioningPresets/Footnote |  |
| [**apiPadesVisualPositioningPresetsNewPageGet**](PadesVisualPositioningPresetsApi.md#apiPadesVisualPositioningPresetsNewPageGet) | **GET** /Api/PadesVisualPositioningPresets/NewPage |  |



## apiPadesVisualPositioningPresetsFootnoteBottomUpGet

> PadesVisualPositioningModel apiPadesVisualPositioningPresetsFootnoteBottomUpGet(pageNumber)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.PadesVisualPositioningPresetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PadesVisualPositioningPresetsApi apiInstance = new PadesVisualPositioningPresetsApi(defaultClient);
        Integer pageNumber = -1; // Integer | 
        try {
            PadesVisualPositioningModel result = apiInstance.apiPadesVisualPositioningPresetsFootnoteBottomUpGet(pageNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PadesVisualPositioningPresetsApi#apiPadesVisualPositioningPresetsFootnoteBottomUpGet");
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
| **pageNumber** | **Integer**|  | [optional] [default to -1] |

### Return type

[**PadesVisualPositioningModel**](PadesVisualPositioningModel.md)

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


## apiPadesVisualPositioningPresetsFootnoteGet

> PadesVisualPositioningModel apiPadesVisualPositioningPresetsFootnoteGet(pageNumber, rows)



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.PadesVisualPositioningPresetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PadesVisualPositioningPresetsApi apiInstance = new PadesVisualPositioningPresetsApi(defaultClient);
        Integer pageNumber = -1; // Integer | 
        Integer rows = 1; // Integer | 
        try {
            PadesVisualPositioningModel result = apiInstance.apiPadesVisualPositioningPresetsFootnoteGet(pageNumber, rows);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PadesVisualPositioningPresetsApi#apiPadesVisualPositioningPresetsFootnoteGet");
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
| **pageNumber** | **Integer**|  | [optional] [default to -1] |
| **rows** | **Integer**|  | [optional] [default to 1] |

### Return type

[**PadesVisualPositioningModel**](PadesVisualPositioningModel.md)

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


## apiPadesVisualPositioningPresetsNewPageGet

> PadesVisualPositioningModel apiPadesVisualPositioningPresetsNewPageGet()



### Example

```java
// Import classes:
import com.lacunasoftware.client.ApiClient;
import com.lacunasoftware.client.ApiException;
import com.lacunasoftware.client.Configuration;
import com.lacunasoftware.client.models.*;
import com.lacunasoftware.client.api.PadesVisualPositioningPresetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PadesVisualPositioningPresetsApi apiInstance = new PadesVisualPositioningPresetsApi(defaultClient);
        try {
            PadesVisualPositioningModel result = apiInstance.apiPadesVisualPositioningPresetsNewPageGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PadesVisualPositioningPresetsApi#apiPadesVisualPositioningPresetsNewPageGet");
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

[**PadesVisualPositioningModel**](PadesVisualPositioningModel.md)

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

