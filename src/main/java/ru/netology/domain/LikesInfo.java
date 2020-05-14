package ru.netology.domain;

public class LikesInfo {
    private int count;  //  число пользователей, которым понравилась запись;
    private int[] liked ={0,1}; //  наличие отметки «Мне нравится» от текущего пользователя (1 — есть, 0 — нет);

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int[] getLiked() {
        return liked;
    }

    public void setLiked(int[] liked) {
        this.liked = liked;
    }

    public int[] getCanLike() {
        return canLike;
    }

    public void setCanLike(int[] canLike) {
        this.canLike = canLike;
    }

    public int[] getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int[] canPublish) {
        this.canPublish = canPublish;
    }

    private int[] canLike ={0,1}; //  информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может);
    private int[] canPublish ={0,1}; // информация о том, может ли текущий пользователь сделать репост записи (1 — может, 0 — не может).
}
