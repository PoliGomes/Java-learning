
public class TestandoMetodo {
	
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta(3465, 654567);
		Conta contaDaPaula = new Conta(2341, 654322);
		contaDoPaulo.setTitular(new Cliente());
		contaDoPaulo.getTitular().nome = "Paulo";
		
		System.out.println(contaDoPaulo.getTitular().nome);
		
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.getSaldo());
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.getSaldo());
		System.out.println(conseguiuRetirar);
		
		contaDaPaula.deposita(5000);
		if((contaDaPaula.transfere(700, contaDoPaulo)) == true) {
			System.out.println("Transferência realizada com sucesso");
		}else{
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(contaDoPaulo.getSaldo());
		
		Cliente poliana = new Cliente();
		poliana.nome = "Poliana Gomes";
		poliana.cpf = "222.222.222-22";
		poliana.profissao = "programadora";
		
		Conta contaDaPoliana = new Conta(1234, 876544);
		contaDaPoliana.setTitular(poliana);
		contaDaPoliana.deposita(8000);
		System.out.println(contaDaPoliana.getSaldo());
		
	}
}
