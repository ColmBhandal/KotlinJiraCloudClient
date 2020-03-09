# PermissionSchemesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionGrantPost**](PermissionSchemesApi.md#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionGrantPost) | **POST** /rest/api/3/permissionscheme/{schemeId}/permission | Create permission grant
[**comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionSchemePost**](PermissionSchemesApi.md#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionSchemePost) | **POST** /rest/api/3/permissionscheme | Create permission scheme
[**comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeDelete**](PermissionSchemesApi.md#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeDelete) | **DELETE** /rest/api/3/permissionscheme/{schemeId} | Delete permission scheme
[**comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeEntityDelete**](PermissionSchemesApi.md#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeEntityDelete) | **DELETE** /rest/api/3/permissionscheme/{schemeId}/permission/{permissionId} | Delete permission scheme grant
[**comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetAllPermissionSchemesGet**](PermissionSchemesApi.md#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetAllPermissionSchemesGet) | **GET** /rest/api/3/permissionscheme | Get all permission schemes
[**comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGet**](PermissionSchemesApi.md#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGet) | **GET** /rest/api/3/permissionscheme/{schemeId} | Get permission scheme
[**comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantGet**](PermissionSchemesApi.md#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantGet) | **GET** /rest/api/3/permissionscheme/{schemeId}/permission/{permissionId} | Get permission scheme grant
[**comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantsGet**](PermissionSchemesApi.md#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantsGet) | **GET** /rest/api/3/permissionscheme/{schemeId}/permission | Get permission scheme grants
[**comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceUpdatePermissionSchemePut**](PermissionSchemesApi.md#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceUpdatePermissionSchemePut) | **PUT** /rest/api/3/permissionscheme/{schemeId} | Update permission scheme


<a name="comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionGrantPost"></a>
# **comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionGrantPost**
> PermissionGrant comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionGrantPost(schemeId, permissionGrant, expand)

Create permission grant

Creates a permission grant in a permission scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionSchemesApi()
val schemeId : kotlin.Long = 789 // kotlin.Long | The ID of the permission scheme in which to create a new permission grant.
val permissionGrant : PermissionGrant = {"holder":{"parameter":"jira-core-users","type":"group"},"permission":"ADMINISTER_PROJECTS"} // PermissionGrant | The permission grant to create.
val expand : kotlin.String = expand_example // kotlin.String | Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  `permissions` Returns all permission grants for each permission scheme.  *  `user` Returns information about the user who is granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `projectRole` Returns information about the project role granted the permission.  *  `field` Returns information about the custom field granted the permission.  *  `all` Returns all expandable information.
try {
    val result : PermissionGrant = apiInstance.comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionGrantPost(schemeId, permissionGrant, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionGrantPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionGrantPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schemeId** | **kotlin.Long**| The ID of the permission scheme in which to create a new permission grant. |
 **permissionGrant** | [**PermissionGrant**](PermissionGrant.md)| The permission grant to create. |
 **expand** | **kotlin.String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;user&#x60; Returns information about the user who is granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;all&#x60; Returns all expandable information. | [optional]

### Return type

[**PermissionGrant**](PermissionGrant.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionSchemePost"></a>
# **comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionSchemePost**
> PermissionScheme comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionSchemePost(requestBody, expand)

Create permission scheme

Creates a new permission scheme. You can create a permission scheme with or without defining a set of permission grants.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionSchemesApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"permissions":[{"holder":{"parameter":"jira-core-users","type":"group"},"permission":"ADMINISTER_PROJECTS"}],"name":"Example permission scheme","description":"description"} // kotlin.collections.Map<kotlin.String, kotlin.Any> | The permission scheme to create.
val expand : kotlin.String = expand_example // kotlin.String | Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
try {
    val result : PermissionScheme = apiInstance.comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionSchemePost(requestBody, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionSchemePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceCreatePermissionSchemePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)| The permission scheme to create. |
 **expand** | **kotlin.String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional]

### Return type

[**PermissionScheme**](PermissionScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeDelete"></a>
# **comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeDelete**
> comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeDelete(schemeId)

Delete permission scheme

Deletes a permission scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionSchemesApi()
val schemeId : kotlin.Long = 789 // kotlin.Long | The ID of the permission scheme being deleted.
try {
    apiInstance.comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeDelete(schemeId)
} catch (e: ClientException) {
    println("4xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schemeId** | **kotlin.Long**| The ID of the permission scheme being deleted. |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeEntityDelete"></a>
# **comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeEntityDelete**
> comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeEntityDelete(schemeId, permissionId)

Delete permission scheme grant

Deletes a permission grant from a permission scheme. See [About permission schemes and grants](#about-permission-schemes) for more details.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionSchemesApi()
val schemeId : kotlin.Long = 789 // kotlin.Long | The ID of the permission scheme to delete the permission grant from.
val permissionId : kotlin.Long = 789 // kotlin.Long | The ID of the permission grant to delete.
try {
    apiInstance.comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeEntityDelete(schemeId, permissionId)
} catch (e: ClientException) {
    println("4xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeEntityDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceDeletePermissionSchemeEntityDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schemeId** | **kotlin.Long**| The ID of the permission scheme to delete the permission grant from. |
 **permissionId** | **kotlin.Long**| The ID of the permission grant to delete. |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetAllPermissionSchemesGet"></a>
# **comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetAllPermissionSchemesGet**
> PermissionSchemes comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetAllPermissionSchemesGet(expand)

Get all permission schemes

Returns all permission schemes.  ### About permission schemes and grants ###  A permission scheme is a collection of permission grants. A permission grant consists of a &#x60;holder&#x60; and a &#x60;permission&#x60;.  #### Holder object ####  The &#x60;holder&#x60; object contains information about the user or group being granted the permission. For example, the *Administer projects* permission is granted to a group named *Teams in space administrators*. In this case, the type is &#x60;\&quot;type\&quot;: \&quot;group\&quot;&#x60;, and the parameter is the group name, &#x60;\&quot;parameter\&quot;: \&quot;Teams in space administrators\&quot;&#x60;. The &#x60;holder&#x60; object is defined by the following properties:   *  &#x60;type&#x60; Identifies the user or group (see the list of types below).  *  &#x60;parameter&#x60; The value of this property depends on the &#x60;type&#x60;. For example, if the &#x60;type&#x60; is a group, then you need to specify the group name.  The following &#x60;types&#x60; are available. The expected values for the &#x60;parameter&#x60; are given in parenthesis (some &#x60;types&#x60; may not have a &#x60;parameter&#x60;):   *  &#x60;anyone&#x60; Grant for anonymous users.  *  &#x60;applicationRole&#x60; Grant for users with access to the specified application (application name). See [Update product access settings](https://confluence.atlassian.com/x/3YxjL) for more information.  *  &#x60;assignee&#x60; Grant for the user currently assigned to an issue.  *  &#x60;group&#x60; Grant for the specified group (group name).  *  &#x60;groupCustomField&#x60; Grant for a user in the group selected in the specified custom field (custom field ID).  *  &#x60;projectLead&#x60; Grant for a project lead.  *  &#x60;projectRole&#x60; Grant for the specified project role (project role ID).  *  &#x60;reporter&#x60; Grant for the user who reported the issue.  *  &#x60;sd.customer.portal.only&#x60; Jira Service Desk only. Grants customers permission to access the customer portal but not Jira. See [Customizing Jira Service Desk permissions](https://confluence.atlassian.com/x/24dKLg) for more information.  *  &#x60;user&#x60; Grant for the specified user (user ID - historically this was the userkey but that is deprecated and the account ID should be used).  *  &#x60;userCustomField&#x60; Grant for a user selected in the specified custom field (custom field ID).  #### Built-in permissions ####  The [built-in Jira permissions](https://confluence.atlassian.com/x/yodKLg) are listed below. Apps can also define custom permissions. See the [project permission](https://developer.atlassian.com/cloud/jira/platform/modules/project-permission/) and [global permission](https://developer.atlassian.com/cloud/jira/platform/modules/global-permission/) module documentation for more information.  **Project permissions**   *  &#x60;ADMINISTER_PROJECTS&#x60;  *  &#x60;BROWSE_PROJECTS&#x60;  *  &#x60;MANAGE_SPRINTS_PERMISSION&#x60; (Jira Software only)  *  &#x60;SERVICEDESK_AGENT&#x60; (Jira Service Desk only)  *  &#x60;VIEW_DEV_TOOLS&#x60; (Jira Software only)  *  &#x60;VIEW_READONLY_WORKFLOW&#x60;  **Issue permissions**   *  &#x60;ASSIGNABLE_USER&#x60;  *  &#x60;ASSIGN_ISSUES&#x60;  *  &#x60;CLOSE_ISSUES&#x60;  *  &#x60;CREATE_ISSUES&#x60;  *  &#x60;DELETE_ISSUES&#x60;  *  &#x60;EDIT_ISSUES&#x60;  *  &#x60;LINK_ISSUES&#x60;  *  &#x60;MODIFY_REPORTER&#x60;  *  &#x60;MOVE_ISSUES&#x60;  *  &#x60;RESOLVE_ISSUES&#x60;  *  &#x60;SCHEDULE_ISSUES&#x60;  *  &#x60;SET_ISSUE_SECURITY&#x60;  *  &#x60;TRANSITION_ISSUES&#x60;  **Voters and watchers permissions**   *  &#x60;MANAGE_WATCHERS&#x60;  *  &#x60;VIEW_VOTERS_AND_WATCHERS&#x60;  **Comments permissions**   *  &#x60;ADD_COMMENTS&#x60;  *  &#x60;DELETE_ALL_COMMENTS&#x60;  *  &#x60;DELETE_OWN_COMMENTS&#x60;  *  &#x60;EDIT_ALL_COMMENTS&#x60;  *  &#x60;EDIT_OWN_COMMENTS&#x60;  **Attachments permissions**   *  &#x60;CREATE_ATTACHMENTS&#x60;  *  &#x60;DELETE_ALL_ATTACHMENTS&#x60;  *  &#x60;DELETE_OWN_ATTACHMENTS&#x60;  **Time tracking permissions**   *  &#x60;DELETE_ALL_WORKLOGS&#x60;  *  &#x60;DELETE_OWN_WORKLOGS&#x60;  *  &#x60;EDIT_ALL_WORKLOGS&#x60;  *  &#x60;EDIT_OWN_WORKLOGS&#x60;  *  &#x60;WORK_ON_ISSUES&#x60;  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionSchemesApi()
val expand : kotlin.String = expand_example // kotlin.String | Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
try {
    val result : PermissionSchemes = apiInstance.comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetAllPermissionSchemesGet(expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetAllPermissionSchemesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetAllPermissionSchemesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expand** | **kotlin.String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional]

### Return type

[**PermissionSchemes**](PermissionSchemes.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGet"></a>
# **comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGet**
> PermissionScheme comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGet(schemeId, expand)

Get permission scheme

Returns a permission scheme.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionSchemesApi()
val schemeId : kotlin.Long = 789 // kotlin.Long | The ID of the permission scheme to return.
val expand : kotlin.String = expand_example // kotlin.String | Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
try {
    val result : PermissionScheme = apiInstance.comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGet(schemeId, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schemeId** | **kotlin.Long**| The ID of the permission scheme to return. |
 **expand** | **kotlin.String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional]

### Return type

[**PermissionScheme**](PermissionScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantGet"></a>
# **comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantGet**
> PermissionGrant comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantGet(schemeId, permissionId, expand)

Get permission scheme grant

Returns a permission grant.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionSchemesApi()
val schemeId : kotlin.Long = 789 // kotlin.Long | The ID of the permission scheme.
val permissionId : kotlin.Long = 789 // kotlin.Long | The ID of the permission grant.
val expand : kotlin.String = expand_example // kotlin.String | Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
try {
    val result : PermissionGrant = apiInstance.comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantGet(schemeId, permissionId, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schemeId** | **kotlin.Long**| The ID of the permission scheme. |
 **permissionId** | **kotlin.Long**| The ID of the permission grant. |
 **expand** | **kotlin.String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional]

### Return type

[**PermissionGrant**](PermissionGrant.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantsGet"></a>
# **comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantsGet**
> PermissionGrants comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantsGet(schemeId, expand)

Get permission scheme grants

Returns all permission grants for a permission scheme.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionSchemesApi()
val schemeId : kotlin.Long = 789 // kotlin.Long | The ID of the permission scheme.
val expand : kotlin.String = expand_example // kotlin.String | Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  `permissions` Returns all permission grants for each permission scheme.  *  `user` Returns information about the user who is granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `projectRole` Returns information about the project role granted the permission.  *  `field` Returns information about the custom field granted the permission.  *  `all` Returns all expandable information.
try {
    val result : PermissionGrants = apiInstance.comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantsGet(schemeId, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceGetPermissionSchemeGrantsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schemeId** | **kotlin.Long**| The ID of the permission scheme. |
 **expand** | **kotlin.String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;user&#x60; Returns information about the user who is granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;all&#x60; Returns all expandable information. | [optional]

### Return type

[**PermissionGrants**](PermissionGrants.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceUpdatePermissionSchemePut"></a>
# **comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceUpdatePermissionSchemePut**
> PermissionScheme comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceUpdatePermissionSchemePut(schemeId, requestBody, expand)

Update permission scheme

Updates a permission scheme. Below are some important things to note when using this resource:   *  If a permissions list is present in the request, then it is set in the permission scheme, overwriting *all existing* grants.  *  If you want to update only the name and description, then do not send a permissions list in the request.  *  Sending an empty list will remove all permission grants from the permission scheme.  If you want to add or delete a permission grant instead of updating the whole list, see [Create permission grant](#api-rest-api-3-permissionscheme-schemeId-permission-post) or [Delete permission scheme entity](#api-rest-api-3-permissionscheme-schemeId-permission-permissionId-delete).  See [About permission schemes and grants](#about-permission-schemes) for more details.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionSchemesApi()
val schemeId : kotlin.Long = 789 // kotlin.Long | The ID of the permission scheme to update.
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"permissions":[{"holder":{"parameter":"jira-core-users","type":"group"},"permission":"ADMINISTER_PROJECTS"}],"name":"Example permission scheme","description":"description"} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
val expand : kotlin.String = expand_example // kotlin.String | Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
try {
    val result : PermissionScheme = apiInstance.comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceUpdatePermissionSchemePut(schemeId, requestBody, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceUpdatePermissionSchemePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionSchemesApi#comAtlassianJiraRestV2AdminPermissionschemePermissionSchemeResourceUpdatePermissionSchemePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schemeId** | **kotlin.Long**| The ID of the permission scheme to update. |
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  |
 **expand** | **kotlin.String**| Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional]

### Return type

[**PermissionScheme**](PermissionScheme.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

