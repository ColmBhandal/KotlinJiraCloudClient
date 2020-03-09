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

import org.openapitools.client.models.SharePermission

import com.squareup.moshi.Json
/**
 * Details of a dashboard.
 * @param description 
 * @param name The name of the dashboard.
 * @param sharePermissions The details of any share permissions for the dashboard.
 */

data class DashboardRequest (
    @Json(name = "description")
    val description: kotlin.String? = null,
    /* The name of the dashboard. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* The details of any share permissions for the dashboard. */
    @Json(name = "sharePermissions")
    val sharePermissions: kotlin.Array<SharePermission>? = null
) 



