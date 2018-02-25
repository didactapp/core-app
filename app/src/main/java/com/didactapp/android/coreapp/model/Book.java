package com.didactapp.android.coreapp.model;

// TODO: null handling
public final class Book {
    private final String id;
    private final String imageUrl;
    private final String title;
    private final String description;
    private final String publishedDate;
    private final String author;

    public Book(String id, String imageUrl, String title, String desc, String pubDate, String author) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.title = title;
        this.description = desc;
        this.publishedDate = pubDate;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getAuthor() {
        return author;
    }
}
