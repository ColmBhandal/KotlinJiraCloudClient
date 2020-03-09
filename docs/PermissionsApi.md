# PermissionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2PermissionPermissionsResourceGetAllPermissionsGet**](PermissionsApi.md#comAtlassianJiraRestV2PermissionPermissionsResourceGetAllPermissionsGet) | **GET** /rest/api/3/permissions | Get all permissions
[**comAtlassianJiraRestV2PermissionPermissionsResourceGetBulkPermissionsPost**](PermissionsApi.md#comAtlassianJiraRestV2PermissionPermissionsResourceGetBulkPermissionsPost) | **POST** /rest/api/3/permissions/check | Get bulk permissions
[**comAtlassianJiraRestV2PermissionPermissionsResourceGetMyPermissionsGet**](PermissionsApi.md#comAtlassianJiraRestV2PermissionPermissionsResourceGetMyPermissionsGet) | **GET** /rest/api/3/mypermissions | Get my permissions
[**comAtlassianJiraRestV2PermissionPermissionsResourceGetPermittedProjectsPost**](PermissionsApi.md#comAtlassianJiraRestV2PermissionPermissionsResourceGetPermittedProjectsPost) | **POST** /rest/api/3/permissions/project | Get permitted projects


<a name="comAtlassianJiraRestV2PermissionPermissionsResourceGetAllPermissionsGet"></a>
# **comAtlassianJiraRestV2PermissionPermissionsResourceGetAllPermissionsGet**
> Permissions comAtlassianJiraRestV2PermissionPermissionsResourceGetAllPermissionsGet()

Get all permissions

Returns all permissions, including:   *  global permissions.  *  project permissions.  *  global permissions added by plugins.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
try {
    val result : Permissions = apiInstance.comAtlassianJiraRestV2PermissionPermissionsResourceGetAllPermissionsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#comAtlassianJiraRestV2PermissionPermissionsResourceGetAllPermissionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#comAtlassianJiraRestV2PermissionPermissionsResourceGetAllPermissionsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Permissions**](Permissions.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2PermissionPermissionsResourceGetBulkPermissionsPost"></a>
# **comAtlassianJiraRestV2PermissionPermissionsResourceGetBulkPermissionsPost**
> BulkPermissionGrants comAtlassianJiraRestV2PermissionPermissionsResourceGetBulkPermissionsPost(bulkPermissionsRequestBean)

Get bulk permissions

Returns:   *  for a list of global permissions, the global permissions granted to the user.  *  for a list of project permissions and lists of projects and issues, for each project permission a list of the projects and issues the user can access or manipulate.  Note that:   *  Invalid project and issue IDs are ignored.  *  A maximum of 1000 projects and 1000 issues can be checked.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val bulkPermissionsRequestBean : BulkPermissionsRequestBean = {"globalPermissions":["SYSTEM_ADMIN"],"projectPermissions":[{"projects":[10001],"permissions":["EDIT_ISSUE"],"issues":[10010,10011,10012,10013,10014]}]} // BulkPermissionsRequestBean | Details of the permissions to check.
try {
    val result : BulkPermissionGrants = apiInstance.comAtlassianJiraRestV2PermissionPermissionsResourceGetBulkPermissionsPost(bulkPermissionsRequestBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#comAtlassianJiraRestV2PermissionPermissionsResourceGetBulkPermissionsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#comAtlassianJiraRestV2PermissionPermissionsResourceGetBulkPermissionsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bulkPermissionsRequestBean** | [**BulkPermissionsRequestBean**](BulkPermissionsRequestBean.md)| Details of the permissions to check. |

### Return type

[**BulkPermissionGrants**](BulkPermissionGrants.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2PermissionPermissionsResourceGetMyPermissionsGet"></a>
# **comAtlassianJiraRestV2PermissionPermissionsResourceGetMyPermissionsGet**
> Permissions comAtlassianJiraRestV2PermissionPermissionsResourceGetMyPermissionsGet(projectKey, projectId, issueKey, issueId, permissions, projectUuid, projectConfigurationUuid)

Get my permissions

Returns a list of permissions indicating which permissions the user has. Details of the user&#39;s permissions can be obtained in a global, project, or issue context.  The user is reported as having a project permission:   *  in the global context, if the user has the project permission in any project.  *  for a project, where the project permission is determined using issue data, if the user meets the permission&#39;s criteria for any issue in the project. Otherwise, if the user has the project permission in the project.  *  for an issue, where a project permission is determined using issue data, if the user has the permission in the issue. Otherwise, if the user has the project permission in the project containing the issue.  This means that users may be shown as having an issue permission (such as EDIT\\_ISSUE) in the global context or a project context but may not have the permission for any or all issues. For example, if Reporters have the EDIT\\_ISSUE permission a user would be shown as having this permission in the global context or the context of a project, because any user can be a reporter. However, if they are not the user who reported the issue queried they would not have EDIT\\_ISSUE permission for that issue.  Global permissions are unaffected by context.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val projectKey : kotlin.String = projectKey_example // kotlin.String | The key of project. Ignored if `projectId` is provided.
val projectId : kotlin.String = projectId_example // kotlin.String | The ID of project.
val issueKey : kotlin.String = issueKey_example // kotlin.String | The key of the issue. Ignored if `issueId` is provided.
val issueId : kotlin.String = issueId_example // kotlin.String | The ID of the issue.
val permissions : kotlin.String = BROWSE_PROJECTS,EDIT_ISSUES // kotlin.String | A list of permission keys. This parameter accepts a comma-separated list. [ Omitting this parameter is **deprecated**.](https://developer.atlassian.com/cloud/jira/platform/change-notice-get-my-permissions-requires-permissions-query-parameter/) To get the list of available permissions, use [Get all permissions](#api-rest-api-3-permissions-get). Note that deprecated keys cannot be used. Deprecated keys are not returned by [Get all permissions](#api-rest-api-3-permissions-get) but are returned by this operation if `permissions` is omitted.
val projectUuid : kotlin.String = projectUuid_example // kotlin.String | 
val projectConfigurationUuid : kotlin.String = projectConfigurationUuid_example // kotlin.String | 
try {
    val result : Permissions = apiInstance.comAtlassianJiraRestV2PermissionPermissionsResourceGetMyPermissionsGet(projectKey, projectId, issueKey, issueId, permissions, projectUuid, projectConfigurationUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#comAtlassianJiraRestV2PermissionPermissionsResourceGetMyPermissionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#comAtlassianJiraRestV2PermissionPermissionsResourceGetMyPermissionsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectKey** | **kotlin.String**| The key of project. Ignored if &#x60;projectId&#x60; is provided. | [optional]
 **projectId** | **kotlin.String**| The ID of project. | [optional]
 **issueKey** | **kotlin.String**| The key of the issue. Ignored if &#x60;issueId&#x60; is provided. | [optional]
 **issueId** | **kotlin.String**| The ID of the issue. | [optional]
 **permissions** | **kotlin.String**| A list of permission keys. This parameter accepts a comma-separated list. [ Omitting this parameter is **deprecated**.](https://developer.atlassian.com/cloud/jira/platform/change-notice-get-my-permissions-requires-permissions-query-parameter/) To get the list of available permissions, use [Get all permissions](#api-rest-api-3-permissions-get). Note that deprecated keys cannot be used. Deprecated keys are not returned by [Get all permissions](#api-rest-api-3-permissions-get) but are returned by this operation if &#x60;permissions&#x60; is omitted. | [optional]
 **projectUuid** | **kotlin.String**|  | [optional]
 **projectConfigurationUuid** | **kotlin.String**|  | [optional]

### Return type

[**Permissions**](Permissions.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2PermissionPermissionsResourceGetPermittedProjectsPost"></a>
# **comAtlassianJiraRestV2PermissionPermissionsResourceGetPermittedProjectsPost**
> PermittedProjects comAtlassianJiraRestV2PermissionPermissionsResourceGetPermittedProjectsPost(permissionsKeysBean)

Get permitted projects

Returns all the projects where the user is granted a list of project permissions.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val permissionsKeysBean : PermissionsKeysBean =  // PermissionsKeysBean | 
try {
    val result : PermittedProjects = apiInstance.comAtlassianJiraRestV2PermissionPermissionsResourceGetPermittedProjectsPost(permissionsKeysBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#comAtlassianJiraRestV2PermissionPermissionsResourceGetPermittedProjectsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#comAtlassianJiraRestV2PermissionPermissionsResourceGetPermittedProjectsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permissionsKeysBean** | [**PermissionsKeysBean**](PermissionsKeysBean.md)|  |

### Return type

[**PermittedProjects**](PermittedProjects.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

