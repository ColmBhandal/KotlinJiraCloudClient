# WorkflowStatusCategoriesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoriesGet**](WorkflowStatusCategoriesApi.md#comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoriesGet) | **GET** /rest/api/3/statuscategory | Get all status categories
[**comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoryGet**](WorkflowStatusCategoriesApi.md#comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoryGet) | **GET** /rest/api/3/statuscategory/{idOrKey} | Get status category


<a name="comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoriesGet"></a>
# **comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoriesGet**
> kotlin.Array&lt;StatusCategory&gt; comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoriesGet()

Get all status categories

Returns a list of all status categories.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowStatusCategoriesApi()
try {
    val result : kotlin.Array<StatusCategory> = apiInstance.comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoriesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowStatusCategoriesApi#comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoriesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowStatusCategoriesApi#comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoriesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;StatusCategory&gt;**](StatusCategory.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoryGet"></a>
# **comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoryGet**
> StatusCategory comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoryGet(idOrKey)

Get status category

Returns a status category. Status categories provided a mechanism for categorizing [statuses](#api-rest-api-3-status-idOrName-get).  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkflowStatusCategoriesApi()
val idOrKey : kotlin.String = idOrKey_example // kotlin.String | The ID or key of the status category.
try {
    val result : StatusCategory = apiInstance.comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoryGet(idOrKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowStatusCategoriesApi#comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoryGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowStatusCategoriesApi#comAtlassianJiraRestV2IssueStatusCategoryResourceGetStatusCategoryGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrKey** | **kotlin.String**| The ID or key of the status category. |

### Return type

[**StatusCategory**](StatusCategory.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

