package dpdev.task_TV.bean;

import java.util.Objects;

public class Tv {
    public final int MIN_CHANNEL = 0;
    public final int MAX_CHANNEL = 100;
    public final int MIN_VOLUME = 0;
    public final int MAX_VOLUME = 10;

    private int currentChannel;
    private int currentVolume;
    private String manufacturer;
    private boolean isON;


    public Tv() {
    }

    public Tv(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isON() {
        return isON;
    }

    public void setON(boolean ON) {
        isON = ON;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel && currentVolume == tv.currentVolume && Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, manufacturer);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", manufacturer='" + manufacturer + '\'' +
                ", isON=" + isON +
                '}';
    }
}
