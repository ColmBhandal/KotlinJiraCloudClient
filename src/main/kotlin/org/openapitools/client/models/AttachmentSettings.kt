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
 * Details of the instance's attachment settings.
 * @param enabled Whether the ability to add attachments is enabled.
 * @param uploadLimit The maximum size of attachments permitted, in bytes.
 */

data class AttachmentSettings (
    /* Whether the ability to add attachments is enabled. */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,
    /* The maximum size of attachments permitted, in bytes. */
    @Json(name = "uploadLimit")
    val uploadLimit: kotlin.Long? = null
) 


