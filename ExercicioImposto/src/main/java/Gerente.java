public class Gerente extends Funcionarios {

    // entrada do salario
    private double salarioGerente;


    public double getSalarioGerente () {return salarioGerente;}

    @Override
    public void setSalarioGerente(double salarioGerente) {
        this.salarioGerente = salarioGerente;
    }
    // calculo do imposto

    public double impostoGerente() {
        return this.salarioGerente * 0.1;
    }

    // valor do salario

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalarioGerente(5145.00);


        // saida
        System.out.println("O salário do gerente é de: R$" + gerente.salarioGerente);
        System.out.println("O imposto pago pelo gerente foi de: R$" + gerente.impostoGerente());


    }



}


