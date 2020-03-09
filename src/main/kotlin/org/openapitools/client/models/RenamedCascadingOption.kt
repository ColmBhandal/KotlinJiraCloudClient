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
 * Details of a custom field cascading option to rename.
 * @param value The value of the cascading option.
 * @param newValue The new value of the cascading option.
 */

data class RenamedCascadingOption (
    /* The value of the cascading option. */
    @Json(name = "value")
    val value: kotlin.String,
    /* The new value of the cascading option. */
    @Json(name = "newValue")
    val newValue: kotlin.String
) 


