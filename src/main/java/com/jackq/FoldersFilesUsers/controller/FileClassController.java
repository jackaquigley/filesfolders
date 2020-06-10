package com.jackq.FoldersFilesUsers.controller;

import com.jackq.FoldersFilesUsers.models.FileClass;
import com.jackq.FoldersFilesUsers.repository.FileClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class FileClassController {

    @Autowired
    FileClassRepository fileClassRepository;

    @GetMapping(value="/files")
    public ResponseEntity<List<FileClass>> getAllFiles(){
        return new ResponseEntity<>(fileClassRepository.findAll(), HttpStatus.OK);
    }

}
