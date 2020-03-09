# MyselfApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2IssueCurrentUserResourceGetCurrentUserGet**](MyselfApi.md#comAtlassianJiraRestV2IssueCurrentUserResourceGetCurrentUserGet) | **GET** /rest/api/3/myself | Get current user
[**comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceDeleteLocaleDelete**](MyselfApi.md#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceDeleteLocaleDelete) | **DELETE** /rest/api/3/mypreferences/locale | Delete locale
[**comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetLocaleGet**](MyselfApi.md#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetLocaleGet) | **GET** /rest/api/3/mypreferences/locale | Get locale
[**comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetPreferenceGet**](MyselfApi.md#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetPreferenceGet) | **GET** /rest/api/3/mypreferences | Get preference
[**comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceRemovePreferenceDelete**](MyselfApi.md#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceRemovePreferenceDelete) | **DELETE** /rest/api/3/mypreferences | Delete preference
[**comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetLocalePut**](MyselfApi.md#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetLocalePut) | **PUT** /rest/api/3/mypreferences/locale | Set locale
[**comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetPreferencePut**](MyselfApi.md#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetPreferencePut) | **PUT** /rest/api/3/mypreferences | Set preference


<a name="comAtlassianJiraRestV2IssueCurrentUserResourceGetCurrentUserGet"></a>
# **comAtlassianJiraRestV2IssueCurrentUserResourceGetCurrentUserGet**
> User comAtlassianJiraRestV2IssueCurrentUserResourceGetCurrentUserGet(expand)

Get current user

Returns details for the current user.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MyselfApi()
val expand : kotlin.String = expand_example // kotlin.String | Use [expand](#expansion) to include additional information about user in the response. This parameter accepts a comma-separated list. Expand options include:   *  `groups` Returns all groups, including nested groups, the user belongs to.  *  `applicationRoles` Returns the application roles the user is assigned to.
try {
    val result : User = apiInstance.comAtlassianJiraRestV2IssueCurrentUserResourceGetCurrentUserGet(expand)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MyselfApi#comAtlassianJiraRestV2IssueCurrentUserResourceGetCurrentUserGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyselfApi#comAtlassianJiraRestV2IssueCurrentUserResourceGetCurrentUserGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expand** | **kotlin.String**| Use [expand](#expansion) to include additional information about user in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;groups&#x60; Returns all groups, including nested groups, the user belongs to.  *  &#x60;applicationRoles&#x60; Returns the application roles the user is assigned to. | [optional]

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

<a name="comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceDeleteLocaleDelete"></a>
# **comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceDeleteLocaleDelete**
> kotlin.Any comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceDeleteLocaleDelete()

Delete locale

Deprecated, use [ Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API instead.  Deletes the locale of the user, which restores the default setting.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MyselfApi()
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceDeleteLocaleDelete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MyselfApi#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceDeleteLocaleDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyselfApi#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceDeleteLocaleDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetLocaleGet"></a>
# **comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetLocaleGet**
> Locale comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetLocaleGet()

Get locale

Returns the locale for the user.  If the user has no language preference set (which is the default setting) or this resource is accessed anonymous, the browser locale detected by Jira is returned. Jira detects the browser locale using the *Accept-Language* header in the request. However, if this doesn&#39;t match a locale available Jira, the site default locale is returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MyselfApi()
try {
    val result : Locale = apiInstance.comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetLocaleGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MyselfApi#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetLocaleGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyselfApi#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetLocaleGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Locale**](Locale.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetPreferenceGet"></a>
# **comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetPreferenceGet**
> kotlin.String comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetPreferenceGet(key)

Get preference

Returns the value of a preference of the current user.  Note that these keys are deprecated:   *  *jira.user.locale* The locale of the user. By default this is not set and the user takes the locale of the instance.  *  *jira.user.timezone* The time zone of the user. By default this is not set and the user takes the timezone of the instance.  Use [ Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API to manage timezone and locale instead.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MyselfApi()
val key : kotlin.String = key_example // kotlin.String | The key of the preference.
try {
    val result : kotlin.String = apiInstance.comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetPreferenceGet(key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MyselfApi#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetPreferenceGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyselfApi#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceGetPreferenceGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**| The key of the preference. |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceRemovePreferenceDelete"></a>
# **comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceRemovePreferenceDelete**
> comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceRemovePreferenceDelete(key)

Delete preference

Deletes a preference of the user, which restores the default value of system defined settings.  Note that these keys are deprecated:   *  *jira.user.locale* The locale of the user. By default, not set. The user takes the instance locale.  *  *jira.user.timezone* The time zone of the user. By default, not set. The user takes the instance timezone.  Use [ Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API to manage timezone and locale instead.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MyselfApi()
val key : kotlin.String = key_example // kotlin.String | The key of the preference.
try {
    apiInstance.comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceRemovePreferenceDelete(key)
} catch (e: ClientException) {
    println("4xx response calling MyselfApi#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceRemovePreferenceDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyselfApi#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceRemovePreferenceDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**| The key of the preference. |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetLocalePut"></a>
# **comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetLocalePut**
> kotlin.Any comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetLocalePut(locale)

Set locale

Deprecated, use [ Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API instead.  Sets the locale of the user. The locale must be one supported by the instance of Jira.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MyselfApi()
val locale : Locale = {"locale":"en_US"} // Locale | The locale defined in a LocaleBean.
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetLocalePut(locale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MyselfApi#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetLocalePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyselfApi#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetLocalePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locale** | [**Locale**](Locale.md)| The locale defined in a LocaleBean. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetPreferencePut"></a>
# **comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetPreferencePut**
> kotlin.Any comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetPreferencePut(key, body)

Set preference

Creates a preference for the user or updates a preference&#39;s value by sending a plain text string. For example, &#x60;false&#x60;. An arbitrary preference can be created with the value containing up to 255 characters. In addition, the following keys define system preferences that can be set or created:   *  *user.notifications.mimetype* The mime type used in notifications sent to the user. Defaults to &#x60;html&#x60;.  *  *user.notify.own.changes* Whether the user gets notified of their own changes. Defaults to &#x60;false&#x60;.  *  *user.default.share.private* Whether new [ filters](https://confluence.atlassian.com/x/eQiiLQ) are set to private. Defaults to &#x60;true&#x60;.  *  *user.keyboard.shortcuts.disabled* Whether keyboard shortcuts are disabled. Defaults to &#x60;false&#x60;.  *  *user.autowatch.disabled* Whether the user automatically watches issues they create or add a comment to. By default, not set: the user takes the instance autowatch setting.  Note that these keys are deprecated:   *  *jira.user.locale* The locale of the user. By default, not set. The user takes the instance locale.  *  *jira.user.timezone* The time zone of the user. By default, not set. The user takes the instance timezone.  Use [ Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API to manage timezone and locale instead.  **[Permissions](#permissions) required:** Permission to access Jira.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MyselfApi()
val key : kotlin.String = key_example // kotlin.String | The key of the preference. The maximum length is 255 characters.
val body : kotlin.String = body_example // kotlin.String | The value of the preference as a plain text string. The maximum length is 255 characters.
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetPreferencePut(key, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MyselfApi#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetPreferencePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyselfApi#comAtlassianJiraRestV2PreferenceCurrentUserPreferencesResourceSetPreferencePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**| The key of the preference. The maximum length is 255 characters. |
 **body** | **kotlin.String**| The value of the preference as a plain text string. The maximum length is 255 characters. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

