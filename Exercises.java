class Exercises {
	public static void main(String[] args) {
		Triangle t = new Triangle(7);
		t.oneAsterisk();
		t.horizontalLine();
		t.verticalLine();
		t.rightTriangle();

		Diamond d = new Diamond(3);
		d.isoscelesTriangle();
		d.diamond();
		d.diamondWithName();
	}
}