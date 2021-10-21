package ru.netology.domain;

public class Affiche {
    private Movie[] films = new Movie[0];
    private int limit;

    public int getLimit() {
        return limit;
    }

    public Movie[] getFilms() {
        return films;
    }

    public Affiche() {
        this.limit = 10;
    }

    public Affiche(int limit) {
        if (limit <= 0) {
            this.limit = 10;
        } else {
            this.limit = limit;
        }
    }

    public void add(Movie newMovie) {
        int newLength = films.length + 1;
        Movie[] newArray = new Movie[newLength];

        for (int i = 0; i < films.length; i++) {
            newArray[i] = films[i];
        }
        int lastIndex = newLength - 1;
        newArray[lastIndex] = newMovie;
        films = newArray;
    }

    public Movie[] showLastFilms() {
        int resultLength;
        if (this.getLimit() > films.length) {
            resultLength = films.length;
        } else {
            resultLength = this.getLimit();
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
