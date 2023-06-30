package com.file.task.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.io.File;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.multipart.MultipartFile;

import com.file.task.model.DatabaseFile;
import com.file.task.service.DatabaseFileService;
import com.file.task.service.repository.DatabaseFileRepository;

@SpringBootTest
public class DatabaseFileServiceTest {

	@Mock
	private DatabaseFileRepository dbFileRepository;

	@InjectMocks
	private DatabaseFileService dbFileService;

	@Test
	public void storeFile() {
		MultipartFile f = (MultipartFile) new File("abc.pdf");

		// save file in db with some attributes
		// retreive it from db

		// then compare above two with assertEquals
		dbFileService.storeFile(f);

		DatabaseFile file = dbFileRepository.findByFileName("abc.pdf");
		assertEquals("abc.pdf", file.getFileName(), "find by fileName");

	}

}
