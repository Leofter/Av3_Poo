package serviço;

public class impostoEUA implements imposto{
	@Override
	public Double calculaImposto(Double valor) {
		return valor * (0.18);
	}
}
