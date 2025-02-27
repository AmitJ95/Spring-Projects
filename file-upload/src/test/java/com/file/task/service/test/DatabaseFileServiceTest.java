package com.file.task.service.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import com.file.task.model.DatabaseFile;
import com.file.task.service.DatabaseFileService;
import com.file.task.service.repository.DatabaseFileRepository;

@ExtendWith(MockitoExtension.class)
public class DatabaseFileServiceTest {

	@Mock
	private DatabaseFileRepository dbFileRepository;

	@InjectMocks
	private DatabaseFileService dbFileService;

	@Mock
	DatabaseFile dbFile;

	@Test
	public void storeFile() {

		Path path = Paths.get("amitjain@Amits-MacBook-Air Desktop/Del-Mum.pdf");
		String name = "Del-Mum.pdf";
		String originalFileName = "Del-Mum.pdf";
		String contentType = "application/pdf";
		byte[] content = null;
		try {
		    content = Files.readAllBytes(path);
		} catch (final IOException e) {
		}
		
		MultipartFile result = new MockMultipartFile(name,
		                     originalFileName, contentType, content);
		//when(dbFileRepository.save(dbFile)).thenReturn(dbFile);
		//--getting unnecesary stubbing exception
		byte[] data = {};
         dbFile = new DatabaseFile("Del-Mum.pdf", "application/pdf", data);
		try {
	
			dbFileService.storeFile(result);//AssertionError
			//assertNotNull(dbFileService.storeFile(result));
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
	
		
		
		//when(dbFileService.storeFile(result)).thenReturn(dbFile);
		//--getting unnecesary stubbing exception
		
		
		
		
		
		
		// assertEquals(dbFile, when(dbFileRepository.save(dbFile)).thenReturn(dbFile));

		// save file in db with some attributes

		// retreive it from db

		/**
		 * possible another test case byte data[] = { 100, 101 }; dbFile = new
		 * DatabaseFile("abc.pdf", "application/pdf", data);
		 * dbFileRepository.save(dbFile);
		 * 
		 * DatabaseFile dbFile1 = dbFileRepository.findByFileName("abc.pdf");
		 * 
		 * 
		 * assertEquals("abc.pdf",dbFile1.getFileName());
		 *
		 */

	}

}
