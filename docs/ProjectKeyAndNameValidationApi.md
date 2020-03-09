# ProjectKeyAndNameValidationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectKeyGet**](ProjectKeyAndNameValidationApi.md#comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectKeyGet) | **GET** /rest/api/3/projectvalidate/validProjectKey | Get valid project key
[**comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectNameGet**](ProjectKeyAndNameValidationApi.md#comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectNameGet) | **GET** /rest/api/3/projectvalidate/validProjectName | Get valid project name
[**comAtlassianJiraRestV2IssueProjectValidateResourceValidateProjectKeyGet**](ProjectKeyAndNameValidationApi.md#comAtlassianJiraRestV2IssueProjectValidateResourceValidateProjectKeyGet) | **GET** /rest/api/3/projectvalidate/key | Validate project key


<a name="comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectKeyGet"></a>
# **comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectKeyGet**
> kotlin.String comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectKeyGet(key)

Get valid project key

Validates a project key and, if the key is invalid or in use, generates a valid random string for the project key.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectKeyAndNameValidationApi()
val key : kotlin.String = HSP // kotlin.String | The project key.
try {
    val result : kotlin.String = apiInstance.comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectKeyGet(key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectKeyAndNameValidationApi#comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectKeyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectKeyAndNameValidationApi#comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectKeyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**| The project key. | [optional]

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectNameGet"></a>
# **comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectNameGet**
> kotlin.String comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectNameGet(name)

Get valid project name

Checks that a project name isn&#39;t in use. If the name isn&#39;t in use, the passed string is returned. If the name is in use, this operation attempts to generate a valid project name based on the one supplied, usually by adding a sequence number. If a valid project name cannot be generated, a 404 response is returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectKeyAndNameValidationApi()
val name : kotlin.String = name_example // kotlin.String | The project name.
try {
    val result : kotlin.String = apiInstance.comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectNameGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectKeyAndNameValidationApi#comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectNameGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectKeyAndNameValidationApi#comAtlassianJiraRestV2IssueProjectValidateResourceGetValidProjectNameGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| The project name. |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectValidateResourceValidateProjectKeyGet"></a>
# **comAtlassianJiraRestV2IssueProjectValidateResourceValidateProjectKeyGet**
> ErrorCollection comAtlassianJiraRestV2IssueProjectValidateResourceValidateProjectKeyGet(key)

Validate project key

Validates a project key by confirming the key is a valid string and not in use.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectKeyAndNameValidationApi()
val key : kotlin.String = HSP // kotlin.String | The project key.
try {
    val result : ErrorCollection = apiInstance.comAtlassianJiraRestV2IssueProjectValidateResourceValidateProjectKeyGet(key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectKeyAndNameValidationApi#comAtlassianJiraRestV2IssueProjectValidateResourceValidateProjectKeyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectKeyAndNameValidationApi#comAtlassianJiraRestV2IssueProjectValidateResourceValidateProjectKeyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**| The project key. | [optional]

### Return type

[**ErrorCollection**](ErrorCollection.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

