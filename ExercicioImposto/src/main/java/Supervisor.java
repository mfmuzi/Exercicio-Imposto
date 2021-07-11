public class Supervisor extends Funcionarios {

    // entrada do salario
    private double salarioSupervisor;


    public double getSalarioSupervisor () {return salarioSupervisor;}

    @Override
    public void setSalarioSupervisor(double salarioSupervisor) {
        this.salarioSupervisor = salarioSupervisor;
    }
    // calculo do imposto

    public double impostoSupervisor() {
        return this.salarioSupervisor * 0.05;
    }

    // valor do salario

    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        supervisor.setSalarioSupervisor(3545.00);


        // saida
        System.out.println("O salário do supervisor é de: R$" + supervisor.salarioSupervisor);
        System.out.println("O imposto pago pelo supervisor foi de: R$" + supervisor.impostoSupervisor());


    }



}
