# IssueCommentPropertiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueCommentPropertyResourceDeleteCommentPropertyDelete**](IssueCommentPropertiesApi.md#comAtlassianJiraRestV2IssueCommentPropertyResourceDeleteCommentPropertyDelete) | **DELETE** /rest/api/3/comment/{commentId}/properties/{propertyKey} | Delete comment property
[**comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyGet**](IssueCommentPropertiesApi.md#comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyGet) | **GET** /rest/api/3/comment/{commentId}/properties/{propertyKey} | Get comment property
[**comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyKeysGet**](IssueCommentPropertiesApi.md#comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyKeysGet) | **GET** /rest/api/3/comment/{commentId}/properties | Get comment property keys
[**comAtlassianJiraRestV2IssueCommentPropertyResourceSetCommentPropertyPut**](IssueCommentPropertiesApi.md#comAtlassianJiraRestV2IssueCommentPropertyResourceSetCommentPropertyPut) | **PUT** /rest/api/3/comment/{commentId}/properties/{propertyKey} | Set comment property


<a name="comAtlassianJiraRestV2IssueCommentPropertyResourceDeleteCommentPropertyDelete"></a>
# **comAtlassianJiraRestV2IssueCommentPropertyResourceDeleteCommentPropertyDelete**
> comAtlassianJiraRestV2IssueCommentPropertyResourceDeleteCommentPropertyDelete(commentId, propertyKey)

Delete comment property

Deletes a comment property.  **[Permissions](#permissions) required:** either of:   *  *Edit All Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete a property from any comment.  *  *Edit Own Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete a property from a comment created by the user.  Also, when the visibility of a comment is restricted to a role or group the user must be a member of that role or group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCommentPropertiesApi()
val commentId : kotlin.String = commentId_example // kotlin.String | The ID of the comment.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the property.
try {
    apiInstance.comAtlassianJiraRestV2IssueCommentPropertyResourceDeleteCommentPropertyDelete(commentId, propertyKey)
} catch (e: ClientException) {
    println("4xx response calling IssueCommentPropertiesApi#comAtlassianJiraRestV2IssueCommentPropertyResourceDeleteCommentPropertyDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCommentPropertiesApi#comAtlassianJiraRestV2IssueCommentPropertyResourceDeleteCommentPropertyDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **kotlin.String**| The ID of the comment. |
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

<a name="comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyGet"></a>
# **comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyGet**
> EntityProperty comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyGet(commentId, propertyKey)

Get comment property

Returns the value of a comment property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCommentPropertiesApi()
val commentId : kotlin.String = commentId_example // kotlin.String | The ID of the comment.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the property.
try {
    val result : EntityProperty = apiInstance.comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyGet(commentId, propertyKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCommentPropertiesApi#comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCommentPropertiesApi#comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **kotlin.String**| The ID of the comment. |
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

<a name="comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyKeysGet"></a>
# **comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyKeysGet**
> PropertyKeys comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyKeysGet(commentId)

Get comment property keys

Returns the keys of all the properties of a comment.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCommentPropertiesApi()
val commentId : kotlin.String = commentId_example // kotlin.String | The ID of the comment.
try {
    val result : PropertyKeys = apiInstance.comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyKeysGet(commentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCommentPropertiesApi#comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyKeysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCommentPropertiesApi#comAtlassianJiraRestV2IssueCommentPropertyResourceGetCommentPropertyKeysGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **kotlin.String**| The ID of the comment. |

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

<a name="comAtlassianJiraRestV2IssueCommentPropertyResourceSetCommentPropertyPut"></a>
# **comAtlassianJiraRestV2IssueCommentPropertyResourceSetCommentPropertyPut**
> kotlin.Any comAtlassianJiraRestV2IssueCommentPropertyResourceSetCommentPropertyPut(commentId, propertyKey, body)

Set comment property

Creates or updates the value of a property for a comment. Use this resource to store custom data against a comment.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** either of:   *  *Edit All Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to create or update the value of a property on any comment.  *  *Edit Own Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to create or update the value of a property on a comment created by the user.  Also, when the visibility of a comment is restricted to a role or group the user must be a member of that role or group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCommentPropertiesApi()
val commentId : kotlin.String = commentId_example // kotlin.String | The ID of the comment.
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the property. The maximum length is 255 characters.
val body : kotlin.Any =  // kotlin.Any | 
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueCommentPropertyResourceSetCommentPropertyPut(commentId, propertyKey, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCommentPropertiesApi#comAtlassianJiraRestV2IssueCommentPropertyResourceSetCommentPropertyPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCommentPropertiesApi#comAtlassianJiraRestV2IssueCommentPropertyResourceSetCommentPropertyPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commentId** | **kotlin.String**| The ID of the comment. |
 **propertyKey** | **kotlin.String**| The key of the property. The maximum length is 255 characters. |
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

