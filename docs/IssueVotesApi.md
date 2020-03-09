# IssueVotesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueIssueResourceAddVotePost**](IssueVotesApi.md#comAtlassianJiraRestV2IssueIssueResourceAddVotePost) | **POST** /rest/api/3/issue/{issueIdOrKey}/votes | Add vote
[**comAtlassianJiraRestV2IssueIssueResourceGetVotesGet**](IssueVotesApi.md#comAtlassianJiraRestV2IssueIssueResourceGetVotesGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/votes | Get votes
[**comAtlassianJiraRestV2IssueIssueResourceRemoveVoteDelete**](IssueVotesApi.md#comAtlassianJiraRestV2IssueIssueResourceRemoveVoteDelete) | **DELETE** /rest/api/3/issue/{issueIdOrKey}/votes | Delete vote


<a name="comAtlassianJiraRestV2IssueIssueResourceAddVotePost"></a>
# **comAtlassianJiraRestV2IssueIssueResourceAddVotePost**
> kotlin.Any comAtlassianJiraRestV2IssueIssueResourceAddVotePost(issueIdOrKey)

Add vote

Adds the user&#39;s vote to an issue. This is the equivalent of the user clicking *Vote* on an issue in Jira.  This operation requires the **Allow users to vote on issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueVotesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueIssueResourceAddVotePost(issueIdOrKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueVotesApi#comAtlassianJiraRestV2IssueIssueResourceAddVotePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueVotesApi#comAtlassianJiraRestV2IssueIssueResourceAddVotePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueResourceGetVotesGet"></a>
# **comAtlassianJiraRestV2IssueIssueResourceGetVotesGet**
> Votes comAtlassianJiraRestV2IssueIssueResourceGetVotesGet(issueIdOrKey)

Get votes

Returns details about the votes on an issue.  This operation requires the **Allow users to vote on issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is ini  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  Note that users with the necessary permissions for this operation but without the *View voters and watchers* project permissions are not returned details in the &#x60;voters&#x60; field.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueVotesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
try {
    val result : Votes = apiInstance.comAtlassianJiraRestV2IssueIssueResourceGetVotesGet(issueIdOrKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueVotesApi#comAtlassianJiraRestV2IssueIssueResourceGetVotesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueVotesApi#comAtlassianJiraRestV2IssueIssueResourceGetVotesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |

### Return type

[**Votes**](Votes.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueResourceRemoveVoteDelete"></a>
# **comAtlassianJiraRestV2IssueIssueResourceRemoveVoteDelete**
> comAtlassianJiraRestV2IssueIssueResourceRemoveVoteDelete(issueIdOrKey)

Delete vote

Deletes a user&#39;s vote from an issue. This is the equivalent of the user clicking *Unvote* on an issue in Jira.  This operation requires the **Allow users to vote on issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueVotesApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
try {
    apiInstance.comAtlassianJiraRestV2IssueIssueResourceRemoveVoteDelete(issueIdOrKey)
} catch (e: ClientException) {
    println("4xx response calling IssueVotesApi#comAtlassianJiraRestV2IssueIssueResourceRemoveVoteDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueVotesApi#comAtlassianJiraRestV2IssueIssueResourceRemoveVoteDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |

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

