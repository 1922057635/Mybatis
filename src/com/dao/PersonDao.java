package com.dao;


import java.util.ArrayList;
import java.util.List;

import com.pojo.Person;
import com.pojo.Users;

public interface PersonDao {
	public Person findPersonById(int id);
	public List<Person> findPersonsById(List<Integer> list);
	public List<Users> selectPersonAndCardByCardId(Integer id);
}
