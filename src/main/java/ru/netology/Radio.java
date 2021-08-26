package ru.netology;

public class Radio {
    private int stationNumber;
    private int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }

    public void nextStation() {
        if (stationNumber == 9) {
            setFirstStation();
        } else {
            stationNumber += 1;
        }
    }

    private void setFirstStation() {
        stationNumber = 0;
    }

    public void prevStation() {
        if (stationNumber == 0) {
            setLastStation();
        } else {
            stationNumber -= 1;
        }
    }

    private void setLastStation() {
        stationNumber = 9;
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
