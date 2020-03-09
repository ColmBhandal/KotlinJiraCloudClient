/**
* The Jira Cloud platform REST API
* Jira Cloud platform REST API documentation
*
* The version of the OpenAPI document: 1001.0.0-SNAPSHOT
* Contact: ecosystem@atlassian.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.UserBeanAvatarUrls

import com.squareup.moshi.Json
/**
 * 
 * @param key This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The key of the user.
 * @param self The URL of the user.
 * @param name This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The username of the user.
 * @param displayName The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
 * @param active Whether the user is active.
 * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
 * @param avatarUrls The avatars of the user.
 */

data class UserBean (
    /* This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The key of the user. */
    @Json(name = "key")
    val key: kotlin.String? = null,
    /* The URL of the user. */
    @Json(name = "self")
    val self: java.net.URI? = null,
    /* This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The username of the user. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* The display name of the user. Depending on the user’s privacy setting, this may return an alternative value. */
    @Json(name = "displayName")
    val displayName: kotlin.String? = null,
    /* Whether the user is active. */
    @Json(name = "active")
    val active: kotlin.Boolean? = null,
    /* The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. */
    @Json(name = "accountId")
    val accountId: kotlin.String? = null,
    /* The avatars of the user. */
    @Json(name = "avatarUrls")
    val avatarUrls: UserBeanAvatarUrls? = null
) 


