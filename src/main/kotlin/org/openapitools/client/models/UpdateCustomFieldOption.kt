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

import org.openapitools.client.models.RenamedOption

import com.squareup.moshi.Json
/**
 * Details of the options to update for a custom field.
 * @param options Details of the options to update.
 */

data class UpdateCustomFieldOption (
    /* Details of the options to update. */
    @Json(name = "options")
    val options: kotlin.Array<RenamedOption>? = null
) 



