public class App {
    public static void main(String[] args) throws Exception {

        Bolsista b1 = new Bolsista("Clebinho", "123.456.789-10", 123, true);
        Bolsista b2 = new Bolsista("Claudinho", "133.444.555-69", 233, false);

        b1.mostrar();
        b2.mostrar();

    }
}
