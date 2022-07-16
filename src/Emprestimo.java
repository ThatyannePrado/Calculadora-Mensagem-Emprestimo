public class Emprestimo {
    public static int getNumParcelas(){
        return 5;
    }

    public static double getTxDuasParcelas(){
        return 0.2;
    }

    public static double getTxCincoParcelas(){
        return 0.6;
    }

    public static void calcular(double valor, int parcelas){
        if (parcelas == 2) {
            double valorFinal = valor*(1+getTxDuasParcelas());
            System.out.println("O valor final para empréstimo em 2 parcelas é de: R$ "+valorFinal);
        } else if (parcelas == 5) {
            double valorFinal = valor*(1+getTxCincoParcelas());
            System.out.println("O valor final para empréstimo em 5 parcelas é de: R$ "+valorFinal);
        } else {
            System.out.println("Valor de parcela não aceito.");
        }

    }
}
