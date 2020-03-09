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

import org.openapitools.client.models.ParsedJqlQuery

import com.squareup.moshi.Json
/**
 * A list of parsed JQL queries.
 * @param queries A list of parsed JQL queries.
 */

data class ParsedJqlQueries (
    /* A list of parsed JQL queries. */
    @Json(name = "queries")
    val queries: kotlin.Array<ParsedJqlQuery>
) 


