package basicProgram;
public class PositionOfGivenArray {
	public static void main(String[] args) {
		int[] a= {13,5,-4,6,-3,7,0,-7,-9,11,-9}; 
		int elefind=-9;
		int i;
		for(i=0;i<a.length;i++) {
			if(a[i]==elefind) {
				System.out.println("The position of given number is " + i);
				break;
			}
		}
	}
}
