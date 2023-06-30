package com.file.task.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.file.task.model.DatabaseFile;

public interface DatabaseFileRepository extends JpaRepository<DatabaseFile,String>{

	public DatabaseFile findByFileName(String fileName);
}
