# ProjectPermissionSchemesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueProjectIssueSecurityLevelSchemeResourceGetIssueSecuritySchemeGet**](ProjectPermissionSchemesApi.md#comAtlassianJiraRestV2IssueProjectIssueSecurityLevelSchemeResourceGetIssueSecuritySchemeGet) | **GET** /rest/api/3/project/{projectKeyOrId}/issuesecuritylevelscheme | Get project issue security scheme
[**comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceAssignPermissionSchemePut**](ProjectPermissionSchemesApi.md#comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceAssignPermissionSchemePut) | **PUT** /rest/api/3/project/{projectKeyOrId}/permissionscheme | Assign permission scheme
[**comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceGetAssignedPermissionSchemeGet**](ProjectPermissionSchemesApi.md#comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceGetAssignedPermissionSchemeGet) | **GET** /rest/api/3/project/{projectKeyOrId}/permissionscheme | Get assigned permission scheme
[**comAtlassianJiraRestV2SecuritylevelProjectSecurityLevelResourceGetSecurityLevelsForProjectGet**](ProjectPermissionSchemesApi.md#comAtlassianJiraRestV2SecuritylevelProjectSecurityLevelResourceGetSecurityLevelsForProjectGet) | **GET** /rest/api/3/project/{projectKeyOrId}/securitylevel | Get project issue security levels


<a name="comAtlassianJiraRestV2IssueProjectIssueSecurityLevelSchemeResourceGetIssueSecuritySchemeGet"></a>
# **comAtlassianJiraRestV2IssueProjectIssueSecurityLevelSchemeResourceGetIssueSecuritySchemeGet**
> SecurityScheme comAtlassianJiraRestV2IssueProjectIssueSecurityLevelSchemeResourceGetIssueSecuritySchemeGet(projectKeyOrId)

Get project issue security scheme

Returns the [issue security scheme](https://confluence.atlassian.com/x/J4lKLg) associated with the project.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or the *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectPermissionSchemesApi()
val projectKeyOrId : kotlin.String = projectKeyOrId_example // kotlin.String | The project ID or project key (case sensitive).
try {
    val result : SecurityScheme = apiInstance.comAtlassianJiraRestV2IssueProjectIssueSecurityLevelSchemeResourceGetIssueSecuritySchemeGet(projectKeyOrId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectPermissionSchemesApi#comAtlassianJiraRestV2IssueProjectIssueSecurityLevelSchemeResourceGetIssueSecuritySchemeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectPermissionSchemesApi#comAtlassianJiraRestV2IssueProjectIssueSecurityLevelSchemeResourceGetIssueSecuritySchemeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectKeyOrId** | **kotlin.String**| The project ID or project key (case sensitive). |

### Return type

[**SecurityScheme**](SecurityScheme.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceAssignPermissionSchemePut"></a>
# **comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceAssignPermissionSchemePut**
> PermissionScheme comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceAssignPermissionSchemePut(projectKeyOrId, idBean, expand)

Assign permission scheme

Assigns a permission scheme with a project. See [Managing project permissions](https://confluence.atlassian.com/x/yodKLg) for more information about permission schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectPermissionSchemesApi()
val projectKeyOrId : kotlin.String = projectKeyOrId_example // kotlin.String | The project ID or project key (case sensitive).
val idBean : IdBean = {"id":10000} // IdBean | 
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
try {
    val result : PermissionScheme = apiInstance.comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceAssignPermissionSchemePut(projectKeyOrId, idBean, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectPermissionSchemesApi#comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceAssignPermissionSchemePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectPermissionSchemesApi#comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceAssignPermissionSchemePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectKeyOrId** | **kotlin.String**| The project ID or project key (case sensitive). |
 **idBean** | [**IdBean**](IdBean.md)|  |
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional]

### Return type

[**PermissionScheme**](PermissionScheme.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceGetAssignedPermissionSchemeGet"></a>
# **comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceGetAssignedPermissionSchemeGet**
> PermissionScheme comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceGetAssignedPermissionSchemeGet(projectKeyOrId, expand)

Get assigned permission scheme

Gets the [permission scheme](https://confluence.atlassian.com/x/yodKLg) associated with the project.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectPermissionSchemesApi()
val projectKeyOrId : kotlin.String = projectKeyOrId_example // kotlin.String | The project ID or project key (case sensitive).
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission.
try {
    val result : PermissionScheme = apiInstance.comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceGetAssignedPermissionSchemeGet(projectKeyOrId, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectPermissionSchemesApi#comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceGetAssignedPermissionSchemeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectPermissionSchemesApi#comAtlassianJiraRestV2PermissionProjectPermissionSchemeResourceGetAssignedPermissionSchemeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectKeyOrId** | **kotlin.String**| The project ID or project key (case sensitive). |
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission. | [optional]

### Return type

[**PermissionScheme**](PermissionScheme.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2SecuritylevelProjectSecurityLevelResourceGetSecurityLevelsForProjectGet"></a>
# **comAtlassianJiraRestV2SecuritylevelProjectSecurityLevelResourceGetSecurityLevelsForProjectGet**
> ProjectIssueSecurityLevels comAtlassianJiraRestV2SecuritylevelProjectSecurityLevelResourceGetSecurityLevelsForProjectGet(projectKeyOrId)

Get project issue security levels

Returns all [issue security](https://confluence.atlassian.com/x/J4lKLg) levels for the project that the user has access to.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project, however, issue security levels are only returned for authenticated user with *Set Issue Security* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectPermissionSchemesApi()
val projectKeyOrId : kotlin.String = projectKeyOrId_example // kotlin.String | The project ID or project key (case sensitive).
try {
    val result : ProjectIssueSecurityLevels = apiInstance.comAtlassianJiraRestV2SecuritylevelProjectSecurityLevelResourceGetSecurityLevelsForProjectGet(projectKeyOrId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectPermissionSchemesApi#comAtlassianJiraRestV2SecuritylevelProjectSecurityLevelResourceGetSecurityLevelsForProjectGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectPermissionSchemesApi#comAtlassianJiraRestV2SecuritylevelProjectSecurityLevelResourceGetSecurityLevelsForProjectGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectKeyOrId** | **kotlin.String**| The project ID or project key (case sensitive). |

### Return type

[**ProjectIssueSecurityLevels**](ProjectIssueSecurityLevels.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

