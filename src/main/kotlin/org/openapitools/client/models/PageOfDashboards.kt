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

import org.openapitools.client.models.Dashboard

import com.squareup.moshi.Json
/**
 * A page containing dashboard details.
 * @param startAt The index of the first item returned on the page.
 * @param maxResults The maximum number of results that could be on the page.
 * @param total The number of results on the page.
 * @param prev The URL of the previous page of results, if any.
 * @param next The URL of the next page of results, if any.
 * @param dashboards List of dashboards.
 */

data class PageOfDashboards (
    /* The index of the first item returned on the page. */
    @Json(name = "startAt")
    val startAt: kotlin.Int? = null,
    /* The maximum number of results that could be on the page. */
    @Json(name = "maxResults")
    val maxResults: kotlin.Int? = null,
    /* The number of results on the page. */
    @Json(name = "total")
    val total: kotlin.Int? = null,
    /* The URL of the previous page of results, if any. */
    @Json(name = "prev")
    val prev: kotlin.String? = null,
    /* The URL of the next page of results, if any. */
    @Json(name = "next")
    val next: kotlin.String? = null,
    /* List of dashboards. */
    @Json(name = "dashboards")
    val dashboards: kotlin.Array<Dashboard>? = null
) 


