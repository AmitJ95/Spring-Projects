package com.file.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.file.task.model.DatabaseFile;
import com.file.task.payload.Response;
import com.file.task.service.DatabaseFileService;

@RestController
public class FileUploadController {
	
	@Autowired
	private DatabaseFileService fileStorageService;
	
	@PostMapping("/uploadFile")
	@ResponseStatus(HttpStatus.OK)
	public Response uploadFile(@RequestParam("file") MultipartFile file) {
		
		DatabaseFile fileName = fileStorageService.storeFile(file);
		
		return new Response(fileName.getFileName(),file.getContentType(),
				file.getSize(), fileName.getId());
	}
	
	@DeleteMapping("/deleteFile")
	@ResponseStatus(HttpStatus.OK)
	public Response deleteFile(@PathVariable("id") String id) {
		
		fileStorageService.deleteFile(id);
		return new Response("File deleted successfully");
		
	}
	
}

	

