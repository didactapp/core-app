package com.didactapp.android.coreapp.model;

// TODO: null handling
public final class BookCover {
    private final String id;
    private final String imageUrl;
    private final String title;
    private final String tagLine;

    public BookCover(String id, String imageUrl, String title, String tagLine) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.title = title;
        this.tagLine = tagLine;
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

    public String getTagLine() {
        return tagLine;
    }
}
