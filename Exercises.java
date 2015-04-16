class Exercises {
	public static void main(String[] args) {
		Triangle t = new Triangle(11);
		t.oneAsterisk();
		t.horizontalLine();
		t.verticalLine();
		t.rightTriangle();

		Diamond d = new Diamond(11);
		d.isoscelesTriangle();
		d.diamond();
		d.diamondWithName();

		fizzBuzz();
	}

	public static void fizzBuzz() {
		for ( int x = 1; x < 101; x++) {
			if ( (x%3 == 0) && (x%5 == 0) ) {
				System.out.println("FizzBuzz");
			}
			else if( x%3 == 0 ) {
				System.out.println("Fizz");
			}
			else if ( x%5 == 0 ) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(x);
			}
		}
	}
}