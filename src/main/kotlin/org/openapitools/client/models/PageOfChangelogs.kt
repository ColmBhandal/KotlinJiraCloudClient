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

import org.openapitools.client.models.Changelog

import com.squareup.moshi.Json
/**
 * A page of changelogs.
 * @param startAt The index of the first item returned on the page.
 * @param maxResults The maximum number of results that could be on the page.
 * @param total The number of results on the page.
 * @param histories The list of changelogs.
 */

data class PageOfChangelogs (
    /* The index of the first item returned on the page. */
    @Json(name = "startAt")
    val startAt: kotlin.Int? = null,
    /* The maximum number of results that could be on the page. */
    @Json(name = "maxResults")
    val maxResults: kotlin.Int? = null,
    /* The number of results on the page. */
    @Json(name = "total")
    val total: kotlin.Int? = null,
    /* The list of changelogs. */
    @Json(name = "histories")
    val histories: kotlin.Array<Changelog>? = null
) 



