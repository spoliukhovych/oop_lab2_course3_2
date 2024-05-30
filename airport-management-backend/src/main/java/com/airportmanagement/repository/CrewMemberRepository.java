package com.airportmanagement.repository;

import com.airportmanagement.model.CrewMember;
import com.airportmanagement.model.Flight;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrewMemberRepository extends JpaRepository<CrewMember, Long> {

  long deleteCrewMemberById(Long id);

  List<CrewMember> findCrewMembersByFlights(Flight flight);

}
