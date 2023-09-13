package com.boardapi.restapi.controller;

import com.boardapi.restapi.dto.Board;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestBoardController {

  @PostMapping("/board")
  public ResponseEntity<String> addBoard(Board board) {
    Board newBoard;
    return new ResponseEntity<>("newBoard, HttpStatus.CREATED");
  }
}
