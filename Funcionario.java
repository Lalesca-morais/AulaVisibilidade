package Exercicio2;
import java.time.LocalDate;
public class Funcionario {
    private String nome;
    private LocalDate dataAdmissao;
    private double salario;
    static int identificador = 20;
    public String getNome () {
        return nome;
    }
    public void setNome(String nome) {
         this.nome = nome;
    }
    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(LocalDate dataAdmissao) {
        if (dataAdmissao.isAfter (LocalDate.now())) {
            System.out.println("Data futura não é permitida!");
        }else {
            this.dataAdmissao = dataAdmissao;
        }
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
        if (salario < 700) {
            System.out.println("Não é permitido adicionar um salário inferior a R$ 700,00.");
        }
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
