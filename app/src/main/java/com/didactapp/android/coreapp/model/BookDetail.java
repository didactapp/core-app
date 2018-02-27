package com.didactapp.android.coreapp.model;

// TODO: null handling
public final class BookDetail {
    private final String id;
    private final String coverImageUrl;
    private final String thumbnailImageUrl;
    private final String title;
    private final String tagLine;
    private final String author;
    private final String description;
    private final String publishedDate;
    private final String revisionDate;
    private final String version;

    public BookDetail(String id, String coverImageUrl, String thumbnailImageUrl, String title, String tagLine, String author, String description, String publishedDate, String revisionDate, String version) {
        this.id = id;
        this.coverImageUrl = coverImageUrl;
        this.thumbnailImageUrl = thumbnailImageUrl;
        this.title = title;
        this.tagLine = tagLine;
        this.author = author;
        this.description = description;
        this.publishedDate = publishedDate;
        this.revisionDate = revisionDate;
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public String getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getTagLine() {
        return tagLine;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getRevisionDate() {
        return revisionDate;
    }

    public String getVersion() {
        return version;
    }
}
