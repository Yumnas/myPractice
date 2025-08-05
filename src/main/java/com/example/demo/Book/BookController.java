package com.example.demo.Book;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class BookController {

    private final List<BookResponseBody> bookResponseBodyList = new ArrayList<>();

    //add book
    @PostMapping(path = "/book")
    public String addBook(@RequestBody BookResponseBody bookResponseBody){
        bookResponseBodyList.add(bookResponseBody);
        return "Book added: " + bookResponseBody.getTitle();
    }
    @GetMapping("/book")
    public List<BookResponseBody> getAllBooks(){
        return bookResponseBodyList;
    }
    @PutMapping("/{title}")
    public String replaceBook(@RequestBody BookResponseBody updateBookResponseBody, @PathVariable String title){
        for(BookResponseBody bookResponseBody : bookResponseBodyList){
            if(bookResponseBody.getTitle().equalsIgnoreCase(title)){
                bookResponseBody.setPrice(updateBookResponseBody.getPrice());
                bookResponseBody.setAuthor(updateBookResponseBody.getAuthor());
                return "Book title " + bookResponseBody.getTitle()
                        + "written by " + updateBookResponseBody.getAuthor() + "around price "
                        + updateBookResponseBody.getPrice();
            }
        }
        return "Book not found " + title;
    }
    @DeleteMapping("/{title}")
    public String deleteBook(@PathVariable String title){
        Iterator<BookResponseBody> iterator = bookResponseBodyList.iterator();
        while(iterator.hasNext()){ // do we have an item left
            BookResponseBody bookResponseBody = iterator.next(); // gets the next book
            if(bookResponseBody.getTitle().equalsIgnoreCase(title)){
                iterator.remove(); // removes that book
                return "Book deleted " + title;
            }
        }

        return "Book not found: " + title;
    }

}
