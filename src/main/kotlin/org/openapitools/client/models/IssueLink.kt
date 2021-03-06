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

import org.openapitools.client.models.IssueLinkType
import org.openapitools.client.models.LinkedIssue

import com.squareup.moshi.Json
/**
 * Details of a link between issues.
 * @param id The ID of the issue link.
 * @param self The URL of the issue link.
 * @param type The type of link between the issues.
 * @param inwardIssue The issue the link joins to.
 * @param outwardIssue The issue the link originates from.
 */

data class IssueLink (
    /* The ID of the issue link. */
    @Json(name = "id")
    val id: kotlin.String? = null,
    /* The URL of the issue link. */
    @Json(name = "self")
    val self: java.net.URI? = null,
    /* The type of link between the issues. */
    @Json(name = "type")
    val type: IssueLinkType? = null,
    /* The issue the link joins to. */
    @Json(name = "inwardIssue")
    val inwardIssue: LinkedIssue? = null,
    /* The issue the link originates from. */
    @Json(name = "outwardIssue")
    val outwardIssue: LinkedIssue? = null
) 



