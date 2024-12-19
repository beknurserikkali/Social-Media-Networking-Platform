package com;

public class Post {
    private String content;
    private String times;


    public Post(String content, String times) {
        this.content = content;
        this.times = times;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }


    public String toString() {
        return "Post{" + "content='" + content + '\'' + ", times='" + times + '\'' + '}';
    }
}