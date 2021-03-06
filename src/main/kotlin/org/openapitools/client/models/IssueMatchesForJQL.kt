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
 * A list of the issues matched to a JQL query or details of errors encountered during matching.
 * @param matchedIssues A list of issue IDs.
 * @param errors A list of errors.
 */

data class IssueMatchesForJQL (
    /* A list of issue IDs. */
    @Json(name = "matchedIssues")
    val matchedIssues: kotlin.collections.Set<kotlin.Long>,
    /* A list of errors. */
    @Json(name = "errors")
    val errors: kotlin.collections.Set<kotlin.String>
) 



