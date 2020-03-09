# IssueCommentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueIssueCommentListResourceGetCommentsByIdsPost**](IssueCommentsApi.md#comAtlassianJiraRestV2IssueIssueCommentListResourceGetCommentsByIdsPost) | **POST** /rest/api/3/comment/list | Get comments by IDs
[**comAtlassianJiraRestV2IssueIssueCommentResourceAddCommentPost**](IssueCommentsApi.md#comAtlassianJiraRestV2IssueIssueCommentResourceAddCommentPost) | **POST** /rest/api/3/issue/{issueIdOrKey}/comment | Add comment
[**comAtlassianJiraRestV2IssueIssueCommentResourceDeleteCommentDelete**](IssueCommentsApi.md#comAtlassianJiraRestV2IssueIssueCommentResourceDeleteCommentDelete) | **DELETE** /rest/api/3/issue/{issueIdOrKey}/comment/{id} | Delete comment
[**comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentGet**](IssueCommentsApi.md#comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/comment/{id} | Get comment
[**comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentsGet**](IssueCommentsApi.md#comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentsGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/comment | Get comments
[**comAtlassianJiraRestV2IssueIssueCommentResourceUpdateCommentPut**](IssueCommentsApi.md#comAtlassianJiraRestV2IssueIssueCommentResourceUpdateCommentPut) | **PUT** /rest/api/3/issue/{issueIdOrKey}/comment/{id} | Update comment


<a name="comAtlassianJiraRestV2IssueIssueCommentListResourceGetCommentsByIdsPost"></a>
# **comAtlassianJiraRestV2IssueIssueCommentListResourceGetCommentsByIdsPost**
> PageBeanComment comAtlassianJiraRestV2IssueIssueCommentListResourceGetCommentsByIdsPost(issueCommentListRequestBean, expand)

Get comments by IDs

Returns the comments for a list of comment IDs.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Comments are returned where the user:   *  has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCommentsApi()
val issueCommentListRequestBean : IssueCommentListRequestBean = {"ids":[1,2,5,10]} // IssueCommentListRequestBean | The list of comment IDs.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts a comma-separated list. Expand options include:   *  `renderedBody` Returns the comment body rendered in HTML.  *  `properties` Returns the comment's properties.
try {
    val result : PageBeanComment = apiInstance.comAtlassianJiraRestV2IssueIssueCommentListResourceGetCommentsByIdsPost(issueCommentListRequestBean, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCommentsApi#comAtlassianJiraRestV2IssueIssueCommentListResourceGetCommentsByIdsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCommentsApi#comAtlassianJiraRestV2IssueIssueCommentListResourceGetCommentsByIdsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueCommentListRequestBean** | [**IssueCommentListRequestBean**](IssueCommentListRequestBean.md)| The list of comment IDs. |
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;renderedBody&#x60; Returns the comment body rendered in HTML.  *  &#x60;properties&#x60; Returns the comment&#39;s properties. | [optional]

### Return type

[**PageBeanComment**](PageBeanComment.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueCommentResourceAddCommentPost"></a>
# **comAtlassianJiraRestV2IssueIssueCommentResourceAddCommentPost**
> Comment comAtlassianJiraRestV2IssueIssueCommentResourceAddCommentPost(issueIdOrKey, requestBody, expand)

Add comment

Adds a comment to an issue.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Add comments* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCommentsApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"visibility":{"type":"role","value":"Administrators"},"body":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget venenatis elit. Duis eu justo eget augue iaculis fermentum. Sed semper quam laoreet nisi egestas at posuere augue semper.","type":"text"}]}]}} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts `renderedBody`, which returns the comment body rendered in HTML.
try {
    val result : Comment = apiInstance.comAtlassianJiraRestV2IssueIssueCommentResourceAddCommentPost(issueIdOrKey, requestBody, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCommentsApi#comAtlassianJiraRestV2IssueIssueCommentResourceAddCommentPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCommentsApi#comAtlassianJiraRestV2IssueIssueCommentResourceAddCommentPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  |
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts &#x60;renderedBody&#x60;, which returns the comment body rendered in HTML. | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueCommentResourceDeleteCommentDelete"></a>
# **comAtlassianJiraRestV2IssueIssueCommentResourceDeleteCommentDelete**
> comAtlassianJiraRestV2IssueIssueCommentResourceDeleteCommentDelete(issueIdOrKey, id)

Delete comment

Deletes a comment.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Delete all comments*[ project permission](https://confluence.atlassian.com/x/yodKLg) to delete any comment or *Delete own comments* to delete comment created by the user,  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCommentsApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val id : kotlin.String = id_example // kotlin.String | The ID of the comment.
try {
    apiInstance.comAtlassianJiraRestV2IssueIssueCommentResourceDeleteCommentDelete(issueIdOrKey, id)
} catch (e: ClientException) {
    println("4xx response calling IssueCommentsApi#comAtlassianJiraRestV2IssueIssueCommentResourceDeleteCommentDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCommentsApi#comAtlassianJiraRestV2IssueIssueCommentResourceDeleteCommentDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **id** | **kotlin.String**| The ID of the comment. |

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

<a name="comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentGet"></a>
# **comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentGet**
> Comment comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentGet(issueIdOrKey, id, expand)

Get comment

Returns a comment.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCommentsApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val id : kotlin.String = id_example // kotlin.String | The ID of the comment.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts `renderedBody`, which returns the comment body rendered in HTML.
try {
    val result : Comment = apiInstance.comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentGet(issueIdOrKey, id, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCommentsApi#comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCommentsApi#comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **id** | **kotlin.String**| The ID of the comment. |
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts &#x60;renderedBody&#x60;, which returns the comment body rendered in HTML. | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentsGet"></a>
# **comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentsGet**
> PageOfComments comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentsGet(issueIdOrKey, startAt, maxResults, orderBy, expand)

Get comments

Returns all comments for an issue.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Comments are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCommentsApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val orderBy : kotlin.String = orderBy_example // kotlin.String | [Order](#ordering) the results by a field. Accepts *created* to sort comments by their created date.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts `renderedBody`, which returns the comment body rendered in HTML.
try {
    val result : PageOfComments = apiInstance.comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentsGet(issueIdOrKey, startAt, maxResults, orderBy, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCommentsApi#comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCommentsApi#comAtlassianJiraRestV2IssueIssueCommentResourceGetCommentsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]
 **orderBy** | **kotlin.String**| [Order](#ordering) the results by a field. Accepts *created* to sort comments by their created date. | [optional] [enum: created, -created, +created]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts &#x60;renderedBody&#x60;, which returns the comment body rendered in HTML. | [optional]

### Return type

[**PageOfComments**](PageOfComments.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueCommentResourceUpdateCommentPut"></a>
# **comAtlassianJiraRestV2IssueIssueCommentResourceUpdateCommentPut**
> Comment comAtlassianJiraRestV2IssueIssueCommentResourceUpdateCommentPut(issueIdOrKey, id, requestBody, expand)

Update comment

Updates a comment.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all comments*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any comment or *Edit own comments* to update comment created by the user.  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueCommentsApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val id : kotlin.String = id_example // kotlin.String | The ID of the comment.
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"visibility":{"type":"role","value":"Administrators"},"body":{"type":"doc","version":1,"content":[{"type":"paragraph","content":[{"text":"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget venenatis elit. Duis eu justo eget augue iaculis fermentum. Sed semper quam laoreet nisi egestas at posuere augue semper.","type":"text"}]}]}} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts `renderedBody`, which returns the comment body rendered in HTML.
try {
    val result : Comment = apiInstance.comAtlassianJiraRestV2IssueIssueCommentResourceUpdateCommentPut(issueIdOrKey, id, requestBody, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueCommentsApi#comAtlassianJiraRestV2IssueIssueCommentResourceUpdateCommentPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueCommentsApi#comAtlassianJiraRestV2IssueIssueCommentResourceUpdateCommentPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **id** | **kotlin.String**| The ID of the comment. |
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  |
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts &#x60;renderedBody&#x60;, which returns the comment body rendered in HTML. | [optional]

### Return type

[**Comment**](Comment.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

