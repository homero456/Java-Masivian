
public class Printer implements IPrinter {

	private int cantPrimes; //cantidad de numeros primos
	private int cantRows; // Numero de filas
	private int cantColumns; // Numero de columnas
	private int list[]; //Array de numero primos

	public Printer(int cantRows, int cantColumns,int list[]) {
		this.cantColumns = cantColumns;
		this.cantRows = cantRows;
		this.list = list;
	}

	public void Print() {
		this.cantPrimes = list.length - 1;
		int pageNumber = 1;
		int pageOffSet = 0;
		PrintTitle();
		while (pageOffSet <= cantPrimes) {
			PrintHeader(pageNumber);
			PrintBody(pageOffSet);
			PrintFoot();
			pageNumber++;
			pageOffSet += cantRows * cantColumns;
		}
	}
	
	public void PrintTitle() {
		System.out.print(" The First ");
		System.out.print(Integer.toString(cantPrimes + 1));
		System.out.println("\n");
	}

	public void PrintHeader(int pageNumber) {
		
		System.out.print(" Prime Numbers === Page ");
		System.out.print(Integer.toString(pageNumber));
		System.out.println("\n");
	}

	public void PrintBody(int pageOffSet) {
		int rowOffSet;
		for (rowOffSet = pageOffSet; rowOffSet <= pageOffSet + cantRows - 1; rowOffSet++) {
			for (int col = 0; col <= cantColumns - 1; col++) {
				if (rowOffSet + col * cantRows <= cantPrimes) {
					System.out.printf("%10d", list[rowOffSet + col * cantRows]);
				}
			}
			System.out.println();
		}
	}

	public void PrintFoot() {
		System.out.println(" end page");
	}

}