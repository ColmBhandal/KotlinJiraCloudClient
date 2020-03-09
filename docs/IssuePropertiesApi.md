# IssuePropertiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueIssuePropertyResourceDeleteIssuePropertyDelete**](IssuePropertiesApi.md#comAtlassianJiraRestV2IssueIssuePropertyResourceDeleteIssuePropertyDelete) | **DELETE** /rest/api/3/issue/{issueIdOrKey}/properties/{propertyKey} | Delete issue property
[**comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyGet**](IssuePropertiesApi.md#comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/properties/{propertyKey} | Get issue property
[**comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyKeysGet**](IssuePropertiesApi.md#comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyKeysGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/properties | Get issue property keys
[**comAtlassianJiraRestV2IssueIssuePropertyResourceSetIssuePropertyPut**](IssuePropertiesApi.md#comAtlassianJiraRestV2IssueIssuePropertyResourceSetIssuePropertyPut) | **PUT** /rest/api/3/issue/{issueIdOrKey}/properties/{propertyKey} | Set issue property
[**comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkDeleteIssuePropertyDelete**](IssuePropertiesApi.md#comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkDeleteIssuePropertyDelete) | **DELETE** /rest/api/3/issue/properties/{propertyKey} | Bulk delete issue property
[**comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuePropertyPut**](IssuePropertiesApi.md#comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuePropertyPut) | **PUT** /rest/api/3/issue/properties/{propertyKey} | Bulk set issue property
[**comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuesPropertiesPost**](IssuePropertiesApi.md#comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuesPropertiesPost) | **POST** /rest/api/3/issue/properties | Bulk set issues properties


<a name="comAtlassianJiraRestV2IssueIssuePropertyResourceDeleteIssuePropertyDelete"></a>
# **comAtlassianJiraRestV2IssueIssuePropertyResourceDeleteIssuePropertyDelete**
> comAtlassianJiraRestV2IssueIssuePropertyResourceDeleteIssuePropertyDelete(issueIdOrKey, propertyKey)

Delete issue property

Deletes an issue&#39;s property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuePropertiesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The key or ID of the issue.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the property.
try {
    apiInstance.comAtlassianJiraRestV2IssueIssuePropertyResourceDeleteIssuePropertyDelete(issueIdOrKey, propertyKey)
} catch (e: ClientException) {
    println("4xx response calling IssuePropertiesApi#comAtlassianJiraRestV2IssueIssuePropertyResourceDeleteIssuePropertyDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuePropertiesApi#comAtlassianJiraRestV2IssueIssuePropertyResourceDeleteIssuePropertyDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The key or ID of the issue. |
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

<a name="comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyGet"></a>
# **comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyGet**
> EntityProperty comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyGet(issueIdOrKey, propertyKey)

Get issue property

Returns the key and value of an issue&#39;s property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuePropertiesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The key or ID of the issue.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the property.
try {
    val result : EntityProperty = apiInstance.comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyGet(issueIdOrKey, propertyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuePropertiesApi#comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuePropertiesApi#comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The key or ID of the issue. |
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

<a name="comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyKeysGet"></a>
# **comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyKeysGet**
> PropertyKeys comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyKeysGet(issueIdOrKey)

Get issue property keys

Returns the URLs and keys of an issue&#39;s properties.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Property details are only returned where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuePropertiesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The key or ID of the issue.
try {
    val result : PropertyKeys = apiInstance.comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyKeysGet(issueIdOrKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuePropertiesApi#comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyKeysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuePropertiesApi#comAtlassianJiraRestV2IssueIssuePropertyResourceGetIssuePropertyKeysGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The key or ID of the issue. |

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

<a name="comAtlassianJiraRestV2IssueIssuePropertyResourceSetIssuePropertyPut"></a>
# **comAtlassianJiraRestV2IssueIssuePropertyResourceSetIssuePropertyPut**
> kotlin.Any comAtlassianJiraRestV2IssueIssuePropertyResourceSetIssuePropertyPut(issueIdOrKey, propertyKey, body)

Set issue property

Sets the value of an issue&#39;s property. Use this resource to store custom data against an issue.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuePropertiesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the issue property. The maximum length is 255 characters.
val body : kotlin.Any =  // kotlin.Any | 
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueIssuePropertyResourceSetIssuePropertyPut(issueIdOrKey, propertyKey, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuePropertiesApi#comAtlassianJiraRestV2IssueIssuePropertyResourceSetIssuePropertyPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuePropertiesApi#comAtlassianJiraRestV2IssueIssuePropertyResourceSetIssuePropertyPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
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

<a name="comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkDeleteIssuePropertyDelete"></a>
# **comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkDeleteIssuePropertyDelete**
> comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkDeleteIssuePropertyDelete(propertyKey, issueFilterForBulkPropertyDelete)

Bulk delete issue property

Deletes a property value from multiple issues. The issues to be updated can be specified by filter criteria.  The criteria the filter used to identify eligible issues are:   *  &#x60;entityIds&#x60; Only issues from this list are eligible.  *  &#x60;currentValue&#x60; Only issues with the property set to this value are eligible.  If both criteria is specified, they are joined with the logical *AND*: only issues that satisfy both criteria are considered eligible.  If no filter criteria are specified, all the issues visible to the user and where the user has the EDIT\\_ISSUES permission for the issue are considered eligible.  This operation is:   *  transactional, either the property is deleted from all eligible issues or, when errors occur, no properties are deleted.  *  [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:**   *  *Browse projects* [ project permission](https://confluence.atlassian.com/x/yodKLg) for each project containing issues.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for each issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuePropertiesApi()
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the property.
val issueFilterForBulkPropertyDelete : IssueFilterForBulkPropertyDelete = {"entityIds":[10100,100010],"currentValue":"deprecated value"} // IssueFilterForBulkPropertyDelete | 
try {
    apiInstance.comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkDeleteIssuePropertyDelete(propertyKey, issueFilterForBulkPropertyDelete)
} catch (e: ClientException) {
    println("4xx response calling IssuePropertiesApi#comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkDeleteIssuePropertyDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuePropertiesApi#comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkDeleteIssuePropertyDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyKey** | **kotlin.String**| The key of the property. |
 **issueFilterForBulkPropertyDelete** | [**IssueFilterForBulkPropertyDelete**](IssueFilterForBulkPropertyDelete.md)|  |

### Return type

null (empty response body)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuePropertyPut"></a>
# **comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuePropertyPut**
> comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuePropertyPut(propertyKey, bulkIssuePropertyUpdateRequest)

Bulk set issue property

Sets a property value on multiple issues. The issues to be updated can be specified by a filter.  The filter identifies issues eligible for update using these criteria:   *  &#x60;entityIds&#x60; Only issues from this list are eligible.  *  &#x60;currentValue&#x60; Only issues with the property set to this value are eligible.  *  &#x60;hasProperty&#x60;:           *  If *true*, only issues with the property are eligible.      *  If *false*, only issues without the property are eligible.  If more than one criteria is specified, they are joined with the logical *AND*: only issues that satisfy all criteria are eligible.  If an invalid combination of criteria is provided, an error is returned. For example, specifying a &#x60;currentValue&#x60; and &#x60;hasProperty&#x60; as *false* would not match any issues (because without the property the property cannot have a value).  The filter is optional. Without the filter all the issues visible to the user and where the user has the EDIT\\_ISSUES permission for the issue are considered eligible.  This operation is:   *  transactional, either all eligible issues are updated or, when errors occur, none are updated.  *  [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for each project containing issues.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for each issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuePropertiesApi()
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the property. The maximum length is 255 characters.
val bulkIssuePropertyUpdateRequest : BulkIssuePropertyUpdateRequest = {"filter":{"hasProperty":true,"entityIds":[10100,100010],"currentValue":{"owner":"admin","weight":50}},"value":{"owner":"admin","weight":100}} // BulkIssuePropertyUpdateRequest | 
try {
    apiInstance.comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuePropertyPut(propertyKey, bulkIssuePropertyUpdateRequest)
} catch (e: ClientException) {
    println("4xx response calling IssuePropertiesApi#comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuePropertyPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuePropertiesApi#comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuePropertyPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyKey** | **kotlin.String**| The key of the property. The maximum length is 255 characters. |
 **bulkIssuePropertyUpdateRequest** | [**BulkIssuePropertyUpdateRequest**](BulkIssuePropertyUpdateRequest.md)|  |

### Return type

null (empty response body)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuesPropertiesPost"></a>
# **comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuesPropertiesPost**
> comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuesPropertiesPost(issueEntityProperties)

Bulk set issues properties

Sets the values of entity properties on issues. It can set up to 10 entity properties on up to 10,000 issues.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON. The maximum length of single issue property value is 32768 characters. This operation can be accessed anonymously.  This operation is:   *  transactional, either all properties are updated in all eligible issues or, when errors occur, no properties are updated.  *  [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuePropertiesApi()
val issueEntityProperties : IssueEntityProperties =  // IssueEntityProperties | Issue properties to be set or updated with values.
try {
    apiInstance.comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuesPropertiesPost(issueEntityProperties)
} catch (e: ClientException) {
    println("4xx response calling IssuePropertiesApi#comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuesPropertiesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuePropertiesApi#comAtlassianJiraRestV2PropertyIssuePropertyBulkUpdateResourceBulkSetIssuesPropertiesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueEntityProperties** | [**IssueEntityProperties**](IssueEntityProperties.md)| Issue properties to be set or updated with values. |

### Return type

null (empty response body)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

