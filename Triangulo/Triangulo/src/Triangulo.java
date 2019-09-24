import javax.swing.JOptionPane;

public class Triangulo {

	private static double lado1;
	private static double lado2;
	private static double lado3;
	private static String nomeTriangulo;
	private static int resposta;

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

	public static void nomeTriangulo() {
		if (lado1 == lado2 && lado2 == lado3) {
			nomeTriangulo = "Equil�tero";
		} else if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado2 != lado3) {
			nomeTriangulo = "Is�celes";
		} else if (lado1 != lado2 && lado2 != lado3) {
			nomeTriangulo = "Escaleno";
		} else {
			System.out.println("Este objeto n�o � um triangulo");

		}

	};

	public static void calculaPerimetro() {
		if (eTriangulo() == true) {
			double perimetro = lado1 + lado2 + lado3;
			System.out.println("O per�metro do triangulo " + nomeTriangulo + " � de " + perimetro);
		}

	};

	public static void leDados() {
		lado1 = Double
				.parseDouble(JOptionPane.showInputDialog("Insira aqui o valor para o primeiro lado do Tri�ngulo"));
		lado2 = Double.parseDouble(JOptionPane.showInputDialog("Insira aqui o valor para o segundo lado do Tri�ngulo"));
		lado3 = Double
				.parseDouble(JOptionPane.showInputDialog("Insira aqui o valor para o terceiro lado do Tri�ngulo"));
		Triangulo.eTriangulo();
		Triangulo.nomeTriangulo();
		Triangulo.calculaPerimetro();
	};

	private static boolean eTriangulo() {
		if (lado1 + lado2 > lado3) {
			return true;
		} else {
			return false;
		}

	};

	public static void CriaTriangulo() {
		 resposta = Integer.parseInt(JOptionPane.showInputDialog(null, "1 � Cadastra Tri�ngulo \n2 � Calcula o Per�metro"
		  		+ "\n3 � Exibe o nome do tri�ngulo \n4 � Sai do programa", "Menu de Op��es", JOptionPane.INFORMATION_MESSAGE));
		  if(resposta == 1) {
			  Triangulo.leDados();
		  } else if(resposta == 2) {
			  Triangulo.calculaPerimetro();
		  } else if(resposta == 3) {
			  Triangulo.eTriangulo();
		  } else if(resposta == 4) {
			  System.exit(0);
		  } else {
			  System.out.println("Resposta inv�lida!");
		  }
		  while(resposta != 4)
		  {
			  resposta = Integer.parseInt(JOptionPane.showInputDialog(null, "1 � Cadastra Tri�ngulo \n2 � Calcula o Per�metro"
				  		+ "\n3 � Exibe o nome do tri�ngulo \n4 � Sair do programa", "Menu de Op��es", JOptionPane.INFORMATION_MESSAGE));
		  } 
	}
}

