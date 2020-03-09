# IssueResolutionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueResolutionResourceGetResolutionGet**](IssueResolutionsApi.md#comAtlassianJiraRestV2IssueResolutionResourceGetResolutionGet) | **GET** /rest/api/3/resolution/{id} | Get resolution
[**comAtlassianJiraRestV2IssueResolutionResourceGetResolutionsGet**](IssueResolutionsApi.md#comAtlassianJiraRestV2IssueResolutionResourceGetResolutionsGet) | **GET** /rest/api/3/resolution | Get resolutions


<a name="comAtlassianJiraRestV2IssueResolutionResourceGetResolutionGet"></a>
# **comAtlassianJiraRestV2IssueResolutionResourceGetResolutionGet**
> Resolution comAtlassianJiraRestV2IssueResolutionResourceGetResolutionGet(id)

Get resolution

Returns an issue resolution value.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueResolutionsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the issue resolution value.
try {
    val result : Resolution = apiInstance.comAtlassianJiraRestV2IssueResolutionResourceGetResolutionGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueResolutionsApi#comAtlassianJiraRestV2IssueResolutionResourceGetResolutionGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueResolutionsApi#comAtlassianJiraRestV2IssueResolutionResourceGetResolutionGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the issue resolution value. |

### Return type

[**Resolution**](Resolution.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueResolutionResourceGetResolutionsGet"></a>
# **comAtlassianJiraRestV2IssueResolutionResourceGetResolutionsGet**
> kotlin.Array&lt;Resolution&gt; comAtlassianJiraRestV2IssueResolutionResourceGetResolutionsGet()

Get resolutions

Returns a list of all issue resolution values.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueResolutionsApi()
try {
    val result : kotlin.Array<Resolution> = apiInstance.comAtlassianJiraRestV2IssueResolutionResourceGetResolutionsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueResolutionsApi#comAtlassianJiraRestV2IssueResolutionResourceGetResolutionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueResolutionsApi#comAtlassianJiraRestV2IssueResolutionResourceGetResolutionsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Resolution&gt;**](Resolution.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

