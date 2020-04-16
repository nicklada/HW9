package ru.netology.domain.ru.netology.domain.ru.netology.domain;

public class Geo {
    private String type;
    private String coordinates;
    private Place Place;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public ru.netology.domain.ru.netology.domain.ru.netology.domain.Place getPlace() {
        return Place;
    }

    public void setPlace(ru.netology.domain.ru.netology.domain.ru.netology.domain.Place place) {
        Place = place;
    }
}
