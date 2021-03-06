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

import org.openapitools.client.models.IncludedFields
import org.openapitools.client.models.IssueTransition
import org.openapitools.client.models.IssueUpdateMetadata
import org.openapitools.client.models.JsonTypeBean
import org.openapitools.client.models.Operations
import org.openapitools.client.models.PageOfChangelogs

import com.squareup.moshi.Json
/**
 * 
 * @param expand Expand options that include additional issue details in the response.
 * @param id The ID of the issue.
 * @param self The URL of the issue details.
 * @param key The key of the issue.
 * @param renderedFields The rendered value of each field present on the issue.
 * @param properties Details of the issue properties identified in the request.
 * @param names The ID and name of each field present on the issue.
 * @param schema The schema describing each field present on the issue.
 * @param transitions The transitions that can be performed on the issue.
 * @param operations The operations that can be performed on the issue.
 * @param editmeta The metadata for the fields on the issue that can be amended.
 * @param changelog Details of changelogs associated with the issue.
 * @param versionedRepresentations The versions of each field on the issue.
 * @param fieldsToInclude 
 * @param fields 
 */

data class IssueBean (
    /* Expand options that include additional issue details in the response. */
    @Json(name = "expand")
    val expand: kotlin.String? = null,
    /* The ID of the issue. */
    @Json(name = "id")
    val id: kotlin.String? = null,
    /* The URL of the issue details. */
    @Json(name = "self")
    val self: java.net.URI? = null,
    /* The key of the issue. */
    @Json(name = "key")
    val key: kotlin.String? = null,
    /* The rendered value of each field present on the issue. */
    @Json(name = "renderedFields")
    val renderedFields: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,
    /* Details of the issue properties identified in the request. */
    @Json(name = "properties")
    val properties: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,
    /* The ID and name of each field present on the issue. */
    @Json(name = "names")
    val names: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    /* The schema describing each field present on the issue. */
    @Json(name = "schema")
    val schema: kotlin.collections.Map<kotlin.String, JsonTypeBean>? = null,
    /* The transitions that can be performed on the issue. */
    @Json(name = "transitions")
    val transitions: kotlin.Array<IssueTransition>? = null,
    /* The operations that can be performed on the issue. */
    @Json(name = "operations")
    val operations: Operations? = null,
    /* The metadata for the fields on the issue that can be amended. */
    @Json(name = "editmeta")
    val editmeta: IssueUpdateMetadata? = null,
    /* Details of changelogs associated with the issue. */
    @Json(name = "changelog")
    val changelog: PageOfChangelogs? = null,
    /* The versions of each field on the issue. */
    @Json(name = "versionedRepresentations")
    val versionedRepresentations: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.Any>>? = null,
    @Json(name = "fieldsToInclude")
    val fieldsToInclude: IncludedFields? = null,
    @Json(name = "fields")
    val fields: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null
) 



