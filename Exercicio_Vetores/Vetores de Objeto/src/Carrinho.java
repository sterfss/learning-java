public class Carrinho {
    public Produto[] produtos;
    public int limiteCarrinho;

    //Construtor de carrinho para instanciar determinado carrinho "c" na MAIN
    public Carrinho(int qtd){
        this.produtos = new Produto[qtd];
        this.limiteCarrinho = qtd;
    }


    // Método para retornar quantas posições estão preenchidas: 
    // 1) definimos o retorno do método como um inteiro e uma variavel de valor zero para receber o total de espaços preenchidos do carrinho;
    // 2) criamos um for para percorrer o tamanho do array, e criamos uma estrutura condicional da seguinte forma: 
    // se determinada posição "i" for diferente de nulo, então o retorno é incrementado
    // 3) Definimos o que a função irá retornar (no caso, a variável "retorno")
    public int totalPreenchido(){
        int retorno = 0;
        for (int i=0; i<produtos.length; i++) {
            if(produtos[i] != null){
                retorno++;
            }
        }
        return retorno;
    }
    // Método para adicionar produtos ao carrinho:
    // 1) Adicionamos um parâmetro à função de quem será adicionado (nesse caso, "p");
    // 2) Criamos uma estrutura condicional da seguinte forma: 
    // se o a função "totalPreenchido" retornar um valor menor que o limite definido - 
    // para o determinado carrinho, então o produto "p" ocupará a posição igual ao total preenchido;
    public void adicionarProduto(Produto p){
        if(totalPreenchido()<this.limiteCarrinho){
            produtos[totalPreenchido()] = p;
        }else{
            System.out.println("Carrinho cheio");
        }
    }
    //Método para listar as informações de cada produto que ocupa um índice:
    //1) Criamos um for para percorrer o array produtos, que durará de acordo com-
    // o comprimento do próprio array (length);
    //2) criamos uma estrutura condicional dentro desse for da seguinte forma:
    // se o produto da posição "i" for diferente de nulo, então ele retornará -
    // o método "informaçõesProduto" para o produto da posição "i".  
    public void listarProdutos(){
        for(int i=0; i<produtos.length; i++){
            if(produtos[i] != null){
                produtos[i].informacoesProduto();
            }
        }
    }
    //Método para verificar quais produtos tem o peso > 10 e o valor < 50:
    //1) Criamos uma variavel (inteira) de valor zero para receber o total do que precisamos.
    //2) Criamos um for para percorrer o comprimento do array, e dentro dele a seguinte estrutura condicional:
    // se o peso do produto na posição "i" for > 10 e o valor desse mesmo produto for < 50,-
    // então o inteiro retorno é incrementado em 1;
    //3) o método retorna, para os produtos com o teste if positivo, as informações do mesmo e-
    // o inteiro retorno.
    public int qtdPesoMaior10ValorMenor50(){
        int retorno = 0;
        for(int i=0;i<produtos.length;i++){
            if(produtos[i].peso>10&&produtos[i].valor<50){
                retorno += 1; 
                produtos[i].informacoesProduto();
            }
    }
    return retorno;
}
}
