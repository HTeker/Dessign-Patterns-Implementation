package Decorator;

/**
 * Created by Halil Teker on 6/25/2017.
 */
public class App {
    public static void main(String[] args){
        StringFromFileComponent str = new StringFromFileComponent();
        System.out.println(str.get());

        StringFromFileComponent str2 = new GetalTekstDecorator(str);
        System.out.println(str2.get());

        StringFromFileComponent str3 = new HoofdLetterDecorator(str2);
        System.out.println(str3.get());
    }
}
