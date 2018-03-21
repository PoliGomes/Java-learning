
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(1345, 245347);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(1345, 7654323);
		System.out.println(segundaConta.getSaldo());
	}
}
