public class Animal implements Action{
    String breath = "Дыхание кислородом";
    @Override
    public void translocation(){
        System.out.println("Передвигается");
    }
    @Override
    public void nutrition(){
        System.out.println("Питается");
    }

}
