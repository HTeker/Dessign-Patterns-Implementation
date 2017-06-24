package Decorator;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class GetalTekstDecorator extends TextDecorator {
    public GetalTekstDecorator(StringFromFileComponent str) {
        super(str);
    }

    @Override
    public String get(){
        return str.get()
                .replace("2", "twee")
                .replace("3", "drie");
    }
}
