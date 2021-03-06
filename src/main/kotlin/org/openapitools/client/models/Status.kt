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

import org.openapitools.client.models.Icon

import com.squareup.moshi.Json
/**
 * The status of the item.
 * @param resolved Whether the item is resolved. If set to \"true\", the link to the issue is displayed in a strikethrough font, otherwise the link displays in normal font.
 * @param icon Details of the icon representing the status. If not provided, no status icon displays in Jira.
 */

data class Status (
    /* Whether the item is resolved. If set to \"true\", the link to the issue is displayed in a strikethrough font, otherwise the link displays in normal font. */
    @Json(name = "resolved")
    val resolved: kotlin.Boolean? = null,
    /* Details of the icon representing the status. If not provided, no status icon displays in Jira. */
    @Json(name = "icon")
    val icon: Icon? = null
) 



