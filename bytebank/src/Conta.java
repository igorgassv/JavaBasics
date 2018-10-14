public class Conta {
	double saldo;
	int agencia;
	int conta;
	String titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (saldo < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		else
		{
			return false;
		}
	}
}