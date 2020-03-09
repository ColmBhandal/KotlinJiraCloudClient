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

import org.openapitools.client.models.User

import com.squareup.moshi.Json
/**
 * A page of items.
 * @param self The URL of the page.
 * @param nextPage If there is another page of results, the URL of the next page.
 * @param maxResults The maximum number of items that could be returned.
 * @param startAt The index of the first item returned.
 * @param total The number of items returned.
 * @param isLast Whether this is the last page.
 * @param values The list of items.
 */

data class PageBeanUser (
    /* The URL of the page. */
    @Json(name = "self")
    val self: java.net.URI? = null,
    /* If there is another page of results, the URL of the next page. */
    @Json(name = "nextPage")
    val nextPage: java.net.URI? = null,
    /* The maximum number of items that could be returned. */
    @Json(name = "maxResults")
    val maxResults: kotlin.Int? = null,
    /* The index of the first item returned. */
    @Json(name = "startAt")
    val startAt: kotlin.Long? = null,
    /* The number of items returned. */
    @Json(name = "total")
    val total: kotlin.Long? = null,
    /* Whether this is the last page. */
    @Json(name = "isLast")
    val isLast: kotlin.Boolean? = null,
    /* The list of items. */
    @Json(name = "values")
    val values: kotlin.Array<User>? = null
) 



