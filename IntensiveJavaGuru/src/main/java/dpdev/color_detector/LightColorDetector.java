package dpdev.color_detector;

public class LightColorDetector {

    public String detect(int wavelength) {
        if (wavelength < 380 || wavelength > 750) return "Invisible Light";
        if (wavelength >= 380 && wavelength <= 449) return "Violet";
        if (wavelength >= 495 && wavelength <= 569) return "Green";
        if (wavelength >= 570 && wavelength <= 589) return "Yellow";
        if (wavelength >= 590 && wavelength <= 619) return "Orange";
        else return "Red";
    }
}
