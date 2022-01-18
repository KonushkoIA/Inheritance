public class Fish extends Animal implements Action{
    String eating = "Питаются днём";
    @Override
    public void translocation(){
        System.out.println("Передвигается с помощью плавников");
    }
    @Override
    public void nutrition(){
        System.out.println("Питается меньшими рыбами");
    }
}
