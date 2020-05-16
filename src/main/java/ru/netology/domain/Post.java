package ru.netology.domain;

public class Post {
    private int id; //идентификатор записи.
    private int ownerId; //идентификатор владельца стены, на которой размещена запись. В версиях API ниже 5.7 это поле называется to_id.
    private int fromId; //идентификатор автора записи (от чьего имени опубликована запись).
    private int createdBy; //идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад.
    private int date; //время публикации записи в формате unixtime.
    private String text; //текст записи.
    private int replayOwnerId; //идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int replayPostId; //идентификатор записи, в ответ на которую была оставлена текущая.
    private int friendsOnly; //1, если запись была создана с опцией «Только для друзей».
    private CommentsInfo commentsInfo; //информация о комментариях к записи
    private String copyright; //источник материала.
    private LikesInfo likesInfo; //информация о лайках к записи.
    private RepostsInfo repostsInfo; //информация о репостах записи («Рассказать друзьям»).
    private Views views; //информация о просмотрах записи.
    private String postType; //	тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private Geo geo; //информация о местоположении
    private int singerId; //идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private int canPin; //информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).
    private int canDelete; //информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может).
    private int canEdit; //информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может).
    private int isPined; //информация о том, что запись закреплена.
    private int markedAsAds; //	информация о том, содержит ли запись отметку "реклама" (1 — да, 0 — нет).
    private boolean isFavorite; //true, если объект добавлен в закладки у текущего пользователя.
    private int postponedId; //идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
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

    public int getReplayOwnerId() {
        return replayOwnerId;
    }

    public void setReplayOwnerId(int replayOwnerId) {
        this.replayOwnerId = replayOwnerId;
    }

    public int getReplayPostId() {
        return replayPostId;
    }

    public void setReplayPostId(int replayPostId) {
        this.replayPostId = replayPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public Views getViews() {
        return views;
    }

    public void setViews(Views views) {
        this.views = views;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
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

    public int getIsPined() {
        return isPined;
    }

    public void setIsPined(int isPined) {
        this.isPined = isPined;
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
