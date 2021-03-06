package com.example.probono.DTO;

public class Notice {
    private int id;
    private String date;
    private String title;
    private String content;

    public Notice(String date, String title, String content) {
        this.date = date;
        this.title = title;
        this.content = content;
    }

    public Notice() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
}
