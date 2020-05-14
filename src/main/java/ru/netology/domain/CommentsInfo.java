package ru.netology.domain;

public class CommentsInfo {
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int[] getCanPost() {
        return canPost;
    }

    public void setCanPost(int[] canPost) {
        this.canPost = canPost;
    }

    public int[] getGroupCanPost() {
        return groupCanPost;
    }

    public void setGroupCanPost(int[] groupCanPost) {
        this.groupCanPost = groupCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    private int count; // число комментариев
    private int[] canPost ={0,1};  // информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может);
    private int[] groupCanPost ={0,1}; //информация о том, могут ли сообщества комментировать запись;
    private boolean canClose; // может ли текущий пользователь закрыть комментарии к записи;
    private boolean canOpen; //может ли текущий пользователь открыть комментарии к записи.

}
