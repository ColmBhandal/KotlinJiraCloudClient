# UserPropertiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**comAtlassianJiraRestV2UserpropertyUserPropertyResourceDeleteUserPropertyDelete**](UserPropertiesApi.md#comAtlassianJiraRestV2UserpropertyUserPropertyResourceDeleteUserPropertyDelete) | **DELETE** /rest/api/3/user/properties/{propertyKey} | Delete user property
[**comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyGet**](UserPropertiesApi.md#comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyGet) | **GET** /rest/api/3/user/properties/{propertyKey} | Get user property
[**comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyKeysGet**](UserPropertiesApi.md#comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyKeysGet) | **GET** /rest/api/3/user/properties | Get user property keys
[**comAtlassianJiraRestV2UserpropertyUserPropertyResourceSetUserPropertyPut**](UserPropertiesApi.md#comAtlassianJiraRestV2UserpropertyUserPropertyResourceSetUserPropertyPut) | **PUT** /rest/api/3/user/properties/{propertyKey} | Set user property


<a name="comAtlassianJiraRestV2UserpropertyUserPropertyResourceDeleteUserPropertyDelete"></a>
# **comAtlassianJiraRestV2UserpropertyUserPropertyResourceDeleteUserPropertyDelete**
> comAtlassianJiraRestV2UserpropertyUserPropertyResourceDeleteUserPropertyDelete(propertyKey, accountId, userKey, username)

Delete user property

Deletes a property from a user.  Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to delete a property from any user.  *  Access to Jira, to delete a property from the calling user&#39;s record.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserPropertiesApi()
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the user's property.
val accountId : kotlin.String = 5b10ac8d82e05b22cc7d4ef5 // kotlin.String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
val userKey : kotlin.String = userKey_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
try {
    apiInstance.comAtlassianJiraRestV2UserpropertyUserPropertyResourceDeleteUserPropertyDelete(propertyKey, accountId, userKey, username)
} catch (e: ClientException) {
    println("4xx response calling UserPropertiesApi#comAtlassianJiraRestV2UserpropertyUserPropertyResourceDeleteUserPropertyDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserPropertiesApi#comAtlassianJiraRestV2UserpropertyUserPropertyResourceDeleteUserPropertyDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyKey** | **kotlin.String**| The key of the user&#39;s property. |
 **accountId** | **kotlin.String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. | [optional]
 **userKey** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]
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

<a name="comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyGet"></a>
# **comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyGet**
> EntityProperty comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyGet(propertyKey, accountId, userKey, username)

Get user property

Returns the value of a user&#39;s property. If no property key is provided [Get user property keys](#api-rest-api-3-user-properties-get) is called.  Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to get a property from any user.  *  Access to Jira, to get a property from the calling user&#39;s record.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserPropertiesApi()
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the user's property.
val accountId : kotlin.String = 5b10ac8d82e05b22cc7d4ef5 // kotlin.String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
val userKey : kotlin.String = userKey_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
try {
    val result : EntityProperty = apiInstance.comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyGet(propertyKey, accountId, userKey, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserPropertiesApi#comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserPropertiesApi#comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyKey** | **kotlin.String**| The key of the user&#39;s property. |
 **accountId** | **kotlin.String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. | [optional]
 **userKey** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]
 **username** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]

### Return type

[**EntityProperty**](EntityProperty.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyKeysGet"></a>
# **comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyKeysGet**
> PropertyKeys comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyKeysGet(accountId, userKey, username)

Get user property keys

Returns the keys of all properties for a user.  Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to access the property keys on any user.  *  Access to Jira, to access the calling user&#39;s property keys.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserPropertiesApi()
val accountId : kotlin.String = 5b10ac8d82e05b22cc7d4ef5 // kotlin.String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
val userKey : kotlin.String = userKey_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
try {
    val result : PropertyKeys = apiInstance.comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyKeysGet(accountId, userKey, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserPropertiesApi#comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyKeysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserPropertiesApi#comAtlassianJiraRestV2UserpropertyUserPropertyResourceGetUserPropertyKeysGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. | [optional]
 **userKey** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]
 **username** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]

### Return type

[**PropertyKeys**](PropertyKeys.md)

### Authorization


Configure OAuth2:
    ApiClient.accessToken = ""
Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="comAtlassianJiraRestV2UserpropertyUserPropertyResourceSetUserPropertyPut"></a>
# **comAtlassianJiraRestV2UserpropertyUserPropertyResourceSetUserPropertyPut**
> kotlin.Any comAtlassianJiraRestV2UserpropertyUserPropertyResourceSetUserPropertyPut(propertyKey, body, accountId, userKey, username)

Set user property

Sets the value of a user&#39;s property. Use this resource to store custom data against a user.  Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set a property on any user.  *  Access to Jira, to set a property on the calling user&#39;s record.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserPropertiesApi()
val propertyKey : kotlin.String = propertyKey_example // kotlin.String | The key of the user's property. The maximum length is 255 characters.
val body : kotlin.Any =  // kotlin.Any | 
val accountId : kotlin.String = 5b10ac8d82e05b22cc7d4ef5 // kotlin.String | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
val userKey : kotlin.String = userKey_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
val username : kotlin.String = username_example // kotlin.String | This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
try {
    val result : kotlin.Any = apiInstance.comAtlassianJiraRestV2UserpropertyUserPropertyResourceSetUserPropertyPut(propertyKey, body, accountId, userKey, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserPropertiesApi#comAtlassianJiraRestV2UserpropertyUserPropertyResourceSetUserPropertyPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserPropertiesApi#comAtlassianJiraRestV2UserpropertyUserPropertyResourceSetUserPropertyPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyKey** | **kotlin.String**| The key of the user&#39;s property. The maximum length is 255 characters. |
 **body** | **kotlin.Any**|  |
 **accountId** | **kotlin.String**| The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. | [optional]
 **userKey** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]
 **username** | **kotlin.String**| This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. | [optional]

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

