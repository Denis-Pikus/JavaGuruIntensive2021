package dpdev.encoder;

public class Encoder {
    public void encode(short code){
        System.out.println((char) code);
    }

    public void decode(char symbol){
        System.out.println((short) symbol);
    }
}
