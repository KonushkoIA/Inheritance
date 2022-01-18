public class Mammals extends Animal{
    String eating = "Питаются когда голодные";
    @Override
    public void translocation(){
        System.out.println("Передвигаются при помощи конечностей");
    }
    @Override
    public void nutrition(){
        System.out.println("Питаются подходящей пищей");
    }
}
