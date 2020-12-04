package com.wang.spring.util;


import java.util.ArrayList;
import java.util.List;

public class Dealstring {
    public String dealhtml(String htmlstr,List<String> filename) {
        StringBuilder str = new StringBuilder("qweqwe<font color=\"#00ff00\">qwe<span style=\"background-color: rgb(255, 0, 0);\">dad</span><span style=\"background-color: rgb(5, 0, 149);\">dsad</span></font><img src=\"content://com.android.providers.downloads.documents/document/raw%3A%2Fstorage%2Femulated%2F0%2FDownload%2F7HNNT%5DF2%241%7DBYAYBPMUMYDG.jpg\" alt=\"dachshund\" width=\"200\"><br>fsdfs<br><div style=\"text-align: center;\"><img src=\"content://com.android.providers.downloads.documents/document/raw%3A%2Fstorage%2Femulated%2F0%2FDownload%2F10700623b16ea61b196ecd3b45e2f7c.jpg\" alt=\"dachshund\" width=\"200\"></div>");
        int ch = 0, o=0, start, end;
        List<String> ret = new ArrayList<>();
        while (ch < str.length()) {
            start = str.indexOf("content://", ch);
            end = str.indexOf("alt=", ch);
            if (start == -1 || end == -1) {
                break;
            }
            str.replace(start, end - 2, "file:///D:/testFile/"+filename.get(o));
            end = str.indexOf("alt=", ch);
            ch = end + 1;
            o++;
        }
        return str.toString();
    }
}