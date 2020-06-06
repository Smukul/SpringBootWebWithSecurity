package com.basic.starter;

import com.basic.starter.model.Books;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class BookRestController {
    @GetMapping("/books")
    public List<Books> getAllBooks(){
        return Arrays.asList(new Books(101,"Spring Boot Mastering","O'Really Publications"));
    }
}
