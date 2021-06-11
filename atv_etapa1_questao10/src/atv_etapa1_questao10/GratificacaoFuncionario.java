package atv_etapa1_questao10;

public class GratificacaoFuncionario implements Gratificacao {
	
	@Override
	public double calcula(Funcionario funcionario) {
		return funcionario.getSalarioCompplementar();
	}

}
