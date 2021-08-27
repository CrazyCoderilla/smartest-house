package ru.netology;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RadioTest {
    Radio radio;

    @BeforeAll
    public void init() {
        radio = new Radio();
    }

    @Test
    public void increaseVolumeTest() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());

        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeTest() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void nextStationTest() {
        radio.setStationNumber(0);
        radio.nextStation();
        assertEquals(1, radio.getStationNumber());


        radio.setStationNumber(8);
        radio.nextStation();
        assertEquals(9, radio.getStationNumber());


        radio.nextStation();
        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void prevStationTest() {
        radio.setStationNumber(0);
        radio.prevStation();
        assertEquals(9, radio.getStationNumber());

        radio.prevStation();
        assertEquals(8, radio.getStationNumber());
    }


}