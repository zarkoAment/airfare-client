package hr.ament.swagairfare.client.api;

import hr.ament.swagairfare.client.invoker.ApiClient;

import hr.ament.swagairfare.client.model.Error400;
import hr.ament.swagairfare.client.model.Error500;
import hr.ament.swagairfare.client.model.FlightOffers;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-18T23:02:34.311+02:00")
@Component("hr.ament.swagairfare.client.api.FlightOffersApi")
public class FlightOffersApi {
    private ApiClient apiClient;

    public FlightOffersApi() {
        this(new ApiClient());
    }

    @Autowired
    public FlightOffersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Find the cheapest bookable flights.
     * Search for the best bookable flight offers from a very simple query where you can specify as little as the travel origin, a destination and a departure date.  ### Query example What are the best offers for flights from New-York to Madrid the 1st of August 2019? &lt;pre&gt;&lt;code&gt; GET https://test.api.amadeus.com/v1/shopping/flight-offers?origin&#x3D;NYC&amp;destination&#x3D;MAD&amp;departureDate&#x3D;2019-08-01&amp;max&#x3D;2 &lt;/code&gt;&lt;/pre&gt;  ### Response example &lt;pre&gt;&lt;code&gt; {     \&quot;meta\&quot;: {         \&quot;links\&quot;: {         \&quot;self\&quot;: \&quot;http://test.api.amadeus.com/v1/shopping/flight-offers?origin&#x3D;NYC&amp;destination&#x3D;MAD&amp;departureDate&#x3D;2019-08-01&amp;adults&#x3D;1&amp;nonStop&#x3D;false&amp;max&#x3D;2\&quot;         },         \&quot;currency\&quot;: \&quot;EUR\&quot;,         \&quot;defaults\&quot;: {             \&quot;nonStop\&quot;: false,             \&quot;adults\&quot;: 1         }     },     \&quot;data\&quot;: [         {             \&quot;type\&quot;: \&quot;flight-offer\&quot;,             \&quot;id\&quot;: \&quot;1539956390004--540268760\&quot;,             \&quot;offerItems\&quot;: [                 {                     \&quot;services\&quot;: [                         {                             \&quot;segments\&quot;: [                                 {                                     \&quot;flightSegment\&quot;: {                                         \&quot;departure\&quot;: {                                             \&quot;iataCode\&quot;: \&quot;EWR\&quot;,                                             \&quot;terminal\&quot;: \&quot;B\&quot;,                                             \&quot;at\&quot;: \&quot;2019-08-01T17:45:00-04:00\&quot;                                         },                                         \&quot;arrival\&quot;: {                                             \&quot;iataCode\&quot;: \&quot;LIS\&quot;,                                             \&quot;terminal\&quot;: \&quot;1\&quot;,                                             \&quot;at\&quot;: \&quot;2019-08-02T05:35:00+01:00\&quot;                                         },                                         \&quot;carrierCode\&quot;: \&quot;TP\&quot;,                                         \&quot;number\&quot;: \&quot;202\&quot;,                                         \&quot;aircraft\&quot;: {                                             \&quot;code\&quot;: \&quot;332\&quot;                                         },                                         \&quot;operating\&quot;: {                                             \&quot;carrierCode\&quot;: \&quot;TP\&quot;,                                             \&quot;number\&quot;: \&quot;202\&quot;                                         },                                         \&quot;duration\&quot;: \&quot;0DT6H50M\&quot;                                     },                                     \&quot;pricingDetailPerAdult\&quot;: {                                         \&quot;travelClass\&quot;: \&quot;ECONOMY\&quot;,                                         \&quot;fareClass\&quot;: \&quot;U\&quot;,                                         \&quot;availability\&quot;: 1,                                         \&quot;fareBasis\&quot;: \&quot;UUSDSI0E\&quot;                                     }                                 },                                 {                                     \&quot;flightSegment\&quot;: {                                         \&quot;departure\&quot;: {                                             \&quot;iataCode\&quot;: \&quot;LIS\&quot;,                                             \&quot;terminal\&quot;: \&quot;1\&quot;,                                             \&quot;at\&quot;: \&quot;2019-08-02T06:55:00+01:00\&quot;                                         },                                         \&quot;arrival\&quot;: {                                             \&quot;iataCode\&quot;: \&quot;MAD\&quot;,                                             \&quot;terminal\&quot;: \&quot;2\&quot;,                                             \&quot;at\&quot;: \&quot;2019-08-02T09:10:00+02:00\&quot;                                         },                                         \&quot;carrierCode\&quot;: \&quot;TP\&quot;,                                         \&quot;number\&quot;: \&quot;1026\&quot;,                                         \&quot;aircraft\&quot;: {                                             \&quot;code\&quot;: \&quot;319\&quot;                                         },                                         \&quot;operating\&quot;: {                                             \&quot;carrierCode\&quot;: \&quot;TP\&quot;,                                             \&quot;number\&quot;: \&quot;1026\&quot;                                         },                                         \&quot;duration\&quot;: \&quot;0DT1H15M\&quot;                                     },                                     \&quot;pricingDetailPerAdult\&quot;: {                                         \&quot;travelClass\&quot;: \&quot;ECONOMY\&quot;,                                         \&quot;fareClass\&quot;: \&quot;U\&quot;,                                         \&quot;availability\&quot;: 5,                                         \&quot;fareBasis\&quot;: \&quot;UUSDSI0E\&quot;                                     }                                 }                             ]                         }                     ],                     \&quot;price\&quot;: {                         \&quot;total\&quot;: \&quot;259.91\&quot;,                         \&quot;totalTaxes\&quot;: \&quot;185.91\&quot;                     },                     \&quot;pricePerAdult\&quot;: {                         \&quot;total\&quot;: \&quot;259.91\&quot;,                         \&quot;totalTaxes\&quot;: \&quot;185.91\&quot;                     }                 }             ]         },         {             \&quot;type\&quot;: \&quot;flight-offer\&quot;,             \&quot;id\&quot;: \&quot;1539956390004-765796655\&quot;,             \&quot;offerItems\&quot;: [                 {                     \&quot;services\&quot;: [                         {                         \&quot;segments\&quot;: [                             {                             \&quot;flightSegment\&quot;: {                                 \&quot;departure\&quot;: {                                 \&quot;iataCode\&quot;: \&quot;JFK\&quot;,                                 \&quot;at\&quot;: \&quot;2019-08-01T22:05:00-04:00\&quot;                                 },                                 \&quot;arrival\&quot;: {                                 \&quot;iataCode\&quot;: \&quot;MAD\&quot;,                                 \&quot;at\&quot;: \&quot;2019-08-02T11:30:00+02:00\&quot;,                                 \&quot;terminal\&quot;: \&quot;1\&quot;                                 },                                 \&quot;carrierCode\&quot;: \&quot;UX\&quot;,                                 \&quot;number\&quot;: \&quot;92\&quot;,                                 \&quot;aircraft\&quot;: {                                 \&quot;code\&quot;: \&quot;332\&quot;                                 },                                 \&quot;operating\&quot;: {                                 \&quot;carrierCode\&quot;: \&quot;UX\&quot;,                                 \&quot;number\&quot;: \&quot;92\&quot;                                 },                                 \&quot;duration\&quot;: \&quot;0DT7H25M\&quot;                             },                             \&quot;pricingDetailPerAdult\&quot;: {                                 \&quot;travelClass\&quot;: \&quot;ECONOMY\&quot;,                                 \&quot;fareClass\&quot;: \&quot;M\&quot;,                                 \&quot;availability\&quot;: 9,                                 \&quot;fareBasis\&quot;: \&quot;MYYOAE\&quot;                             }                             }                         ]                         }                     ],                     \&quot;price\&quot;: {                         \&quot;total\&quot;: \&quot;1670.89\&quot;,                         \&quot;totalTaxes\&quot;: \&quot;162.89\&quot;                     },                     \&quot;pricePerAdult\&quot;: {                         \&quot;total\&quot;: \&quot;1670.89\&quot;,                         \&quot;totalTaxes\&quot;: \&quot;162.89\&quot;                     }                 }             ]         }     ],     \&quot;dictionaries\&quot;: {         \&quot;locations\&quot;: {             \&quot;JFK\&quot;: {                 \&quot;subType\&quot;: \&quot;AIRPORT\&quot;,                 \&quot;detailedName\&quot;: \&quot;JOHN F KENNEDY INTL\&quot;             },             \&quot;EWR\&quot;: {                 \&quot;subType\&quot;: \&quot;AIRPORT\&quot;,                 \&quot;detailedName\&quot;: \&quot;NEWARK LIBERTY INTL\&quot;             },             \&quot;MAD\&quot;: {                 \&quot;subType\&quot;: \&quot;AIRPORT\&quot;,                 \&quot;detailedName\&quot;: \&quot;ADOLFO SUAREZ BARAJAS\&quot;             },             \&quot;LIS\&quot;: {                 \&quot;subType\&quot;: \&quot;AIRPORT\&quot;,                 \&quot;detailedName\&quot;: \&quot;AIRPORT\&quot;             }         },         \&quot;carriers\&quot;: {             \&quot;UX\&quot;: \&quot;AIR EUROPA\&quot;,             \&quot;TP\&quot;: \&quot;TAP PORTUGAL\&quot;         },         \&quot;currencies\&quot;: {             \&quot;EUR\&quot;: \&quot;EURO\&quot;         },         \&quot;aircraft\&quot;: {             \&quot;319\&quot;: \&quot;AIRBUS INDUSTRIE A319\&quot;,             \&quot;332\&quot;: \&quot;AIRBUS INDUSTRIE A330-200\&quot;         }     } } &lt;/code&gt;&lt;/pre&gt;
     * <p><b>200</b> - Success
     * <p><b>400</b> - code    | title                                  ------- | -------------------------------------  425     | INVALID DATE 432     | INVALID CURRENCY CODE 477     | INVALID FORMAT 1379    | VERIFY CURRENCY CODE 4926    | INVALID DATA RECEIVED 32171   | MANDATORY DATA MISSING 
     * <p><b>500</b> - Unexpected error
     * @param origin city/airport [IATA code](http://www.iata.org/publications/Pages/code-search.aspx) from which the traveler will depart, e.g. BOS for Boston (required)
     * @param destination city/airport [IATA code](http://www.iata.org/publications/Pages/code-search.aspx) to which the traveler is going, e.g. PAR for Paris (required)
     * @param departureDate the date on which the traveler will depart from the origin to go to the destination. Dates are specified in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-DD format, e.g. 2017-12-25 (required)
     * @param returnDate the date on which the traveler will depart from the destination to return to the origin. If this parameter is not specified, only one-way itineraries are found. If this parameter is specified, only round-trip itineraries are found. Dates are specified in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-DD format, e.g. 2018-02-28 (optional)
     * @param arrivalBy the date and time by which the last flight of the outbound should arrive at the destination. Datetimes are specified in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-ddThh:mm format, e.g. 2016-12-31T23:59 (optional)
     * @param returnBy the date and time by which the last flight of the inbound should arrive at the origin. Datetimes are specified in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-ddThh:mm format, e.g. 2017-12-31T12:01 (optional)
     * @param adults the number of adult travelers (age 12 or older on date of departure). If specified, this number should be greater than or equal to 0 (optional, default to 1)
     * @param children the number of child travelers (older than age 2 and younger than age 12 on date of departure) who will each have their own separate seat. If specified, this number should be greater than or equal to 0 (optional)
     * @param infants the number of infant travelers (whose age is less or equal to 2 on date of departure). Infants travel on the lap of an adult or a senior traveler, and thus the number of infants must not exceed the sum of the number of adults and seniors. If specified, this number should be greater than or equal to 0 (optional)
     * @param seniors the number of senior travelers (age 65 or older on date of departure). If specified, this number should be greater than or equal to 0 (optional)
     * @param travelClass most of the flight time should be spent in a cabin of this quality or higher. The accepted travel class is economy, premium economy, business or first class. If no travel class is specified, the search considers any travel class (optional)
     * @param includeAirlines if specified, the flight offer will include at least one segment per bound marketed by one of these airlines. Airlines are specified as [IATA airline codes](http://www.iata.org/publications/Pages/code-search.aspx) and are comma-separated, e.g. 6X,7X,8X (optional)
     * @param excludeAirlines if specified, the flight offer will exclude all the flights marketed by one of these airlines. Airlines are specified as [IATA airline codes](http://www.iata.org/publications/Pages/code-search.aspx) and are comma-separated, e.g. 6X,7X,8X (optional)
     * @param nonStop if set to true, the search will find only flights going from the origin to the destination with no stop in between (optional, default to false)
     * @param currency the preferred currency for the flight offers. Currency is specified in the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) format, e.g. EUR for Euro (optional)
     * @param maxPrice maximum price of the flight offers to find, in EUR unless some other currency is specified. By default, no limit is applied. If specified, the value should be a positive number with no decimals (optional)
     * @param max maximum number of flight offers to return.   If specified, the value should be between 1 and 250. When not specified, system uses the default value **50**.  (optional, default to 50)
     * @return FlightOffers
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FlightOffers getFlightOffers(String origin, String destination, LocalDate departureDate, LocalDate returnDate, OffsetDateTime arrivalBy, OffsetDateTime returnBy, Integer adults, Integer children, Integer infants, Integer seniors, String travelClass, String includeAirlines, String excludeAirlines, Boolean nonStop, String currency, Integer maxPrice, Integer max) throws RestClientException {
        return getFlightOffersWithHttpInfo(origin, destination, departureDate, returnDate, arrivalBy, returnBy, adults, children, infants, seniors, travelClass, includeAirlines, excludeAirlines, nonStop, currency, maxPrice, max).getBody();
    }

    /**
     * Find the cheapest bookable flights.
     * Search for the best bookable flight offers from a very simple query where you can specify as little as the travel origin, a destination and a departure date.  ### Query example What are the best offers for flights from New-York to Madrid the 1st of August 2019? &lt;pre&gt;&lt;code&gt; GET https://test.api.amadeus.com/v1/shopping/flight-offers?origin&#x3D;NYC&amp;destination&#x3D;MAD&amp;departureDate&#x3D;2019-08-01&amp;max&#x3D;2 &lt;/code&gt;&lt;/pre&gt;  ### Response example &lt;pre&gt;&lt;code&gt; {     \&quot;meta\&quot;: {         \&quot;links\&quot;: {         \&quot;self\&quot;: \&quot;http://test.api.amadeus.com/v1/shopping/flight-offers?origin&#x3D;NYC&amp;destination&#x3D;MAD&amp;departureDate&#x3D;2019-08-01&amp;adults&#x3D;1&amp;nonStop&#x3D;false&amp;max&#x3D;2\&quot;         },         \&quot;currency\&quot;: \&quot;EUR\&quot;,         \&quot;defaults\&quot;: {             \&quot;nonStop\&quot;: false,             \&quot;adults\&quot;: 1         }     },     \&quot;data\&quot;: [         {             \&quot;type\&quot;: \&quot;flight-offer\&quot;,             \&quot;id\&quot;: \&quot;1539956390004--540268760\&quot;,             \&quot;offerItems\&quot;: [                 {                     \&quot;services\&quot;: [                         {                             \&quot;segments\&quot;: [                                 {                                     \&quot;flightSegment\&quot;: {                                         \&quot;departure\&quot;: {                                             \&quot;iataCode\&quot;: \&quot;EWR\&quot;,                                             \&quot;terminal\&quot;: \&quot;B\&quot;,                                             \&quot;at\&quot;: \&quot;2019-08-01T17:45:00-04:00\&quot;                                         },                                         \&quot;arrival\&quot;: {                                             \&quot;iataCode\&quot;: \&quot;LIS\&quot;,                                             \&quot;terminal\&quot;: \&quot;1\&quot;,                                             \&quot;at\&quot;: \&quot;2019-08-02T05:35:00+01:00\&quot;                                         },                                         \&quot;carrierCode\&quot;: \&quot;TP\&quot;,                                         \&quot;number\&quot;: \&quot;202\&quot;,                                         \&quot;aircraft\&quot;: {                                             \&quot;code\&quot;: \&quot;332\&quot;                                         },                                         \&quot;operating\&quot;: {                                             \&quot;carrierCode\&quot;: \&quot;TP\&quot;,                                             \&quot;number\&quot;: \&quot;202\&quot;                                         },                                         \&quot;duration\&quot;: \&quot;0DT6H50M\&quot;                                     },                                     \&quot;pricingDetailPerAdult\&quot;: {                                         \&quot;travelClass\&quot;: \&quot;ECONOMY\&quot;,                                         \&quot;fareClass\&quot;: \&quot;U\&quot;,                                         \&quot;availability\&quot;: 1,                                         \&quot;fareBasis\&quot;: \&quot;UUSDSI0E\&quot;                                     }                                 },                                 {                                     \&quot;flightSegment\&quot;: {                                         \&quot;departure\&quot;: {                                             \&quot;iataCode\&quot;: \&quot;LIS\&quot;,                                             \&quot;terminal\&quot;: \&quot;1\&quot;,                                             \&quot;at\&quot;: \&quot;2019-08-02T06:55:00+01:00\&quot;                                         },                                         \&quot;arrival\&quot;: {                                             \&quot;iataCode\&quot;: \&quot;MAD\&quot;,                                             \&quot;terminal\&quot;: \&quot;2\&quot;,                                             \&quot;at\&quot;: \&quot;2019-08-02T09:10:00+02:00\&quot;                                         },                                         \&quot;carrierCode\&quot;: \&quot;TP\&quot;,                                         \&quot;number\&quot;: \&quot;1026\&quot;,                                         \&quot;aircraft\&quot;: {                                             \&quot;code\&quot;: \&quot;319\&quot;                                         },                                         \&quot;operating\&quot;: {                                             \&quot;carrierCode\&quot;: \&quot;TP\&quot;,                                             \&quot;number\&quot;: \&quot;1026\&quot;                                         },                                         \&quot;duration\&quot;: \&quot;0DT1H15M\&quot;                                     },                                     \&quot;pricingDetailPerAdult\&quot;: {                                         \&quot;travelClass\&quot;: \&quot;ECONOMY\&quot;,                                         \&quot;fareClass\&quot;: \&quot;U\&quot;,                                         \&quot;availability\&quot;: 5,                                         \&quot;fareBasis\&quot;: \&quot;UUSDSI0E\&quot;                                     }                                 }                             ]                         }                     ],                     \&quot;price\&quot;: {                         \&quot;total\&quot;: \&quot;259.91\&quot;,                         \&quot;totalTaxes\&quot;: \&quot;185.91\&quot;                     },                     \&quot;pricePerAdult\&quot;: {                         \&quot;total\&quot;: \&quot;259.91\&quot;,                         \&quot;totalTaxes\&quot;: \&quot;185.91\&quot;                     }                 }             ]         },         {             \&quot;type\&quot;: \&quot;flight-offer\&quot;,             \&quot;id\&quot;: \&quot;1539956390004-765796655\&quot;,             \&quot;offerItems\&quot;: [                 {                     \&quot;services\&quot;: [                         {                         \&quot;segments\&quot;: [                             {                             \&quot;flightSegment\&quot;: {                                 \&quot;departure\&quot;: {                                 \&quot;iataCode\&quot;: \&quot;JFK\&quot;,                                 \&quot;at\&quot;: \&quot;2019-08-01T22:05:00-04:00\&quot;                                 },                                 \&quot;arrival\&quot;: {                                 \&quot;iataCode\&quot;: \&quot;MAD\&quot;,                                 \&quot;at\&quot;: \&quot;2019-08-02T11:30:00+02:00\&quot;,                                 \&quot;terminal\&quot;: \&quot;1\&quot;                                 },                                 \&quot;carrierCode\&quot;: \&quot;UX\&quot;,                                 \&quot;number\&quot;: \&quot;92\&quot;,                                 \&quot;aircraft\&quot;: {                                 \&quot;code\&quot;: \&quot;332\&quot;                                 },                                 \&quot;operating\&quot;: {                                 \&quot;carrierCode\&quot;: \&quot;UX\&quot;,                                 \&quot;number\&quot;: \&quot;92\&quot;                                 },                                 \&quot;duration\&quot;: \&quot;0DT7H25M\&quot;                             },                             \&quot;pricingDetailPerAdult\&quot;: {                                 \&quot;travelClass\&quot;: \&quot;ECONOMY\&quot;,                                 \&quot;fareClass\&quot;: \&quot;M\&quot;,                                 \&quot;availability\&quot;: 9,                                 \&quot;fareBasis\&quot;: \&quot;MYYOAE\&quot;                             }                             }                         ]                         }                     ],                     \&quot;price\&quot;: {                         \&quot;total\&quot;: \&quot;1670.89\&quot;,                         \&quot;totalTaxes\&quot;: \&quot;162.89\&quot;                     },                     \&quot;pricePerAdult\&quot;: {                         \&quot;total\&quot;: \&quot;1670.89\&quot;,                         \&quot;totalTaxes\&quot;: \&quot;162.89\&quot;                     }                 }             ]         }     ],     \&quot;dictionaries\&quot;: {         \&quot;locations\&quot;: {             \&quot;JFK\&quot;: {                 \&quot;subType\&quot;: \&quot;AIRPORT\&quot;,                 \&quot;detailedName\&quot;: \&quot;JOHN F KENNEDY INTL\&quot;             },             \&quot;EWR\&quot;: {                 \&quot;subType\&quot;: \&quot;AIRPORT\&quot;,                 \&quot;detailedName\&quot;: \&quot;NEWARK LIBERTY INTL\&quot;             },             \&quot;MAD\&quot;: {                 \&quot;subType\&quot;: \&quot;AIRPORT\&quot;,                 \&quot;detailedName\&quot;: \&quot;ADOLFO SUAREZ BARAJAS\&quot;             },             \&quot;LIS\&quot;: {                 \&quot;subType\&quot;: \&quot;AIRPORT\&quot;,                 \&quot;detailedName\&quot;: \&quot;AIRPORT\&quot;             }         },         \&quot;carriers\&quot;: {             \&quot;UX\&quot;: \&quot;AIR EUROPA\&quot;,             \&quot;TP\&quot;: \&quot;TAP PORTUGAL\&quot;         },         \&quot;currencies\&quot;: {             \&quot;EUR\&quot;: \&quot;EURO\&quot;         },         \&quot;aircraft\&quot;: {             \&quot;319\&quot;: \&quot;AIRBUS INDUSTRIE A319\&quot;,             \&quot;332\&quot;: \&quot;AIRBUS INDUSTRIE A330-200\&quot;         }     } } &lt;/code&gt;&lt;/pre&gt;
     * <p><b>200</b> - Success
     * <p><b>400</b> - code    | title                                  ------- | -------------------------------------  425     | INVALID DATE 432     | INVALID CURRENCY CODE 477     | INVALID FORMAT 1379    | VERIFY CURRENCY CODE 4926    | INVALID DATA RECEIVED 32171   | MANDATORY DATA MISSING 
     * <p><b>500</b> - Unexpected error
     * @param origin city/airport [IATA code](http://www.iata.org/publications/Pages/code-search.aspx) from which the traveler will depart, e.g. BOS for Boston (required)
     * @param destination city/airport [IATA code](http://www.iata.org/publications/Pages/code-search.aspx) to which the traveler is going, e.g. PAR for Paris (required)
     * @param departureDate the date on which the traveler will depart from the origin to go to the destination. Dates are specified in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-DD format, e.g. 2017-12-25 (required)
     * @param returnDate the date on which the traveler will depart from the destination to return to the origin. If this parameter is not specified, only one-way itineraries are found. If this parameter is specified, only round-trip itineraries are found. Dates are specified in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-DD format, e.g. 2018-02-28 (optional)
     * @param arrivalBy the date and time by which the last flight of the outbound should arrive at the destination. Datetimes are specified in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-ddThh:mm format, e.g. 2016-12-31T23:59 (optional)
     * @param returnBy the date and time by which the last flight of the inbound should arrive at the origin. Datetimes are specified in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-ddThh:mm format, e.g. 2017-12-31T12:01 (optional)
     * @param adults the number of adult travelers (age 12 or older on date of departure). If specified, this number should be greater than or equal to 0 (optional, default to 1)
     * @param children the number of child travelers (older than age 2 and younger than age 12 on date of departure) who will each have their own separate seat. If specified, this number should be greater than or equal to 0 (optional)
     * @param infants the number of infant travelers (whose age is less or equal to 2 on date of departure). Infants travel on the lap of an adult or a senior traveler, and thus the number of infants must not exceed the sum of the number of adults and seniors. If specified, this number should be greater than or equal to 0 (optional)
     * @param seniors the number of senior travelers (age 65 or older on date of departure). If specified, this number should be greater than or equal to 0 (optional)
     * @param travelClass most of the flight time should be spent in a cabin of this quality or higher. The accepted travel class is economy, premium economy, business or first class. If no travel class is specified, the search considers any travel class (optional)
     * @param includeAirlines if specified, the flight offer will include at least one segment per bound marketed by one of these airlines. Airlines are specified as [IATA airline codes](http://www.iata.org/publications/Pages/code-search.aspx) and are comma-separated, e.g. 6X,7X,8X (optional)
     * @param excludeAirlines if specified, the flight offer will exclude all the flights marketed by one of these airlines. Airlines are specified as [IATA airline codes](http://www.iata.org/publications/Pages/code-search.aspx) and are comma-separated, e.g. 6X,7X,8X (optional)
     * @param nonStop if set to true, the search will find only flights going from the origin to the destination with no stop in between (optional, default to false)
     * @param currency the preferred currency for the flight offers. Currency is specified in the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) format, e.g. EUR for Euro (optional)
     * @param maxPrice maximum price of the flight offers to find, in EUR unless some other currency is specified. By default, no limit is applied. If specified, the value should be a positive number with no decimals (optional)
     * @param max maximum number of flight offers to return.   If specified, the value should be between 1 and 250. When not specified, system uses the default value **50**.  (optional, default to 50)
     * @return ResponseEntity&lt;FlightOffers&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FlightOffers> getFlightOffersWithHttpInfo(String origin, String destination, LocalDate departureDate, LocalDate returnDate, OffsetDateTime arrivalBy, OffsetDateTime returnBy, Integer adults, Integer children, Integer infants, Integer seniors, String travelClass, String includeAirlines, String excludeAirlines, Boolean nonStop, String currency, Integer maxPrice, Integer max) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'origin' is set
        if (origin == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'origin' when calling getFlightOffers");
        }
        
        // verify the required parameter 'destination' is set
        if (destination == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destination' when calling getFlightOffers");
        }
        
        // verify the required parameter 'departureDate' is set
        if (departureDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'departureDate' when calling getFlightOffers");
        }
        
        String path = UriComponentsBuilder.fromPath("/shopping/flight-offers").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "origin", origin));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "destination", destination));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "departureDate", departureDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "returnDate", returnDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "arrivalBy", arrivalBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "returnBy", returnBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "adults", adults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "children", children));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "infants", infants));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "seniors", seniors));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "travelClass", travelClass));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeAirlines", includeAirlines));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "excludeAirlines", excludeAirlines));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nonStop", nonStop));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency", currency));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxPrice", maxPrice));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));

        final String[] accepts = { 
            "application/vnd.amadeus+json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/vnd.amadeus+json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "airfare_auth" };

        ParameterizedTypeReference<FlightOffers> returnType = new ParameterizedTypeReference<FlightOffers>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
