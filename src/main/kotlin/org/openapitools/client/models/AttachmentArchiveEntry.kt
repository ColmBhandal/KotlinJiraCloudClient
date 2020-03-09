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
 * 
 * @param entryIndex 
 * @param abbreviatedName 
 * @param mediaType 
 * @param name 
 * @param size 
 */

data class AttachmentArchiveEntry (
    @Json(name = "entryIndex")
    val entryIndex: kotlin.Long? = null,
    @Json(name = "abbreviatedName")
    val abbreviatedName: kotlin.String? = null,
    @Json(name = "mediaType")
    val mediaType: kotlin.String? = null,
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "size")
    val size: kotlin.Long? = null
) 



