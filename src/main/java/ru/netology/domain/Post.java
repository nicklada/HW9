package ru.netology.domain;

import ru.netology.domain.ru.netology.domain.ru.netology.domain.*;

public class Post {
    private int id;
    private int ownerID;
    private int fromID;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private CommentsInfo CommentsInfo;
    private LikesInfo LikesInfo;
    private RepostsInfo RepostsInfo;
    private ViewsInfo ViewsInfo;
    private String postType;
    private PostSource PostSource;
    private Geo Geo;
    private int signerID;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public int getFromID() {
        return fromID;
    }

    public void setFromID(int fromID) {
        this.fromID = fromID;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public ru.netology.domain.ru.netology.domain.ru.netology.domain.CommentsInfo getCommentsInfo() {
        return CommentsInfo;
    }

    public void setCommentsInfo(ru.netology.domain.ru.netology.domain.ru.netology.domain.CommentsInfo commentsInfo) {
        CommentsInfo = commentsInfo;
    }

    public ru.netology.domain.ru.netology.domain.ru.netology.domain.LikesInfo getLikesInfo() {
        return LikesInfo;
    }

    public void setLikesInfo(ru.netology.domain.ru.netology.domain.ru.netology.domain.LikesInfo likesInfo) {
        LikesInfo = likesInfo;
    }

    public ru.netology.domain.ru.netology.domain.ru.netology.domain.RepostsInfo getRepostsInfo() {
        return RepostsInfo;
    }

    public void setRepostsInfo(ru.netology.domain.ru.netology.domain.ru.netology.domain.RepostsInfo repostsInfo) {
        RepostsInfo = repostsInfo;
    }

    public ru.netology.domain.ru.netology.domain.ru.netology.domain.ViewsInfo getViewsInfo() {
        return ViewsInfo;
    }

    public void setViewsInfo(ru.netology.domain.ru.netology.domain.ru.netology.domain.ViewsInfo viewsInfo) {
        ViewsInfo = viewsInfo;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public ru.netology.domain.ru.netology.domain.ru.netology.domain.PostSource getPostSource() {
        return PostSource;
    }

    public void setPostSource(ru.netology.domain.ru.netology.domain.ru.netology.domain.PostSource postSource) {
        PostSource = postSource;
    }

    public ru.netology.domain.ru.netology.domain.ru.netology.domain.Geo getGeo() {
        return Geo;
    }

    public void setGeo(ru.netology.domain.ru.netology.domain.ru.netology.domain.Geo geo) {
        Geo = geo;
    }

    public int getSignerID() {
        return signerID;
    }

    public void setSignerID(int signerID) {
        this.signerID = signerID;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}