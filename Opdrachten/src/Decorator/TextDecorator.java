package Decorator;

/**
 * Created by Halil Teker on 6/25/2017.
 */
abstract class TextDecorator extends StringFromFileComponent {
    protected StringFromFileComponent str;

    public TextDecorator(StringFromFileComponent str){
        this.str = str;
    }

    public String get(){
        return str.get();
    }
}
