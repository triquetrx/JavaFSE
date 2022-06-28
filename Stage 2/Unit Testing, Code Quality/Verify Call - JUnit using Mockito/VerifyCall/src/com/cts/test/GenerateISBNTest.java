package com.cts.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.junit.Assert.*;

import com.cts.utility.Book;
import com.cts.utility.GenerateISBN;

//Provide necessary Annotation to class, attributes and test methods
@RunWith(MockitoJUnitRunner.class)
public class GenerateISBNTest {
	    @Mock
        Book book;
	    @InjectMocks
        GenerateISBN service;
        @Rule
        public ExpectedException exceptionRule = ExpectedException.none();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
    
    @Test
	public void testSuccess() {
	    	//fill code
	    service.assignISBN("ISBN1234");
        verify(book,times(1)).setIsbn("ISBN1234");
	}
	
	@Test
	public void testFailed() {
	    	//fill code
	    exceptionRule.expect(RuntimeException.class);
	    exceptionRule.expectMessage("Invalid Code");
        service.assignISBN("ISBN12345");
        verify(book,never()).setIsbn("ISBN12345");
	}

    @Test
	public void testException() {
	    	//fill code
	    exceptionRule.expect(RuntimeException.class);
	    exceptionRule.expectMessage("Invalid Code");
        service.assignISBN("ISBN12345");
	}
}
