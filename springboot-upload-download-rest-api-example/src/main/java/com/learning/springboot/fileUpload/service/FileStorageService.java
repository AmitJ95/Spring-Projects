package com.learning.springboot.fileUpload.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.learning.springboot.fileUpload.exception.FileStorageException;
import com.learning.springboot.fileUpload.property.FileStorageProperties;

@Service
public class FileStorageService {

	private Path fileStorageLocation = null;
	
	
	public FileStorageService(FileStorageProperties 
			fileStorageProperties) {
		
		this.fileStorageLocation = 
				Paths.get(fileStorageProperties.getUploadDir())
				.toAbsolutePath().normalize();
		
		
		try {
			Files.createDirectories(this.fileStorageLocation);
		} catch (Exception e) {
			throw new FileStorageException("Could not create directory"
					+ "where uploaded files will be stored",e);
			
		}
		
		public String storeFile(MultipartFile file) {
			
			
			String fileName = StringUtils.cleanPath(file.getOriginalFilename());
			try {
			//check if filename contains invalid characters
				if(fileName.contains("..")) {
					throw new FileStorageException("Filename contains "
							+ "invalid path sequence");
				}	
		//copy file to target location (Replacing existing file with same name)
					
				Path targetLocation = this.fileStorageLocation.resolve(fileName);
				
				Files.copy(file.getInputStream(), targetLocation, 
						StandardCopyOption.REPLACE_EXISTING);
				return fileName;
				
						
				
					
				}
			catch (IOException e) {		
				throw new FileStorageException("Could not store file"+fileName+".Please try again",e);
			}		
		
	
		
		public Resource loadFileasResource(String fileName) {
			try {
				Path filePath = 
							this.fileStorageLocation.resolve(fileName).normalize();
				
				Resource resource = new UrlResource(filePath.toUri());
				
				
				if(resource.exists()) {
					return resource;
					
				}else {
					
				 throw new FileNotFoundException("File not found"+fileName);	
				
				}
				
				}
				
				
				
			 catch (MalformedURLException e) {
				// TODO: handle exception
				 
				 
				 throw new FileNotFoundException("File not found"+fileName,e);
			}
			
			
			}
		}
}
