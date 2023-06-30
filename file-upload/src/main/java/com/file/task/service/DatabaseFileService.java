package com.file.task.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.file.task.exception.FileStorageException;
import com.file.task.model.DatabaseFile;
import com.file.task.service.repository.DatabaseFileRepository;

@Service
public class DatabaseFileService {

	@Autowired
	private DatabaseFileRepository dbFileRepository;
	
	public DatabaseFile storeFile(MultipartFile file) {
		
		//Normalize filename
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		
		try {
			
			if(fileName.contains("..")) {
				throw new FileStorageException("Sorry filename contains invalid path sequence"+fileName);
			}
			System.out.println(file.getContentType());
			String contentType = file.getContentType();
			if(!contentType.equals("application/pdf")) {
				
				throw new FileStorageException("Sorry uploaded file format is not supported"+": "+fileName);
			}
			
			DatabaseFile dbFile = new DatabaseFile(fileName, file.getContentType(), file.getBytes());
            return dbFileRepository.save(dbFile);
            
		}catch(IOException ex) {
			throw new FileStorageException("Could not store the file"+fileName+"Please try again",ex);
			
		}
	}
	
	public void deleteFile(String id) {
		dbFileRepository.deleteById(id);
		
	}
}
