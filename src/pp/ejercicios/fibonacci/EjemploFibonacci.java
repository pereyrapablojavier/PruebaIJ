package pp.ejercicios.fibonacci;

/**
 * @author Carlos
 */
public class EjemploFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fibonacci f1 = new Fibonacci("fibonacci 1", 10);
        System.out.println(f1.showSeries());

        Fibonacci f2 = new Fibonacci();
        f2.setName("fibonacci 2");
        f2.setSize(10);
        System.out.println(f2.showSeries());
    }
}