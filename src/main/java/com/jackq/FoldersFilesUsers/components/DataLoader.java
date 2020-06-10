package com.jackq.FoldersFilesUsers.components;

import com.jackq.FoldersFilesUsers.models.FileClass;
import com.jackq.FoldersFilesUsers.models.Folder;
import com.jackq.FoldersFilesUsers.repository.FileClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileClassRepository fileClassRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Folder folder = new Folder("Stock Reports");
        FileClass file = new FileClass("March2020", ".PDF", 234, folder);
    }

}
