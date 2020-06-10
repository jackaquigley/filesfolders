package com.jackq.FoldersFilesUsers.repository;

import com.jackq.FoldersFilesUsers.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
