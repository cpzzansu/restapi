package com.boardapi.restapi.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


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
