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

import org.openapitools.client.models.StatusCategory

import com.squareup.moshi.Json
/**
 * A status.
 * @param self The URL of the status.
 * @param description The description of the status.
 * @param iconUrl The URL of the icon used to represent the status.
 * @param name The name of the status.
 * @param id The ID of the status.
 * @param statusCategory The category assigned to the status.
 */

data class StatusDetails (
    /* The URL of the status. */
    @Json(name = "self")
    val self: kotlin.String? = null,
    /* The description of the status. */
    @Json(name = "description")
    val description: kotlin.String? = null,
    /* The URL of the icon used to represent the status. */
    @Json(name = "iconUrl")
    val iconUrl: kotlin.String? = null,
    /* The name of the status. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* The ID of the status. */
    @Json(name = "id")
    val id: kotlin.String? = null,
    /* The category assigned to the status. */
    @Json(name = "statusCategory")
    val statusCategory: StatusCategory? = null
) 



