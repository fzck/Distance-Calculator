import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DistanceCalculator dc = new DistanceCalculator();
		dc.initCoord();
		
		int choice;
		String[] choices = {"Temple of Leah","Oslob","Mactan Island Resort","SM Seaside","Kawasan Falls",
				"Osmena Peak","Magellan's Cross","Balamban","Bantayan Island","Malapascua Island"};
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i<choices.length ; i++){
			System.out.println(i+1 + "\t" + choices[i]);
		}
		
		choice = scan.nextInt();
		System.out.println("dist: " + dc.distance(choice, "K"));

	}

}
