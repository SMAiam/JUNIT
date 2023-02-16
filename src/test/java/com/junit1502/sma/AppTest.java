//package com.junit1502.sma;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.Assume.assumeFalse;
//import static org.junit.Assume.assumeTrue;
//import static org.junit.jupiter.api.Assertions.assertAll;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assumptions.assumingThat;
//
//import java.time.LocalDateTime;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//
//public class AppTest {
////	@BeforeAll
////
////	static void beforeAll() {
////		
////		System.out.println("executed once before all test methods in the class");
////		
////	}
////
////	@BeforeEach
////	void beforeEach() {
////		System.out.println("executed once before each test methods in the class");	
////	}
////
////	@Test
////	
////	public void testMethod1() {
////		System.out.println("test method1");
////	}
////	
////	@DisplayName("Test method2")
////    @Test
////	
////    public void testMethod2() {
////		System.out.println("test method2");
////	}
////	
////    @Test
////    @Disabled("implementation pending")
////	
////    public void testMethod3() {
////		System.out.println("test method3");
////	}
////    
////    @AfterEach
////	 void afterEach() {
////		System.out.println("executed once after each test methods in the class");	
////	}
////    
////	@AfterAll
////
////	static void afterAll() {
////		
////		System.out.println("executed once after all test methods in the class");
////		
////	}
////	@Test
////    void testAssertEqual() {
////    	
////    	assertEquals("ABC","ABC");
////    	assertEquals(20,20,"optional assertion message");
////    }
////    
////    @Test
////    void testAssertFalseOrTrue() {
////    	 assertFalse("Dahmer".length() == 10);
////    	 assertFalse(10 > 20, "assertion message");
////    }
////
////    @Test
////    void testAssertNull() {
////         String str1 = null;
////    	 String str2 = "abc";
////    	 assertNull(str1);
////    	 assertNotNull(str2);	
////    }
////    
////  @Test
////  void testAssertAll() {
////  	 String str1 = "abc";
////  	 String str2 = "pqr";
////  	 String str3 = "xyz";
////  	 assertAll("numbers",
////  	      () -> assertEquals(str1,"abc"),
////  		  () -> assertEquals(str2,"pqr"),
////  		  () -> assertEquals(str3,"xyz")
////  	 );
////  	
////  }
//
////WRONG
////  @Test
////  void testAssertTrue() {
////  	 assertTrue("FirstName".startsWith("F"));
////  	 try {
////  	 assertTrue("10"  {
////  	      throw new IllegalArgumentException("Illegal Argument Exception occured");
////  	 });
////  	 }
////  	 catch(exception) {
////  		assertEquals("Illegal Argument Exception occured", exception.getMessage());
////  	 }
////  	 
////  }
//
////  @Test
////  void testAssumeTrue() {
////       boolean b = 'A' == 'B';
////       assumeTrue(b);
////       assertEquals("Hello", "Bello");
////  }
//
////  @Test
////  @DisplayName("test executes only on Saturday")
////  public void testAssumeTrueSaturday() {
////       LocalDateTime dt = LocalDateTime.now();
////       
////       System.out.println(dt.getDayOfWeek().getValue());
////       
////       assumeTrue(dt.getDayOfWeek().getValue() == 3);
////      
////       System.out.println("further code will execute only if above assumption holds true");
////  }
//
////  @Test
////  void testAssumeFalse() {
////       boolean b = 'A' != 'A';
////       assumeFalse(b);
////       System.out.println("further code will execute only if above assumption holds true");
////       assertEquals("Hello", "Hello");
////  }
//
////  @Test
////  void testAssumeFalseEnvProp() {
////       System.setProperty("env", "prod");
////       assumeFalse("dev".equals(System.getProperty("env")));
////       System.out.println("further code will execute only if above assumption hold");
////  }
////
//	// DOUBT
////  @Test
////  void testAssumingThat() {
////       System.setProperty("env", "test");
////       assumingThat("test".equals(System.getProperty("env")),
////            () -> {
////                 //assertEquals(10, 10);
////                 System.out.println("perform below assertions only on the test env");
////                 });
////
////       assertEquals(20, 10);
////       System.out.println("perform below assertions on all env");
////  }
//
////	@BeforeAll
////	static void beforeAll() {
////		System.out.println("**--- JUnit5Sample4Test :: beforeAll :: Executed once before all test methods ---**");
////	}
////
////	@BeforeEach
////	void beforeEach() {
////		System.out.println("**--- JUnit5Sample4Test :: beforeEach :: Executed before each test method ---**");
////	}
////
////	@AfterEach
////	void afterEach() {
////		System.out.println("**--- JUnit5Sample4Test :: afterEach :: Executed after each test method ---**");
////	}
////
////	@AfterAll
////	static void afterAll() {
////		System.out.println("**--- JUnit5Sample4Test :: afterAll :: Executed after all test method ---**");
////	}
////
////	@Nested
////	class InnerClass {
////
////		@BeforeEach
////		void beforeEach() {
////			System.out.println("**--- InnerClass :: beforeEach :: Executed before each test method ---**");
////		}
////
////		@AfterEach
////		void afterEach() {
////			System.out.println("**--- InnerClass :: afterEach :: Executed after each test method ---**");
////		}
////
////		@Test
////		void testMethod1() {
////			System.out.println("**--- InnerClass :: testMethod1 :: Executed test method1 ---**");
////		}
////
////		@Nested
////		class InnerMostClass {
////
////			@BeforeEach
////			void beforeEach() {
////				System.out.println("**--- InnerMostClass :: beforeEach :: Executed before each test method ---**");
////			}
////
////			@AfterEach
////			void afterEach() {
////				System.out.println("**--- InnerMostClass :: afterEach :: Executed after each test method ---**");
////			}
////
////			@Test
////			void testMethod2() {
////				System.out.println("**--- InnerMostClass :: testMethod2 :: Executed test method2 ---**");
////			}
////		}
////	}
//	
////DOUBT
//	
////	Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
////	     throw new IllegalArgumentException("Illegal Argument Exception occured");
////	});
////	
////	assertEquals("Illegal Argument Exception occured", exception.getMessage());
//
////}
//}
