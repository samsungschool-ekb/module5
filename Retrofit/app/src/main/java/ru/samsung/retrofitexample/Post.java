package ru.samsung.retrofitexample;

import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("userId")
    private long USER_ID;

    private long id;

    private String title;

    private String body;

    public Post() {
    }

    public Post(long USER_ID, long id, String title, String body) {
        this.USER_ID = USER_ID;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public long getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(long USER_ID) {
        this.USER_ID = USER_ID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "USER_ID=" + USER_ID +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
