package N1Ex1;

public class N1Ex1 {

	public static void main (String[]args) {
		
		Venda compra1 = new Venda();
		try {
			compra1.calcularTotal();
		}catch (VendaBuidaException exVB) {
			System.out.println(exVB.getMessage());
		}
	}
}
