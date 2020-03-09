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

import org.openapitools.client.models.FilterSubscription

import com.squareup.moshi.Json
/**
 * A paginated list of subscriptions to a filter.
 * @param size The number of items on the page.
 * @param items The list of items.
 * @param maxMinusResults The maximum number of results that could be on the page.
 * @param startMinusIndex The index of the first item returned on the page.
 * @param endMinusIndex The index of the last item returned on the page.
 */

data class FilterSubscriptionsList (
    /* The number of items on the page. */
    @Json(name = "size")
    val size: kotlin.Int? = null,
    /* The list of items. */
    @Json(name = "items")
    val items: kotlin.Array<FilterSubscription>? = null,
    /* The maximum number of results that could be on the page. */
    @Json(name = "max-results")
    val maxMinusResults: kotlin.Int? = null,
    /* The index of the first item returned on the page. */
    @Json(name = "start-index")
    val startMinusIndex: kotlin.Int? = null,
    /* The index of the last item returned on the page. */
    @Json(name = "end-index")
    val endMinusIndex: kotlin.Int? = null
) 



