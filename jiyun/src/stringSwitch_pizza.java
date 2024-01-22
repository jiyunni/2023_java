import java.util.Scanner;

public class stringSwitch_pizza {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("what kind of pizza:");
		String  model = sc.next();
		
		int price = 0;
		switch (model) {
			case "combination" :
			case "super_suprime" : price = 20000;	break;
			case "patatoes":	price = 15000;	break;
			default:	price = 0;	break;
		}
		System.out.println("pizza"+"\t"+model+"'s price="+price);
				

	}

}
