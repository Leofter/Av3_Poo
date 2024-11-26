package serviço;

public class impostoConsoleBr implements imposto{

	@Override
	public Double calculaImposto(Double valor) {
		return valor*(0.25);
	}

}
