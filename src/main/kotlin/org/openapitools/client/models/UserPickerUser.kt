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


import com.squareup.moshi.Json
/**
 * A user found in a search.
 * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
 * @param name This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
 * @param key This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
 * @param html The display name, email address, and key of the user with the matched query string highlighted with the HTML bold tag.
 * @param displayName The display name of the user. Depending on the user’s privacy setting, this may be returned as null.
 * @param avatarUrl The avatar URL of the user.
 */

data class UserPickerUser (
    /* The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. */
    @Json(name = "accountId")
    val accountId: kotlin.String? = null,
    /* This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. */
    @Json(name = "key")
    val key: kotlin.String? = null,
    /* The display name, email address, and key of the user with the matched query string highlighted with the HTML bold tag. */
    @Json(name = "html")
    val html: kotlin.String? = null,
    /* The display name of the user. Depending on the user’s privacy setting, this may be returned as null. */
    @Json(name = "displayName")
    val displayName: kotlin.String? = null,
    /* The avatar URL of the user. */
    @Json(name = "avatarUrl")
    val avatarUrl: java.net.URI? = null
) 


