public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio Calculadora");

        Calculadora.soma(1,5);
        Calculadora.subtracao(6,11);
        Calculadora.divisao(6,9);
        Calculadora.multiplicacao(3,7);

        System.out.println("Exercicio Mensagem");

        Mensagem.obterMensagem(1);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(9);

        System.out.println("Exercício Empréstimo");

        Emprestimo.calcular(1000,Emprestimo.getNumParcelas());
        Emprestimo.calcular(4500,2);


    }
}
