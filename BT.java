import java.util.Scanner;

public class BT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		chiaHetCho5();
//		thongTinSinhVien();
//		tongHaiSoNguyen();
//		phepTinhSoNguyen();
//		chanLe();
//		conVat();
	}
	public static void chiaHetCho5() {
		//Take input number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Chương trình kiểm tra 1 số có chia hết cho 5.");
		System.out.println("Vui lòng nhập số cần kiểm tra: ");
		double number = sc.nextDouble();
		
		//Check the number if the result from this number divides 5 equal 0 or not.
		if (number%5==0)
			System.out.println("Số "+number+" chia hết cho 5.");
		else
			System.out.println("Số "+number+" không chia hết cho 5.");
		sc.close();
	}
	public static void thongTinSinhVien() {
		//Take student informations.
		Scanner sc = new Scanner(System.in);
		System.out.println("Chương trình thu thập thông tin sinh viên.");
		System.out.print("Vui lòng nhập Họ tên sinh viên: ");
		String name = sc.nextLine();
		System.out.print("Vui lòng nhập tuổi sinh viên: ");
		int age = sc.nextInt();
		sc.nextLine();
		if (age <=0) {
			System.out.println("Vui lòng nhập tuổi lớn hơn 0.");
			sc.close();
			return;
		}
		System.out.print("Vui lòng nhập giới tính sinh viên: ");
		String sex = sc.nextLine();
		System.out.print("Vui lòng nhập mã số sinh viên: ");
		String ID = sc.nextLine();
		
		//Export the Student information
		System.out.println("Họ tên: "+name+"\t Tuổi: "+age+"\t Giới tính: "+sex+"\t \t ID: "+ID);
		sc.close();
	}
	public static void tongHaiSoNguyen() {
		//Take student informations.
		int numberA =0;
		int numberB =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Chương trình tính tổng hai số nguyên.");
		while(true) {
			try {
				System.out.print("Vui lòng nhập số nguyên thứ nhất: ");
				numberA = sc.nextInt();
				System.out.print("Vui lòng nhập số nguyên thứ hai: ");
				numberB = sc.nextInt();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Vui lòng nhập số nguyên.");
				sc.nextLine();
			}
		}
		
		//Sum of two numbers
		int sum = numberA + numberB;
		System.out.printf("Kết quả tổng 2 số nguyên %d + %d = %d",numberA,numberB,sum);
		sc.close();
	}
	public static void phepTinhSoNguyen() {
		//Take input numbers.
		System.out.print("Vui lòng nhập số nguyên thứ a: ");
		int numberA = inputSoNguyen();
		System.out.print("Vui lòng nhập số nguyên thứ b: ");
		int numberB = inputSoNguyen();
		System.out.print("Vui lòng nhập số nguyên thứ c: ");
		int numberC = inputSoNguyen();
		System.out.print("Vui lòng nhập số nguyên thứ d: ");
		int numberD = inputSoNguyen();
		
		int sum = numberA + numberB + numberC + numberD;
		System.out.printf("Tổng %d + %d +%d + %d = %d  \n",numberA,numberB,numberC,numberD,sum);
		
		int minus = numberA - numberB - numberC - numberD;
		System.out.printf("Hiệu %d - %d - %d - %d = %d  \n",numberA,numberB,numberC,numberD,minus);
		
		int plusAB = numberA * numberB;
		System.out.printf("Phép tính a * b :%d * %d = %d  \n",numberA,numberB,plusAB);
		
		int plusCD = numberC * numberD;
		System.out.printf("Phép tính c * d :%d * %d = %d  \n",numberC,numberD,plusCD);
		
		//Tính kết quả của a – b + c + d
		int result = numberA - numberB + numberC + numberD;
		System.out.printf("Phép tính a – b + c + d: %d - %d + %d + %d = %d  \n",numberA,numberB,numberC,numberD,result);
	}
	public static void chanLe() {
		//Take input number.
		System.out.print("Vui lòng nhập số cần kiểm tra: ");
		int number = inputSoNguyen();
		
		//Check the number if the result from this number divides 5 equal 0 or not.
		if (number%2==0)
			System.out.println(number+" là số chẵn.");
		else
			System.out.println(number+" là số lẻ.");
	}
	public static void conVat() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vui lòng nhập tên con vật.(chó/mèo/ngựa/chuột)");
		String ten = sc.nextLine();
		
		switch (ten) {
		case "chó":
			System.out.println("Gâu gâu");
			break;
		case "mèo":
			System.out.println("Meo meo");
			break;
		case "ngựa":
			System.out.println("Hí hí");
			break;
		case "chuột":
			System.out.println("Chít chít");
			break;
		default:
			break;
		}
	}
 	public static int inputSoNguyen() {
		int numberA =0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				numberA = sc.nextInt();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Vui lòng nhập số nguyên.");
				sc.nextLine();
			}
		}
		return numberA;
	}
}
