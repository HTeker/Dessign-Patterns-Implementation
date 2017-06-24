package Adapter;

/**
 * Created by Halil Teker on 6/24/2017.
 */
class DieHardIIIBR implements BluRayDisc {
    @Override
    public String getData() {
        return "Now, Bruce Willes takes his gun and ......";
    }
    @Override
    public void burn(String data) {
        System.out.println("Adding movie extras to the disc.....");
    }
}
