package arraylist;

// Create the HDTV class which will implement the Comparable interface
public class HDTV implements Comparable<HDTV> {
	// Declare the variables
	String Brandname;
	int Size;

	// Constructor to initiate the values to the variables
	public HDTV(String brandname, int size) {
		super();
		Brandname = brandname;
		Size = size;
	}

	@Override
	// Convert the elements of the collection to string for printing
	public String toString() {
		return "\n HDTV [Brandname=" + Brandname + ", Size=" + Size + "]";
	}

	@Override
	// Compart the values of the Sized and accordingly sort the elements of the
	// collection
	public int compareTo(HDTV o) {
		return o.Size - this.Size;
		//return this.Size - o.Size; //To Sort in ascending order of Size
	}
}
