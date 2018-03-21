
public class TesteEscopo {
	public static void main(String[] args) {
		double salario = 2000.50;
		if (salario >= 1900.00 && salario <= 2800.00){
			System.out.println("deduzimos R$142,00");
		}else{
			if(salario >= 2800.00 && salario <= 3751.00){
				System.out.println("deduzimos R$350,00");
			}else{
				if (salario >= 3751.00 && salario <= 4664.00){
					System.out.println("deduzimos R$636,00");
				}
			}
		}
	}
	
	
}
