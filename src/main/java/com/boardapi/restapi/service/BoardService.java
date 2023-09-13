package com.boardapi.restapi.service;

import java.util.Iterator;
import java.util.List;

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
    
    

    public void addBoard(Board board, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception {
        
        //boardMapper.addBoard(board);
        if (ObjectUtils.isEmpty(multipartHttpServletRequest) == false) {
            Iterator<String> iterator = multipartHttpServletRequest.getFileNames();
            String name;
            while (iterator.hasNext()) {
                name = iterator.next();
                log.debug("file tag name : " + name);
                List<MultipartFile> list = multipartHttpServletRequest.getFiles(name);
                for (MultipartFile multipartFile : list) {
                    log.debug("start file informaiton");
                    log.debug("file name : " + multipartFile.getOriginalFilename());
                    log.debug("file size : " + multipartFile.getSize());
                    log.debug("file content type : " + multipartFile.getContentType());
                    log.debug("end file information.\n");
                }
            }
        }

    }
}
