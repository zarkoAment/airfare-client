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
import hr.ament.swagairfare.client.model.Dictionaries;
import hr.ament.swagairfare.client.model.FlightOffer;
import hr.ament.swagairfare.client.model.Issue;
import hr.ament.swagairfare.client.model.Meta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * FlightOffers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-18T23:02:34.311+02:00")
public class FlightOffers {
  @JsonProperty("data")
  private List<FlightOffer> data = null;

  @JsonProperty("dictionaries")
  private Dictionaries dictionaries = null;

  @JsonProperty("meta")
  private Meta meta = null;

  @JsonProperty("warnings")
  private List<Issue> warnings = null;

  public FlightOffers data(List<FlightOffer> data) {
    this.data = data;
    return this;
  }

  public FlightOffers addDataItem(FlightOffer dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<FlightOffer>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<FlightOffer> getData() {
    return data;
  }

  public void setData(List<FlightOffer> data) {
    this.data = data;
  }

  public FlightOffers dictionaries(Dictionaries dictionaries) {
    this.dictionaries = dictionaries;
    return this;
  }

   /**
   * Get dictionaries
   * @return dictionaries
  **/
  @ApiModelProperty(value = "")
  public Dictionaries getDictionaries() {
    return dictionaries;
  }

  public void setDictionaries(Dictionaries dictionaries) {
    this.dictionaries = dictionaries;
  }

  public FlightOffers meta(Meta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  public FlightOffers warnings(List<Issue> warnings) {
    this.warnings = warnings;
    return this;
  }

  public FlightOffers addWarningsItem(Issue warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<Issue>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(example = "[{\"status\":\"200\",\"code\":\"12345\",\"title\":\"WARNING\"}]", value = "")
  public List<Issue> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<Issue> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightOffers flightOffers = (FlightOffers) o;
    return Objects.equals(this.data, flightOffers.data) &&
        Objects.equals(this.dictionaries, flightOffers.dictionaries) &&
        Objects.equals(this.meta, flightOffers.meta) &&
        Objects.equals(this.warnings, flightOffers.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, dictionaries, meta, warnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightOffers {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dictionaries: ").append(toIndentedString(dictionaries)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

