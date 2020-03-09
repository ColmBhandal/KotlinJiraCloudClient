# UsersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueUserResourceCreateUserPost**](UsersApi.md#comAtlassianJiraRestV2IssueUserResourceCreateUserPost) | **POST** /rest/api/3/user | Create user
[**comAtlassianJiraRestV2IssueUserResourceGetUserDefaultColumnsGet**](UsersApi.md#comAtlassianJiraRestV2IssueUserResourceGetUserDefaultColumnsGet) | **GET** /rest/api/3/user/columns | Get user default columns
[**comAtlassianJiraRestV2IssueUserResourceGetUserGet**](UsersApi.md#comAtlassianJiraRestV2IssueUserResourceGetUserGet) | **GET** /rest/api/3/user | Get user
[**comAtlassianJiraRestV2IssueUserResourceGetUserGroupsGet**](UsersApi.md#comAtlassianJiraRestV2IssueUserResourceGetUserGroupsGet) | **GET** /rest/api/3/user/groups | Get user groups
[**comAtlassianJiraRestV2IssueUserResourceRemoveUserDelete**](UsersApi.md#comAtlassianJiraRestV2IssueUserResourceRemoveUserDelete) | **DELETE** /rest/api/3/user | Delete user
[**comAtlassianJiraRestV2IssueUserResourceResetUserColumnsDelete**](UsersApi.md#comAtlassianJiraRestV2IssueUserResourceResetUserColumnsDelete) | **DELETE** /rest/api/3/user/columns | Reset user default columns
[**comAtlassianJiraRestV2IssueUserResourceSetUserColumnsPut**](UsersApi.md#comAtlassianJiraRestV2IssueUserResourceSetUserColumnsPut) | **PUT** /rest/api/3/user/columns | Set user default columns
[**comAtlassianJiraRestV2IssueUsersResourceGetAllUsersDefaultGet**](UsersApi.md#comAtlassianJiraRestV2IssueUsersResourceGetAllUsersDefaultGet) | **GET** /rest/api/3/users | Get all users default
[**comAtlassianJiraRestV2IssueUsersResourceGetAllUsersGet**](UsersApi.md#comAtlassianJiraRestV2IssueUsersResourceGetAllUsersGet) | **GET** /rest/api/3/users/search | Get all users
[**comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailBulkGet**](UsersApi.md#comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailBulkGet) | **GET** /rest/api/3/user/email/bulk | Get user email bulk
[**comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailGet**](UsersApi.md#comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailGet) | **GET** /rest/api/3/user/email | Get user email
[**comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersGet**](UsersApi.md#comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersGet) | **GET** /rest/api/3/user/bulk | Bulk get users
[**comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersMigrationGet**](UsersApi.md#comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersMigrationGet) | **GET** /rest/api/3/user/bulk/migration | Get account IDs for users


<a name="comAtlassianJiraRestV2IssueUserResourceCreateUserPost"></a>
# **comAtlassianJiraRestV2IssueUserResourceCreateUserPost**
> User comAtlassianJiraRestV2IssueUserResourceCreateUserPost(requestBody)

Create user

Creates a user. This resource is retained for legacy compatibility. As soon as a more suitable alternative is available this resource will be deprecated.  The option is provided to set or generate a password for the user. When using the option to generate a password, by omitting &#x60;password&#x60; from the request, include &#x60;\&quot;notification\&quot;: \&quot;true\&quot;&#x60; to ensure the user is sent an email advising them that their account is created. This email includes a link for the user to set their password. If the notification isn&#39;t sent for a generated password, the user will need to be sent a reset password request from Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val requestBody : kotlin.collections.Map<kotlin.String, kotlin.Any> = {"password":"abracadabra","emailAddress":"mia@atlassian.com","displayName":"Mia Krystof","name":""} // kotlin.collections.Map<kotlin.String, kotlin.Any> | 
try {
    val result : User = apiInstance.comAtlassianJiraRestV2IssueUserResourceCreateUserPost(requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#comAtlassianJiraRestV2IssueUserResourceCreateUserPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#comAtlassianJiraRestV2IssueUserResourceCreateUserPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md)|  |

### Return type

[**User**](User.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueUserResourceGetUserDefaultColumnsGet"></a>
# **comAtlassianJiraRestV2IssueUserResourceGetUserDefaultColumnsGet**
> kotlin.Array&lt;ColumnItem&gt; comAtlassianJiraRestV2IssueUserResourceGetUserDefaultColumnsGet(accountId, username)

Get user default columns

Returns the default [issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user. If &#x60;accountId&#x60; is not passed in the request, the calling user&#39;s details are returned.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLgl), to get the column details for any user.  *  Permission to access Jira, to get the calling user&#39;s column details.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val accountId : kotlin.String = 5b10ac8d82e05b22cc7d4ef5 // kotlin.String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
try {
    val result : kotlin.Array<ColumnItem> = apiInstance.comAtlassianJiraRestV2IssueUserResourceGetUserDefaultColumnsGet(accountId, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#comAtlassianJiraRestV2IssueUserResourceGetUserDefaultColumnsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#comAtlassianJiraRestV2IssueUserResourceGetUserDefaultColumnsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. | [optional]
 **username** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]

### Return type

[**kotlin.Array&lt;ColumnItem&gt;**](ColumnItem.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueUserResourceGetUserGet"></a>
# **comAtlassianJiraRestV2IssueUserResourceGetUserGet**
> User comAtlassianJiraRestV2IssueUserResourceGetUserGet(accountId, username, key, expand)

Get user

Returns a user.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val accountId : kotlin.String = 5b10ac8d82e05b22cc7d4ef5 // kotlin.String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide) for details.
val key : kotlin.String = key_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide) for details.
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about users in the response. This parameter accepts a comma-separated list. Expand options include:   *  `groups` includes all groups and nested groups to which the user belongs.  *  `applicationRoles` includes details of all the applications to which the user has access.
try {
    val result : User = apiInstance.comAtlassianJiraRestV2IssueUserResourceGetUserGet(accountId, username, key, expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#comAtlassianJiraRestV2IssueUserResourceGetUserGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#comAtlassianJiraRestV2IssueUserResourceGetUserGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required. | [optional]
 **username** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide) for details. | [optional]
 **key** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide) for details. | [optional]
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about users in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;groups&#x60; includes all groups and nested groups to which the user belongs.  *  &#x60;applicationRoles&#x60; includes details of all the applications to which the user has access. | [optional]

### Return type

[**User**](User.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueUserResourceGetUserGroupsGet"></a>
# **comAtlassianJiraRestV2IssueUserResourceGetUserGroupsGet**
> kotlin.Array&lt;GroupName&gt; comAtlassianJiraRestV2IssueUserResourceGetUserGroupsGet(accountId, username, key)

Get user groups

Returns the groups to which a user belongs.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val accountId : kotlin.String = 5b10ac8d82e05b22cc7d4ef5 // kotlin.String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
val key : kotlin.String = key_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
try {
    val result : kotlin.Array<GroupName> = apiInstance.comAtlassianJiraRestV2IssueUserResourceGetUserGroupsGet(accountId, username, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#comAtlassianJiraRestV2IssueUserResourceGetUserGroupsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#comAtlassianJiraRestV2IssueUserResourceGetUserGroupsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. |
 **username** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]
 **key** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]

### Return type

[**kotlin.Array&lt;GroupName&gt;**](GroupName.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueUserResourceRemoveUserDelete"></a>
# **comAtlassianJiraRestV2IssueUserResourceRemoveUserDelete**
> comAtlassianJiraRestV2IssueUserResourceRemoveUserDelete(accountId, username, key)

Delete user

Deletes a user.  **[Permissions](#permissions) required:** Site administration (that is, membership of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val accountId : kotlin.String = 5b10ac8d82e05b22cc7d4ef5 // kotlin.String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
val key : kotlin.String = key_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
try {
    apiInstance.comAtlassianJiraRestV2IssueUserResourceRemoveUserDelete(accountId, username, key)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#comAtlassianJiraRestV2IssueUserResourceRemoveUserDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#comAtlassianJiraRestV2IssueUserResourceRemoveUserDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. |
 **username** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]
 **key** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2IssueUserResourceResetUserColumnsDelete"></a>
# **comAtlassianJiraRestV2IssueUserResourceResetUserColumnsDelete**
> comAtlassianJiraRestV2IssueUserResourceResetUserColumnsDelete(accountId, username)

Reset user default columns

Resets the default [ issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user to the system default. If &#x60;accountId&#x60; is not passed, the calling user&#39;s default columns are reset.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set the columns on any user.  *  Permission to access Jira, to set the calling user&#39;s columns.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val accountId : kotlin.String = 5b10ac8d82e05b22cc7d4ef5 // kotlin.String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
try {
    apiInstance.comAtlassianJiraRestV2IssueUserResourceResetUserColumnsDelete(accountId, username)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#comAtlassianJiraRestV2IssueUserResourceResetUserColumnsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#comAtlassianJiraRestV2IssueUserResourceResetUserColumnsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. | [optional]
 **username** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2IssueUserResourceSetUserColumnsPut"></a>
# **comAtlassianJiraRestV2IssueUserResourceSetUserColumnsPut**
> kotlin.Any comAtlassianJiraRestV2IssueUserResourceSetUserColumnsPut(accountId, requestBody)

Set user default columns

Sets the default [ issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user. If an account ID is not passed, the calling user&#39;s default columns are set. If no column details are sent, then all default columns are removed.  The parameters for this resource are expressed as HTML form data. For example, in curl:  &#x60;curl -X PUT -d columns&#x3D;summary -d columns&#x3D;description https://your-domain.atlassian.net/rest/api/3/user/columns?accountId&#x3D;5b10ac8d82e05b22cc7d4ef5&#39;&#x60;  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set the columns on any user.  *  Permission to access Jira, to set the calling user&#39;s columns.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val accountId : kotlin.String = 5b10ac8d82e05b22cc7d4ef5 // kotlin.String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
val requestBody : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | The ID of a column to set. To set multiple columns, send multiple `columns` parameters.
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2IssueUserResourceSetUserColumnsPut(accountId, requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#comAtlassianJiraRestV2IssueUserResourceSetUserColumnsPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#comAtlassianJiraRestV2IssueUserResourceSetUserColumnsPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. | [optional]
 **requestBody** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| The ID of a column to set. To set multiple columns, send multiple &#x60;columns&#x60; parameters. | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data, 
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2IssueUsersResourceGetAllUsersDefaultGet"></a>
# **comAtlassianJiraRestV2IssueUsersResourceGetAllUsersDefaultGet**
> kotlin.Array&lt;User&gt; comAtlassianJiraRestV2IssueUsersResourceGetAllUsersDefaultGet(startAt, maxResults)

Get all users default

Returns a list of all (active and inactive) users.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val startAt : kotlin.Int = 56 // kotlin.Int | The index of the first item to return.
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return.
try {
    val result : kotlin.Array<User> = apiInstance.comAtlassianJiraRestV2IssueUsersResourceGetAllUsersDefaultGet(startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#comAtlassianJiraRestV2IssueUsersResourceGetAllUsersDefaultGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#comAtlassianJiraRestV2IssueUsersResourceGetAllUsersDefaultGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Int**| The index of the first item to return. | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return. | [optional] [default to 50]

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

<a name="comAtlassianJiraRestV2IssueUsersResourceGetAllUsersGet"></a>
# **comAtlassianJiraRestV2IssueUsersResourceGetAllUsersGet**
> kotlin.Array&lt;User&gt; comAtlassianJiraRestV2IssueUsersResourceGetAllUsersGet(startAt, maxResults)

Get all users

Returns a list of all (active and inactive) users.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val startAt : kotlin.Int = 56 // kotlin.Int | The index of the first item to return.
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return.
try {
    val result : kotlin.Array<User> = apiInstance.comAtlassianJiraRestV2IssueUsersResourceGetAllUsersGet(startAt, maxResults)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#comAtlassianJiraRestV2IssueUsersResourceGetAllUsersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#comAtlassianJiraRestV2IssueUsersResourceGetAllUsersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Int**| The index of the first item to return. | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return. | [optional] [default to 50]

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

<a name="comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailBulkGet"></a>
# **comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailBulkGet**
> UnrestrictedUserEmail comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailBulkGet(accountId)

Get user email bulk

Returns a user&#39;s email address. This API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val accountId : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | The account IDs of the users for which emails are required. An `accountId` is an identifier that uniquely identifies the user across all Atlassian products. For example, `5b10ac8d82e05b22cc7d4ef5`. Note, this should be treated as an opaque identifier (that is, do not assume any structure in the value).
try {
    val result : UnrestrictedUserEmail = apiInstance.comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailBulkGet(accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailBulkGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailBulkGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| The account IDs of the users for which emails are required. An &#x60;accountId&#x60; is an identifier that uniquely identifies the user across all Atlassian products. For example, &#x60;5b10ac8d82e05b22cc7d4ef5&#x60;. Note, this should be treated as an opaque identifier (that is, do not assume any structure in the value). |

### Return type

[**UnrestrictedUserEmail**](UnrestrictedUserEmail.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailGet"></a>
# **comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailGet**
> UnrestrictedUserEmail comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailGet(accountId)

Get user email

Returns a user&#39;s email address. This API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val accountId : kotlin.String = accountId_example // kotlin.String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, `5b10ac8d82e05b22cc7d4ef5`.
try {
    val result : UnrestrictedUserEmail = apiInstance.comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailGet(accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#comAtlassianJiraRestV2UserUnrestrictedUserEmailResourceGetUserEmailGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, &#x60;5b10ac8d82e05b22cc7d4ef5&#x60;. |

### Return type

[**UnrestrictedUserEmail**](UnrestrictedUserEmail.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersGet"></a>
# **comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersGet**
> PageBeanUser comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersGet(accountId, startAt, maxResults, username, key)

Bulk get users

Returns details of the users specified by one or more account IDs.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val accountId : kotlin.Array<kotlin.String> = 5b10ac8d82e05b22cc7d4ef5 // kotlin.Array<kotlin.String> | The account ID of a user. To specify multiple users, pass multiple `accountId` parameters. For example, `accountId=5b10a2844c20165700ede21g&accountId=5b10ac8d82e05b22cc7d4ef5`.
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val username : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
val key : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
try {
    val result : PageBeanUser = apiInstance.comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersGet(accountId, startAt, maxResults, username, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| The account ID of a user. To specify multiple users, pass multiple &#x60;accountId&#x60; parameters. For example, &#x60;accountId&#x3D;5b10a2844c20165700ede21g&amp;accountId&#x3D;5b10ac8d82e05b22cc7d4ef5&#x60;. |
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 10]
 **username** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]
 **key** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]

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

<a name="comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersMigrationGet"></a>
# **comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersMigrationGet**
> kotlin.Array&lt;UserMigrationBean&gt; comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersMigrationGet(startAt, maxResults, username, key)

Get account IDs for users

Returns the account IDs for the users specified in the &#x60;key&#x60; or &#x60;username&#x60; parameters. Note that multiple &#x60;key&#x60; or &#x60;username&#x60; parameters can be specified.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val startAt : kotlin.Long = 789 // kotlin.Long | The index of the first item to return in a page of results (page offset).
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of items to return per page.
val username : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Username of a user. To specify multiple users, pass multiple copies of this parameter. For example, `username=fred&username=barney`. Required if `key` isn't provided. Cannot be provided if `key` is present.
val key : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Key of a user. To specify multiple users, pass multiple copies of this parameter. For example, `key=fred&key=barney`. Required if `username` isn't provided. Cannot be provided if `username` is present.
try {
    val result : kotlin.Array<UserMigrationBean> = apiInstance.comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersMigrationGet(startAt, maxResults, username, key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersMigrationGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#comAtlassianJiraRestV2UserUserBulkResourceBulkGetUsersMigrationGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **kotlin.Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **kotlin.Int**| The maximum number of items to return per page. | [optional] [default to 10]
 **username** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Username of a user. To specify multiple users, pass multiple copies of this parameter. For example, &#x60;username&#x3D;fred&amp;username&#x3D;barney&#x60;. Required if &#x60;key&#x60; isn&#39;t provided. Cannot be provided if &#x60;key&#x60; is present. | [optional]
 **key** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Key of a user. To specify multiple users, pass multiple copies of this parameter. For example, &#x60;key&#x3D;fred&amp;key&#x3D;barney&#x60;. Required if &#x60;username&#x60; isn&#39;t provided. Cannot be provided if &#x60;username&#x60; is present. | [optional]

### Return type

[**kotlin.Array&lt;UserMigrationBean&gt;**](UserMigrationBean.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

