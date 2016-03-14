package session6;

interface Operation {
    public int num();

	public int square();

	
}
class SimpleOperation implements Operation {
int n=2;
    public int num() {
        return n;
    }

    public int square() {
        return n*n;
    }

}
public class Interrface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op = new SimpleOperation();
		System.out.println("Print first method \n"+op.num()); // Valid
		System.out.println("Square of first method\n"+op.square()); // Invalid
	}

}
