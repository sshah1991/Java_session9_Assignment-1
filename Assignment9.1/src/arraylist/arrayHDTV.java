package arraylist;

//Sorting of Collection using Comparator
import java.util.ArrayList;
import java.util.Collections;

public class arrayHDTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a collection ArrayList of the object HDTV
		ArrayList<HDTV> arr_hdtv = new ArrayList<HDTV>();

		// Add elements to the Array list HDTV - In this case the element is the
		// object of the class HDTV
		arr_hdtv.add(new HDTV("Samsung", 32));
		arr_hdtv.add(new HDTV("Sony", 54));
		arr_hdtv.add(new HDTV("Micromax", 24));
		
		//Print the elements of the ArrayList HDTV
		System.out.println(arr_hdtv);
		
		//Run the sort method to arrange in the descending order of the Size
		Collections.sort(arr_hdtv);
		//Print the sorted elements of the ArrayList HDTV
		System.out.println(arr_hdtv);
	}

}
