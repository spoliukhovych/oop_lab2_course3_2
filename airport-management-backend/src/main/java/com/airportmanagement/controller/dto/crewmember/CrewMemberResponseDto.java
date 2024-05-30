package com.airportmanagement.controller.dto.crewmember;

import com.airportmanagement.controller.dto.flight.FlightWithoutCrewMembersDto;
import com.airportmanagement.model.enums.Position;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CrewMemberResponseDto {

  private Long id;
  private String name;
  private String surname;
  private Position position;
  private List<FlightWithoutCrewMembersDto> flights;

}
