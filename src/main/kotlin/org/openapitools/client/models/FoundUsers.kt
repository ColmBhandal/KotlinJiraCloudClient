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

import org.openapitools.client.models.UserPickerUser

import com.squareup.moshi.Json
/**
 * The list of users found in a search, including header text (Showing X of Y matching users) and total of matched users.
 * @param users 
 * @param total The total number of users found in the search.
 * @param header Header text indicating the number of users in the response and the total number of users found in the search.
 */

data class FoundUsers (
    @Json(name = "users")
    val users: kotlin.Array<UserPickerUser>? = null,
    /* The total number of users found in the search. */
    @Json(name = "total")
    val total: kotlin.Int? = null,
    /* Header text indicating the number of users in the response and the total number of users found in the search. */
    @Json(name = "header")
    val header: kotlin.String? = null
) 



