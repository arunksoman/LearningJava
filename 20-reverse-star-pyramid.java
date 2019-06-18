public class ForLoop {
	public static void main(String[] args) {
		int i, j;
		int temp = 6;
		for(i=1;i<=temp;i++){
			for(j=temp;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}