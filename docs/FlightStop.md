
# FlightStop

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iataCode** | **String** | [IATA airline codes](http://www.iata.org/publications/Pages/code-search.aspx) |  [optional]
**newAircraft** | [**AircraftEquipment**](AircraftEquipment.md) |  |  [optional]
**duration** | **String** | stop duration in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) PnYnMnDTnHnMnS format, e.g. PT2H10M |  [optional]
**arrivalAt** | [**OffsetDateTime**](OffsetDateTime.md) | arrival at the stop in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-ddThh:mm±hh:mm format, e.g. 2017-02-10T20:40:00+02:00 |  [optional]
**departureAt** | [**OffsetDateTime**](OffsetDateTime.md) | departure from the stop in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-ddThh:mm±hh:mm format, e.g. 2017-02-10T20:40:00+02:00 |  [optional]



