package com.wang.spring.pojo;

import java.sql.Timestamp;
import org.apache.ibatis.type.Alias;
@Alias("PushMassege")
public class PushMassege {
    private int content_id;
    private String title;

    public int getContent_id() {
        return content_id;
    }

    public void setContent_id(int content_id) {
        this.content_id = content_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getPushtime() {
        return pushtime;
    }

    public void setPushtime(Timestamp pushtime) {
        this.pushtime = pushtime;
    }


    private String content;
    private Timestamp pushtime;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    private String user_name;
}
