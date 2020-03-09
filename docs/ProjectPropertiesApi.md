# ProjectPropertiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueProjectPropertyResourceDeleteProjectPropertyDelete**](ProjectPropertiesApi.md#comAtlassianJiraRestV2IssueProjectPropertyResourceDeleteProjectPropertyDelete) | **DELETE** /rest/api/3/project/{projectIdOrKey}/properties/{propertyKey} | Delete project property
[**comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyGet**](ProjectPropertiesApi.md#comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyGet) | **GET** /rest/api/3/project/{projectIdOrKey}/properties/{propertyKey} | Get project property
[**comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyKeysGet**](ProjectPropertiesApi.md#comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyKeysGet) | **GET** /rest/api/3/project/{projectIdOrKey}/properties | Get project property keys
[**comAtlassianJiraRestV2IssueProjectPropertyResourceSetProjectPropertyPut**](ProjectPropertiesApi.md#comAtlassianJiraRestV2IssueProjectPropertyResourceSetProjectPropertyPut) | **PUT** /rest/api/3/project/{projectIdOrKey}/properties/{propertyKey} | Set project property


<a name="comAtlassianJiraRestV2IssueProjectPropertyResourceDeleteProjectPropertyDelete"></a>
# **comAtlassianJiraRestV2IssueProjectPropertyResourceDeleteProjectPropertyDelete**
> comAtlassianJiraRestV2IssueProjectPropertyResourceDeleteProjectPropertyDelete(projectIdOrKey, propertyKey)

Delete project property

Deletes the [property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) from a project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the property.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectPropertiesApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The project property key. Use [Get project property keys](#api-rest-api-3-project-projectIdOrKey-properties-get) to get a list of all project property keys.
try {
    apiInstance.comAtlassianJiraRestV2IssueProjectPropertyResourceDeleteProjectPropertyDelete(projectIdOrKey, propertyKey)
} catch (e: ClientException) {
    println("4xx response calling ProjectPropertiesApi#comAtlassianJiraRestV2IssueProjectPropertyResourceDeleteProjectPropertyDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectPropertiesApi#comAtlassianJiraRestV2IssueProjectPropertyResourceDeleteProjectPropertyDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |
 **propertyKey** | **kotlin.String**| The project property key. Use [Get project property keys](#api-rest-api-3-project-projectIdOrKey-properties-get) to get a list of all project property keys. |

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

<a name="comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyGet"></a>
# **comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyGet**
> EntityProperty comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyGet(projectIdOrKey, propertyKey)

Get project property

Returns the value of a [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the property.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectPropertiesApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The project property key. Use [Get project property keys](#api-rest-api-3-project-projectIdOrKey-properties-get) to get a list of all project property keys.
try {
    val result : EntityProperty = apiInstance.comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyGet(projectIdOrKey, propertyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectPropertiesApi#comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectPropertiesApi#comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |
 **propertyKey** | **kotlin.String**| The project property key. Use [Get project property keys](#api-rest-api-3-project-projectIdOrKey-properties-get) to get a list of all project property keys. |

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

<a name="comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyKeysGet"></a>
# **comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyKeysGet**
> PropertyKeys comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyKeysGet(projectIdOrKey)

Get project property keys

Returns all [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) keys for the project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectPropertiesApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
try {
    val result : PropertyKeys = apiInstance.comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyKeysGet(projectIdOrKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectPropertiesApi#comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyKeysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectPropertiesApi#comAtlassianJiraRestV2IssueProjectPropertyResourceGetProjectPropertyKeysGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |

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

<a name="comAtlassianJiraRestV2IssueProjectPropertyResourceSetProjectPropertyPut"></a>
# **comAtlassianJiraRestV2IssueProjectPropertyResourceSetProjectPropertyPut**
> kotlin.Any comAtlassianJiraRestV2IssueProjectPropertyResourceSetProjectPropertyPut(projectIdOrKey, propertyKey, body)

Set project property

Sets the value of the [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties). You can use project properties to store custom data against the project.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the property is created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectPropertiesApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the project property. The maximum length is 255 characters.
val body : kotlin.Any = {"number":5,"string":"string-value"} // kotlin.Any | 
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueProjectPropertyResourceSetProjectPropertyPut(projectIdOrKey, propertyKey, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectPropertiesApi#comAtlassianJiraRestV2IssueProjectPropertyResourceSetProjectPropertyPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectPropertiesApi#comAtlassianJiraRestV2IssueProjectPropertyResourceSetProjectPropertyPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |
 **propertyKey** | **kotlin.String**| The key of the project property. The maximum length is 255 characters. |
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

