public class Div implements Math{

    @Override
    public void action(int a, int b) {
        System.out.println((double) a / b );
    }
}