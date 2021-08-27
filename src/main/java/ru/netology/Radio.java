package ru.netology;

public class Radio {
    private int stationNumber;
    private int currentVolume;
    private int stationCount;

    public Radio() {
        this.stationCount = 10;
    }

    public Radio(int stationCount) {
        this.stationCount = stationCount;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void nextStation() {
        if (stationNumber == stationCount - 1) {
            setFirstStation();
        } else {
            stationNumber++;
        }
    }

    private void setFirstStation() {
        stationNumber = 0;
    }

    public void prevStation() {
        if (stationNumber == 0) {
            setLastStation();
        } else {
            stationNumber--;
        }
    }

    private void setLastStation() {
        stationNumber = stationCount - 1;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}
