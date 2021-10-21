package ru.netology.domain;

public class Movie {
    private int id;
    private String name;
    private String imageURL;
    private String genre;
    private boolean premiereTomorrow;

    public Movie(){

    }

    public Movie(int id, String name, String imageURL, String genre, boolean premiereTomorrow){
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.genre = genre;
        this.premiereTomorrow = premiereTomorrow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isPremiereTomorrow() {
        return premiereTomorrow;
    }

    public void setPremiereTomorrow(boolean premiereTomorrow) {
        this.premiereTomorrow = premiereTomorrow;
    }


}
