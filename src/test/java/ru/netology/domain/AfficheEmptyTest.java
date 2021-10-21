package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfficheEmptyTest {
    @Test
    public void shouldShowLastFilmsDefault() {
        Affiche manager = new Affiche();
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsWithLimit() {
        Affiche manager = new Affiche(5);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsOverLimit() {
        Affiche manager = new Affiche(11);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[0];
        assertArrayEquals(expected, actual);
    }
}