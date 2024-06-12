package com.charan.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.charan.bindings.Book;

@Controller
public class BookController {
	/*@GetMapping("/book")
	public String getBookData(Model model) {
		Book b=new Book(101, "Java", 1000.00);
		model.addAttribute("book", b);
		return "book";
			}*/
	@GetMapping("/books")
	public String getBooksData(Model model) {
		Book b1=new Book(101, "Java", 1000.00);
		Book b2=new Book(102, "Python", 800.10);
		Book b3=new Book(103, "C++", 700.50);
		Book b4=new Book(104, "React.js", 900.70);
		List<Book>booksList=Arrays.asList(b1,b2,b3,b4);
		model.addAttribute("books",booksList);
		return "books";
	}
	

}