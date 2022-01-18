public class Dace extends Fish implements Action{
    String eyes = "Имеют два глаза";
    @Override
    public void translocation(){
        System.out.println("Передвигается в поисках пищи повсюду");
    }
    @Override
    public void nutrition(){
        System.out.println("Питается только растительной пищей");
    }
}
