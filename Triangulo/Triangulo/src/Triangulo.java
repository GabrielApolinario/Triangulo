import javax.swing.JOptionPane;

public class Triangulo {
	 
	private static double lado1;
	private static double lado2;
	private static double lado3;
	 private static String nomeTriangulo;


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

	public static void nomeTriangulo(){
		if(lado1 == lado2 && lado2 == lado3){
		  nomeTriangulo = "Equilátero";
		} else if(lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado2 != lado3){
		  nomeTriangulo = "Isóceles";
		} else if(lado1 != lado2 && lado2 != lado3) {
		  nomeTriangulo = "Escaleno";
		} else { System.out.println("Este objeto não é um triangulo");

		}

	  };

	  public static void calculaPerimetro(){
		if (eTriangulo() == true) {
		double perimetro = lado1 + lado2 + lado3;
		System.out.println("O perímetro do triangulo " + nomeTriangulo + " é de " + perimetro);
		}

	  };

	  public void leDados(){
		lado1 = Double.parseDouble(JOptionPane.showInputDialog("Insira aqui o valor para o primeiro lado do Triângulo"));
		lado2 = Double.parseDouble(JOptionPane.showInputDialog("Insira aqui o valor para o segundo lado do Triângulo"));
		lado3 = Double.parseDouble(JOptionPane.showInputDialog("Insira aqui o valor para o terceiro lado do Triângulo"));
		Triangulo.eTriangulo();
		Triangulo.nomeTriangulo();
		Triangulo.calculaPerimetro();
	  };

	  private static boolean eTriangulo(){
		if(lado1 + lado2 > lado3){
		 return true;
		} else {return false;}
			
		
	  

	  };
	 //Terminar exercicio
	  public void CriaTriangulo() {
		 String resposta = "";
		  Triangulo triangulo1 = new Triangulo();
		  resposta = JOptionPane.showInputDialog("      MENU\n 1- Cadastra Triangulo");
	  }
	
	
}
