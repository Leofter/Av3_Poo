package serviço;

import entidades.Jogos;
import entidades.Console;
import entidades.Acessorios;
import entidades.Produto;

public class servicoimposto {
	
private imposto imposto;

public servicoimposto(serviço.imposto imposto) {
	
	this.imposto = imposto;
}

public imposto getImposto() {
	return imposto;
}

public void setImposto(imposto imposto) {
	this.imposto = imposto;
}

public void processaimposto(Double preco) {
	double valorImposto = imposto.calculaImposto(preco);
	
}

}
