package com.junit.tdd.TDDJUnit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonalProcessTest {


	@BeforeClass
	public static void init(){
		System.out.println("class init");
	}
	
	@Test
	public void test_Order1_AddPerson() {
		Person person = new Person();
		person.setPersonalId("Id1");
		person.setName("Name1");
		person.setSurname("Surname1");
		PersonalProcess personalProcess = new PersonalProcess();
		
		assertTrue(personalProcess.addPerson(person));
		
		assertFalse(personalProcess.addPerson(person));
		
		person = new Person();
		person.setPersonalId("Id2");
		person.setName("Name2");
		person.setSurname("Surname2");
		personalProcess = new PersonalProcess();
		
		assertTrue(personalProcess.addPerson(person));
		
		person = new Person();
		person.setPersonalId("Id3");
		person.setName("Name3");
		person.setSurname("Surname3");
		personalProcess = new PersonalProcess();
		assertTrue(personalProcess.addPerson(person));
	}
	
	@Test
	public void test_Order2_FindPersonByPersonalId() {
		PersonalProcess personalProcess = new PersonalProcess();
		assertEquals(personalProcess.findPersonByPersonalId("Id1").getPersonalId(),"Id1");
		assertEquals(personalProcess.findPersonByPersonalId("Id1").getName(),"Name1");
		assertEquals(personalProcess.findPersonByPersonalId("Id1").getSurname(),"Surname1");
	}

	@Test
	public void test_Order3_DeletePersonByPersonalId() {
		Person person = new Person();
		person.setPersonalId("Id1");
		person.setName("Name1");
		person.setSurname("Surname1");
		PersonalProcess personalProcess = new PersonalProcess();
		assertTrue(personalProcess.deletePersonByPersonalId(person));
	}	
	
	@AfterClass
	public static void destroy(){
		System.out.println("destroy");
	}


}
