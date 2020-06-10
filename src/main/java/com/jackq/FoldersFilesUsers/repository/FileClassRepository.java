package com.jackq.FoldersFilesUsers.repository;

import com.jackq.FoldersFilesUsers.models.FileClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileClassRepository extends JpaRepository<FileClass, Long> {
}
