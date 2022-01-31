package apache;
import java.util.*; 
public class collections {
	public static void main(String args[]) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(17);
		al.add(6);
		al.add(9);
		al.add(7);
		System.out.println("Using Advanced For Loop");   

		for (Integer num : al) {         
			System.out.println(num);   
		}
	}
}