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
 * @param textValue 
 * @param valueAsText 
 * @param fieldNames 
 * @param elements 
 * @param number 
 * @param `object` 
 * @param pojo 
 * @param integralNumber 
 * @param floatingPointNumber 
 * @param int 
 * @param long 
 * @param double 
 * @param bigDecimal 
 * @param bigInteger 
 * @param textual 
 * @param boolean 
 * @param binary 
 * @param valueNode 
 * @param containerNode 
 * @param missingNode 
 * @param numberValue 
 * @param numberType 
 * @param intValue 
 * @param longValue 
 * @param bigIntegerValue 
 * @param doubleValue 
 * @param decimalValue 
 * @param booleanValue 
 * @param binaryValue 
 * @param valueAsInt 
 * @param valueAsLong 
 * @param valueAsDouble 
 * @param valueAsBoolean 
 * @param array 
 * @param fields 
 * @param `null` 
 */

data class JsonNode (
    @Json(name = "textValue")
    val textValue: kotlin.String? = null,
    @Json(name = "valueAsText")
    val valueAsText: kotlin.String? = null,
    @Json(name = "fieldNames")
    val fieldNames: kotlin.Any? = null,
    @Json(name = "elements")
    val elements: kotlin.Any? = null,
    @Json(name = "number")
    val number: kotlin.Boolean? = null,
    @Json(name = "object")
    val `object`: kotlin.Boolean? = null,
    @Json(name = "pojo")
    val pojo: kotlin.Boolean? = null,
    @Json(name = "integralNumber")
    val integralNumber: kotlin.Boolean? = null,
    @Json(name = "floatingPointNumber")
    val floatingPointNumber: kotlin.Boolean? = null,
    @Json(name = "int")
    val int: kotlin.Boolean? = null,
    @Json(name = "long")
    val long: kotlin.Boolean? = null,
    @Json(name = "double")
    val double: kotlin.Boolean? = null,
    @Json(name = "bigDecimal")
    val bigDecimal: kotlin.Boolean? = null,
    @Json(name = "bigInteger")
    val bigInteger: kotlin.Boolean? = null,
    @Json(name = "textual")
    val textual: kotlin.Boolean? = null,
    @Json(name = "boolean")
    val boolean: kotlin.Boolean? = null,
    @Json(name = "binary")
    val binary: kotlin.Boolean? = null,
    @Json(name = "valueNode")
    val valueNode: kotlin.Boolean? = null,
    @Json(name = "containerNode")
    val containerNode: kotlin.Boolean? = null,
    @Json(name = "missingNode")
    val missingNode: kotlin.Boolean? = null,
    @Json(name = "numberValue")
    val numberValue: java.math.BigDecimal? = null,
    @Json(name = "numberType")
    val numberType: JsonNode.NumberType? = null,
    @Json(name = "intValue")
    val intValue: kotlin.Int? = null,
    @Json(name = "longValue")
    val longValue: kotlin.Long? = null,
    @Json(name = "bigIntegerValue")
    val bigIntegerValue: kotlin.Int? = null,
    @Json(name = "doubleValue")
    val doubleValue: kotlin.Double? = null,
    @Json(name = "decimalValue")
    val decimalValue: java.math.BigDecimal? = null,
    @Json(name = "booleanValue")
    val booleanValue: kotlin.Boolean? = null,
    @Json(name = "binaryValue")
    val binaryValue: kotlin.Array<kotlin.ByteArray>? = null,
    @Json(name = "valueAsInt")
    val valueAsInt: kotlin.Int? = null,
    @Json(name = "valueAsLong")
    val valueAsLong: kotlin.Long? = null,
    @Json(name = "valueAsDouble")
    val valueAsDouble: kotlin.Double? = null,
    @Json(name = "valueAsBoolean")
    val valueAsBoolean: kotlin.Boolean? = null,
    @Json(name = "array")
    val array: kotlin.Boolean? = null,
    @Json(name = "fields")
    val fields: kotlin.Any? = null,
    @Json(name = "null")
    val `null`: kotlin.Boolean? = null
) 


{
    /**
    * 
    * Values: iNT,lONG,bIGINTEGER,fLOAT,dOUBLE,bIGDECIMAL
    */
    
    enum class NumberType(val value: kotlin.String){
        @Json(name = "INT") iNT("INT"),
        @Json(name = "LONG") lONG("LONG"),
        @Json(name = "BIG_INTEGER") bIGINTEGER("BIG_INTEGER"),
        @Json(name = "FLOAT") fLOAT("FLOAT"),
        @Json(name = "DOUBLE") dOUBLE("DOUBLE"),
        @Json(name = "BIG_DECIMAL") bIGDECIMAL("BIG_DECIMAL");
    }
}
