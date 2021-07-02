package com.gdw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {

    private  int bookID;
    private int bookCounts;
    private String detail;
    private String bookName;


}
