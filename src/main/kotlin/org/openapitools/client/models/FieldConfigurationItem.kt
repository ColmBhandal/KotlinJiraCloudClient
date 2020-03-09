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
 * A field within a field configuration.
 * @param id The ID of the field within the field configuration.
 * @param description The description of the field within the field configuration.
 * @param isHidden Whether the field is hidden in the field configuration.
 * @param isRequired Whether the field is required in the field configuration.
 */

data class FieldConfigurationItem (
    /* The ID of the field within the field configuration. */
    @Json(name = "id")
    val id: kotlin.String,
    /* The description of the field within the field configuration. */
    @Json(name = "description")
    val description: kotlin.String? = null,
    /* Whether the field is hidden in the field configuration. */
    @Json(name = "isHidden")
    val isHidden: kotlin.Boolean? = null,
    /* Whether the field is required in the field configuration. */
    @Json(name = "isRequired")
    val isRequired: kotlin.Boolean? = null
) 



