package com.file.task.controller.test;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.file.task.model.DatabaseFile;
import com.file.task.service.DatabaseFileService;
import org.mockito.BDDMockito.*;

@WebMvcTest
@AutoConfigureMockMvc
public class FileUploadControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private DatabaseFileService fileStorageService;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Test
	public void uploadGivenFileSuccessfully()throws Exception{
		
		MultipartFile f = (MultipartFile) new File("demo.pdf");
		
//		given(fileStorageService.storeFile(f)).
//		willAnswer((invocation)-> invocation.getArgument(0));
		//DatabaseFile fileName = fileStorageService.storeFile(file);
		//when(fileStorageService.storeFile(f)).thenReturn()
	   ResultActions response = 
			   mockMvc.perform(post("/uploadFile").
			   contentType(MediaType.APPLICATION_PDF)
			   .content(objectMapper.writeValueAsString(f)));
               
			   
	}
}
