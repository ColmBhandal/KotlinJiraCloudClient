# IssueTypePropertiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueIssueTypePropertyResourceDeleteIssueTypePropertyDelete**](IssueTypePropertiesApi.md#comAtlassianJiraRestV2IssueIssueTypePropertyResourceDeleteIssueTypePropertyDelete) | **DELETE** /rest/api/3/issuetype/{issueTypeId}/properties/{propertyKey} | Delete issue type property
[**comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyGet**](IssueTypePropertiesApi.md#comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyGet) | **GET** /rest/api/3/issuetype/{issueTypeId}/properties/{propertyKey} | Get issue type property
[**comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyKeysGet**](IssueTypePropertiesApi.md#comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyKeysGet) | **GET** /rest/api/3/issuetype/{issueTypeId}/properties | Get issue type property keys
[**comAtlassianJiraRestV2IssueIssueTypePropertyResourceSetIssueTypePropertyPut**](IssueTypePropertiesApi.md#comAtlassianJiraRestV2IssueIssueTypePropertyResourceSetIssueTypePropertyPut) | **PUT** /rest/api/3/issuetype/{issueTypeId}/properties/{propertyKey} | Set issue type property


<a name="comAtlassianJiraRestV2IssueIssueTypePropertyResourceDeleteIssueTypePropertyDelete"></a>
# **comAtlassianJiraRestV2IssueIssueTypePropertyResourceDeleteIssueTypePropertyDelete**
> comAtlassianJiraRestV2IssueIssueTypePropertyResourceDeleteIssueTypePropertyDelete(issueTypeId, propertyKey)

Delete issue type property

Deletes the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueTypePropertiesApi()
val issueTypeId : kotlin.String = issueTypeId_example // kotlin.String | The ID of the issue type.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the property. Use [Get issue type property keys](#api-rest-api-3-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys.
try {
    apiInstance.comAtlassianJiraRestV2IssueIssueTypePropertyResourceDeleteIssueTypePropertyDelete(issueTypeId, propertyKey)
} catch (e: ClientException) {
    println("4xx response calling IssueTypePropertiesApi#comAtlassianJiraRestV2IssueIssueTypePropertyResourceDeleteIssueTypePropertyDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueTypePropertiesApi#comAtlassianJiraRestV2IssueIssueTypePropertyResourceDeleteIssueTypePropertyDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueTypeId** | **kotlin.String**| The ID of the issue type. |
 **propertyKey** | **kotlin.String**| The key of the property. Use [Get issue type property keys](#api-rest-api-3-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys. |

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

<a name="comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyGet"></a>
# **comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyGet**
> EntityProperty comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyGet(issueTypeId, propertyKey)

Get issue type property

Returns the key and value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the details of any issue type.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the details of any issue types associated with the projects the user has permission to browse.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueTypePropertiesApi()
val issueTypeId : kotlin.String = issueTypeId_example // kotlin.String | The ID of the issue type.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the property. Use [Get issue type property keys](#api-rest-api-3-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys.
try {
    val result : EntityProperty = apiInstance.comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyGet(issueTypeId, propertyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueTypePropertiesApi#comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueTypePropertiesApi#comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueTypeId** | **kotlin.String**| The ID of the issue type. |
 **propertyKey** | **kotlin.String**| The key of the property. Use [Get issue type property keys](#api-rest-api-3-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys. |

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

<a name="comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyKeysGet"></a>
# **comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyKeysGet**
> PropertyKeys comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyKeysGet(issueTypeId)

Get issue type property keys

Returns all the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) keys of the issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the property keys of any issue type.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the property keys of any issue types associated with the projects the user has permission to browse.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueTypePropertiesApi()
val issueTypeId : kotlin.String = issueTypeId_example // kotlin.String | The ID of the issue type.
try {
    val result : PropertyKeys = apiInstance.comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyKeysGet(issueTypeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueTypePropertiesApi#comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyKeysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueTypePropertiesApi#comAtlassianJiraRestV2IssueIssueTypePropertyResourceGetIssueTypePropertyKeysGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueTypeId** | **kotlin.String**| The ID of the issue type. |

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

<a name="comAtlassianJiraRestV2IssueIssueTypePropertyResourceSetIssueTypePropertyPut"></a>
# **comAtlassianJiraRestV2IssueIssueTypePropertyResourceSetIssueTypePropertyPut**
> kotlin.Any comAtlassianJiraRestV2IssueIssueTypePropertyResourceSetIssueTypePropertyPut(issueTypeId, propertyKey, body)

Set issue type property

Creates or updates the value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties). Use this resource to store and update data against an issue type.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueTypePropertiesApi()
val issueTypeId : kotlin.String = issueTypeId_example // kotlin.String | The ID of the issue type.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the issue type property. The maximum length is 255 characters.
val body : kotlin.Any = {"number":5,"string":"string-value"} // kotlin.Any | 
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueIssueTypePropertyResourceSetIssueTypePropertyPut(issueTypeId, propertyKey, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueTypePropertiesApi#comAtlassianJiraRestV2IssueIssueTypePropertyResourceSetIssueTypePropertyPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueTypePropertiesApi#comAtlassianJiraRestV2IssueIssueTypePropertyResourceSetIssueTypePropertyPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueTypeId** | **kotlin.String**| The ID of the issue type. |
 **propertyKey** | **kotlin.String**| The key of the issue type property. The maximum length is 255 characters. |
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

