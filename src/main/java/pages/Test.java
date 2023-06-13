package pages;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	
	public ArrayList<String> playSong(String song)
	{
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(new String[2]) );
		
		al.add(song);
		
		return al;
		
		
	}
	
	public static void main(String[] args) {

		Test user1 = new Test();
		
		user1.playSong("song1");
		System.out.println(user1.playSong("song2"));
		
		System.out.println(user1.playSong("song3"));
	}

}
