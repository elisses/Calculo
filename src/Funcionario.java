
public class Funcionario {
	String nome;
	String departamento;
	double salario;
	String rg;
	boolean estaNaEmpresa;
	
		
	void recebeAumento(double aumento){
			salario = salario+aumento;
		
	}
	
	 double calculaGanhoAnual(){
		 double salarioAnual = salario * 12;
		 return salarioAnual; 
		
	}
	

}
