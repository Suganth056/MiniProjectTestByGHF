package miniProject;
import java.util.*;
public class UnitConversion {
	void mTOkm() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello! Please enter a Distance in a meter:");
		double m=sc.nextDouble();
		double km=(m/1000);
		System.out.println("KiloMeter of "+m+" meter="+km+" KiloMeter");
	}
	void kmTOm(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello! Please enter a Distance in a KiloMeter:");
		double km=sc.nextDouble();
		double m=(km*1000);
		System.out.println("Meter of "+km+" KiloMeter="+m+" Meter");

	}
	void ltrTOml() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello! Please enter a Ouantity in a Litre");
		double ltr=sc.nextDouble();
		double ml=(ltr*1000);
		System.out.println("MiliLitre of "+ltr+" Litre="+ml+" MiliLitre");
	}
	void mlToLTR() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello! Please enter a Ouantity in a MiliLitre");
		double ml=sc.nextDouble();
		double ltr=(ml/1000);
		System.out.println("Litre of "+ml+" MiliLitre="+ltr+" Litre");
	}
	void kgToGram() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello! Please enter a Quantity in a KiloGram:");
		double kg=sc.nextDouble();
		double g=(kg*1000);
		System.out.println("Gram of "+kg+" KiloGram="+g+" Gram");
	}
	void gramToKG() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello! Please enter a Quantity in a Gram:");
		double g=sc.nextDouble();
		double kg=(g/1000);
		System.out.println("KiloGram of "+g+" Gram="+kg+" KiloGram");
	}
	void inchToCM() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello! Please enter a value in inch");
		double inch=sc.nextDouble();
		double cm=inch*2.54;
		System.out.println("CentiMeter Of "+inch +" Inch="+cm+" Centimeter.");
	}
	void cmToInch() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello! Please enter a value in Centimeter");
		double cm=sc.nextDouble();
		double inch=cm/2.54;
		System.out.println("Inch Of "+cm +" CentiMeter="+inch+" Inch.");
		
	}
	void cmToM() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello! Please Enter a value in CentiMeter:");
		double cm=sc.nextDouble();
		double m=cm/100;
		System.out.println("Meter Of "+cm+" Centimeter="+m+" Meter");
	}
	public void kmToMILE() {
	    Scanner sc =new Scanner(System.in);
		System.out.println("Hello! Please Enter a value in Kilometer:");
		double km=sc.nextDouble();
		double mile=km*0.621371;
		System.out.println("Mile of "+km+" Kilometer="+mile+" Mile");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UnitConversion u=new UnitConversion();
		int choice=1;
		int a;
		while((choice!=0)) {
			System.out.println("Hello I am a Converter Please Select the below options");
			System.out.println("Press --1-- to Convert METER To KILOMETER");
			System.out.println("Press --2-- to Convert KILOMETER To METER");
			System.out.println("Press --3-- to Convert LITRE To MILILITRE");
			System.out.println("Press --4-- to Convert MILILITRE To LITRE");
			System.out.println("Press --5-- to Convert KILOGRAM To GRAM");
			System.out.println("Press --6-- to Convert GRAM To KILOGRAM");
			System.out.println("Press --7-- to Convert INCH To CENTIMETER");
			System.out.println("Press --8-- to Convert CENTIMETER To INCH");
			System.out.println("Press --9-- to Convert CENTIMETER To METER");
			System.out.println("Press --10-- to Convert KILOMETER To MILE");
			System.out.print("Please enter a Number Between (1to10):");
			a=sc.nextInt();
			switch(a) {
			case 1:
				u.mTOkm();
				break;
			case 2:
				u.kmTOm();
				break;
			case 3:
				u.ltrTOml();
				break;
			case 4:
				u.mlToLTR();
				break;
			case 5:
				u.kgToGram();
				break;
			case 6:
				u.gramToKG();
				break;
			case 7:
				u.inchToCM();
				break;
			case 8:
				u.cmToInch();
				break;
			case 9:
				u.cmToM();
				break;
			case 10:
				u.kmToMILE();
				break;
			default:
				System.out.println("Sorry You have entered mismatch Number----");
			}
		
				
			System.out.println("Enter 0 to EXIT (or) 1 to CONTINUE:");
			choice=sc.nextInt();
			
		}
	}
}
