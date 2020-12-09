package com.wang.spring.util;


import java.util.ArrayList;
import java.util.List;

public class Dealstring {
    public String dealhtml(String htmlstr,List<String> filename) {
        StringBuilder str = new StringBuilder(htmlstr);
        int ch = 0, o=0, start, end;
        List<String> ret = new ArrayList<>();
        while (ch < str.length()) {
            start = str.indexOf("content://", ch);
            end = str.indexOf("alt=", ch);
            if (start == -1 || end == -1) {
                break;
            }
            str.replace(start, end - 2, "http://localhost:8080/static/"+filename.get(o));
            end = str.indexOf("alt=", ch);
            ch = end + 1;
            o++;
        }
        return str.toString();
    }
}