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
  public ResponseEntity<String> addBoard(Board board) throws Exception {
    Board newBoard;
    return ResponseEntity.ok("파일업로드를 하였습니다.: ");
  }
}
