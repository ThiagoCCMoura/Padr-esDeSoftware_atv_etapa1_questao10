package atv_etapa1_questao10;

public class Funcionario {
	private int id;
	private String nome;
	private Cargo cargo;
	private double salarioBase;
	private double salarioBonus;
	private Conta conta;

	public double calculaGratificao() {
		return cargo.getGratificao().calcula(this);
	}

	public double getSalarioMaisGratificacao() {
		return salarioBase + this.calculaGratificao();
	}

	public void recebeSalario() {
		this.conta.recebeDeposito(getSalarioMaisGratificacao());
	}

	// getters e setters
	public double getSalarioCompplementar() {
		// TODO Auto-generated method stub
		return 0;
	}
}
