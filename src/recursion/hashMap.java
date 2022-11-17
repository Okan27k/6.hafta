package recursion;

import java.util.HashMap;
import java.util.LinkedList;

public class hashMap {
	public static void main(String[]args){
		LinkedList<String> cars = new LinkedList<String>();
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		people.put("Kumalala", 20);
		people.put("Savesta", 26);
		people.put("Quandale Dingle",3000);
		
		for (String i:people.keySet()){
			System.out.println("Key : " +i +"|" + " Value :" +people.get(i));
		}
		cars.add("Honda");
		cars.add("Toyota");
		cars.add("Renault");
		cars.add(1,"Mazda");
		String a = cars.get(1);
		if (a=="Mazda") {
			System.out.println("Eşitlik Sağlandı");
			
			
		}
		else if(a.equals(cars.get(1))) {
			System.out.println("Equals Sağlandı");
			
		}
		else {
			
			System.out.println("Eşitlik Sağlanamadı");
		}
		
			try {
				int[] dizi = {1,2,3};
				System.out.println(dizi[10]);
				System.out.println("Buraya ulaştı");
				
			}
			catch(Exception e ) {
				System.out.println("Bir şeyler yanlış ");
			}
		}
	}

