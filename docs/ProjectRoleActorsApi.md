# ProjectRoleActorsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueProjectProjectRoleResourceAddActorUsersPost**](ProjectRoleActorsApi.md#comAtlassianJiraRestV2IssueProjectProjectRoleResourceAddActorUsersPost) | **POST** /rest/api/3/project/{projectIdOrKey}/role/{id} | Add actors to project role
[**comAtlassianJiraRestV2IssueProjectProjectRoleResourceDeleteActorDelete**](ProjectRoleActorsApi.md#comAtlassianJiraRestV2IssueProjectProjectRoleResourceDeleteActorDelete) | **DELETE** /rest/api/3/project/{projectIdOrKey}/role/{id} | Delete actors from project role
[**comAtlassianJiraRestV2IssueProjectProjectRoleResourceSetActorsPut**](ProjectRoleActorsApi.md#comAtlassianJiraRestV2IssueProjectProjectRoleResourceSetActorsPut) | **PUT** /rest/api/3/project/{projectIdOrKey}/role/{id} | Set actors for project role
[**comAtlassianJiraRestV2IssueProjectRoleResourceAddProjectRoleActorsToRolePost**](ProjectRoleActorsApi.md#comAtlassianJiraRestV2IssueProjectRoleResourceAddProjectRoleActorsToRolePost) | **POST** /rest/api/3/role/{id}/actors | Add default actors to project role
[**comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleActorsFromRoleDelete**](ProjectRoleActorsApi.md#comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleActorsFromRoleDelete) | **DELETE** /rest/api/3/role/{id}/actors | Delete default actors from project role
[**comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleActorsForRoleGet**](ProjectRoleActorsApi.md#comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleActorsForRoleGet) | **GET** /rest/api/3/role/{id}/actors | Get default actors for project role


<a name="comAtlassianJiraRestV2IssueProjectProjectRoleResourceAddActorUsersPost"></a>
# **comAtlassianJiraRestV2IssueProjectProjectRoleResourceAddActorUsersPost**
> ProjectRole comAtlassianJiraRestV2IssueProjectProjectRoleResourceAddActorUsersPost(projectIdOrKey, id, actorsMap)

Add actors to project role

Adds actors to a project role for the project.  To replace all actors for the project, use [Set actors for project role](#api-rest-api-3-project-projectIdOrKey-role-id-put).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRoleActorsApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
val id : kotlin.Long = 789 // kotlin.Long | The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
val actorsMap : ActorsMap = {"group":["jira-developers"]} // ActorsMap | The groups or users to associate with the project role for this project. Provide the user account ID or group name.
try {
    val result : ProjectRole = apiInstance.comAtlassianJiraRestV2IssueProjectProjectRoleResourceAddActorUsersPost(projectIdOrKey, id, actorsMap)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectRoleActorsApi#comAtlassianJiraRestV2IssueProjectProjectRoleResourceAddActorUsersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRoleActorsApi#comAtlassianJiraRestV2IssueProjectProjectRoleResourceAddActorUsersPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |
 **id** | **kotlin.Long**| The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. |
 **actorsMap** | [**ActorsMap**](ActorsMap.md)| The groups or users to associate with the project role for this project. Provide the user account ID or group name. |

### Return type

[**ProjectRole**](ProjectRole.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectProjectRoleResourceDeleteActorDelete"></a>
# **comAtlassianJiraRestV2IssueProjectProjectRoleResourceDeleteActorDelete**
> comAtlassianJiraRestV2IssueProjectProjectRoleResourceDeleteActorDelete(projectIdOrKey, id, user, group)

Delete actors from project role

Deletes actors from a project role for the project.  To remove default actors from the project role, use [Delete default actors from project role This operation can be accessed anonymously. ](#api-rest-api-3-role-id-actors-delete)  [ ](#api-rest-api-3-role-id-actors-delete)**[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRoleActorsApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
val id : kotlin.Long = 789 // kotlin.Long | The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
val user : kotlin.String = 5b10ac8d82e05b22cc7d4ef5 // kotlin.String | The user account ID of the user to remove from the project role.
val group : kotlin.String = group_example // kotlin.String | The name of the group to remove from the project role.
try {
    apiInstance.comAtlassianJiraRestV2IssueProjectProjectRoleResourceDeleteActorDelete(projectIdOrKey, id, user, group)
} catch (e: ClientException) {
    println("4xx response calling ProjectRoleActorsApi#comAtlassianJiraRestV2IssueProjectProjectRoleResourceDeleteActorDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRoleActorsApi#comAtlassianJiraRestV2IssueProjectProjectRoleResourceDeleteActorDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |
 **id** | **kotlin.Long**| The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. |
 **user** | **kotlin.String**| The user account ID of the user to remove from the project role. | [optional]
 **group** | **kotlin.String**| The name of the group to remove from the project role. | [optional]

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

<a name="comAtlassianJiraRestV2IssueProjectProjectRoleResourceSetActorsPut"></a>
# **comAtlassianJiraRestV2IssueProjectProjectRoleResourceSetActorsPut**
> ProjectRole comAtlassianJiraRestV2IssueProjectProjectRoleResourceSetActorsPut(projectIdOrKey, id, projectRoleActorsUpdateBean)

Set actors for project role

Sets the actors for a project role for a project, replacing all existing actors.  To add actors to the project without overwriting the existing list, use [Add actors to project role](#api-rest-api-3-project-projectIdOrKey-role-id-post).  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRoleActorsApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or project key (case sensitive).
val id : kotlin.Long = 789 // kotlin.Long | The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
val projectRoleActorsUpdateBean : ProjectRoleActorsUpdateBean = {"categorisedActors":{"atlassian-user-role-actor":["12345678-9abc-def1-2345-6789abcdef12"],"atlassian-group-role-actor":["jira-developers"]}} // ProjectRoleActorsUpdateBean | The groups or users to associate with the project role for this project. Provide the user account ID or group name.
try {
    val result : ProjectRole = apiInstance.comAtlassianJiraRestV2IssueProjectProjectRoleResourceSetActorsPut(projectIdOrKey, id, projectRoleActorsUpdateBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectRoleActorsApi#comAtlassianJiraRestV2IssueProjectProjectRoleResourceSetActorsPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRoleActorsApi#comAtlassianJiraRestV2IssueProjectProjectRoleResourceSetActorsPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or project key (case sensitive). |
 **id** | **kotlin.Long**| The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. |
 **projectRoleActorsUpdateBean** | [**ProjectRoleActorsUpdateBean**](ProjectRoleActorsUpdateBean.md)| The groups or users to associate with the project role for this project. Provide the user account ID or group name. |

### Return type

[**ProjectRole**](ProjectRole.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectRoleResourceAddProjectRoleActorsToRolePost"></a>
# **comAtlassianJiraRestV2IssueProjectRoleResourceAddProjectRoleActorsToRolePost**
> ProjectRole comAtlassianJiraRestV2IssueProjectRoleResourceAddProjectRoleActorsToRolePost(id, actorInputBean)

Add default actors to project role

Adds [default actors](#api-rest-api-3-resolution-get) to a role. You may add groups or users, but you cannot add groups and users in the same request.  Changing a project role&#39;s default actors does not affect project role members for projects already created.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRoleActorsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
val actorInputBean : ActorInputBean = {"user":["admin"]} // ActorInputBean | 
try {
    val result : ProjectRole = apiInstance.comAtlassianJiraRestV2IssueProjectRoleResourceAddProjectRoleActorsToRolePost(id, actorInputBean)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectRoleActorsApi#comAtlassianJiraRestV2IssueProjectRoleResourceAddProjectRoleActorsToRolePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRoleActorsApi#comAtlassianJiraRestV2IssueProjectRoleResourceAddProjectRoleActorsToRolePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. |
 **actorInputBean** | [**ActorInputBean**](ActorInputBean.md)|  |

### Return type

[**ProjectRole**](ProjectRole.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleActorsFromRoleDelete"></a>
# **comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleActorsFromRoleDelete**
> ProjectRole comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleActorsFromRoleDelete(id, user, group)

Delete default actors from project role

Deletes the [default actors](#api-rest-api-3-resolution-get) from a project role. You may delete a group or user, but you cannot delete a group and a user in the same request.  Changing a project role&#39;s default actors does not affect project role members for projects already created.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRoleActorsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
val user : kotlin.String = 5b10ac8d82e05b22cc7d4ef5 // kotlin.String | The user account ID of the user to remove as a default actor.
val group : kotlin.String = group_example // kotlin.String | The group name of the group to be removed as a default actor.
try {
    val result : ProjectRole = apiInstance.comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleActorsFromRoleDelete(id, user, group)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectRoleActorsApi#comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleActorsFromRoleDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRoleActorsApi#comAtlassianJiraRestV2IssueProjectRoleResourceDeleteProjectRoleActorsFromRoleDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Long**| The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs. |
 **user** | **kotlin.String**| The user account ID of the user to remove as a default actor. | [optional]
 **group** | **kotlin.String**| The group name of the group to be removed as a default actor. | [optional]

### Return type

[**ProjectRole**](ProjectRole.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleActorsForRoleGet"></a>
# **comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleActorsForRoleGet**
> ProjectRole comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleActorsForRoleGet(id)

Get default actors for project role

Returns the [default actors](#api-rest-api-3-resolution-get) for the project role.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectRoleActorsApi()
val id : kotlin.Long = 789 // kotlin.Long | The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
try {
    val result : ProjectRole = apiInstance.comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleActorsForRoleGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectRoleActorsApi#comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleActorsForRoleGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectRoleActorsApi#comAtlassianJiraRestV2IssueProjectRoleResourceGetProjectRoleActorsForRoleGet")
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

