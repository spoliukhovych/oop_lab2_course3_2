package com.airportmanagement.controller.dto.crewmember;

import com.airportmanagement.model.enums.Position;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CrewMemberWithoutFlightsDto {

  private Long id;
  private String name;
  private String surname;
  private Position position;

}
