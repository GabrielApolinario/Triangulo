import javax.swing.JOptionPane;

public class Triangulo {

	private double lado1;
	private double lado2;
	private double lado3;
	private String nomeTriangulo;

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public void nomeTriangulo() {
		if (lado1 == lado2 && lado2 == lado3) {
			nomeTriangulo = "Equilátero";
		} else if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado2 != lado3) {
			nomeTriangulo = "Isóceles";
		} else if (lado1 != lado2 && lado2 != lado3) {
			nomeTriangulo = "Escaleno";
		} else {
			System.out.println("Este objeto não é um triangulo");

		}

	};

	public void calculaPerimetro() {
		if (eTriangulo() == true) {
			double perimetro = lado1 + lado2 + lado3;
			System.out.println("O perímetro do triangulo " + nomeTriangulo + " é de " + perimetro);
		}

	};

	public void leDados() {
		lado1 = Double.parseDouble(JOptionPane.showInputDialog("Insira aqui o valor para o primeiro lado do Triângulo"));
		lado2 = Double.parseDouble(JOptionPane.showInputDialog("Insira aqui o valor para o segundo lado do Triângulo"));
		lado3 = Double.parseDouble(JOptionPane.showInputDialog("Insira aqui o valor para o terceiro lado do Triângulo"));
		eTriangulo();
		nomeTriangulo();
		calculaPerimetro();
	};

	private boolean eTriangulo() {
		if (lado1 + lado2 > lado3) {
			return true;
		} else {
			return false;
		}

	};

	//public static void CriaTriangulo() {
	//	 resposta = Integer.parseInt(JOptionPane.showInputDialog(null, "1 – Cadastra Triângulo \n2 – Calcula o Perímetro"
	//	  		+ "\n3 – Exibe o nome do triângulo \n4 – Sai do programa", "Menu de Opções", JOptionPane.INFORMATION_MESSAGE));
	//	  if(resposta == 1) {
	//		  Triangulo.leDados();
	//	  } else if(resposta == 2) {
	//		  Triangulo.calculaPerimetro();
	//	  } else if(resposta == 3) {
	//		  Triangulo.eTriangulo();
	//	  } else if(resposta == 4) {
	//		  System.exit(0);
	//	  } else {
	//		  System.out.println("Resposta inválida!");
	//	  }

	//}
}

