# IssueWatchersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueIssueResourceAddWatcherPost**](IssueWatchersApi.md#comAtlassianJiraRestV2IssueIssueResourceAddWatcherPost) | **POST** /rest/api/3/issue/{issueIdOrKey}/watchers | Add watcher
[**comAtlassianJiraRestV2IssueIssueResourceGetIssueWatchersGet**](IssueWatchersApi.md#comAtlassianJiraRestV2IssueIssueResourceGetIssueWatchersGet) | **GET** /rest/api/3/issue/{issueIdOrKey}/watchers | Get issue watchers
[**comAtlassianJiraRestV2IssueIssueResourceRemoveWatcherDelete**](IssueWatchersApi.md#comAtlassianJiraRestV2IssueIssueResourceRemoveWatcherDelete) | **DELETE** /rest/api/3/issue/{issueIdOrKey}/watchers | Delete watcher


<a name="comAtlassianJiraRestV2IssueIssueResourceAddWatcherPost"></a>
# **comAtlassianJiraRestV2IssueIssueResourceAddWatcherPost**
> kotlin.Any comAtlassianJiraRestV2IssueIssueResourceAddWatcherPost(issueIdOrKey, body)

Add watcher

Adds a user as a watcher of an issue by passing the account ID of the user. For example, &#x60;\&quot;5b10ac8d82e05b22cc7d4ef5\&quot;&#x60;. If no user is specified the calling user is added.  This operation requires the **Allow users to watch issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  To add users other than themselves to the watchlist, *Manage watcher list* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWatchersApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val body : kotlin.String = body_example // kotlin.String | The account ID of the user. Note that username cannot be used due to privacy changes.
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueIssueResourceAddWatcherPost(issueIdOrKey, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueWatchersApi#comAtlassianJiraRestV2IssueIssueResourceAddWatcherPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWatchersApi#comAtlassianJiraRestV2IssueIssueResourceAddWatcherPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **body** | **kotlin.String**| The account ID of the user. Note that username cannot be used due to privacy changes. |

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

<a name="comAtlassianJiraRestV2IssueIssueResourceGetIssueWatchersGet"></a>
# **comAtlassianJiraRestV2IssueIssueResourceGetIssueWatchersGet**
> Watchers comAtlassianJiraRestV2IssueIssueResourceGetIssueWatchersGet(issueIdOrKey)

Get issue watchers

Returns the watchers for an issue.  This operation requires the **Allow users to watch issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is ini  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  To see details of users on the watchlist other than themselves, *View voters and watchers* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWatchersApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
try {
    val result : Watchers = apiInstance.comAtlassianJiraRestV2IssueIssueResourceGetIssueWatchersGet(issueIdOrKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssueWatchersApi#comAtlassianJiraRestV2IssueIssueResourceGetIssueWatchersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWatchersApi#comAtlassianJiraRestV2IssueIssueResourceGetIssueWatchersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |

### Return type

[**Watchers**](Watchers.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueIssueResourceRemoveWatcherDelete"></a>
# **comAtlassianJiraRestV2IssueIssueResourceRemoveWatcherDelete**
> comAtlassianJiraRestV2IssueIssueResourceRemoveWatcherDelete(issueIdOrKey, username, accountId)

Delete watcher

Deletes a user as a watcher of an issue.  This operation requires the **Allow users to watch issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  To remove users other than themselves from the watchlist, *Manage watcher list* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssueWatchersApi()
val issueIdOrKey : kotlin.String = issueIdOrKey_example // kotlin.String | The ID or key of the issue.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
val accountId : kotlin.String = 5b10ac8d82e05b22cc7d4ef5 // kotlin.String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required.
try {
    apiInstance.comAtlassianJiraRestV2IssueIssueResourceRemoveWatcherDelete(issueIdOrKey, username, accountId)
} catch (e: ClientException) {
    println("4xx response calling IssueWatchersApi#comAtlassianJiraRestV2IssueIssueResourceRemoveWatcherDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssueWatchersApi#comAtlassianJiraRestV2IssueIssueResourceRemoveWatcherDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueIdOrKey** | **kotlin.String**| The ID or key of the issue. |
 **username** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]
 **accountId** | **kotlin.String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required. | [optional]

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

