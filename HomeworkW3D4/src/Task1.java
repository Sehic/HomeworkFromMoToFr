
public class Task1 {

		public static void main(String[] args) {
			
			System.out.println(getMin2(456, 165));
			System.out.println(getMin3(-45, -4, 456));
			

		}
		public static int getMin2(int a, int b) {
			return (a < b) ? a : b;
		}
		public static int getMin3(int a, int b, int c) {
			return (a < getMin2(b, c)) ? a : getMin2(b, c);
		}
}

