# IssueWorklogPropertiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueWorklogPropertyResourceDeleteWorklogPropertyDelete**](IssueWorklogPropertiesApi.md#comAtlassianJiraRestV2IssueWorklogPropertyResourceDeleteWorklogPropertyDelete) | **DELETE** /rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey} | Delete worklog property
[**comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyGet**](IssueWorklogPropertiesApi.md#comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey} | Get worklog property
[**comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyKeysGet**](IssueWorklogPropertiesApi.md#comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyKeysGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties | Get worklog property keys
[**comAtlassianJiraRestV2IssueWorklogPropertyResourceSetWorklogPropertyPut**](IssueWorklogPropertiesApi.md#comAtlassianJiraRestV2IssueWorklogPropertyResourceSetWorklogPropertyPut) | **PUT** /rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey} | Set worklog property


<a name="comAtlassianJiraRestV2IssueWorklogPropertyResourceDeleteWorklogPropertyDelete"></a>
# **comAtlassianJiraRestV2IssueWorklogPropertyResourceDeleteWorklogPropertyDelete**
> comAtlassianJiraRestV2IssueWorklogPropertyResourceDeleteWorklogPropertyDelete(issueIdOrKey, worklogId, propertyKey)

Delete worklog property

Deletes a worklog property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWorklogPropertiesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val worklogId : kotlin.String = worklogId_example // kotlin.String | The ID of the worklog.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the property.
try {
    apiInstance.comAtlassianJiraRestV2IssueWorklogPropertyResourceDeleteWorklogPropertyDelete(issueIdOrKey, worklogId, propertyKey)
} catch (e: ClientException) {
    println("4xx response calling IssueWorklogPropertiesApi#comAtlassianJiraRestV2IssueWorklogPropertyResourceDeleteWorklogPropertyDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWorklogPropertiesApi#comAtlassianJiraRestV2IssueWorklogPropertyResourceDeleteWorklogPropertyDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **worklogId** | **kotlin.String**| The ID of the worklog. |
 **propertyKey** | **kotlin.String**| The key of the property. |

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

<a name="comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyGet"></a>
# **comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyGet**
> EntityProperty comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyGet(issueIdOrKey, worklogId, propertyKey)

Get worklog property

Returns the value of a worklog property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWorklogPropertiesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val worklogId : kotlin.String = worklogId_example // kotlin.String | The ID of the worklog.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the property.
try {
    val result : EntityProperty = apiInstance.comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyGet(issueIdOrKey, worklogId, propertyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueWorklogPropertiesApi#comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWorklogPropertiesApi#comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **worklogId** | **kotlin.String**| The ID of the worklog. |
 **propertyKey** | **kotlin.String**| The key of the property. |

### Return type

[**EntityProperty**](EntityProperty.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyKeysGet"></a>
# **comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyKeysGet**
> PropertyKeys comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyKeysGet(issueIdOrKey, worklogId)

Get worklog property keys

Returns the keys of all properties for a worklog.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWorklogPropertiesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val worklogId : kotlin.String = worklogId_example // kotlin.String | The ID of the worklog.
try {
    val result : PropertyKeys = apiInstance.comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyKeysGet(issueIdOrKey, worklogId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueWorklogPropertiesApi#comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyKeysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWorklogPropertiesApi#comAtlassianJiraRestV2IssueWorklogPropertyResourceGetWorklogPropertyKeysGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **worklogId** | **kotlin.String**| The ID of the worklog. |

### Return type

[**PropertyKeys**](PropertyKeys.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueWorklogPropertyResourceSetWorklogPropertyPut"></a>
# **comAtlassianJiraRestV2IssueWorklogPropertyResourceSetWorklogPropertyPut**
> kotlin.Any comAtlassianJiraRestV2IssueWorklogPropertyResourceSetWorklogPropertyPut(issueIdOrKey, worklogId, propertyKey, body)

Set worklog property

Sets the value of a worklog property. Use this operation to store custom data against the worklog.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWorklogPropertiesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val worklogId : kotlin.String = worklogId_example // kotlin.String | The ID of the worklog.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the issue property. The maximum length is 255 characters.
val body : kotlin.Any =  // kotlin.Any | 
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueWorklogPropertyResourceSetWorklogPropertyPut(issueIdOrKey, worklogId, propertyKey, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueWorklogPropertiesApi#comAtlassianJiraRestV2IssueWorklogPropertyResourceSetWorklogPropertyPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWorklogPropertiesApi#comAtlassianJiraRestV2IssueWorklogPropertyResourceSetWorklogPropertyPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **worklogId** | **kotlin.String**| The ID of the worklog. |
 **propertyKey** | **kotlin.String**| The key of the issue property. The maximum length is 255 characters. |
 **body** | **kotlin.Any**|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

