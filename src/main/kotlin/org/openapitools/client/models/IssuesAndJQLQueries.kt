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
 * List of issues and JQL queries.
 * @param jqls A list of JQL queries.
 * @param issueIds A list of issue IDs.
 */

data class IssuesAndJQLQueries (
    /* A list of JQL queries. */
    @Json(name = "jqls")
    val jqls: kotlin.Array<kotlin.String>,
    /* A list of issue IDs. */
    @Json(name = "issueIds")
    val issueIds: kotlin.collections.Set<kotlin.Long>
) 


