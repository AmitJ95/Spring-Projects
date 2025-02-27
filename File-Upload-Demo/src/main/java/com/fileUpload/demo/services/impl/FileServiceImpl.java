package com.fileUpload.demo.services.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.web.multipart.MultipartFile;

import com.fileUpload.demo.services.FileService;

public class FileServiceImpl implements FileService {

	@Override
	public String uploadImage(String path, MultipartFile file) {
		// TODO Auto-generated method stub	
		
		//Filenames
		String name = file.getOriginalFilename();
		
		//Fullpath
		
		String filePath = path+File.separator+name;
		 
		
		//create folder if not created
		File f = new File(path);
		if(!f.exists()) {
			f.mkdir();
		}
		
		//file copy
		
		
			
				try {
					Files.copy(file.getInputStream(), Paths.get(filePath));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
		
		
		return name;
	}

}
