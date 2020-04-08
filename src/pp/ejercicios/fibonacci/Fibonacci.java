package pp.ejercicios.fibonacci;

/**
 * Fibonacci series class.
 */
public class Fibonacci {

    public int size;
    public String name;

    /**
     * Overloaded class constructor.
     *
     * @param name : The fibonacci series name.
     * @param size The fibonacci series size.
     */
    public Fibonacci(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Empty class constructor.
     */
    public Fibonacci() {
        //Empty
    }

    /**
     * Method to calculate and show a Fibonacci series.
     */
    public String showSeries() {
        String result = "";
        System.out.println(this.name + ", size:" + this.size);
        for (int i = 0; i < size; i++) {
            result = result.concat(fibonacci(i) + " ");
        }

        return result.trim();
    }

    /**
     * This method calculate recursive Fibonacci series.
     *
     * @param n : Value to use to calculate Fibonacci series.
     * @return : Value Fibonacci series calculated.
     */
    public int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            System.out.println("Value must be  equals to o greater than 0");
            return -1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}