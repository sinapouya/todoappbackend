package com.sina.todoappbackend.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sina.todoappbackend.entity.Todo;

@Service
public class HardCodedToDoService {
	private static List<Todo> listOfTodos=new ArrayList<Todo>();
	private static int idCounter=1;
	static {
		listOfTodos.add(new Todo(++idCounter,"sina","dentist session",new Date(),false));
		listOfTodos.add(new Todo(++idCounter,"sina","interview session",new Date(),false));
		listOfTodos.add(new Todo(++idCounter,"ali","study streams",new Date(),true));
		listOfTodos.add(new Todo(++idCounter,"ali","study spring boot",new Date(),false));

	}
	public List<Todo> findAll(){
		return listOfTodos;
	}
	
	
}