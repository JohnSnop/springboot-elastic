package com.wf.elastic.bean;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author wf
 * @create 2020-08-28 20:54
 * @desc
 **/
@Data
// @Document(indexName = "mofeiwanli")
public class Book {

    private Integer id;
    private String author;
    private String title;
    private String content;
}
