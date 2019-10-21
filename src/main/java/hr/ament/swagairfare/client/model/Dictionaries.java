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
import hr.ament.swagairfare.client.model.DictionaryEntry;
import hr.ament.swagairfare.client.model.LocationEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Dictionaries
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-18T23:02:34.311+02:00")
public class Dictionaries {
  @JsonProperty("carriers")
  private DictionaryEntry carriers = null;

  @JsonProperty("currencies")
  private DictionaryEntry currencies = null;

  @JsonProperty("aircraft")
  private DictionaryEntry aircraft = null;

  @JsonProperty("locations")
  private LocationEntry locations = null;

  public Dictionaries carriers(DictionaryEntry carriers) {
    this.carriers = carriers;
    return this;
  }

   /**
   * Get carriers
   * @return carriers
  **/
  @ApiModelProperty(value = "")
  public DictionaryEntry getCarriers() {
    return carriers;
  }

  public void setCarriers(DictionaryEntry carriers) {
    this.carriers = carriers;
  }

  public Dictionaries currencies(DictionaryEntry currencies) {
    this.currencies = currencies;
    return this;
  }

   /**
   * Get currencies
   * @return currencies
  **/
  @ApiModelProperty(value = "")
  public DictionaryEntry getCurrencies() {
    return currencies;
  }

  public void setCurrencies(DictionaryEntry currencies) {
    this.currencies = currencies;
  }

  public Dictionaries aircraft(DictionaryEntry aircraft) {
    this.aircraft = aircraft;
    return this;
  }

   /**
   * Get aircraft
   * @return aircraft
  **/
  @ApiModelProperty(value = "")
  public DictionaryEntry getAircraft() {
    return aircraft;
  }

  public void setAircraft(DictionaryEntry aircraft) {
    this.aircraft = aircraft;
  }

  public Dictionaries locations(LocationEntry locations) {
    this.locations = locations;
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @ApiModelProperty(value = "")
  public LocationEntry getLocations() {
    return locations;
  }

  public void setLocations(LocationEntry locations) {
    this.locations = locations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dictionaries dictionaries = (Dictionaries) o;
    return Objects.equals(this.carriers, dictionaries.carriers) &&
        Objects.equals(this.currencies, dictionaries.currencies) &&
        Objects.equals(this.aircraft, dictionaries.aircraft) &&
        Objects.equals(this.locations, dictionaries.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carriers, currencies, aircraft, locations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dictionaries {\n");
    
    sb.append("    carriers: ").append(toIndentedString(carriers)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    aircraft: ").append(toIndentedString(aircraft)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

