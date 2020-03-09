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

import org.openapitools.client.models.FieldLastUsed
import org.openapitools.client.models.JsonTypeBean

import com.squareup.moshi.Json
/**
 * Details of a field.
 * @param id The ID of the field.
 * @param name The name of the field.
 * @param schema 
 * @param description The description of the field.
 * @param key The key of the field.
 * @param isLocked Whether the field is locked.
 * @param screensCount Number of screens where the field is used.
 * @param contextsCount Number of contexts where the field is used.
 * @param lastUsed 
 */

data class Field (
    /* The ID of the field. */
    @Json(name = "id")
    val id: kotlin.String,
    /* The name of the field. */
    @Json(name = "name")
    val name: kotlin.String,
    @Json(name = "schema")
    val schema: JsonTypeBean? = null,
    /* The description of the field. */
    @Json(name = "description")
    val description: kotlin.String? = null,
    /* The key of the field. */
    @Json(name = "key")
    val key: kotlin.String? = null,
    /* Whether the field is locked. */
    @Json(name = "isLocked")
    val isLocked: kotlin.Boolean? = null,
    /* Number of screens where the field is used. */
    @Json(name = "screensCount")
    val screensCount: kotlin.Long? = null,
    /* Number of contexts where the field is used. */
    @Json(name = "contextsCount")
    val contextsCount: kotlin.Long? = null,
    @Json(name = "lastUsed")
    val lastUsed: FieldLastUsed? = null
) 



