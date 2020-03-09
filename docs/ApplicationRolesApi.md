# ApplicationRolesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetAllApplicationRolesGet**](ApplicationRolesApi.md#comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetAllApplicationRolesGet) | **GET** /rest/api/3/applicationrole | Get all application roles
[**comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetApplicationRoleGet**](ApplicationRolesApi.md#comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetApplicationRoleGet) | **GET** /rest/api/3/applicationrole/{key} | Get application role


<a name="comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetAllApplicationRolesGet"></a>
# **comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetAllApplicationRolesGet**
> kotlin.Array&lt;ApplicationRole&gt; comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetAllApplicationRolesGet()

Get all application roles

Returns all application roles. In Jira, application roles are managed using the [Application access configuration](https://confluence.atlassian.com/x/3YxjL) page.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationRolesApi()
try {
    val result : kotlin.Array<ApplicationRole> = apiInstance.comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetAllApplicationRolesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationRolesApi#comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetAllApplicationRolesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationRolesApi#comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetAllApplicationRolesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ApplicationRole&gt;**](ApplicationRole.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetApplicationRoleGet"></a>
# **comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetApplicationRoleGet**
> ApplicationRole comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetApplicationRoleGet(key)

Get application role

Returns an application role.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationRolesApi()
val key : kotlin.String = jira-software // kotlin.String | The key of the application role. Use the [Get all application roles](#api-rest-api-3-applicationrole-get) operation to get the key for each application role.
try {
    val result : ApplicationRole = apiInstance.comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetApplicationRoleGet(key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationRolesApi#comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetApplicationRoleGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationRolesApi#comAtlassianJiraRestV2AdminApplicationroleApplicationRoleResourceGetApplicationRoleGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**| The key of the application role. Use the [Get all application roles](#api-rest-api-3-applicationrole-get) operation to get the key for each application role. |

### Return type

[**ApplicationRole**](ApplicationRole.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

