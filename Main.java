package Exercicio2;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.setNome("Ana");
        funcionario1.setSalario(2.500);
        funcionario1.setDataAdmissao(LocalDate.of(2010,10,2));

        System.out.println("Funcionário 1 ");
        System.out.println("Nome: "+funcionario1.getNome());
        System.out.println("Salário: "+ funcionario1.getSalario());
        System.out.println("Data de admissão:"+ funcionario1.getDataAdmissao());
        System.out.println("Número do identificador: " +funcionario1.getIdentificador());
        System.out.println("-----------------------------------------------------------");

        funcionario2.setNome("José");
        funcionario2.setSalario(2000);
        funcionario2.setDataAdmissao(LocalDate.of(2011,3,2));

        System.out.println("Funcionário 2 ");   
        System.out.println("Nome: "+funcionario2.getNome());
        System.out.println("Salário: "+ funcionario2.getSalario());
        System.out.println("Data de admissão:"+ funcionario2.getDataAdmissao());
        System.out.println("Número do identificador: " +funcionario2.getIdentificador());
        System.out.println("-----------------------------------------------------------");

        funcionario3.setNome("Maria");
        funcionario3.setSalario(1000);
        funcionario3.setDataAdmissao(LocalDate.of(2006,5,14));

        System.out.println("Funcionário 3 ");
        System.out.println("Nome: "+funcionario3.getNome());
        System.out.println("Salário: "+ funcionario3.getSalario());
        System.out.println("Data de admissão:"+ funcionario3.getDataAdmissao());
        System.out.println("Número do identificador: " +funcionario3.getIdentificador());
        System.out.println("-----------------------------------------------------------");
    }
}
