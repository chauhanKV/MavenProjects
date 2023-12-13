package org.mvn;

import java.util.List;

public interface FlightSearchInterface {
    List<FlightData> getFlightSearchData(String source, String destination);
}
