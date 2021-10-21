package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfficheTestFull {
    private Affiche manager = new Affiche();
    private Movie first = new Movie(1, "Дюна", "#link", "Фантастика", false);
    private Movie second = new Movie(2, "Неисправимый Рон", "#link", "Мультфильм", true);
    private Movie third = new Movie(3, "Не время умирать", "#link", "Боевик", false);
    private Movie fourth = new Movie(4, "Веном 2", "#link", "Боевик", false);
    private Movie fifth = new Movie(5, "Исчезнувший", "#link", "Триллер", false);
    private Movie sixth = new Movie(6, "Хэллоуин убивает", "#link", "Ужасы", false);
    private Movie seventh = new Movie(7, "Эйфель", "#link", "Драма", false);
    private Movie eighth = new Movie(8, "Монстры на каникулах", "#link", "Мультфильм", false);
    private Movie ninth = new Movie(9, "Демоник", "#link", "Ужасы", false);
    private Movie tenth = new Movie(10, "Суперзвезда", "#link", "Драма", false);
    private Movie eleventh = new Movie(11, "В джазе только девушки", "#link", "Комедия", false);

   @Test
    public void shouldAddFilm() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        int actual = manager.getFilms().length;
        int expected = 10;
        assertEquals(expected, actual);
    }

   @Test
    public void shouldShowLastFilmsDefault() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

}