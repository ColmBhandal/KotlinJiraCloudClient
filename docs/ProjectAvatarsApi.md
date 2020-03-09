# ProjectAvatarsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueProjectResourceCreateProjectAvatarPost**](ProjectAvatarsApi.md#comAtlassianJiraRestV2IssueProjectResourceCreateProjectAvatarPost) | **POST** /rest/api/3/project/{projectIdOrKey}/avatar2 | Load project avatar
[**comAtlassianJiraRestV2IssueProjectResourceDeleteProjectAvatarDelete**](ProjectAvatarsApi.md#comAtlassianJiraRestV2IssueProjectResourceDeleteProjectAvatarDelete) | **DELETE** /rest/api/3/project/{projectIdOrKey}/avatar/{id} | Delete project avatar
[**comAtlassianJiraRestV2IssueProjectResourceGetAllProjectAvatarsGet**](ProjectAvatarsApi.md#comAtlassianJiraRestV2IssueProjectResourceGetAllProjectAvatarsGet) | **GET** /rest/api/3/project/{projectIdOrKey}/avatars | Get all project avatars
[**comAtlassianJiraRestV2IssueProjectResourceUpdateProjectAvatarPut**](ProjectAvatarsApi.md#comAtlassianJiraRestV2IssueProjectResourceUpdateProjectAvatarPut) | **PUT** /rest/api/3/project/{projectIdOrKey}/avatar | Set project avatar


<a name="comAtlassianJiraRestV2IssueProjectResourceCreateProjectAvatarPost"></a>
# **comAtlassianJiraRestV2IssueProjectResourceCreateProjectAvatarPost**
> Avatar comAtlassianJiraRestV2IssueProjectResourceCreateProjectAvatarPost(projectIdOrKey, body, x, y, size)

Load project avatar

Loads an avatar for a project.  Specify the avatar&#39;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST &#x60;  &#x60;--user email@example.com:&lt;api_token&gt; &#x60;  &#x60;--header &#39;X-Atlassian-Token: no-check&#39; &#x60;  &#x60;--header &#39;Content-Type: image/&lt; image_type&gt;&#39; &#x60;  &#x60;--data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; &#x60;  &#x60;--url &#39;https://your-domain.atlassian.net/rest/api/3/project/{projectIdOrKey}/avatar2&#39;&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#39;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar use [Set project avatar](#api-rest-api-3-project-projectIdOrKey-avatar-put) to set it as the project&#39;s displayed avatar.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectAvatarsApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The ID or (case-sensitive) key of the project.
val body : kotlin.Any =  // kotlin.Any | 
val x : kotlin.Int = 56 // kotlin.Int | The X coordinate of the top-left corner of the crop region.
val y : kotlin.Int = 56 // kotlin.Int | The Y coordinate of the top-left corner of the crop region.
val size : kotlin.Int = 56 // kotlin.Int | The length of each side of the crop region.
try {
    val result : Avatar = apiInstance.comAtlassianJiraRestV2IssueProjectResourceCreateProjectAvatarPost(projectIdOrKey, body, x, y, size)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectAvatarsApi#comAtlassianJiraRestV2IssueProjectResourceCreateProjectAvatarPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectAvatarsApi#comAtlassianJiraRestV2IssueProjectResourceCreateProjectAvatarPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The ID or (case-sensitive) key of the project. |
 **body** | **kotlin.Any**|  |
 **x** | **kotlin.Int**| The X coordinate of the top-left corner of the crop region. | [optional] [default to 0]
 **y** | **kotlin.Int**| The Y coordinate of the top-left corner of the crop region. | [optional] [default to 0]
 **size** | **kotlin.Int**| The length of each side of the crop region. | [optional]

### Return type

[**Avatar**](Avatar.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectResourceDeleteProjectAvatarDelete"></a>
# **comAtlassianJiraRestV2IssueProjectResourceDeleteProjectAvatarDelete**
> comAtlassianJiraRestV2IssueProjectResourceDeleteProjectAvatarDelete(projectIdOrKey, id)

Delete project avatar

Deletes a custom avatar from a project. Note that system avatars cannot be deleted.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectAvatarsApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The project ID or (case-sensitive) key.
val id : kotlin.Long = 789 // kotlin.Long | The ID of the avatar.
try {
    apiInstance.comAtlassianJiraRestV2IssueProjectResourceDeleteProjectAvatarDelete(projectIdOrKey, id)
} catch (e: ClientException) {
    println("4xx response calling ProjectAvatarsApi#comAtlassianJiraRestV2IssueProjectResourceDeleteProjectAvatarDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectAvatarsApi#comAtlassianJiraRestV2IssueProjectResourceDeleteProjectAvatarDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The project ID or (case-sensitive) key. |
 **id** | **kotlin.Long**| The ID of the avatar. |

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

<a name="comAtlassianJiraRestV2IssueProjectResourceGetAllProjectAvatarsGet"></a>
# **comAtlassianJiraRestV2IssueProjectResourceGetAllProjectAvatarsGet**
> ProjectAvatars comAtlassianJiraRestV2IssueProjectResourceGetAllProjectAvatarsGet(projectIdOrKey)

Get all project avatars

Returns all project avatars, grouped by system and custom avatars.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectAvatarsApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The ID or (case-sensitive) key of the project.
try {
    val result : ProjectAvatars = apiInstance.comAtlassianJiraRestV2IssueProjectResourceGetAllProjectAvatarsGet(projectIdOrKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectAvatarsApi#comAtlassianJiraRestV2IssueProjectResourceGetAllProjectAvatarsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectAvatarsApi#comAtlassianJiraRestV2IssueProjectResourceGetAllProjectAvatarsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The ID or (case-sensitive) key of the project. |

### Return type

[**ProjectAvatars**](ProjectAvatars.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueProjectResourceUpdateProjectAvatarPut"></a>
# **comAtlassianJiraRestV2IssueProjectResourceUpdateProjectAvatarPut**
> kotlin.Any comAtlassianJiraRestV2IssueProjectResourceUpdateProjectAvatarPut(projectIdOrKey, avatar)

Set project avatar

Sets the avatar displayed for a project.  Use [Load project avatar](#api-rest-api-3-project-projectIdOrKey-avatar2-post) to store avatars against the project, before using this operation to set the displayed avatar.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectAvatarsApi()
val projectIdOrKey : kotlin.String = projectIdOrKey_example // kotlin.String | The ID or (case-sensitive) key of the project.
val avatar : Avatar = {"id":"10010"} // Avatar | 
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueProjectResourceUpdateProjectAvatarPut(projectIdOrKey, avatar)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectAvatarsApi#comAtlassianJiraRestV2IssueProjectResourceUpdateProjectAvatarPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectAvatarsApi#comAtlassianJiraRestV2IssueProjectResourceUpdateProjectAvatarPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectIdOrKey** | **kotlin.String**| The ID or (case-sensitive) key of the project. |
 **avatar** | [**Avatar**](Avatar.md)|  |

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

