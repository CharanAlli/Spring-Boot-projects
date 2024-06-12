package com.charan.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.charan.binding.Book;
@Service
public class BookClient {
	public void insertBookRec() {
		String apiUrl ="http://localhost:8080/book";
		Book book = new Book();
		book.setBookName("Spring");
		book.setBookPrice(3000D);
		RestTemplate rt= new RestTemplate();
		ResponseEntity<String>postFEntity=rt.postForEntity(apiUrl,book, String.class);
		System.out.println(postFEntity.getBody());
	}
	public void invokeGetBooks() {
		String apiUrl="http://localhost:8080/books";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Book[]>forEntity=rt.getForEntity(apiUrl,Book[].class);
		Book[] body=forEntity.getBody();
		for(Book book:body) {
			System.out.println(book);
		}
	}

}
