# AppPropertiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addonPropertiesResourceDeleteAddonPropertyDelete**](AppPropertiesApi.md#addonPropertiesResourceDeleteAddonPropertyDelete) | **DELETE** /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey} | Delete app property
[**addonPropertiesResourceGetAddonPropertiesGet**](AppPropertiesApi.md#addonPropertiesResourceGetAddonPropertiesGet) | **GET** /rest/atlassian-connect/1/addons/{addonKey}/properties | Get app properties
[**addonPropertiesResourceGetAddonPropertyGet**](AppPropertiesApi.md#addonPropertiesResourceGetAddonPropertyGet) | **GET** /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey} | Get app property
[**addonPropertiesResourcePutAddonPropertyPut**](AppPropertiesApi.md#addonPropertiesResourcePutAddonPropertyPut) | **PUT** /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey} | Set app property


<a name="addonPropertiesResourceDeleteAddonPropertyDelete"></a>
# **addonPropertiesResourceDeleteAddonPropertyDelete**
> addonPropertiesResourceDeleteAddonPropertyDelete(addonKey, propertyKey)

Delete app property

Deletes an app&#39;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppPropertiesApi()
val addonKey : kotlin.String = addonKey_example // kotlin.String | The key of the app, as defined in its descriptor.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the property.
try {
    apiInstance.addonPropertiesResourceDeleteAddonPropertyDelete(addonKey, propertyKey)
} catch (e: ClientException) {
    println("4xx response calling AppPropertiesApi#addonPropertiesResourceDeleteAddonPropertyDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppPropertiesApi#addonPropertiesResourceDeleteAddonPropertyDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonKey** | **kotlin.String**| The key of the app, as defined in its descriptor. |
 **propertyKey** | **kotlin.String**| The key of the property. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonPropertiesResourceGetAddonPropertiesGet"></a>
# **addonPropertiesResourceGetAddonPropertiesGet**
> PropertyKeys addonPropertiesResourceGetAddonPropertiesGet(addonKey)

Get app properties

Gets all the properties of an app.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppPropertiesApi()
val addonKey : kotlin.String = addonKey_example // kotlin.String | The key of the app, as defined in its descriptor.
try {
    val result : PropertyKeys = apiInstance.addonPropertiesResourceGetAddonPropertiesGet(addonKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppPropertiesApi#addonPropertiesResourceGetAddonPropertiesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppPropertiesApi#addonPropertiesResourceGetAddonPropertiesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonKey** | **kotlin.String**| The key of the app, as defined in its descriptor. |

### Return type

[**PropertyKeys**](PropertyKeys.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonPropertiesResourceGetAddonPropertyGet"></a>
# **addonPropertiesResourceGetAddonPropertyGet**
> EntityProperty addonPropertiesResourceGetAddonPropertyGet(addonKey, propertyKey)

Get app property

Returns the key and value of an app&#39;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppPropertiesApi()
val addonKey : kotlin.String = addonKey_example // kotlin.String | The key of the app, as defined in its descriptor.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the property.
try {
    val result : EntityProperty = apiInstance.addonPropertiesResourceGetAddonPropertyGet(addonKey, propertyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppPropertiesApi#addonPropertiesResourceGetAddonPropertyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppPropertiesApi#addonPropertiesResourceGetAddonPropertyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonKey** | **kotlin.String**| The key of the app, as defined in its descriptor. |
 **propertyKey** | **kotlin.String**| The key of the property. |

### Return type

[**EntityProperty**](EntityProperty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="addonPropertiesResourcePutAddonPropertyPut"></a>
# **addonPropertiesResourcePutAddonPropertyPut**
> OperationMessage addonPropertiesResourcePutAddonPropertyPut(addonKey, propertyKey, body)

Set app property

Sets the value of an app&#39;s property. Use this resource to store custom data for your app.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppPropertiesApi()
val addonKey : kotlin.String = addonKey_example // kotlin.String | The key of the app, as defined in its descriptor.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the property.
val body : kotlin.Any =  // kotlin.Any | 
try {
    val result : OperationMessage = apiInstance.addonPropertiesResourcePutAddonPropertyPut(addonKey, propertyKey, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppPropertiesApi#addonPropertiesResourcePutAddonPropertyPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppPropertiesApi#addonPropertiesResourcePutAddonPropertyPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addonKey** | **kotlin.String**| The key of the app, as defined in its descriptor. |
 **propertyKey** | **kotlin.String**| The key of the property. |
 **body** | **kotlin.Any**|  |

### Return type

[**OperationMessage**](OperationMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

