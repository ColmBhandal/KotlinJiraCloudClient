# ProjectTypesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAccessibleProjectTypeByKeyGet**](ProjectTypesApi.md#comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAccessibleProjectTypeByKeyGet) | **GET** /rest/api/3/project/type/{projectTypeKey}/accessible | Get accessible project type by key
[**comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllAccessibleProjectTypesGet**](ProjectTypesApi.md#comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllAccessibleProjectTypesGet) | **GET** /rest/api/3/project/type/accessible | Get all accessible project types on the instance
[**comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllProjectTypesGet**](ProjectTypesApi.md#comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllProjectTypesGet) | **GET** /rest/api/3/project/type | Get all project types
[**comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetProjectTypeByKeyGet**](ProjectTypesApi.md#comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetProjectTypeByKeyGet) | **GET** /rest/api/3/project/type/{projectTypeKey} | Get project type by key


<a name="comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAccessibleProjectTypeByKeyGet"></a>
# **comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAccessibleProjectTypeByKeyGet**
> ProjectType comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAccessibleProjectTypeByKeyGet(projectTypeKey)

Get accessible project type by key

Returns a [project type](https://confluence.atlassian.com/x/Var1Nw) if it is accessible to the user.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTypesApi()
val projectTypeKey : kotlin.String = projectTypeKey_example // kotlin.String | The key of the project type.
try {
    val result : ProjectType = apiInstance.comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAccessibleProjectTypeByKeyGet(projectTypeKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTypesApi#comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAccessibleProjectTypeByKeyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTypesApi#comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAccessibleProjectTypeByKeyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectTypeKey** | **kotlin.String**| The key of the project type. | [enum: software, service_desk, business]

### Return type

[**ProjectType**](ProjectType.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllAccessibleProjectTypesGet"></a>
# **comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllAccessibleProjectTypesGet**
> kotlin.Array&lt;ProjectType&gt; comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllAccessibleProjectTypesGet()

Get all accessible project types on the instance

Returns all [project types](https://confluence.atlassian.com/x/Var1Nw) on the instance with a valid license

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTypesApi()
try {
    val result : kotlin.Array<ProjectType> = apiInstance.comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllAccessibleProjectTypesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTypesApi#comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllAccessibleProjectTypesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTypesApi#comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllAccessibleProjectTypesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ProjectType&gt;**](ProjectType.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllProjectTypesGet"></a>
# **comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllProjectTypesGet**
> kotlin.Array&lt;ProjectType&gt; comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllProjectTypesGet()

Get all project types

Returns all [project types](https://confluence.atlassian.com/x/Var1Nw), whether or not the instance has a valid license for each type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTypesApi()
try {
    val result : kotlin.Array<ProjectType> = apiInstance.comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllProjectTypesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTypesApi#comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllProjectTypesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTypesApi#comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetAllProjectTypesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ProjectType&gt;**](ProjectType.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetProjectTypeByKeyGet"></a>
# **comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetProjectTypeByKeyGet**
> ProjectType comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetProjectTypeByKeyGet(projectTypeKey)

Get project type by key

Returns a [project type](https://confluence.atlassian.com/x/Var1Nw).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTypesApi()
val projectTypeKey : kotlin.String = projectTypeKey_example // kotlin.String | The key of the project type.
try {
    val result : ProjectType = apiInstance.comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetProjectTypeByKeyGet(projectTypeKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTypesApi#comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetProjectTypeByKeyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTypesApi#comAtlassianJiraRestV2ProjectTypeProjectTypeResourceGetProjectTypeByKeyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectTypeKey** | **kotlin.String**| The key of the project type. | [enum: software, service_desk, business]

### Return type

[**ProjectType**](ProjectType.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

