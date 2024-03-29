/*
 * Flight Low-fare Search
 * # Introduction  The Flight Low-fare Search REST/JSON API is a traditional flight search API that enables you to find the best flight offers that match your search (one-way and round-trip) from a wide choice of airlines.  The result contains the flight details and will allow the user to select their preferred option based on either price or convenience. A wide range of search criteria can be applied to narrow the search results.  # Authorization  Before using the API you will need to get an access token. Please read our **[Authorization Guide](https://developers.amadeus.com/self-service/apis-docs/guides/authorization)** for more information on how to get your token.  # Supported Operations  Resource: flight-offers  HTTP method: GET
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package hr.ament.swagairfare.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * information about the operating flight
 */
@ApiModel(description = "information about the operating flight")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-18T23:02:34.311+02:00")
public class OperatingFlight {
  @JsonProperty("carrierCode")
  private String carrierCode = null;

  @JsonProperty("number")
  private String number = null;

  public OperatingFlight carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * providing the airline / carrier code
   * @return carrierCode
  **/
  @ApiModelProperty(example = "DL", value = "providing the airline / carrier code")
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }

  public OperatingFlight number(String number) {
    this.number = number;
    return this;
  }

   /**
   * the flight number as assigned by the carrier
   * @return number
  **/
  @ApiModelProperty(example = "212", value = "the flight number as assigned by the carrier")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperatingFlight operatingFlight = (OperatingFlight) o;
    return Objects.equals(this.carrierCode, operatingFlight.carrierCode) &&
        Objects.equals(this.number, operatingFlight.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierCode, number);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatingFlight {\n");
    
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

