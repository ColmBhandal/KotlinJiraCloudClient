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
 * List of custom fields using the version.
 * @param fieldName The name of the custom field.
 * @param customFieldId The ID of the custom field.
 * @param issueCountWithVersionInCustomField Count of the issues where the custom field contains the version.
 */

data class VersionUsageInCustomField (
    /* The name of the custom field. */
    @Json(name = "fieldName")
    val fieldName: kotlin.String? = null,
    /* The ID of the custom field. */
    @Json(name = "customFieldId")
    val customFieldId: kotlin.Long? = null,
    /* Count of the issues where the custom field contains the version. */
    @Json(name = "issueCountWithVersionInCustomField")
    val issueCountWithVersionInCustomField: kotlin.Long? = null
) 



