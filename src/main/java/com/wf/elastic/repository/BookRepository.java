package com.wf.elastic.repository;

import com.wf.elastic.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wf
 * @create 2020-08-28 21:11
 * @desc
 **/
// @Repository
public interface BookRepository extends ElasticsearchRepository<Book, Integer> {
}
