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

import org.openapitools.client.models.IssueTypeScheme

import com.squareup.moshi.Json
/**
 * Issue type scheme with a list of the projects that use it.
 * @param projectIds The IDs of the projects using the issue type scheme.
 * @param issueTypeScheme Details of an issue type scheme.
 */

data class IssueTypeSchemeProjects (
    /* The IDs of the projects using the issue type scheme. */
    @Json(name = "projectIds")
    val projectIds: kotlin.Array<kotlin.String>,
    /* Details of an issue type scheme. */
    @Json(name = "issueTypeScheme")
    val issueTypeScheme: IssueTypeScheme? = null
) 


