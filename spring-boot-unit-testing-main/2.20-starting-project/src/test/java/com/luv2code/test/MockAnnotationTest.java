package com.luv2code.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;

import com.luv2code.component.MvcTestingExampleApplication;
import com.luv2code.component.dao.ApplicationDao;
import com.luv2code.component.models.CollegeStudent;
import com.luv2code.component.models.StudentGrades;
import com.luv2code.component.service.ApplicationService;

@SpringBootTest(classes=MvcTestingExampleApplication.class)
public class MockAnnotationTest {

	@Autowired
	ApplicationContext context;
	
	@Autowired
	CollegeStudent studentOne;
	
	@Autowired
	StudentGrades studentGrades;
	
	//@Mock
	@MockBean
	private ApplicationDao applicationDao;
	
	
	//@InjectMocks
	@Autowired
	private ApplicationService applicationService;
	
	
	
	
	@BeforeEach
	public void beforeEach() {
		studentOne.setFirstname("Eric");
		studentOne.setLastname("Roby");
		studentOne.setEmailAddress("eric.roby@luv2code_school.com");
		studentOne.setStudentGrades(studentGrades);
	}
	
	@DisplayName("When & Verify")
	@Test
	public void assertEqualsTestAddGrades() {
			
		when(applicationDao.addGradeResultsForSingleClass
				(studentGrades.getMathGradeResults())).thenReturn(100.0);
		
		assertEquals(100,applicationService.
				addGradeResultsForSingleClass(studentOne.getStudentGrades().
						getMathGradeResults()));
		
		verify(applicationDao).
		addGradeResultsForSingleClass(studentGrades.getMathGradeResults());
		
		
		verify(applicationDao,times(1)).
		addGradeResultsForSingleClass(studentGrades.getMathGradeResults());
		
	}
	
	@DisplayName("Find Gpa")
    @Test
    public void assertEqualsTestFindGpa() {
		when(applicationDao.findGradePointAverage(studentGrades.getMathGradeResults()))
		.thenReturn(88.31);
		assertEquals(88.31,applicationService.findGradePointAverage(studentOne.getStudentGrades()
				.getMathGradeResults()));
	}
	
	@DisplayName("Throw runtime error")
	@Test
	public void throwRuntimeError() {
			CollegeStudent nullStudent = (CollegeStudent)context.
					getBean("collegeStudent");
			
			doThrow(new RuntimeException()).when(applicationDao).
			checkNull(nullStudent);
			
			assertThrows(RuntimeException.class,()->{
				applicationService.checkNull(nullStudent);
			});
	}
	
	@DisplayName("Multiple Stubbing")
	@Test
	public void stubbingConsecutiveCalls() {
		
		CollegeStudent nullStudent = (CollegeStudent)context.
				getBean("collegeStudent");
		
		when(applicationDao.checkNull(nullStudent))
		.thenThrow(new RuntimeException())
		.thenReturn("Do not throw exception second time");
		
		
		assertThrows(RuntimeException.class,()->{
			applicationService.checkNull(nullStudent);
		});
		
		assertEquals("Do not throw exception second time",
				applicationService.checkNull(nullStudent));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
