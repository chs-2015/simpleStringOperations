/**
 * Author: Brandon B.
 * Date: 8-20-15
 */
 
public class simpleStringOperations {
    
    public static void main(String[] args) {
    	
		// String Concentration
		String mn = "Hello";
		String nx = "good buddy";
		String c = mn + nx;
		System.out.println(c); // Will print Hellogood buddy.
		System.out.println(mn + " " + nx); // Will print Hello good buddy.

		// Length
		String theName = "Donald Duck";
		int len = theName.length();
		System.out.println(len); // Will print 11, space is counted.

		// Pieces of strings
		String myPet = "Sparky the dog";
		String smallPart = myPet.substring(4);
		System.out.println(smallPart); // Prints ky the dog
		
		String smallerPart = myPet.substring(4, 12);
		System.out.println(smallerPart); // Prints ky the d

		// Text conversion
		String bismark = "Dude, where's MY car?";

		System.out.println(bismark.toLowerCase()); // Prints string in all lower case.
		System.out.println(bismark.toUpperCase()); // Prints string in all caps.

		// Concentrating a string and a numeric
		int x = 27;
		String s = "Was haben wir gemacht?"; // German for "What have we done?"
		// Herr Vessa would be very proud
		String combo = s + " " + x;

		System.out.println(combo);

		// Escape sequences
		String z = "What \"is\" the right way?";
		System.out.println(z);

		String g = "Here is one line\nand here is another.";
		System.out.println(g);

		System.out.println("Path = c:\\nerd_file.doc");
		System.out.println("Name:\t\tAddress:");
		
		String m = "\"Look here!\"";
		int m_count = m.length() - 2;
		System.out.println(m + " has " + m_count + " characters.");

		System.out.println("A backslash looks like this \\, ...right?");

		String pq = "Eddie Haskel";
		int hm = pq.length();
		String ed = pq.substring(hm - 4);
		System.out.println(ed);

		System.out.println("Herman Munster".substring(5));
    }
}
