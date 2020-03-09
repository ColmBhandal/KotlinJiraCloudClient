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
 * A change item.
 * @param field The name of the field changed.
 * @param fieldtype The type of the field changed.
 * @param fieldId The ID of the field changed.
 * @param from The details of the original value.
 * @param fromString The details of the original value as a string.
 * @param to The details of the new value.
 * @param toString The details of the new value as a string.
 */

data class ChangeDetails (
    /* The name of the field changed. */
    @Json(name = "field")
    val field: kotlin.String? = null,
    /* The type of the field changed. */
    @Json(name = "fieldtype")
    val fieldtype: kotlin.String? = null,
    /* The ID of the field changed. */
    @Json(name = "fieldId")
    val fieldId: kotlin.String? = null,
    /* The details of the original value. */
    @Json(name = "from")
    val from: kotlin.String? = null,
    /* The details of the original value as a string. */
    @Json(name = "fromString")
    val fromString: kotlin.String? = null,
    /* The details of the new value. */
    @Json(name = "to")
    val to: kotlin.String? = null,
    /* The details of the new value as a string. */
    @Json(name = "toString")
    val toString: kotlin.String? = null
) 



