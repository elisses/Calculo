
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Alan";
		f1.salario = 1000;
		f1.recebeAumento(50);
		
		System.out.println("Salario atual:"+ f1.salario);
		System.out.println("Ganho Anual:"+ f1.calculaGanhoAnual());

	}

}
