class Diamond {

	int n;

	public Diamond (int number){
		this.n = number;
	}

	public void isoscelesTriangle() {
		System.out.println("");

		for ( int x = 0; x < n; x++) {
			for ( int j = (n - 1); j > x; j-- ) {
				System.out.print(" ");
			}
			for ( int y = -1; y < x; y++ ) {
				System.out.print("*");
			}
			for ( int y = 0; y < x; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void diamond() {
		for ( int x = 0; x < n; x++) {
			for ( int j = (n - 1); j > x; j-- ) {
				System.out.print(" ");
			}
			for ( int y = -1; y < x; y++ ) {
				System.out.print("*");
			}
			for ( int y = 0; y < x; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for ( int x = 0; x < n; x++) {
			for ( int j = -1; j < x; j++ ) {
				System.out.print(" ");
			}
			for ( int y = (n - 1); y > x; y-- ) {
				System.out.print("*");
			}
			for ( int y = (n - 2); y > x; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void diamondWithName() {
		for ( int x = 0; x < (n - 1); x++) {
			for ( int y = (n - 1); y > x; y-- ) {
				System.out.print(" ");
			}
			for ( int y = -1; y < x ; y++ ) {
				System.out.print("*");
			}
			for ( int y = 0; y < x; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("Sarah");

		for ( int x = 0; x < n; x++) {
			for ( int y = -1; y < x; y++ ) {
				System.out.print(" ");
			}
			for ( int y = (n - 1); y > x; y-- ) {
				System.out.print("*");
			}
			for ( int y = (n - 2); y > x; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}