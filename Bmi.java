import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 2; i++) {
		System.out.println(i + "人目の身長(cm)を入力してください。");
		double height;
			
			try {
				height = Double.parseDouble(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("数値のみを入力してください。");
				i--;
				continue;
			}
			
		System.out.println(i + "人目の体重(kg)を入力してください。");
		double weight;
			
			try {
				weight = Double.parseDouble(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("数値のみを入力してください。");
				i--;
				continue;
			}
		
		height /= 100;
		
		Double BMI = weight / height / height;
		
		String ans = String.format("%.2f", BMI);
		
		System.out.println(i + "人目ののBMIは" + ans + "です。");
		}
	}
}