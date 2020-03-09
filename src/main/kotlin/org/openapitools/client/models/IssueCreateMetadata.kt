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

import org.openapitools.client.models.ProjectIssueCreateMetadata

import com.squareup.moshi.Json
/**
 * The wrapper for the issue creation metadata for a list of projects.
 * @param expand Expand options that include additional project details in the response.
 * @param projects List of projects and their issue creation metadata.
 */

data class IssueCreateMetadata (
    /* Expand options that include additional project details in the response. */
    @Json(name = "expand")
    val expand: kotlin.String? = null,
    /* List of projects and their issue creation metadata. */
    @Json(name = "projects")
    val projects: kotlin.Array<ProjectIssueCreateMetadata>? = null
) 


