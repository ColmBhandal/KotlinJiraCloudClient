# UserSearchApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueUserResourceFindAssignableUsersGet**](UserSearchApi.md#comAtlassianJiraRestV2IssueUserResourceFindAssignableUsersGet) | **GET** /rest/api/3/user/assignable/search | Find users assignable to issues
[**comAtlassianJiraRestV2IssueUserResourceFindBulkAssignableUsersGet**](UserSearchApi.md#comAtlassianJiraRestV2IssueUserResourceFindBulkAssignableUsersGet) | **GET** /rest/api/3/user/assignable/multiProjectSearch | Find users assignable to projects
[**comAtlassianJiraRestV2IssueUserResourceFindUsersForPickerGet**](UserSearchApi.md#comAtlassianJiraRestV2IssueUserResourceFindUsersForPickerGet) | **GET** /rest/api/3/user/picker | Find users for picker
[**comAtlassianJiraRestV2IssueUserResourceFindUsersGet**](UserSearchApi.md#comAtlassianJiraRestV2IssueUserResourceFindUsersGet) | **GET** /rest/api/3/user/search | Find users
[**comAtlassianJiraRestV2IssueUserResourceFindUsersWithAllPermissionsGet**](UserSearchApi.md#comAtlassianJiraRestV2IssueUserResourceFindUsersWithAllPermissionsGet) | **GET** /rest/api/3/user/permission/search | Find users with permissions
[**comAtlassianJiraRestV2IssueUserResourceFindUsersWithBrowsePermissionGet**](UserSearchApi.md#comAtlassianJiraRestV2IssueUserResourceFindUsersWithBrowsePermissionGet) | **GET** /rest/api/3/user/viewissue/search | Find users with browse permission
[**comAtlassianJiraRestV2SearchUserSearchResourceFindUserKeysByQueryGet**](UserSearchApi.md#comAtlassianJiraRestV2SearchUserSearchResourceFindUserKeysByQueryGet) | **GET** /rest/api/3/user/search/query/key | Find user keys by query
[**comAtlassianJiraRestV2SearchUserSearchResourceFindUsersByQueryGet**](UserSearchApi.md#comAtlassianJiraRestV2SearchUserSearchResourceFindUsersByQueryGet) | **GET** /rest/api/3/user/search/query | Find users by query


<a name="comAtlassianJiraRestV2IssueUserResourceFindAssignableUsersGet"></a>
# **comAtlassianJiraRestV2IssueUserResourceFindAssignableUsersGet**
> kotlin.Array&lt;User&gt; comAtlassianJiraRestV2IssueUserResourceFindAssignableUsersGet(query, sessionId, username, accountId, project, issueKey, startAt, maxResults, actionDescriptorId, recommend)

Find users assignable to issues

Returns a list of users that can be assigned to an issue. Use this operation to find the list of users who can be assigned to:   *  a new issue, by providing the &#x60;projectKeyOrId&#x60;.  *  an updated issue, by providing the &#x60;issueKey&#x60;.  *  to an issue during a transition (workflow action), by providing the &#x60;issueKey&#x60; and the transition id in &#x60;actionDescriptorId&#x60;. You can obtain the IDs of an issue&#39;s valid transitions using the &#x60;transitions&#x60; option in the &#x60;expand&#x60; parameter of [ Get issue](#api-rest-api-3-issue-issueIdOrKey-get).  In all these cases, you can pass an account ID to determine if a user can be assigned to an issue. The user is returned in the response if they can be assigned to the issue or issue transition.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that can be assigned the issue. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who can be assigned the issue, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserSearchApi()
val query : kotlin.String = query // kotlin.String | A query string that is matched against user attributes, such as `displayName`, and `emailAddress`, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a `displayName` of *John Smith* and a user with an `emailAddress` of *johnson@example.com*. Required, unless `username` or `accountId` is specified.
val sessionId : kotlin.String = sessionId_example // kotlin.String | The sessionId of this request. SessionId is the same until the assignee is set.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
val accountId : kotlin.String = accountId_example // kotlin.String | A query string that is matched exactly against user `accountId`. Required, unless `query` is specified.
val project : kotlin.String = project_example // kotlin.String | The project ID or project key (case sensitive). Required, unless `issueKey` is specified.
val issueKey : kotlin.String = issueKey_example // kotlin.String | The key of the issue. Required, unless `project` is specified.
val startAt : kotlin.Int = 56 // kotlin.Int | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. This operation may return less than the maximum number of items even if more are available. The operation fetches users up to the maximum and then, from the fetched users, returns only the users that can be assigned to the issue.
val actionDescriptorId : kotlin.Int = 56 // kotlin.Int | The ID of the transition.
val recommend : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.Array<User> = apiInstance.comAtlassianJiraRestV2IssueUserResourceFindAssignableUsersGet(query, sessionId, username, accountId, project, issueKey, startAt, maxResults, actionDescriptorId, recommend)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserSearchApi#comAtlassianJiraRestV2IssueUserResourceFindAssignableUsersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserSearchApi#comAtlassianJiraRestV2IssueUserResourceFindAssignableUsersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| A query string that is matched against user attributes, such as &#x60;displayName&#x60;, and &#x60;emailAddress&#x60;, to find relevant users. The string can match the prefix of the attribute&#39;s value. For example, *query&#x3D;john* matches a user with a &#x60;displayName&#x60; of *John Smith* and a user with an &#x60;emailAddress&#x60; of *johnson@example.com*. Required, unless &#x60;username&#x60; or &#x60;accountId&#x60; is specified. | [optional]
 **sessionId** | **kotlin.String**| The sessionId of this request. SessionId is the same until the assignee is set. | [optional]
 **username** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]
 **accountId** | **kotlin.String**| A query string that is matched exactly against user &#x60;accountId&#x60;. Required, unless &#x60;query&#x60; is specified. | [optional]
 **project** | **kotlin.String**| The project ID or project key (case sensitive). Required, unless &#x60;issueKey&#x60; is specified. | [optional]
 **issueKey** | **kotlin.String**| The key of the issue. Required, unless &#x60;project&#x60; is specified. | [optional]
 **startAt** | **kotlin.Int**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return. This operation may return less than the maximum number of items even if more are available. The operation fetches users up to the maximum and then, from the fetched users, returns only the users that can be assigned to the issue. | [optional] [default to 50]
 **actionDescriptorId** | **kotlin.Int**| The ID of the transition. | [optional]
 **recommend** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueUserResourceFindBulkAssignableUsersGet"></a>
# **comAtlassianJiraRestV2IssueUserResourceFindBulkAssignableUsersGet**
> kotlin.Array&lt;User&gt; comAtlassianJiraRestV2IssueUserResourceFindBulkAssignableUsersGet(projectKeys, query, username, accountId, startAt, maxResults)

Find users assignable to projects

Returns a list of users who can be assigned issues in one or more projects. The list may be restricted to users whose attributes match a string.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that can be assigned issues in the projects. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who can be assigned issues in the projects, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserSearchApi()
val projectKeys : kotlin.String = projectKeys_example // kotlin.String | A list of project keys (case sensitive). This parameter accepts a comma-separated list.
val query : kotlin.String = query // kotlin.String | A query string that is matched against user attributes, such as `displayName` and `emailAddress`, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a `displayName` of *John Smith* and a user with an `emailAddress` of *johnson@example.com*. Required, unless `accountId` is specified.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
val accountId : kotlin.String = accountId_example // kotlin.String | A query string that is matched exactly against user `accountId`. Required, unless `query` is specified.
val startAt : kotlin.Int = 56 // kotlin.Int | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : kotlin.Array<User> = apiInstance.comAtlassianJiraRestV2IssueUserResourceFindBulkAssignableUsersGet(projectKeys, query, username, accountId, startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserSearchApi#comAtlassianJiraRestV2IssueUserResourceFindBulkAssignableUsersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserSearchApi#comAtlassianJiraRestV2IssueUserResourceFindBulkAssignableUsersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectKeys** | **kotlin.String**| A list of project keys (case sensitive). This parameter accepts a comma-separated list. |
 **query** | **kotlin.String**| A query string that is matched against user attributes, such as &#x60;displayName&#x60; and &#x60;emailAddress&#x60;, to find relevant users. The string can match the prefix of the attribute&#39;s value. For example, *query&#x3D;john* matches a user with a &#x60;displayName&#x60; of *John Smith* and a user with an &#x60;emailAddress&#x60; of *johnson@example.com*. Required, unless &#x60;accountId&#x60; is specified. | [optional]
 **username** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]
 **accountId** | **kotlin.String**| A query string that is matched exactly against user &#x60;accountId&#x60;. Required, unless &#x60;query&#x60; is specified. | [optional]
 **startAt** | **kotlin.Int**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueUserResourceFindUsersForPickerGet"></a>
# **comAtlassianJiraRestV2IssueUserResourceFindUsersForPickerGet**
> FoundUsers comAtlassianJiraRestV2IssueUserResourceFindUsersForPickerGet(query, maxResults, showAvatar, exclude, excludeAccountIds, avatarSize, excludeConnectUsers)

Find users for picker

Returns a list of users whose attributes match the query term. The returned object includes the &#x60;html&#x60; field where the matched query term is highlighted with the HTML strong tag. A list of account IDs can be provided to exclude users from the results.  This operation takes the users in the range defined by &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the query term. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the query term, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls and calls by users without the required permission return search results for an exact name match only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserSearchApi()
val query : kotlin.String = query_example // kotlin.String | A query string that is matched against user attributes, such as `displayName`, and `emailAddress`, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a `displayName` of *John Smith* and a user with an `emailAddress` of *johnson@example.com*.
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return. The total number of matched users is returned in `total`.
val showAvatar : kotlin.Boolean = true // kotlin.Boolean | Include the URI to the user's avatar.
val exclude : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
val excludeAccountIds : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | A list of account IDs to exclude from the search results. This parameter accepts a comma-separated list. Multiple account IDs can also be provided using an ampersand-separated list. For example, `excludeAccountIds=5b10a2844c20165700ede21g,5b10a0effa615349cb016cd8&excludeAccountIds=5b10ac8d82e05b22cc7d4ef5`. Cannot be provided with `exclude`.
val avatarSize : kotlin.String = avatarSize_example // kotlin.String | 
val excludeConnectUsers : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FoundUsers = apiInstance.comAtlassianJiraRestV2IssueUserResourceFindUsersForPickerGet(query, maxResults, showAvatar, exclude, excludeAccountIds, avatarSize, excludeConnectUsers)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserSearchApi#comAtlassianJiraRestV2IssueUserResourceFindUsersForPickerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserSearchApi#comAtlassianJiraRestV2IssueUserResourceFindUsersForPickerGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| A query string that is matched against user attributes, such as &#x60;displayName&#x60;, and &#x60;emailAddress&#x60;, to find relevant users. The string can match the prefix of the attribute&#39;s value. For example, *query&#x3D;john* matches a user with a &#x60;displayName&#x60; of *John Smith* and a user with an &#x60;emailAddress&#x60; of *johnson@example.com*. |
 **maxResults** | **kotlin.Int**| The maximum number of items to return. The total number of matched users is returned in &#x60;total&#x60;. | [optional] [default to 50]
 **showAvatar** | **kotlin.Boolean**| Include the URI to the user&#39;s avatar. | [optional] [default to false]
 **exclude** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]
 **excludeAccountIds** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| A list of account IDs to exclude from the search results. This parameter accepts a comma-separated list. Multiple account IDs can also be provided using an ampersand-separated list. For example, &#x60;excludeAccountIds&#x3D;5b10a2844c20165700ede21g,5b10a0effa615349cb016cd8&amp;excludeAccountIds&#x3D;5b10ac8d82e05b22cc7d4ef5&#x60;. Cannot be provided with &#x60;exclude&#x60;. | [optional]
 **avatarSize** | **kotlin.String**|  | [optional]
 **excludeConnectUsers** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**FoundUsers**](FoundUsers.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueUserResourceFindUsersGet"></a>
# **comAtlassianJiraRestV2IssueUserResourceFindUsersGet**
> kotlin.Array&lt;User&gt; comAtlassianJiraRestV2IssueUserResourceFindUsersGet(query, username, accountId, startAt, maxResults, property)

Find users

Returns a list of users that match the search string and property.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the search string and property. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the search string and property, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls or calls by users without the required permission return empty search results.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserSearchApi()
val query : kotlin.String = query // kotlin.String | A query string that is matched against user attributes ( `displayName`, and `emailAddress`) to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a `displayName` of *John Smith* and a user with an `emailAddress` of *johnson@example.com*. Required, unless `accountId` or `property` is specified.
val username : kotlin.String = username_example // kotlin.String | 
val accountId : kotlin.String = accountId_example // kotlin.String | A query string that is matched exactly against a user `accountId`. Required, unless `query` or `property` is specified.
val startAt : kotlin.Int = 56 // kotlin.Int | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val property : kotlin.String = property_example // kotlin.String | A query string used to search properties. Property keys are specified by path, so property keys containing dot (.) or equals (=) characters cannot be used. The query string cannot be specified using a JSON object. Example: To search for the value of `nested` from `{\"something\":{\"nested\":1,\"other\":2}}` use `thepropertykey.something.nested=1`. Required, unless `accountId` or `query` is specified.
try {
    val result : kotlin.Array<User> = apiInstance.comAtlassianJiraRestV2IssueUserResourceFindUsersGet(query, username, accountId, startAt, maxResults, property)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserSearchApi#comAtlassianJiraRestV2IssueUserResourceFindUsersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserSearchApi#comAtlassianJiraRestV2IssueUserResourceFindUsersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| A query string that is matched against user attributes ( &#x60;displayName&#x60;, and &#x60;emailAddress&#x60;) to find relevant users. The string can match the prefix of the attribute&#39;s value. For example, *query&#x3D;john* matches a user with a &#x60;displayName&#x60; of *John Smith* and a user with an &#x60;emailAddress&#x60; of *johnson@example.com*. Required, unless &#x60;accountId&#x60; or &#x60;property&#x60; is specified. | [optional]
 **username** | **kotlin.String**|  | [optional]
 **accountId** | **kotlin.String**| A query string that is matched exactly against a user &#x60;accountId&#x60;. Required, unless &#x60;query&#x60; or &#x60;property&#x60; is specified. | [optional]
 **startAt** | **kotlin.Int**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]
 **property** | **kotlin.String**| A query string used to search properties. Property keys are specified by path, so property keys containing dot (.) or equals (&#x3D;) characters cannot be used. The query string cannot be specified using a JSON object. Example: To search for the value of &#x60;nested&#x60; from &#x60;{\&quot;something\&quot;:{\&quot;nested\&quot;:1,\&quot;other\&quot;:2}}&#x60; use &#x60;thepropertykey.something.nested&#x3D;1&#x60;. Required, unless &#x60;accountId&#x60; or &#x60;query&#x60; is specified. | [optional]

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueUserResourceFindUsersWithAllPermissionsGet"></a>
# **comAtlassianJiraRestV2IssueUserResourceFindUsersWithAllPermissionsGet**
> kotlin.Array&lt;User&gt; comAtlassianJiraRestV2IssueUserResourceFindUsersWithAllPermissionsGet(permissions, query, username, accountId, issueKey, projectKey, startAt, maxResults)

Find users with permissions

Returns a list of users who fulfill these criteria:   *  their user attributes match a search string.  *  they have a set of permissions for a project or issue.  If no search string is provided, a list of all users with the permissions is returned.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the search string and have permission for the project or issue. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the search string and have permission for the project or issue, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to get users for any project.  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project, to get users for that project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserSearchApi()
val permissions : kotlin.String = permissions_example // kotlin.String | A list of permissions. This parameter accepts a comma-separated list. The valid permissions are:   *  ASSIGNABLE\\_USER  *  ASSIGN\\_ISSUE  *  ATTACHMENT\\_DELETE\\_ALL  *  ATTACHMENT\\_DELETE\\_OWN  *  BROWSE  *  CLOSE\\_ISSUE  *  COMMENT\\_DELETE\\_ALL  *  COMMENT\\_DELETE\\_OWN  *  COMMENT\\_EDIT\\_ALL  *  COMMENT\\_EDIT\\_OWN  *  COMMENT\\_ISSUE  *  CREATE\\_ATTACHMENT  *  CREATE\\_ISSUE  *  DELETE\\_ISSUE  *  EDIT\\_ISSUE  *  LINK\\_ISSUE  *  MANAGE\\_WATCHER\\_LIST  *  MODIFY\\_REPORTER  *  MOVE\\_ISSUE  *  PROJECT\\_ADMIN  *  RESOLVE\\_ISSUE  *  SCHEDULE\\_ISSUE  *  SET\\_ISSUE\\_SECURITY  *  TRANSITION\\_ISSUE  *  VIEW\\_VERSION\\_CONTROL  *  VIEW\\_VOTERS\\_AND\\_WATCHERS  *  VIEW\\_WORKFLOW\\_READONLY  *  WORKLOG\\_DELETE\\_ALL  *  WORKLOG\\_DELETE\\_OWN  *  WORKLOG\\_EDIT\\_ALL  *  WORKLOG\\_EDIT\\_OWN  *  WORK\\_ISSUE
val query : kotlin.String = query // kotlin.String | A query string that is matched against user attributes, such as `displayName` and `emailAddress`, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a `displayName` of *John Smith* and a user with an `emailAddress` of *johnson@example.com*. Required, unless `accountId` is specified.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
val accountId : kotlin.String = accountId_example // kotlin.String | A query string that is matched exactly against user `accountId`. Required, unless `query` is specified.
val issueKey : kotlin.String = issueKey_example // kotlin.String | The issue key for the issue.
val projectKey : kotlin.String = projectKey_example // kotlin.String | The project key for the project (case sensitive).
val startAt : kotlin.Int = 56 // kotlin.Int | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : kotlin.Array<User> = apiInstance.comAtlassianJiraRestV2IssueUserResourceFindUsersWithAllPermissionsGet(permissions, query, username, accountId, issueKey, projectKey, startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserSearchApi#comAtlassianJiraRestV2IssueUserResourceFindUsersWithAllPermissionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserSearchApi#comAtlassianJiraRestV2IssueUserResourceFindUsersWithAllPermissionsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permissions** | **kotlin.String**| A list of permissions. This parameter accepts a comma-separated list. The valid permissions are:   *  ASSIGNABLE\\_USER  *  ASSIGN\\_ISSUE  *  ATTACHMENT\\_DELETE\\_ALL  *  ATTACHMENT\\_DELETE\\_OWN  *  BROWSE  *  CLOSE\\_ISSUE  *  COMMENT\\_DELETE\\_ALL  *  COMMENT\\_DELETE\\_OWN  *  COMMENT\\_EDIT\\_ALL  *  COMMENT\\_EDIT\\_OWN  *  COMMENT\\_ISSUE  *  CREATE\\_ATTACHMENT  *  CREATE\\_ISSUE  *  DELETE\\_ISSUE  *  EDIT\\_ISSUE  *  LINK\\_ISSUE  *  MANAGE\\_WATCHER\\_LIST  *  MODIFY\\_REPORTER  *  MOVE\\_ISSUE  *  PROJECT\\_ADMIN  *  RESOLVE\\_ISSUE  *  SCHEDULE\\_ISSUE  *  SET\\_ISSUE\\_SECURITY  *  TRANSITION\\_ISSUE  *  VIEW\\_VERSION\\_CONTROL  *  VIEW\\_VOTERS\\_AND\\_WATCHERS  *  VIEW\\_WORKFLOW\\_READONLY  *  WORKLOG\\_DELETE\\_ALL  *  WORKLOG\\_DELETE\\_OWN  *  WORKLOG\\_EDIT\\_ALL  *  WORKLOG\\_EDIT\\_OWN  *  WORK\\_ISSUE |
 **query** | **kotlin.String**| A query string that is matched against user attributes, such as &#x60;displayName&#x60; and &#x60;emailAddress&#x60;, to find relevant users. The string can match the prefix of the attribute&#39;s value. For example, *query&#x3D;john* matches a user with a &#x60;displayName&#x60; of *John Smith* and a user with an &#x60;emailAddress&#x60; of *johnson@example.com*. Required, unless &#x60;accountId&#x60; is specified. | [optional]
 **username** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]
 **accountId** | **kotlin.String**| A query string that is matched exactly against user &#x60;accountId&#x60;. Required, unless &#x60;query&#x60; is specified. | [optional]
 **issueKey** | **kotlin.String**| The issue key for the issue. | [optional]
 **projectKey** | **kotlin.String**| The project key for the project (case sensitive). | [optional]
 **startAt** | **kotlin.Int**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueUserResourceFindUsersWithBrowsePermissionGet"></a>
# **comAtlassianJiraRestV2IssueUserResourceFindUsersWithBrowsePermissionGet**
> kotlin.Array&lt;User&gt; comAtlassianJiraRestV2IssueUserResourceFindUsersWithBrowsePermissionGet(query, username, accountId, issueKey, projectKey, startAt, maxResults)

Find users with browse permission

Returns a list of users who fulfill these criteria:   *  their user attributes match a search string.  *  they have permission to browse issues.  Use this resource to find users who can browse:   *  an issue, by providing the &#x60;issueKey&#x60;.  *  any issue in a project, by providing the &#x60;projectKey&#x60;.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the search string and have permission to browse issues. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the search string and have permission to browse issues, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls and calls by users without the required permission return empty search results.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserSearchApi()
val query : kotlin.String = query // kotlin.String | A query string that is matched against user attributes, such as `displayName` and `emailAddress`, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a `displayName` of *John Smith* and a user with an `emailAddress` of *johnson@example.com*. Required, unless `accountId` is specified.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
val accountId : kotlin.String = accountId_example // kotlin.String | A query string that is matched exactly against user `accountId`. Required, unless `query` is specified.
val issueKey : kotlin.String = issueKey_example // kotlin.String | The issue key for the issue. Required, unless `projectKey` is specified.
val projectKey : kotlin.String = projectKey_example // kotlin.String | The project key for the project (case sensitive). Required, unless `issueKey` is specified.
val startAt : kotlin.Int = 56 // kotlin.Int | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : kotlin.Array<User> = apiInstance.comAtlassianJiraRestV2IssueUserResourceFindUsersWithBrowsePermissionGet(query, username, accountId, issueKey, projectKey, startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserSearchApi#comAtlassianJiraRestV2IssueUserResourceFindUsersWithBrowsePermissionGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserSearchApi#comAtlassianJiraRestV2IssueUserResourceFindUsersWithBrowsePermissionGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| A query string that is matched against user attributes, such as &#x60;displayName&#x60; and &#x60;emailAddress&#x60;, to find relevant users. The string can match the prefix of the attribute&#39;s value. For example, *query&#x3D;john* matches a user with a &#x60;displayName&#x60; of *John Smith* and a user with an &#x60;emailAddress&#x60; of *johnson@example.com*. Required, unless &#x60;accountId&#x60; is specified. | [optional]
 **username** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]
 **accountId** | **kotlin.String**| A query string that is matched exactly against user &#x60;accountId&#x60;. Required, unless &#x60;query&#x60; is specified. | [optional]
 **issueKey** | **kotlin.String**| The issue key for the issue. Required, unless &#x60;projectKey&#x60; is specified. | [optional]
 **projectKey** | **kotlin.String**| The project key for the project (case sensitive). Required, unless &#x60;issueKey&#x60; is specified. | [optional]
 **startAt** | **kotlin.Int**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**kotlin.Array&lt;User&gt;**](User.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2SearchUserSearchResourceFindUserKeysByQueryGet"></a>
# **comAtlassianJiraRestV2SearchUserSearchResourceFindUserKeysByQueryGet**
> PageBeanUserKey comAtlassianJiraRestV2SearchUserSearchResourceFindUserKeysByQueryGet(query, startAt, maxResults)

Find user keys by query

Finds users with a structured query and returns a list of user keys.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the structured query. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the structured query, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).  The query statements are:   *  &#x60;is assignee of PROJ&#x60; Returns the users that are assignees of at least one issue in project *PROJ*.  *  &#x60;is assignee of (PROJ-1, PROJ-2)&#x60; Returns users that are assignees on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is reporter of (PROJ-1, PROJ-2)&#x60; Returns users that are reporters on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is watcher of (PROJ-1, PROJ-2)&#x60; Returns users that are watchers on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is voter of (PROJ-1, PROJ-2)&#x60; Returns users that are voters on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is commenter of (PROJ-1, PROJ-2)&#x60; Returns users that have posted a comment on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is transitioner of (PROJ-1, PROJ-2)&#x60; Returns users that have performed a transition on issues *PROJ-1* or *PROJ-2*.  *  &#x60;[propertyKey].entity.property.path is \&quot;property value\&quot;&#x60; Returns users with the entity property value.  The list of issues can be extended as needed, as in *(PROJ-1, PROJ-2, ... PROJ-n)*. Statements can be combined using the &#x60;AND&#x60; and &#x60;OR&#x60; operators to form more complex queries. For example:  &#x60;is assignee of PROJ AND [propertyKey].entity.property.path is \&quot;property value\&quot;&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserSearchApi()
val query : kotlin.String = query_example // kotlin.String | The search query.
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanUserKey = apiInstance.comAtlassianJiraRestV2SearchUserSearchResourceFindUserKeysByQueryGet(query, startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserSearchApi#comAtlassianJiraRestV2SearchUserSearchResourceFindUserKeysByQueryGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserSearchApi#comAtlassianJiraRestV2SearchUserSearchResourceFindUserKeysByQueryGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| The search query. |
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 100]

### Return type

[**PageBeanUserKey**](PageBeanUserKey.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2SearchUserSearchResourceFindUsersByQueryGet"></a>
# **comAtlassianJiraRestV2SearchUserSearchResourceFindUsersByQueryGet**
> PageBeanUser comAtlassianJiraRestV2SearchUserSearchResourceFindUsersByQueryGet(query, startAt, maxResults)

Find users by query

Finds users with a structured query and returns user details.  This operation takes the users in the range defined by &#x60;startAt&#x60; and &#x60;maxResults&#x60;, up to the thousandth user, and then returns only the users from that range that match the structured query. This means the operation usually returns fewer users than specified in &#x60;maxResults&#x60;. To get all the users who match the structured query, use [Get all users](#api-rest-api-3-users-search-get) and filter the records in your code.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).  The query statements are:   *  &#x60;is assignee of PROJ&#x60; Returns the users that are assignees of at least one issue in project *PROJ*.  *  &#x60;is assignee of (PROJ-1, PROJ-2)&#x60; Returns users that are assignees on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is reporter of (PROJ-1, PROJ-2)&#x60; Returns users that are reporters on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is watcher of (PROJ-1, PROJ-2)&#x60; Returns users that are watchers on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is voter of (PROJ-1, PROJ-2)&#x60; Returns users that are voters on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is commenter of (PROJ-1, PROJ-2)&#x60; Returns users that have posted a comment on the issues *PROJ-1* or *PROJ-2*.  *  &#x60;is transitioner of (PROJ-1, PROJ-2)&#x60; Returns users that have performed a transition on issues *PROJ-1* or *PROJ-2*.  *  &#x60;[propertyKey].entity.property.path is \&quot;property value\&quot;&#x60; Returns users with the entity property value.  The list of issues can be extended as needed, as in *(PROJ-1, PROJ-2, ... PROJ-n)*. Statements can be combined using the &#x60;AND&#x60; and &#x60;OR&#x60; operators to form more complex queries. For example:  &#x60;is assignee of PROJ AND [propertyKey].entity.property.path is \&quot;property value\&quot;&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserSearchApi()
val query : kotlin.String = query_example // kotlin.String | The search query.
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanUser = apiInstance.comAtlassianJiraRestV2SearchUserSearchResourceFindUsersByQueryGet(query, startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserSearchApi#comAtlassianJiraRestV2SearchUserSearchResourceFindUsersByQueryGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserSearchApi#comAtlassianJiraRestV2SearchUserSearchResourceFindUsersByQueryGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| The search query. |
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 100]

### Return type

[**PageBeanUser**](PageBeanUser.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

