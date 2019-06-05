package com.junit.tdd.TDDJUnit;

import java.util.HashMap;
import java.util.Map;

public class PersonalProcess {

	private static Map<String, Person> personalList = new HashMap<String, Person>();

	public boolean addPerson(Person person) {
		try {
			if (!personalList.containsKey(person.getPersonalId())) {
				personalList.put(person.getPersonalId(), person);
				return true;
			}
			return false;
		} catch (Exception e) {
			throw new RuntimeException(e.toString());
		}
	}

	public boolean deletePersonByPersonalId(Person person) {
		try {
			if (personalList.containsKey(person.getPersonalId())) {
				personalList.remove(person.getPersonalId());
			}
			return true;
		} catch (Exception e) {
			throw new RuntimeException(e.toString());
		}
	}

	public Person findPersonByPersonalId(String personelId) {
		try {
			return personalList.get(personelId);
		} catch (Exception e) {
			throw new RuntimeException(e.toString());
		}
	}

}
