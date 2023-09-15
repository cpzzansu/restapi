package com.boardapi.restapi.common;

import com.boardapi.restapi.dto.BoardFile;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileUtils {

    public List<BoardFile> parseFileInfo(int boardIdx, List<MultipartFile> files) throws Exception{
        if(files == null && files.isEmpty()){
            return null;
        }
        List<BoardFile> fileList = new ArrayList<>();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd");
        ZonedDateTime current = ZonedDateTime.now();
        String path = "images/"+current.format(format);
        File file = new File(path);
        if(file.exists() == false){
            file.mkdirs();
        }
        for(MultipartFile multipartFile : files){


        }
    }
}
