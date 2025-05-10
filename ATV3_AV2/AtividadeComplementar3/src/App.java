public class App {
    public static void main(String[] args) throws Exception {
        Ingresso[] ingressos = new Ingresso[4];
        ingressos[0] = new IngressoComum("Ingresso Comum", true, 40.0, 1);
        ingressos[1] = new IngressoVip("Ingresso VIP", false, 150.0, 1);
        ingressos[2] = new IngressoVip("Ingresso VIP", true, 150.0, 1);
        ingressos[3] = new IngressoComum("Ingresso Comum", false, 40.0, 2);

        for (Ingresso ingresso : ingressos) {
            System.out.println("Nome: " + ingresso.nome);
            System.out.println("Meia Entrada: " + ingresso.ehMeia);
            System.out.println("Valor: " + ingresso.valor);
            System.out.println("Lote: " + ingresso.lote);
            System.out.println("Reembolso: " + ingresso.calcularReembolso());
        }
    }
}