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

import org.openapitools.client.models.JiraExpressionsComplexityValueBean

import com.squareup.moshi.Json
/**
 * 
 * @param steps The number of steps it took to evaluate the expression.
 * @param expensiveOperations The number of expensive operations executed while evaluating the expression. Expensive operations are those that load additional data, such as entity properties, comments, or custom fields.
 * @param beans The number of Jira REST API beans returned in the response.
 * @param primitiveValues The number of primitive values returned in the response.
 */

data class JiraExpressionsComplexityBean (
    /* The number of steps it took to evaluate the expression. */
    @Json(name = "steps")
    val steps: JiraExpressionsComplexityValueBean? = null,
    /* The number of expensive operations executed while evaluating the expression. Expensive operations are those that load additional data, such as entity properties, comments, or custom fields. */
    @Json(name = "expensiveOperations")
    val expensiveOperations: JiraExpressionsComplexityValueBean? = null,
    /* The number of Jira REST API beans returned in the response. */
    @Json(name = "beans")
    val beans: JiraExpressionsComplexityValueBean? = null,
    /* The number of primitive values returned in the response. */
    @Json(name = "primitiveValues")
    val primitiveValues: JiraExpressionsComplexityValueBean? = null
) 



