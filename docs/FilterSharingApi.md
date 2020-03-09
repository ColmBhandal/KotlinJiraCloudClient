# FilterSharingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2SearchFilterResourceAddSharePermissionPost**](FilterSharingApi.md#comAtlassianJiraRestV2SearchFilterResourceAddSharePermissionPost) | **POST** /rest/api/3/filter/{id}/permission | Add share permission
[**comAtlassianJiraRestV2SearchFilterResourceDeleteSharePermissionDelete**](FilterSharingApi.md#comAtlassianJiraRestV2SearchFilterResourceDeleteSharePermissionDelete) | **DELETE** /rest/api/3/filter/{id}/permission/{permissionId} | Delete share permission
[**comAtlassianJiraRestV2SearchFilterResourceGetDefaultShareScopeGet**](FilterSharingApi.md#comAtlassianJiraRestV2SearchFilterResourceGetDefaultShareScopeGet) | **GET** /rest/api/3/filter/defaultShareScope | Get default share scope
[**comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionGet**](FilterSharingApi.md#comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionGet) | **GET** /rest/api/3/filter/{id}/permission/{permissionId} | Get share permission
[**comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionsGet**](FilterSharingApi.md#comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionsGet) | **GET** /rest/api/3/filter/{id}/permission | Get share permissions
[**comAtlassianJiraRestV2SearchFilterResourceSetDefaultShareScopePut**](FilterSharingApi.md#comAtlassianJiraRestV2SearchFilterResourceSetDefaultShareScopePut) | **PUT** /rest/api/3/filter/defaultShareScope | Set default share scope


<a name="comAtlassianJiraRestV2SearchFilterResourceAddSharePermissionPost"></a>
# **comAtlassianJiraRestV2SearchFilterResourceAddSharePermissionPost**
> kotlin.Array&lt;SharePermission&gt; comAtlassianJiraRestV2SearchFilterResourceAddSharePermissionPost(id, sharePermissionInputBean)

Add share permission

Add a share permissions to a filter. If you add a global share permission (one for all logged-in users or the public) it will overwrite all share permissions for the filter.  Be aware that this operation uses different objects for updating share permissions compared to [Update filter](#api-rest-api-3-filter-id-put).  **[Permissions](#permissions) required:** *Share dashboards and filters* [global permission](https://confluence.atlassian.com/x/x4dKLg) and the user must own the filter.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilterSharingApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the filter.
val sharePermissionInputBean : SharePermissionInputBean = {"type":"group","groupname":"jira-administrators"} // SharePermissionInputBean | 
try {
    val result : kotlin.Array<SharePermission> = apiInstance.comAtlassianJiraRestV2SearchFilterResourceAddSharePermissionPost(id, sharePermissionInputBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilterSharingApi#comAtlassianJiraRestV2SearchFilterResourceAddSharePermissionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilterSharingApi#comAtlassianJiraRestV2SearchFilterResourceAddSharePermissionPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the filter. |
 **sharePermissionInputBean** | [**SharePermissionInputBean**](SharePermissionInputBean.md)|  |

### Return type

[**kotlin.Array&lt;SharePermission&gt;**](SharePermission.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2SearchFilterResourceDeleteSharePermissionDelete"></a>
# **comAtlassianJiraRestV2SearchFilterResourceDeleteSharePermissionDelete**
> comAtlassianJiraRestV2SearchFilterResourceDeleteSharePermissionDelete(id, permissionId)

Delete share permission

Deletes a share permission from a filter.  **[Permissions](#permissions) required:** Permission to access Jira and the user must own the filter.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilterSharingApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the filter.
val permissionId : kotlin.Long = 789 // kotlin.Long | The ID of the share permission.
try {
    apiInstance.comAtlassianJiraRestV2SearchFilterResourceDeleteSharePermissionDelete(id, permissionId)
} catch (e: ClientException) {
    println("4xx response calling FilterSharingApi#comAtlassianJiraRestV2SearchFilterResourceDeleteSharePermissionDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilterSharingApi#comAtlassianJiraRestV2SearchFilterResourceDeleteSharePermissionDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the filter. |
 **permissionId** | **kotlin.Long**| The ID of the share permission. |

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

<a name="comAtlassianJiraRestV2SearchFilterResourceGetDefaultShareScopeGet"></a>
# **comAtlassianJiraRestV2SearchFilterResourceGetDefaultShareScopeGet**
> DefaultShareScope comAtlassianJiraRestV2SearchFilterResourceGetDefaultShareScopeGet()

Get default share scope

Returns the default sharing settings for new filters and dashboards for a user.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilterSharingApi()
try {
    val result : DefaultShareScope = apiInstance.comAtlassianJiraRestV2SearchFilterResourceGetDefaultShareScopeGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilterSharingApi#comAtlassianJiraRestV2SearchFilterResourceGetDefaultShareScopeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilterSharingApi#comAtlassianJiraRestV2SearchFilterResourceGetDefaultShareScopeGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DefaultShareScope**](DefaultShareScope.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionGet"></a>
# **comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionGet**
> SharePermission comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionGet(id, permissionId)

Get share permission

Returns a share permission for a filter. A filter can be shared with groups, projects, all logged-in users, or the public. Sharing with all logged-in users or the public is known as a global share permission.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None, however, a share permission is only returned for:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilterSharingApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the filter.
val permissionId : kotlin.Long = 789 // kotlin.Long | The ID of the share permission.
try {
    val result : SharePermission = apiInstance.comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionGet(id, permissionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilterSharingApi#comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilterSharingApi#comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the filter. |
 **permissionId** | **kotlin.Long**| The ID of the share permission. |

### Return type

[**SharePermission**](SharePermission.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionsGet"></a>
# **comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionsGet**
> kotlin.Array&lt;SharePermission&gt; comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionsGet(id)

Get share permissions

Returns the share permissions for a filter. A filter can be shared with groups, projects, all logged-in users, or the public. Sharing with all logged-in users or the public is known as a global share permission.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None, however, share permissions are only returned for:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilterSharingApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the filter.
try {
    val result : kotlin.Array<SharePermission> = apiInstance.comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionsGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilterSharingApi#comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilterSharingApi#comAtlassianJiraRestV2SearchFilterResourceGetSharePermissionsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the filter. |

### Return type

[**kotlin.Array&lt;SharePermission&gt;**](SharePermission.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2SearchFilterResourceSetDefaultShareScopePut"></a>
# **comAtlassianJiraRestV2SearchFilterResourceSetDefaultShareScopePut**
> DefaultShareScope comAtlassianJiraRestV2SearchFilterResourceSetDefaultShareScopePut(defaultShareScope)

Set default share scope

Sets the default sharing for new filters and dashboards for a user.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilterSharingApi()
val defaultShareScope : DefaultShareScope = {"scope":"GLOBAL"} // DefaultShareScope | 
try {
    val result : DefaultShareScope = apiInstance.comAtlassianJiraRestV2SearchFilterResourceSetDefaultShareScopePut(defaultShareScope)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilterSharingApi#comAtlassianJiraRestV2SearchFilterResourceSetDefaultShareScopePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilterSharingApi#comAtlassianJiraRestV2SearchFilterResourceSetDefaultShareScopePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **defaultShareScope** | [**DefaultShareScope**](DefaultShareScope.md)|  |

### Return type

[**DefaultShareScope**](DefaultShareScope.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

