# AvatarsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueAvatarResourceGetAllSystemAvatarsGet**](AvatarsApi.md#comAtlassianJiraRestV2IssueAvatarResourceGetAllSystemAvatarsGet) | **GET** /rest/api/3/avatar/{type}/system | Get system avatars by type
[**comAtlassianJiraRestV2IssueUniversalAvatarResourceDeleteAvatarDelete**](AvatarsApi.md#comAtlassianJiraRestV2IssueUniversalAvatarResourceDeleteAvatarDelete) | **DELETE** /rest/api/3/universal_avatar/type/{type}/owner/{owningObjectId}/avatar/{id} | Delete avatar
[**comAtlassianJiraRestV2IssueUniversalAvatarResourceGetAvatarsGet**](AvatarsApi.md#comAtlassianJiraRestV2IssueUniversalAvatarResourceGetAvatarsGet) | **GET** /rest/api/3/universal_avatar/type/{type}/owner/{entityId} | Get avatars
[**comAtlassianJiraRestV2IssueUniversalAvatarResourceStoreAvatarPost**](AvatarsApi.md#comAtlassianJiraRestV2IssueUniversalAvatarResourceStoreAvatarPost) | **POST** /rest/api/3/universal_avatar/type/{type}/owner/{entityId} | Load avatar


<a name="comAtlassianJiraRestV2IssueAvatarResourceGetAllSystemAvatarsGet"></a>
# **comAtlassianJiraRestV2IssueAvatarResourceGetAllSystemAvatarsGet**
> SystemAvatars comAtlassianJiraRestV2IssueAvatarResourceGetAllSystemAvatarsGet(type)

Get system avatars by type

Returns a list of system avatar details by owner type, where the owner types are issue type, project, or user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AvatarsApi()
val type : kotlin.String = project // kotlin.String | The avatar type.
try {
    val result : SystemAvatars = apiInstance.comAtlassianJiraRestV2IssueAvatarResourceGetAllSystemAvatarsGet(type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#comAtlassianJiraRestV2IssueAvatarResourceGetAllSystemAvatarsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#comAtlassianJiraRestV2IssueAvatarResourceGetAllSystemAvatarsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **kotlin.String**| The avatar type. | [enum: issuetype, project, user]

### Return type

[**SystemAvatars**](SystemAvatars.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueUniversalAvatarResourceDeleteAvatarDelete"></a>
# **comAtlassianJiraRestV2IssueUniversalAvatarResourceDeleteAvatarDelete**
> comAtlassianJiraRestV2IssueUniversalAvatarResourceDeleteAvatarDelete(type, owningObjectId, id)

Delete avatar

Deletes an avatar from a project or issue type.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AvatarsApi()
val type : kotlin.String = type_example // kotlin.String | The avatar type.
val owningObjectId : kotlin.String = owningObjectId_example // kotlin.String | The ID of the item the avatar is associated with.
val id : kotlin.Long = 789 // kotlin.Long | The ID of the avatar.
try {
    apiInstance.comAtlassianJiraRestV2IssueUniversalAvatarResourceDeleteAvatarDelete(type, owningObjectId, id)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#comAtlassianJiraRestV2IssueUniversalAvatarResourceDeleteAvatarDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#comAtlassianJiraRestV2IssueUniversalAvatarResourceDeleteAvatarDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **kotlin.String**| The avatar type. | [enum: project, issuetype]
 **owningObjectId** | **kotlin.String**| The ID of the item the avatar is associated with. |
 **id** | **kotlin.Long**| The ID of the avatar. |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2IssueUniversalAvatarResourceGetAvatarsGet"></a>
# **comAtlassianJiraRestV2IssueUniversalAvatarResourceGetAvatarsGet**
> Avatars comAtlassianJiraRestV2IssueUniversalAvatarResourceGetAvatarsGet(type, entityId)

Get avatars

Returns the system and custom avatars for a project or issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AvatarsApi()
val type : kotlin.String = type_example // kotlin.String | The avatar type.
val entityId : kotlin.String = entityId_example // kotlin.String | The ID of the item the avatar is associated with.
try {
    val result : Avatars = apiInstance.comAtlassianJiraRestV2IssueUniversalAvatarResourceGetAvatarsGet(type, entityId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#comAtlassianJiraRestV2IssueUniversalAvatarResourceGetAvatarsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#comAtlassianJiraRestV2IssueUniversalAvatarResourceGetAvatarsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **kotlin.String**| The avatar type. | [enum: project, issuetype]
 **entityId** | **kotlin.String**| The ID of the item the avatar is associated with. |

### Return type

[**Avatars**](Avatars.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueUniversalAvatarResourceStoreAvatarPost"></a>
# **comAtlassianJiraRestV2IssueUniversalAvatarResourceStoreAvatarPost**
> Avatar comAtlassianJiraRestV2IssueUniversalAvatarResourceStoreAvatarPost(type, entityId, size, body, x, y)

Load avatar

Loads a custom avatar for a project or issue type.  Specify the avatar&#39;s local file location in the body of the request. Also, include the following headers:   *  &#x60;X-Atlassian-Token: no-check&#x60; To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).  *  &#x60;Content-Type: image/image type&#x60; Valid image types are JPEG, GIF, or PNG.  For example:   &#x60;curl --request POST &#x60;  &#x60;--user email@example.com:&lt;api_token&gt; &#x60;  &#x60;--header &#39;X-Atlassian-Token: no-check&#39; &#x60;  &#x60;--header &#39;Content-Type: image/&lt; image_type&gt;&#39; &#x60;  &#x60;--data-binary \&quot;&lt;@/path/to/file/with/your/avatar&gt;\&quot; &#x60;  &#x60;--url &#39;https://your-domain.atlassian.net/rest/api/3/universal_avatar/type/{type}/owner/{entityId}&#39;&#x60;  The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square&#39;s sides is set to the smaller of the height or width of the image.  The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.  After creating the avatar use:   *  [Update issue type](#api-rest-api-3-issuetype-id-put) to set it as the issue type&#39;s displayed avatar.  *  [Set project avatar](#api-rest-api-3-project-projectIdOrKey-avatar-put) to set it as the project&#39;s displayed avatar.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AvatarsApi()
val type : kotlin.String = type_example // kotlin.String | The avatar type.
val entityId : kotlin.String = entityId_example // kotlin.String | The ID of the item the avatar is associated with.
val size : kotlin.Int = 56 // kotlin.Int | The length of each side of the crop region.
val body : kotlin.Any =  // kotlin.Any | 
val x : kotlin.Int = 56 // kotlin.Int | The X coordinate of the top-left corner of the crop region.
val y : kotlin.Int = 56 // kotlin.Int | The Y coordinate of the top-left corner of the crop region.
try {
    val result : Avatar = apiInstance.comAtlassianJiraRestV2IssueUniversalAvatarResourceStoreAvatarPost(type, entityId, size, body, x, y)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#comAtlassianJiraRestV2IssueUniversalAvatarResourceStoreAvatarPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#comAtlassianJiraRestV2IssueUniversalAvatarResourceStoreAvatarPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **kotlin.String**| The avatar type. | [enum: project, issuetype]
 **entityId** | **kotlin.String**| The ID of the item the avatar is associated with. |
 **size** | **kotlin.Int**| The length of each side of the crop region. |
 **body** | **kotlin.Any**|  |
 **x** | **kotlin.Int**| The X coordinate of the top-left corner of the crop region. | [optional] [default to 0]
 **y** | **kotlin.Int**| The Y coordinate of the top-left corner of the crop region. | [optional] [default to 0]

### Return type

[**Avatar**](Avatar.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

