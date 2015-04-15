class Triangle {

	int n;

	public Triangle (int number){
		this.n = number;
	}

	public void oneAsterisk() {
		//Easiest exercise ever
		System.out.println("");
		System.out.print("*");
	}

	public void horizontalLine() {
		//Draw a horizontal line
		System.out.println("");

		for ( int x = 0; x < n; x++ ) {
			System.out.print("*");
		}
	}

	public void verticalLine() {
		//Draw a verical line
		System.out.println("");
		for ( int x = 0; x < n; x++ ) {
			System.out.println("*");
		}
	}

	public void rightTriangle() {
		System.out.println("");

		for ( int x = 0; x < n; x++) {
			for ( int y = -1; y < x; y++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}