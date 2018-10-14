
public class testaMetodo {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();

		primeiraConta.deposita(200);
		
		boolean retirar = primeiraConta.saca(200);
		System.out.println(retirar);
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(600);
		
		segundaConta.transfere(300, primeiraConta);
		System.out.println(segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
	}

}
