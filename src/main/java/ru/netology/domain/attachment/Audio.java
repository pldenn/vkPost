package ru.netology.domain.attachment;

public class Audio {
    private int id; // идентификатор.
    private int ownerId; // идентификатор владельца.
    private String artist; // исполнитель.
    private String title; // название.
    private int duration; // длительность аудиозаписи в секундах.
    private String url; // ссылка на mp3.
    private int lyricsId; // идентификатор текста аудиозаписи (если доступно).
    private int albumId; // идентификатор альбома, в котором находится аудиозапись (если присвоен).
    private int genre_id; // идентификатор жанра из списка аудио жанров.
    private int date; // дата добавления.
    private int[] noSearch; //1, если включена опция «Не выводить при поиске». Если опция отключена, поле не возвращается.
    private int[] isH; //1, если аудио в высоком качестве.

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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(int lyricsId) {
        this.lyricsId = lyricsId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int[] getNoSearch() {
        return noSearch;
    }

    public void setNoSearch(int[] noSearch) {
        this.noSearch = noSearch;
    }

    public int[] getIsH() {
        return isH;
    }

    public void setIsH(int[] isH) {
        this.isH = isH;
    }
}

