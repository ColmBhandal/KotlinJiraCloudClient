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

import org.openapitools.client.models.AvatarUrlsBean
import org.openapitools.client.models.SimpleListWrapperApplicationRole
import org.openapitools.client.models.SimpleListWrapperGroupName

import com.squareup.moshi.Json
/**
 * A user with details as permitted by the user's Atlassian Account privacy settings. However, be aware of these exceptions:   *  User record deleted from Atlassian: This occurs as the result of a right to be forgotten request. In this case, `displayName` provides an indication and other parameters have default values or are blank (for example, email is blank).  *  User record corrupted: This occurs as a results of events such as a server import and can only happen to deleted users. In this case, `accountId` returns *unknown* and all other parameters have fallback values.  *  User record unavailable: This usually occurs due to an internal service outage. In this case, all parameters have fallback values.
 * @param self The URL of the user.
 * @param key This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
 * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.
 * @param accountType The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk
 * @param name This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
 * @param emailAddress The email address of the user. Depending on the user’s privacy setting, this may be returned as null.
 * @param avatarUrls The avatars of the user.
 * @param displayName The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
 * @param active Whether the user is active.
 * @param timeZone The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null.
 * @param locale The locale of the user. Depending on the user’s privacy setting, this may be returned as null.
 * @param groups The groups that the user belongs to.
 * @param applicationRoles The application roles the user is assigned to.
 * @param expand Expand options that include additional user details in the response.
 */

data class User (
    /* The URL of the user. */
    @Json(name = "self")
    val self: java.net.URI? = null,
    /* This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. */
    @Json(name = "key")
    val key: kotlin.String? = null,
    /* The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests. */
    @Json(name = "accountId")
    val accountId: kotlin.String? = null,
    /* The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk */
    @Json(name = "accountType")
    val accountType: User.AccountType? = null,
    /* This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* The email address of the user. Depending on the user’s privacy setting, this may be returned as null. */
    @Json(name = "emailAddress")
    val emailAddress: kotlin.String? = null,
    /* The avatars of the user. */
    @Json(name = "avatarUrls")
    val avatarUrls: AvatarUrlsBean? = null,
    /* The display name of the user. Depending on the user’s privacy setting, this may return an alternative value. */
    @Json(name = "displayName")
    val displayName: kotlin.String? = null,
    /* Whether the user is active. */
    @Json(name = "active")
    val active: kotlin.Boolean? = null,
    /* The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null. */
    @Json(name = "timeZone")
    val timeZone: kotlin.String? = null,
    /* The locale of the user. Depending on the user’s privacy setting, this may be returned as null. */
    @Json(name = "locale")
    val locale: kotlin.String? = null,
    /* The groups that the user belongs to. */
    @Json(name = "groups")
    val groups: SimpleListWrapperGroupName? = null,
    /* The application roles the user is assigned to. */
    @Json(name = "applicationRoles")
    val applicationRoles: SimpleListWrapperApplicationRole? = null,
    /* Expand options that include additional user details in the response. */
    @Json(name = "expand")
    val expand: kotlin.String? = null
) 


{
    /**
    * The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk
    * Values: atlassian,app,customer,unknown
    */
    
    enum class AccountType(val value: kotlin.String){
        @Json(name = "atlassian") atlassian("atlassian"),
        @Json(name = "app") app("app"),
        @Json(name = "customer") customer("customer"),
        @Json(name = "unknown") unknown("unknown");
    }
}

