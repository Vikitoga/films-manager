package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfficheOneFilmTest {
    private Movie first = new Movie(1, "Дюна", "#link", "Фантастика", false);

    @Test
    public void shouldAddFilm() {
        Affiche manager = new Affiche();
        manager.add(first);
        int actual = manager.getFilms().length;
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsDefault() {
        Affiche manager = new Affiche();
        manager.add(first);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsWithLimit() {
        Affiche manager = new Affiche(5);
        manager.add(first);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsOverLimit() {
        Affiche manager = new Affiche(15);
        manager.add(first);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }
}