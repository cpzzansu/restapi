package com.boardapi.restapi.dto;

import lombok.Data;

@Data
public class Board {

  private String boardCode;
  private String memberEmail;
  private String memberName;
  private String boardContent;
  private String boardRegisterTime;
}
