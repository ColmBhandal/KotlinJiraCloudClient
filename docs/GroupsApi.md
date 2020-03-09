# GroupsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueGroupPickerResourceFindGroupsGet**](GroupsApi.md#comAtlassianJiraRestV2IssueGroupPickerResourceFindGroupsGet) | **GET** /rest/api/3/groups/picker | Find groups
[**comAtlassianJiraRestV2IssueGroupResourceAddUserToGroupPost**](GroupsApi.md#comAtlassianJiraRestV2IssueGroupResourceAddUserToGroupPost) | **POST** /rest/api/3/group/user | Add user to group
[**comAtlassianJiraRestV2IssueGroupResourceCreateGroupPost**](GroupsApi.md#comAtlassianJiraRestV2IssueGroupResourceCreateGroupPost) | **POST** /rest/api/3/group | Create group
[**comAtlassianJiraRestV2IssueGroupResourceGetGroupGet**](GroupsApi.md#comAtlassianJiraRestV2IssueGroupResourceGetGroupGet) | **GET** /rest/api/3/group | Get group
[**comAtlassianJiraRestV2IssueGroupResourceGetUsersFromGroupGet**](GroupsApi.md#comAtlassianJiraRestV2IssueGroupResourceGetUsersFromGroupGet) | **GET** /rest/api/3/group/member | Get users from group
[**comAtlassianJiraRestV2IssueGroupResourceRemoveGroupDelete**](GroupsApi.md#comAtlassianJiraRestV2IssueGroupResourceRemoveGroupDelete) | **DELETE** /rest/api/3/group | Remove group
[**comAtlassianJiraRestV2IssueGroupResourceRemoveUserFromGroupDelete**](GroupsApi.md#comAtlassianJiraRestV2IssueGroupResourceRemoveUserFromGroupDelete) | **DELETE** /rest/api/3/group/user | Remove user from group


<a name="comAtlassianJiraRestV2IssueGroupPickerResourceFindGroupsGet"></a>
# **comAtlassianJiraRestV2IssueGroupPickerResourceFindGroupsGet**
> FoundGroups comAtlassianJiraRestV2IssueGroupPickerResourceFindGroupsGet(accountId, query, exclude, maxResults, userName)

Find groups

Returns a list of groups whose names contain a query string. A list of group names can be provided to exclude groups from the results.  The primary use case for this resource is to populate a group picker suggestions list. To this end, the returned object includes the &#x60;html&#x60; field where the matched query term is highlighted in the group name with the HTML strong tag. Also, the groups list is wrapped in a response object that contains a header for use in the picker, specifically *Showing X of Y matching groups*.  The list returns with the groups sorted. If no groups match the list criteria, an empty list is returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg). Anonymous calls and calls by users without the required permission return an empty list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GroupsApi()
val accountId : kotlin.String = accountId_example // kotlin.String | This parameter is deprecated, setting it does not affect the results. To find groups containing a particular user, use [Get user groups](#api-rest-api-3-user-groups-get).
val query : kotlin.String = query // kotlin.String | The string to find in group names.
val exclude : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | A group to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, `exclude=group1&exclude=group2`.
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of groups to return. The maximum number of groups that can be returned is limited by the system property `jira.ajax.autocomplete.limit`.
val userName : kotlin.String = userName_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
try {
    val result : FoundGroups = apiInstance.comAtlassianJiraRestV2IssueGroupPickerResourceFindGroupsGet(accountId, query, exclude, maxResults, userName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#comAtlassianJiraRestV2IssueGroupPickerResourceFindGroupsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#comAtlassianJiraRestV2IssueGroupPickerResourceFindGroupsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| This parameter is deprecated, setting it does not affect the results. To find groups containing a particular user, use [Get user groups](#api-rest-api-3-user-groups-get). | [optional]
 **query** | **kotlin.String**| The string to find in group names. | [optional]
 **exclude** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| A group to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, &#x60;exclude&#x3D;group1&amp;exclude&#x3D;group2&#x60;. | [optional]
 **maxResults** | **kotlin.Int**| The maximum number of groups to return. The maximum number of groups that can be returned is limited by the system property &#x60;jira.ajax.autocomplete.limit&#x60;. | [optional]
 **userName** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]

### Return type

[**FoundGroups**](FoundGroups.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueGroupResourceAddUserToGroupPost"></a>
# **comAtlassianJiraRestV2IssueGroupResourceAddUserToGroupPost**
> Group comAtlassianJiraRestV2IssueGroupResourceAddUserToGroupPost(groupname, requestBody)

Add user to group

Adds a user to a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GroupsApi()
val groupname : kotlin.String = groupname_example // kotlin.String | The name of the group (case sensitive).
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"accountId":"5b10ac8d82e05b22cc7d4ef5"} // kotlin.collections.Map<kotlin.String, kotlin.Any> | The user to add to the group.
try {
    val result : Group = apiInstance.comAtlassianJiraRestV2IssueGroupResourceAddUserToGroupPost(groupname, requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#comAtlassianJiraRestV2IssueGroupResourceAddUserToGroupPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#comAtlassianJiraRestV2IssueGroupResourceAddUserToGroupPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupname** | **kotlin.String**| The name of the group (case sensitive). |
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)| The user to add to the group. |

### Return type

[**Group**](Group.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueGroupResourceCreateGroupPost"></a>
# **comAtlassianJiraRestV2IssueGroupResourceCreateGroupPost**
> Group comAtlassianJiraRestV2IssueGroupResourceCreateGroupPost(requestBody)

Create group

Creates a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GroupsApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"name":"power-users"} // kotlin.collections.Map<kotlin.String, kotlin.Any> | The name of the group.
try {
    val result : Group = apiInstance.comAtlassianJiraRestV2IssueGroupResourceCreateGroupPost(requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#comAtlassianJiraRestV2IssueGroupResourceCreateGroupPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#comAtlassianJiraRestV2IssueGroupResourceCreateGroupPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)| The name of the group. |

### Return type

[**Group**](Group.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueGroupResourceGetGroupGet"></a>
# **comAtlassianJiraRestV2IssueGroupResourceGetGroupGet**
> Group comAtlassianJiraRestV2IssueGroupResourceGetGroupGet(groupname, expand)

Get group

This operation is deprecated, use [&#x60;group/member&#x60;](#api-rest-api-3-group-member-get).  Returns all users in a group.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GroupsApi()
val groupname : kotlin.String = groupname_example // kotlin.String | The name of the group.
val expand : kotlin.String = expand_example // kotlin.String | List of fields to expand.
try {
    val result : Group = apiInstance.comAtlassianJiraRestV2IssueGroupResourceGetGroupGet(groupname, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#comAtlassianJiraRestV2IssueGroupResourceGetGroupGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#comAtlassianJiraRestV2IssueGroupResourceGetGroupGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupname** | **kotlin.String**| The name of the group. |
 **expand** | **kotlin.String**| List of fields to expand. | [optional]

### Return type

[**Group**](Group.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueGroupResourceGetUsersFromGroupGet"></a>
# **comAtlassianJiraRestV2IssueGroupResourceGetUsersFromGroupGet**
> PageBeanUserDetails comAtlassianJiraRestV2IssueGroupResourceGetUsersFromGroupGet(groupname, includeInactiveUsers, startAt, maxResults)

Get users from group

Returns all users in a group.  Note that users are ordered by username, however the username is not returned in the results due to privacy reasons.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GroupsApi()
val groupname : kotlin.String = groupname_example // kotlin.String | The name of the group.
val includeInactiveUsers : kotlin.Boolean = true // kotlin.Boolean | Include inactive users.
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
try {
    val result : PageBeanUserDetails = apiInstance.comAtlassianJiraRestV2IssueGroupResourceGetUsersFromGroupGet(groupname, includeInactiveUsers, startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#comAtlassianJiraRestV2IssueGroupResourceGetUsersFromGroupGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#comAtlassianJiraRestV2IssueGroupResourceGetUsersFromGroupGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupname** | **kotlin.String**| The name of the group. |
 **includeInactiveUsers** | **kotlin.Boolean**| Include inactive users. | [optional] [default to false]
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 50]

### Return type

[**PageBeanUserDetails**](PageBeanUserDetails.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueGroupResourceRemoveGroupDelete"></a>
# **comAtlassianJiraRestV2IssueGroupResourceRemoveGroupDelete**
> comAtlassianJiraRestV2IssueGroupResourceRemoveGroupDelete(groupname, swapGroup)

Remove group

Deletes a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* strategic [group](https://confluence.atlassian.com/x/24xjL)).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GroupsApi()
val groupname : kotlin.String = groupname_example // kotlin.String | The name of the group.
val swapGroup : kotlin.String = swapGroup_example // kotlin.String | The group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion.
try {
    apiInstance.comAtlassianJiraRestV2IssueGroupResourceRemoveGroupDelete(groupname, swapGroup)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#comAtlassianJiraRestV2IssueGroupResourceRemoveGroupDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#comAtlassianJiraRestV2IssueGroupResourceRemoveGroupDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupname** | **kotlin.String**| The name of the group. |
 **swapGroup** | **kotlin.String**| The group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. | [optional]

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

<a name="comAtlassianJiraRestV2IssueGroupResourceRemoveUserFromGroupDelete"></a>
# **comAtlassianJiraRestV2IssueGroupResourceRemoveUserFromGroupDelete**
> comAtlassianJiraRestV2IssueGroupResourceRemoveUserFromGroupDelete(groupname, accountId, username)

Remove user from group

Removes a user from a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GroupsApi()
val groupname : kotlin.String = groupname_example // kotlin.String | The name of the group.
val accountId : kotlin.String = 5b10ac8d82e05b22cc7d4ef5 // kotlin.String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
try {
    apiInstance.comAtlassianJiraRestV2IssueGroupResourceRemoveUserFromGroupDelete(groupname, accountId, username)
} catch (e: ClientException) {
    println("4xx response calling GroupsApi#comAtlassianJiraRestV2IssueGroupResourceRemoveUserFromGroupDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GroupsApi#comAtlassianJiraRestV2IssueGroupResourceRemoveUserFromGroupDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupname** | **kotlin.String**| The name of the group. |
 **accountId** | **kotlin.String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. |
 **username** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]

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

