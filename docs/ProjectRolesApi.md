# ProjectRolesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueProjectProjectRoleDetailsResourceGetProjectRoleDetailsGet**](ProjectRolesApi.md#comAtlassianJiraRestV2IssueProjectProjectRoleDetailsResourceGetProjectRoleDetailsGet) | **GET** /rest/api/3/project/{projectIdOrKey}/roledetails | Get project role details
[**comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRoleGet**](ProjectRolesApi.md#comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRoleGet) | **GET** /rest/api/3/project/{projectIdOrKey}/role/{id} | Get project role for project
[**comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRolesGet**](ProjectRolesApi.md#comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRolesGet) | **GET** /rest/api/3/project/{projectIdOrKey}/role | Get project roles for project
[**comAtlassianJiraRestV2IssueProjectRoleResourceCreateProjectRolePost**](ProjectRolesApi.md#comAtlassianJiraRestV2IssueProjectRoleResourceCreateProjectRolePost) | **POST** /rest/api/3/role | Create project role
[**comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleDelete**](ProjectRolesApi.md#comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleDelete) | **DELETE** /rest/api/3/role/{id} | Delete project role
[**comAtlassianJiraRestV2IssueProjectRoleResourceFullyUpdateProjectRolePut**](ProjectRolesApi.md#comAtlassianJiraRestV2IssueProjectRoleResourceFullyUpdateProjectRolePut) | **PUT** /rest/api/3/role/{id} | Fully update project role
[**comAtlassianJiraRestV2IssueProjectRoleResourceGetAllProjectRolesGet**](ProjectRolesApi.md#comAtlassianJiraRestV2IssueProjectRoleResourceGetAllProjectRolesGet) | **GET** /rest/api/3/role | Get all project roles
[**comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleByIdGet**](ProjectRolesApi.md#comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleByIdGet) | **GET** /rest/api/3/role/{id} | Get project role by ID
[**comAtlassianJiraRestV2IssueProjectRoleResourcePartialUpdateProjectRolePost**](ProjectRolesApi.md#comAtlassianJiraRestV2IssueProjectRoleResourcePartialUpdateProjectRolePost) | **POST** /rest/api/3/role/{id} | Partial update project role


<a name="comAtlassianJiraRestV2IssueProjectProjectRoleDetailsResourceGetProjectRoleDetailsGet"></a>
# **comAtlassianJiraRestV2IssueProjectProjectRoleDetailsResourceGetProjectRoleDetailsGet**
> kotlin.Array&lt;ProjectRole&gt; comAtlassianJiraRestV2IssueProjectProjectRoleDetailsResourceGetProjectRoleDetailsGet(projectIdOrKey, currentMember, excludeConnectAddons)

Get project role details

Returns all [project roles](https://confluence.atlassian.com/x/3odKLg) and the details for each role. Note that the list of project roles is common to all projects.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRolesApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
val currentMember : kotlin.Boolean = true // kotlin.Boolean | Whether the roles should be filtered to include only those the user is assigned to.
val excludeConnectAddons : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.Array<ProjectRole> = apiInstance.comAtlassianJiraRestV2IssueProjectProjectRoleDetailsResourceGetProjectRoleDetailsGet(projectIdOrKey, currentMember, excludeConnectAddons)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectProjectRoleDetailsResourceGetProjectRoleDetailsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectProjectRoleDetailsResourceGetProjectRoleDetailsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |
 **currentMember** | **kotlin.Boolean**| Whether the roles should be filtered to include only those the user is assigned to. | [optional] [default to false]
 **excludeConnectAddons** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**kotlin.Array&lt;ProjectRole&gt;**](ProjectRole.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRoleGet"></a>
# **comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRoleGet**
> ProjectRole comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRoleGet(projectIdOrKey, id)

Get project role for project

Returns a project role&#39;s details and actors associated with the project. The list of actors is sorted by display name.  To check whether a user belongs to a role based on their group memberships, use [Get user](#api-rest-api-3-user-get) with the &#x60;groups&#x60; expand parameter selected. Then check whether the user keys and groups match with the actors returned for the project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRolesApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
val id : kotlin.Long = 789 // kotlin.Long | The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
try {
    val result : ProjectRole = apiInstance.comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRoleGet(projectIdOrKey, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRoleGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRoleGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |
 **id** | **kotlin.Long**| The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. |

### Return type

[**ProjectRole**](ProjectRole.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRolesGet"></a>
# **comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRolesGet**
> kotlin.collections.Map&lt;kotlin.String, java.net.URI&gt; comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRolesGet(projectIdOrKey)

Get project roles for project

Returns a list of [project roles](https://confluence.atlassian.com/x/3odKLg) for the project returning the name and self URL for each role.  Note that all project roles are shared with all projects in Jira Cloud. See [Get all project roles](#api-rest-api-3-role-get) for more information.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for any project on the site or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRolesApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
try {
    val result : kotlin.collections.Map<kotlin.String, java.net.URI> = apiInstance.comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRolesGet(projectIdOrKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRolesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectProjectRoleResourceGetProjectRolesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |

### Return type

[**kotlin.collections.Map&lt;kotlin.String, java.net.URI&gt;**](java.net.URI.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectRoleResourceCreateProjectRolePost"></a>
# **comAtlassianJiraRestV2IssueProjectRoleResourceCreateProjectRolePost**
> ProjectRole comAtlassianJiraRestV2IssueProjectRoleResourceCreateProjectRolePost(createUpdateRoleRequestBean)

Create project role

Creates a new project role with no [default actors](#api-rest-api-3-resolution-get). You can use the [Add default actors to project role](#api-rest-api-3-role-id-actors-post) operation to add default actors to the project role after creating it.  *Note that although a new project role is available to all projects upon creation, any default actors that are associated with the project role are not added to projects that existed prior to the role being created.*&lt;  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRolesApi()
val createUpdateRoleRequestBean : CreateUpdateRoleRequestBean = {"name":"Developers","description":"A project role that represents developers in a project"} // CreateUpdateRoleRequestBean | 
try {
    val result : ProjectRole = apiInstance.comAtlassianJiraRestV2IssueProjectRoleResourceCreateProjectRolePost(createUpdateRoleRequestBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectRoleResourceCreateProjectRolePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectRoleResourceCreateProjectRolePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUpdateRoleRequestBean** | [**CreateUpdateRoleRequestBean**](CreateUpdateRoleRequestBean.md)|  |

### Return type

[**ProjectRole**](ProjectRole.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleDelete"></a>
# **comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleDelete**
> comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleDelete(id, swap)

Delete project role

Deletes a project role. You must specify a replacement project role if you wish to delete a project role that is in use.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRolesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the project role to delete. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
val swap : kotlin.Long = 789 // kotlin.Long | The ID of the project role that will replace the one being deleted.
try {
    apiInstance.comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleDelete(id, swap)
} catch (e: ClientException) {
    println("4xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the project role to delete. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. |
 **swap** | **kotlin.Long**| The ID of the project role that will replace the one being deleted. | [optional]

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2IssueProjectRoleResourceFullyUpdateProjectRolePut"></a>
# **comAtlassianJiraRestV2IssueProjectRoleResourceFullyUpdateProjectRolePut**
> ProjectRole comAtlassianJiraRestV2IssueProjectRoleResourceFullyUpdateProjectRolePut(id, createUpdateRoleRequestBean)

Fully update project role

Updates the project role&#39;s name and description. You must include both a name and a description in the request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRolesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
val createUpdateRoleRequestBean : CreateUpdateRoleRequestBean = {"name":"Developers","description":"A project role that represents developers in a project"} // CreateUpdateRoleRequestBean | 
try {
    val result : ProjectRole = apiInstance.comAtlassianJiraRestV2IssueProjectRoleResourceFullyUpdateProjectRolePut(id, createUpdateRoleRequestBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectRoleResourceFullyUpdateProjectRolePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectRoleResourceFullyUpdateProjectRolePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. |
 **createUpdateRoleRequestBean** | [**CreateUpdateRoleRequestBean**](CreateUpdateRoleRequestBean.md)|  |

### Return type

[**ProjectRole**](ProjectRole.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectRoleResourceGetAllProjectRolesGet"></a>
# **comAtlassianJiraRestV2IssueProjectRoleResourceGetAllProjectRolesGet**
> kotlin.Array&lt;ProjectRole&gt; comAtlassianJiraRestV2IssueProjectRoleResourceGetAllProjectRolesGet()

Get all project roles

Gets a list of all project roles, complete with project role details and default actors.  ### About project roles ###  [Project roles](https://confluence.atlassian.com/x/3odKLg) are a flexible way to to associate users and groups with projects. In Jira Cloud, the list of project roles is shared globally with all projects, but each project can have a different set of actors associated with it (unlike groups, which have the same membership throughout all Jira applications).  Project roles are used in [permission schemes](#api-rest-api-3-permissionscheme-get), [email notification schemes](#api-rest-api-3-notificationscheme-get), [issue security levels](#api-rest-api-3-issuesecurityschemes-get), [comment visibility](#api-rest-api-3-comment-list-post), and workflow conditions.  #### Members and actors ####  In the Jira REST API, a member of a project role is called an *actor*. An *actor* is a group or user associated with a project role.  Actors may be set as [default members](https://confluence.atlassian.com/x/3odKLg#Managingprojectroles-Specifying&#39;defaultmembers&#39;foraprojectrole) of the project role or set at the project level:   *  Default actors: Users and groups that are assigned to the project role for all newly created projects. The default actors can be removed at the project level later if desired.  *  Actors: Users and groups that are associated with a project role for a project, which may differ from the default actors. This enables you to assign a user to different roles in different projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRolesApi()
try {
    val result : kotlin.Array<ProjectRole> = apiInstance.comAtlassianJiraRestV2IssueProjectRoleResourceGetAllProjectRolesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectRoleResourceGetAllProjectRolesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectRoleResourceGetAllProjectRolesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ProjectRole&gt;**](ProjectRole.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleByIdGet"></a>
# **comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleByIdGet**
> ProjectRole comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleByIdGet(id)

Get project role by ID

Gets the project role details and the default actors associated with the role. The list of default actors is sorted by display name.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRolesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
try {
    val result : ProjectRole = apiInstance.comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleByIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleByIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleByIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. |

### Return type

[**ProjectRole**](ProjectRole.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectRoleResourcePartialUpdateProjectRolePost"></a>
# **comAtlassianJiraRestV2IssueProjectRoleResourcePartialUpdateProjectRolePost**
> ProjectRole comAtlassianJiraRestV2IssueProjectRoleResourcePartialUpdateProjectRolePost(id, createUpdateRoleRequestBean)

Partial update project role

Updates either the project role&#39;s name or its description.  You cannot update both the name and description at the same time using this operation. If you send a request with a name and a description only the name is updated.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRolesApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
val createUpdateRoleRequestBean : CreateUpdateRoleRequestBean = {"name":"Developers","description":"A project role that represents developers in a project"} // CreateUpdateRoleRequestBean | 
try {
    val result : ProjectRole = apiInstance.comAtlassianJiraRestV2IssueProjectRoleResourcePartialUpdateProjectRolePost(id, createUpdateRoleRequestBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectRoleResourcePartialUpdateProjectRolePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRolesApi#comAtlassianJiraRestV2IssueProjectRoleResourcePartialUpdateProjectRolePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. |
 **createUpdateRoleRequestBean** | [**CreateUpdateRoleRequestBean**](CreateUpdateRoleRequestBean.md)|  |

### Return type

[**ProjectRole**](ProjectRole.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

