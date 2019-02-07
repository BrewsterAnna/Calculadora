package calculadora3;
import java.util.Scanner;

public class Calculadora3 {

   
    public static void main(String[] args) {
        final int FIM = 0;
        int operacao;
        double result;
        
        operacao = Menu();
        while (operacao!=FIM){
            Calcula(operacao);
            operacao = Menu();
        }
        
    }
    public static double LeOperando(String msg){
        double op;
        Scanner ler = new Scanner (System.in);
        
        System.out.print(msg);
        op = ler.nextDouble();
            
        return op;
    }
    public static void Calcula (int operacao){
        double op1, op2,result = 0;
        
        
        op1 = LeOperando("Entre com o operando 1: ");
        op2 = LeOperando("Entre com o operando 2: ");
        switch (operacao) {
            case 1:
                result = op1 + op2;
                System.out.println("Resultado = "+ result);
                break;
            case 2:
                result = op1 - op2;
                System.out.println("Resultado = "+ result);
                break;
            case 3:
                result = op1 * op2;
                System.out.println("Resultado = "+ result);
                break;
            case 4:
                if (op2!=0){
                    result = op1 / op2;
                    System.out.println("Resultado = "+ result);
                }
                else {
                    System.out.println("Erro: divisão por zero");
                }
                break;
            }
        }
    public static int Menu(){
        int operacao;
        Scanner ler = new Scanner (System.in);
        
        do {
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.println("Escolha a operação: ");
            operacao = ler.nextInt();
            if ((operacao<0) || (operacao>4)) {
            System.out.println("Erro: operação inválida");
            }
        } while ((operacao<0) || (operacao>4));
        return operacao;
    }
}
