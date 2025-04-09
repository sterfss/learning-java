import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtos;
    public int limiteCarrinho;

    public Carrinho(int limiteCarrinho){
        this.produtos = new ArrayList<>();
        this.limiteCarrinho = limiteCarrinho;
    }

    public int totalPreenchido(){
        return produtos.size();
    }


    public void adicionarProduto(Produto p){
        if(produtos.size()<this.limiteCarrinho){
            produtos.add(p);
        }else{
            System.out.println("Carrinho cheio");
        }
    }
  
    public void listarProdutos(){
        for (Produto produto : produtos){
            produto.informacoesProduto();
        }
    }
 
    public int qtdPesoMaior10ValorMenor50(){
        int contador = 0;
        for (Produto produto : produtos){
            if(produto.peso > 10 && produto.valor < 50){
                contador++;
            }
        }

        return contador;
}

}