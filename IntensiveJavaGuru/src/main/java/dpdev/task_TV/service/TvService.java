package dpdev.task_TV.service;

import dpdev.task_TV.bean.Tv;
import dpdev.task_TV.exceptions.TvException;

public class TvService {
    private Tv tv;

    public TvService(Tv tv) {
        this.tv = tv;
    }

    public void switchChannelUp() {
        if (tv.isON()) {
            if (tv.getCurrentChannel() == tv.MAX_CHANNEL)
                tv.setCurrentChannel(tv.MIN_CHANNEL);
            else
                tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        } else throw new TvException("Tv isn't on!");
    }

    public void switchChannelDown() {
        if (tv.isON()) {
            if (tv.getCurrentChannel() == tv.MIN_CHANNEL)
                tv.setCurrentChannel(tv.MAX_CHANNEL);
            else tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        } else throw new TvException("Tv isn't on!");
    }

    public void switchVolumeUp() {
        if (tv.isON()) {
            if (tv.getCurrentVolume() != tv.MAX_VOLUME)
                tv.setCurrentVolume(tv.getCurrentVolume() + 1);
        } else throw new TvException("Tv isn't on!");
    }

    public void switchVolumeDown() {
        if (tv.isON()) {
            if (tv.getCurrentVolume() != tv.MIN_VOLUME)
                tv.setCurrentVolume(tv.getCurrentVolume() - 1);
        } else throw new TvException("Tv isn't on!");
    }

    public void turnOnTv() {
        tv.setON(true);
    }

    public void turnOffTv() {
        tv.setON(false);
    }
}
