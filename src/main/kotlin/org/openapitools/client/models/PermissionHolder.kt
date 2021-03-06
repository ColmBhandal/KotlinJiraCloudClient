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
 * Details of a user, group, field, or project role that holds a permission. See [Holder object](#holder-object) in *Get all permission schemes* for more information.
 * @param type The type of permission holder.
 * @param parameter The identifier of permission holder.
 * @param expand Expand options that include additional permission holder details in the response.
 */

data class PermissionHolder (
    /* The type of permission holder. */
    @Json(name = "type")
    val type: kotlin.String,
    /* The identifier of permission holder. */
    @Json(name = "parameter")
    val parameter: kotlin.String? = null,
    /* Expand options that include additional permission holder details in the response. */
    @Json(name = "expand")
    val expand: kotlin.String? = null
) 



