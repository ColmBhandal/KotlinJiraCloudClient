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
 * Details of a custom option for a field.
 * @param self The URL of these custom field option details.
 * @param value The value of the custom field option.
 */

data class CustomFieldOption (
    /* The URL of these custom field option details. */
    @Json(name = "self")
    val self: java.net.URI? = null,
    /* The value of the custom field option. */
    @Json(name = "value")
    val value: kotlin.String? = null
) 



