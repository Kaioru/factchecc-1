package io.github.omfgshaz.factchecc.data.model;

public class Article {
    private String originURL;
    private String imageURL;
    private String title;
    private String body;
    private int rating;

    public Article(String originURL, String imageURL, String title, String body, int rating) {
        this.originURL = originURL;
        this.imageURL = imageURL;
        this.title = title;
        this.body = body;
        this.rating = rating;
    }

    public String getOriginURL() {
        return originURL;
    }

    public void setOriginURL(String originURL) {
        this.originURL = originURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
