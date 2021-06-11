package atv_etapa1_questao10;

public enum Cargo {
	
	FUNCIONARIO_NORMAL(new GratificacaoFuncionario()), 
	CHEFE(new GratificacaoFuncionario()),
	ESTAGIARIO(new GratificacaoFuncionario());

	private GratificacaoFuncionario gratificao;

	private Cargo(GratificacaoFuncionario gratificacaoFuncionario) {
		this.gratificao = gratificacaoFuncionario;
	}

	public GratificacaoFuncionario getGratificao() {
		return gratificao;
	}
}
