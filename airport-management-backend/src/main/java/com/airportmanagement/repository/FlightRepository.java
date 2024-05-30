package com.airportmanagement.repository;

import com.airportmanagement.model.CrewMember;
import com.airportmanagement.model.Flight;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {

  long deleteFlightById(Long id);

  List<Flight> findFlightsByCrewMembers(CrewMember crewMember);

}
