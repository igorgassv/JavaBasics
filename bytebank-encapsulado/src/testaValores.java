
public class testaValores {
	public static void main(String[] args) {
		Conta conta1 = new Conta(1445, 1187);
		Conta conta2 = new Conta(1445, 1137);
		Conta conta3 = new Conta(1445, 112);
		
		System.out.println(Conta.getTotal());
	}
}
