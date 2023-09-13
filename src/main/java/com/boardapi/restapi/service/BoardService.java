package com.boardapi.restapi.service;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.boardapi.restapi.dto.Board;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;


@Transactional
@Slf4j
@AllArgsConstructor
@Service
public class BoardService {


    public void addBoard(String boardContent, List<MultipartFile> files) throws Exception {


        //boardMapper.addBoard(board);
        if(files != null && !files.isEmpty()){
            for(MultipartFile file : files){
                System.out.println("hi");
                log.info("start file informaiton");
                log.info("file name : " + file.getOriginalFilename());
                log.info("file size : " + file.getSize());
                log.info("file content type : " + file.getContentType());
                log.info("end file information.\n");
            }
        }
    }
}
