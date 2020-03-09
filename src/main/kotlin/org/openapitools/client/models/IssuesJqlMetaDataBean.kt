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
 * The description of the page of issues loaded by the provided JQL query.
 * @param startAt The index of the first issue.
 * @param maxResults The maximum number of issues that could be loaded in this evaluation.
 * @param count The number of issues that were loaded in this evaluation.
 * @param totalCount The total number of issues the JQL returned.
 * @param validationWarnings Any warnings related to the JQL query. Present only if the validation mode was set to `warn`.
 */

data class IssuesJqlMetaDataBean (
    /* The index of the first issue. */
    @Json(name = "startAt")
    val startAt: kotlin.Long,
    /* The maximum number of issues that could be loaded in this evaluation. */
    @Json(name = "maxResults")
    val maxResults: kotlin.Int,
    /* The number of issues that were loaded in this evaluation. */
    @Json(name = "count")
    val count: kotlin.Int,
    /* The total number of issues the JQL returned. */
    @Json(name = "totalCount")
    val totalCount: kotlin.Long,
    /* Any warnings related to the JQL query. Present only if the validation mode was set to `warn`. */
    @Json(name = "validationWarnings")
    val validationWarnings: kotlin.Array<kotlin.String>? = null
) 


