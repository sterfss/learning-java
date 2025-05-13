public class Main {
    public static void main(String[] args) throws Exception {
        President president1 = new President("Anna Taylor", "111.000.123.23", 20000.500, 1000);

        System.out.println("President's name: " + president1.getName());
        System.out.println("President's cpf: " +  president1.getCpf());
        System.out.println("President's salary: " + president1.getSalary());
        System.out.println("President's stocks: " + president1.getStocks());

    }
}
