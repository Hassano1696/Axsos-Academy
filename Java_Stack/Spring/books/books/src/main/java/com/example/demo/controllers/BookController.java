package com.example.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Book;
import com.example.demo.services.BookService;

@SpringBootApplication
@Controller
public class BookController{
	private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    
    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "index.jsp";
    }
    
    @RequestMapping("/books/{bookId}")
    public String index(Model model,@PathVariable("bookId") Long bookId) {
    	Book book = bookService.findBook(bookId);
    	model.addAttribute("book", book);
    	return "show.jsp";
    }
}
