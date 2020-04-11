package lpoo;

public class amais {
	    public static void main(String[] args) {
	        Gerente gerente = new Gerente();
	        gerente.setSalario(300);
	        System.out.println(gerente.getBonificacao());
	    }
	}

	class Gerente extends Funcionario {
	    int senha;
	    int numeroDeFuncionariosGerenciados;

	    public double getBonificacao() {
	        return this.salario * 0.015;
	    }
	}

	class Funcionario {
	    protected String nome;
	    protected String cpf;
	    protected double salario;

	    public double getBonificacao() {
	        return this.salario * 00.150;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }
	}



