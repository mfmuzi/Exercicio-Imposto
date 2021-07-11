public class Atendente extends Funcionarios {

    // entrada do salario
    private double salarioAtendente;


    public double getSalarioAtendente () {return salarioAtendente;}

    @Override
    public void setSalarioAtendente(double salarioAtendente) {
        this.salarioAtendente = salarioAtendente;
    }
    // calculo do imposto

    public double impostoAtendente() {
        return this.salarioAtendente * 0.01;
    }

    // valor do salario

    public static void main(String[] args) {
        Atendente atendente = new Atendente();
        atendente.setSalarioAtendente(2350.00);


        // saida
        System.out.println("O salário do atendente é de: R$" + atendente.salarioAtendente);
        System.out.println("O imposto pago pelo atendente foi de: R$" + atendente.impostoAtendente());


    }



}
