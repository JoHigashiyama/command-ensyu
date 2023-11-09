import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1人目の身長(cm)を入力してください。");
		double height = Double.parseDouble(sc.nextLine());
		System.out.println("1人目の体重(kg)を入力してください。");
		double weight = Double.parseDouble(sc.nextLine());
		
		height /= 100;
		
		Double BMI = weight / height / height;
		
		String ans = String.format("%.2f", BMI);
		
		System.out.println("1人目ののBMIは" + ans + "です。");
		
		System.out.println("2人目の身長(cm)を入力してください。");
		double height2 = Double.parseDouble(sc.nextLine());
		System.out.println("2人目の体重(kg)を入力してください。");
		double weight2 = Double.parseDouble(sc.nextLine());
		
		height2 /= 100;
		
		double BMI2 = weight2 / height2 / height2;
		
		String ans2 = String.format("%.2f", BMI2);
		
		System.out.println("2人目のBMIは" + ans2 + "です。");
	}
}