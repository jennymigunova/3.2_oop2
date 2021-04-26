package ru.netology.domain;

public class Post {
    private int postId;
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
    private Donut donut;
    private Geo geo;
    private PostSource postSource;
    private ViewsInfo viewsInfo;
    private SharesInfo sharesInfo;
    private LikesInfo likesInfo;
    private Copyright copyright;
    private CommentsInfo commentsInfo;

    private Place place;
    private User user;

}
