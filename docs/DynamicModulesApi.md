# DynamicModulesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dynamicModulesResourceGetModulesGet**](DynamicModulesApi.md#dynamicModulesResourceGetModulesGet) | **GET** /rest/atlassian-connect/1/app/module/dynamic | Get modules
[**dynamicModulesResourceRegisterModulesPost**](DynamicModulesApi.md#dynamicModulesResourceRegisterModulesPost) | **POST** /rest/atlassian-connect/1/app/module/dynamic | Register modules
[**dynamicModulesResourceRemoveModulesDelete**](DynamicModulesApi.md#dynamicModulesResourceRemoveModulesDelete) | **DELETE** /rest/atlassian-connect/1/app/module/dynamic | Remove modules


<a name="dynamicModulesResourceGetModulesGet"></a>
# **dynamicModulesResourceGetModulesGet**
> kotlin.collections.Map&lt;kotlin.String, kotlin.Array&lt;kotlin.Any&gt;&gt; dynamicModulesResourceGetModulesGet()

Get modules

Returns all modules registered dynamically by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DynamicModulesApi()
try {
    val result : kotlin.collections.Map<kotlin.String, kotlin.Array<kotlin.Any>> = apiInstance.dynamicModulesResourceGetModulesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DynamicModulesApi#dynamicModulesResourceGetModulesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicModulesApi#dynamicModulesResourceGetModulesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.Array&lt;kotlin.Any&gt;&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dynamicModulesResourceRegisterModulesPost"></a>
# **dynamicModulesResourceRegisterModulesPost**
> dynamicModulesResourceRegisterModulesPost(requestBody)

Register modules

Registers a list of modules.  **[Permissions](#permissions) required:** Only Connect apps can make this request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DynamicModulesApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Array<kotlin.Any>> =  // kotlin.collections.Map<kotlin.String, kotlin.Array<kotlin.Any>> | 
try {
    apiInstance.dynamicModulesResourceRegisterModulesPost(requestBody)
} catch (e: ClientException) {
    println("4xx response calling DynamicModulesApi#dynamicModulesResourceRegisterModulesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicModulesApi#dynamicModulesResourceRegisterModulesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Array&lt;kotlin.Any&gt;&gt;**](kotlin.Array.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dynamicModulesResourceRemoveModulesDelete"></a>
# **dynamicModulesResourceRemoveModulesDelete**
> dynamicModulesResourceRemoveModulesDelete(moduleKey)

Remove modules

Remove all or a list of modules registered by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DynamicModulesApi()
val moduleKey : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, `moduleKey=dynamic-attachment-entity-property&moduleKey=dynamic-select-field`. Nonexistent keys are ignored.
try {
    apiInstance.dynamicModulesResourceRemoveModulesDelete(moduleKey)
} catch (e: ClientException) {
    println("4xx response calling DynamicModulesApi#dynamicModulesResourceRemoveModulesDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicModulesApi#dynamicModulesResourceRemoveModulesDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moduleKey** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, &#x60;moduleKey&#x3D;dynamic-attachment-entity-property&amp;moduleKey&#x3D;dynamic-select-field&#x60;. Nonexistent keys are ignored. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

