package serviço;

public class impostoAcessorioBr implements imposto{

	@Override
	public Double calculaImposto(Double valor) {
		return valor * (0.19);
	}

}
