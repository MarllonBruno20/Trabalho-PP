package usuario;

public class Funcionario extends Usuario {
    private Double salario;
    private Double bonus;

    public Funcionario(String nome, String telefone) {
        super(nome, telefone);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public void calcularBonificacao(Double txBonus) {
        this.setBonus(this.salario * txBonus);
    }
}
