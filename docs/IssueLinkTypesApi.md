# IssueLinkTypesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueIssueLinkTypeResourceCreateIssueLinkTypePost**](IssueLinkTypesApi.md#comAtlassianJiraRestV2IssueIssueLinkTypeResourceCreateIssueLinkTypePost) | **POST** /rest/api/3/issueLinkType | Create issue link type
[**comAtlassianJiraRestV2IssueIssueLinkTypeResourceDeleteIssueLinkTypeDelete**](IssueLinkTypesApi.md#comAtlassianJiraRestV2IssueIssueLinkTypeResourceDeleteIssueLinkTypeDelete) | **DELETE** /rest/api/3/issueLinkType/{issueLinkTypeId} | Delete issue link type
[**comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypeGet**](IssueLinkTypesApi.md#comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypeGet) | **GET** /rest/api/3/issueLinkType/{issueLinkTypeId} | Get issue link type
[**comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypesGet**](IssueLinkTypesApi.md#comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypesGet) | **GET** /rest/api/3/issueLinkType | Get issue link types
[**comAtlassianJiraRestV2IssueIssueLinkTypeResourceUpdateIssueLinkTypePut**](IssueLinkTypesApi.md#comAtlassianJiraRestV2IssueIssueLinkTypeResourceUpdateIssueLinkTypePut) | **PUT** /rest/api/3/issueLinkType/{issueLinkTypeId} | Update issue link type


<a name="comAtlassianJiraRestV2IssueIssueLinkTypeResourceCreateIssueLinkTypePost"></a>
# **comAtlassianJiraRestV2IssueIssueLinkTypeResourceCreateIssueLinkTypePost**
> IssueLinkType comAtlassianJiraRestV2IssueIssueLinkTypeResourceCreateIssueLinkTypePost(issueLinkType)

Create issue link type

Creates an issue link type. Use this operation to create descriptions of the reasons why issues are linked. The issue link type consists of a name and descriptions for a link&#39;s inward and outward relationships.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueLinkTypesApi()
val issueLinkType : IssueLinkType = {"inward":"Duplicated by","name":"Duplicate","outward":"Duplicates"} // IssueLinkType | 
try {
    val result : IssueLinkType = apiInstance.comAtlassianJiraRestV2IssueIssueLinkTypeResourceCreateIssueLinkTypePost(issueLinkType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueLinkTypesApi#comAtlassianJiraRestV2IssueIssueLinkTypeResourceCreateIssueLinkTypePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueLinkTypesApi#comAtlassianJiraRestV2IssueIssueLinkTypeResourceCreateIssueLinkTypePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueLinkType** | [**IssueLinkType**](IssueLinkType.md)|  |

### Return type

[**IssueLinkType**](IssueLinkType.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueLinkTypeResourceDeleteIssueLinkTypeDelete"></a>
# **comAtlassianJiraRestV2IssueIssueLinkTypeResourceDeleteIssueLinkTypeDelete**
> comAtlassianJiraRestV2IssueIssueLinkTypeResourceDeleteIssueLinkTypeDelete(issueLinkTypeId)

Delete issue link type

Deletes an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueLinkTypesApi()
val issueLinkTypeId : kotlin.String = issueLinkTypeId_example // kotlin.String | The ID of the issue link type.
try {
    apiInstance.comAtlassianJiraRestV2IssueIssueLinkTypeResourceDeleteIssueLinkTypeDelete(issueLinkTypeId)
} catch (e: ClientException) {
    println("4xx response calling IssueLinkTypesApi#comAtlassianJiraRestV2IssueIssueLinkTypeResourceDeleteIssueLinkTypeDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueLinkTypesApi#comAtlassianJiraRestV2IssueIssueLinkTypeResourceDeleteIssueLinkTypeDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueLinkTypeId** | **kotlin.String**| The ID of the issue link type. |

### Return type

null (empty response body)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypeGet"></a>
# **comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypeGet**
> IssueLinkType comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypeGet(issueLinkTypeId)

Get issue link type

Returns an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueLinkTypesApi()
val issueLinkTypeId : kotlin.String = issueLinkTypeId_example // kotlin.String | The ID of the issue link type.
try {
    val result : IssueLinkType = apiInstance.comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypeGet(issueLinkTypeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueLinkTypesApi#comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueLinkTypesApi#comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueLinkTypeId** | **kotlin.String**| The ID of the issue link type. |

### Return type

[**IssueLinkType**](IssueLinkType.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypesGet"></a>
# **comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypesGet**
> IssueLinkTypes comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypesGet()

Get issue link types

Returns a list of all issue link types.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueLinkTypesApi()
try {
    val result : IssueLinkTypes = apiInstance.comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueLinkTypesApi#comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueLinkTypesApi#comAtlassianJiraRestV2IssueIssueLinkTypeResourceGetIssueLinkTypesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IssueLinkTypes**](IssueLinkTypes.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueLinkTypeResourceUpdateIssueLinkTypePut"></a>
# **comAtlassianJiraRestV2IssueIssueLinkTypeResourceUpdateIssueLinkTypePut**
> IssueLinkType comAtlassianJiraRestV2IssueIssueLinkTypeResourceUpdateIssueLinkTypePut(issueLinkTypeId, issueLinkType)

Update issue link type

Updates an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueLinkTypesApi()
val issueLinkTypeId : kotlin.String = issueLinkTypeId_example // kotlin.String | The ID of the issue link type.
val issueLinkType : IssueLinkType = {"inward":"Duplicated by","name":"Duplicate","outward":"Duplicates"} // IssueLinkType | 
try {
    val result : IssueLinkType = apiInstance.comAtlassianJiraRestV2IssueIssueLinkTypeResourceUpdateIssueLinkTypePut(issueLinkTypeId, issueLinkType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueLinkTypesApi#comAtlassianJiraRestV2IssueIssueLinkTypeResourceUpdateIssueLinkTypePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueLinkTypesApi#comAtlassianJiraRestV2IssueIssueLinkTypeResourceUpdateIssueLinkTypePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueLinkTypeId** | **kotlin.String**| The ID of the issue link type. |
 **issueLinkType** | [**IssueLinkType**](IssueLinkType.md)|  |

### Return type

[**IssueLinkType**](IssueLinkType.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

