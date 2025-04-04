public class Main {
    public static void main(String[] args) throws Exception {
        Produto p1 =  new Produto("001", 2.5,10.5);
        Produto p2 =  new Produto("002", 15.2, 20.5);
        Produto p3 = new Produto("003", 3.5, 55.2);
        
        p1.informacoesProduto();
    }
}
