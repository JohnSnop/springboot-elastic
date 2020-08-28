package com.wf.elastic.repository;

import com.wf.elastic.bean.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author wf
 * @create 2020-08-28 21:12
 * @desc
 **/
@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void test1() {
        Book book = new Book();
        book.setId(1);
        book.setAuthor("Hello");
        book.setTitle("Yes man");
        book.setContent("JJJJJJJJJJJJJJJJJ");
        bookRepository.index(book);
    }

}