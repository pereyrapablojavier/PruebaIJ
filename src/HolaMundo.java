public class HolaMundo {

    /*
    Aca va un comentario
     */
    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        miToString();
    }


    public static void miToString() {
        System.out.println(String.format("Este es mi mensaje: %s", "Hola Mundo"));
    }
}
