package edu.uts.sep.model;

import java.util.ArrayList;

import edu.uts.sep.Generator;

public class Persons
{
	private ArrayList<Person> list = new ArrayList<Person>();

	public Person login(String user, String password)
	{
		int id;
		try
		{
			id = Integer.parseInt(user);
		}
		catch (Exception e)
		{
			return null;
		}

		Person person = findPerson(id);
		if (person == null)
			return person;

		if (comparePassword(person, password))
			return person;

		return null;
	}
	
	public Person newPerson(String firstname, String lastname, String email, String password)
	{
		Person newperson = new Person();
		
		newperson.setEmail(email);
		newperson.setFirstname(firstname);
		newperson.setLastname(lastname);
		newperson.setPassword(password);
		
		for (Person person : list)
		{
			if (newperson.getEmail() == email)
				return null;
		}
		
		
		this.list.add(newperson);
		
		return newperson;
	}

	private Person findPerson(int id)
	{
		for (Person person : list)
		{
			if (person.getId() == id)
				return person;
		}

		return null;
	}

	private boolean comparePassword(Person person, String password)
	{
		String newHash = Generator.md5Hash(person.getSalt(), password);
		return newHash.equals(person.getPassword_hash());
	}
}
