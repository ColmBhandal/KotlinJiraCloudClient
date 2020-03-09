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

import org.openapitools.client.models.ChangeDetails
import org.openapitools.client.models.HistoryMetadata
import org.openapitools.client.models.UserDetails

import com.squareup.moshi.Json
/**
 * A changelog.
 * @param id The ID of the changelog.
 * @param author The user who made the change.
 * @param created The date on which the change took place.
 * @param items The list of items changed.
 * @param historyMetadata The history metadata associated with the changed.
 */

data class Changelog (
    /* The ID of the changelog. */
    @Json(name = "id")
    val id: kotlin.String? = null,
    /* The user who made the change. */
    @Json(name = "author")
    val author: UserDetails? = null,
    /* The date on which the change took place. */
    @Json(name = "created")
    val created: java.time.OffsetDateTime? = null,
    /* The list of items changed. */
    @Json(name = "items")
    val items: kotlin.Array<ChangeDetails>? = null,
    /* The history metadata associated with the changed. */
    @Json(name = "historyMetadata")
    val historyMetadata: HistoryMetadata? = null
) 


