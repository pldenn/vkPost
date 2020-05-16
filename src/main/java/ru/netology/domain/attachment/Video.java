package ru.netology.domain.attachment;

public class Video {
    private int id; // идентификатор.
    private int ownerId; // идентификатор владельца.
    private String title; // название видеозаписи.
    private String description; // текст описания видеозаписи.
    private int duration; // длительность ролика в секундах.
    private String photo130; // URL изображения-обложки ролика с размером 130x98 px.
    private String photo320; // URL изображения-обложки ролика с размером 320x240 px.
    private String photo640; // URL изображения-обложки ролика с размером 640x480 px (если размер есть).
    private String photo800; // URL изображения-обложки ролика с размером 800x450 px (если размер есть).
    private String photo1280; // URL изображения-обложки ролика с размеро
    private String firstFrame130; // URL изображения первого кадра ролика с размером 130x98 px.
    private String firstFrame320; //URL изображения первого кадра ролика с размером 320x240 px.
    private String firstFrame640; //URL изображения первого кадра ролика с размером 640x480 px (если размер есть).
    private String firstFrame800; //URL изображения первого кадра ролика с размером 800x450 px (если размер есть).
    private String firstFrame1280; //URL изображения первого кадра ролика с шириной до 1028 px (если размер есть).
    private int date; // дата создания видеозаписи в формате Unixtime
    private int addingDate; // дата добавления видеозаписи пользователем или группой в формате Unixtime.
    private int views; // количество просмотров видеозаписи.
    private int comments; //количество комментариев к видеозаписи.
    private String player; //URL страницы с плеером, который можно использовать для воспроизведения ролика в браузере. Поддерживается flash и html5, плеер всегда масштабируется по размеру окна.
    private String platform; //название платформы (для видеозаписей, добавленных с внешних сайтов).
    private int[] canEdit; //поле возвращается, если пользователь может редактировать видеозапись, всегда содержит 1.
    private int[] canAdd; //1, если пользователь может добавить видеозапись к себе.
    private int[] isPrivate; //поле возвращается, если видеозапись приватная (например, была загружена в личное сообщение), всегда содержит 1.
    private String accessKey; //название платформы (для видеозаписей, добавленных с внешних сайтов).
    private int[] processing; //поле возвращается в том случае, если видеоролик находится в процессе обработки, всегда содержит 1.
    private int[] live; //поле возвращается в том случае, если видеозапись является прямой трансляцией, всегда содержит 1. Обратите внимание, в этом случае в поле duration содержится значение 0.
    private int[] upcoming; //(для live = 1). Поле свидетельствует о том, что трансляция скоро начнётся.

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPhoto130() {
        return photo130;
    }

    public void setPhoto130(String photo130) {
        this.photo130 = photo130;
    }

    public String getPhoto320() {
        return photo320;
    }

    public void setPhoto320(String photo320) {
        this.photo320 = photo320;
    }

    public String getPhoto640() {
        return photo640;
    }

    public void setPhoto640(String photo640) {
        this.photo640 = photo640;
    }

    public String getPhoto800() {
        return photo800;
    }

    public void setPhoto800(String photo800) {
        this.photo800 = photo800;
    }

    public String getPhoto1280() {
        return photo1280;
    }

    public void setPhoto1280(String photo1280) {
        this.photo1280 = photo1280;
    }

    public String getFirstFrame130() {
        return firstFrame130;
    }

    public void setFirstFrame130(String firstFrame130) {
        this.firstFrame130 = firstFrame130;
    }

    public String getFirstFrame320() {
        return firstFrame320;
    }

    public void setFirstFrame320(String firstFrame320) {
        this.firstFrame320 = firstFrame320;
    }

    public String getFirstFrame640() {
        return firstFrame640;
    }

    public void setFirstFrame640(String firstFrame640) {
        this.firstFrame640 = firstFrame640;
    }

    public String getFirstFrame800() {
        return firstFrame800;
    }

    public void setFirstFrame800(String firstFrame800) {
        this.firstFrame800 = firstFrame800;
    }

    public String getFirstFrame1280() {
        return firstFrame1280;
    }

    public void setFirstFrame1280(String firstFrame1280) {
        this.firstFrame1280 = firstFrame1280;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAddingDate() {
        return addingDate;
    }

    public void setAddingDate(int addingDate) {
        this.addingDate = addingDate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int[] getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int[] canEdit) {
        this.canEdit = canEdit;
    }

    public int[] getCanAdd() {
        return canAdd;
    }

    public void setCanAdd(int[] canAdd) {
        this.canAdd = canAdd;
    }

    public int[] getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(int[] isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public int[] getProcessing() {
        return processing;
    }

    public void setProcessing(int[] processing) {
        this.processing = processing;
    }

    public int[] getLive() {
        return live;
    }

    public void setLive(int[] live) {
        this.live = live;
    }

    public int[] getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(int[] upcoming) {
        this.upcoming = upcoming;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    private boolean isFavorite; //true, если объект добавлен в закладки у текущего пользователя.
}

