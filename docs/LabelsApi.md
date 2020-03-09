# LabelsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2LabelLabelResourceGetAllLabelsGet**](LabelsApi.md#comAtlassianJiraRestV2LabelLabelResourceGetAllLabelsGet) | **GET** /rest/api/3/label | Get all labels


<a name="comAtlassianJiraRestV2LabelLabelResourceGetAllLabelsGet"></a>
# **comAtlassianJiraRestV2LabelLabelResourceGetAllLabelsGet**
> PageBeanString comAtlassianJiraRestV2LabelLabelResourceGetAllLabelsGet(startAt, maxResults)

Get all labels

Returns a [paginated](#pagination) list of labels.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LabelsApi()
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanString = apiInstance.comAtlassianJiraRestV2LabelLabelResourceGetAllLabelsGet(startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LabelsApi#comAtlassianJiraRestV2LabelLabelResourceGetAllLabelsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LabelsApi#comAtlassianJiraRestV2LabelLabelResourceGetAllLabelsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 1000]

### Return type

[**PageBeanString**](PageBeanString.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

