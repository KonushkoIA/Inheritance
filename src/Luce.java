public class Luce extends Fish implements Action{
    String lines = "Раскраска в полосы";
    @Override
    public void translocation(){
        System.out.println("Передвигается в поисках пищи на небольшие расстояния");
    }
    @Override
    public void nutrition(){
        System.out.println("Питается плотью");
    }
}
