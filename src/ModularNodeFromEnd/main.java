package ModularNodeFromEnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);*/
		
		int num = 2;
		
		//System.out.println(num);
		ModularNode s = new ModularNode();
		s.insert(s, 3);
		s.insert(s, 7);
		s.insert(s, 1);
		s.insert(s, 9);
		s.insert(s, 8);

		s.modulus(s, num);
		s.modulus(s, num+1);
		s.modulus(s, num+2);
	}
}

