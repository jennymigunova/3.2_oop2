package ru.netology.domain;

public class Post {
    private int id;
    private String text;
    private String image;
    private String link;
    private String createdAt;
    private String updatedAt;

    private int ownerId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    boolean friendsOnly;
    private String postType;
    private int signerId;
    private boolean isCanPin;
    private boolean isCanDelete;
    private boolean isCanEdit;
    private boolean isPinned;
    private boolean isMarkedAsAds;
    private boolean isFavorite;
    private int postponedId;
    private Object donut;
    private Object geo;
    private Object postSource;
    private Object viewsInfo;
    private Object repostsInfo;
    private Object likesInfo;
    private Object copyright;
    private Object commentsInfo;
}
