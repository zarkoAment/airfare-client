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
import hr.ament.swagairfare.client.model.TravelClass;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PricingDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-18T23:02:34.311+02:00")
public class PricingDetail {
  @JsonProperty("travelClass")
  private TravelClass travelClass = null;

  @JsonProperty("fareClass")
  private String fareClass = null;

  @JsonProperty("availability")
  private Integer availability = null;

  @JsonProperty("fareBasis")
  private String fareBasis = null;

  public PricingDetail travelClass(TravelClass travelClass) {
    this.travelClass = travelClass;
    return this;
  }

   /**
   * Get travelClass
   * @return travelClass
  **/
  @ApiModelProperty(value = "")
  public TravelClass getTravelClass() {
    return travelClass;
  }

  public void setTravelClass(TravelClass travelClass) {
    this.travelClass = travelClass;
  }

  public PricingDetail fareClass(String fareClass) {
    this.fareClass = fareClass;
    return this;
  }

   /**
   * class of the fare that applied. Fare classes are subdivisions of travel classes and vary from airline to airline. For instance, Y designs usually a full fare economy class
   * @return fareClass
  **/
  @ApiModelProperty(example = "L", value = "class of the fare that applied. Fare classes are subdivisions of travel classes and vary from airline to airline. For instance, Y designs usually a full fare economy class")
  public String getFareClass() {
    return fareClass;
  }

  public void setFareClass(String fareClass) {
    this.fareClass = fareClass;
  }

  public PricingDetail availability(Integer availability) {
    this.availability = availability;
    return this;
  }

   /**
   * the number of seats still available at this time of search with this class of fare
   * @return availability
  **/
  @ApiModelProperty(example = "9", value = "the number of seats still available at this time of search with this class of fare")
  public Integer getAvailability() {
    return availability;
  }

  public void setAvailability(Integer availability) {
    this.availability = availability;
  }

  public PricingDetail fareBasis(String fareBasis) {
    this.fareBasis = fareBasis;
    return this;
  }

   /**
   * the identifier of the fare that applied. Farebasis identifiers vary from airline to airline. It is usually composed of the fare class followed by other alphanumeric codes that identify the rules that apply to the fare. For instance, WH7LNR might mean that the fare class is W, that it is valid during high-season only (H) and for a 7-day advance purchase, long-haul (L) and not refundable (NR)
   * @return fareBasis
  **/
  @ApiModelProperty(example = "WH7LNR", value = "the identifier of the fare that applied. Farebasis identifiers vary from airline to airline. It is usually composed of the fare class followed by other alphanumeric codes that identify the rules that apply to the fare. For instance, WH7LNR might mean that the fare class is W, that it is valid during high-season only (H) and for a 7-day advance purchase, long-haul (L) and not refundable (NR)")
  public String getFareBasis() {
    return fareBasis;
  }

  public void setFareBasis(String fareBasis) {
    this.fareBasis = fareBasis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingDetail pricingDetail = (PricingDetail) o;
    return Objects.equals(this.travelClass, pricingDetail.travelClass) &&
        Objects.equals(this.fareClass, pricingDetail.fareClass) &&
        Objects.equals(this.availability, pricingDetail.availability) &&
        Objects.equals(this.fareBasis, pricingDetail.fareBasis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(travelClass, fareClass, availability, fareBasis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingDetail {\n");
    
    sb.append("    travelClass: ").append(toIndentedString(travelClass)).append("\n");
    sb.append("    fareClass: ").append(toIndentedString(fareClass)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    fareBasis: ").append(toIndentedString(fareBasis)).append("\n");
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
