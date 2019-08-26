package Palindrome;


public class main {

	public static void main(String[] args) 
	{
		palindrome ms = new palindrome();
		ms.insert(ms, 1);
		ms.insert(ms, 2);
		ms.insert(ms, 3);
		ms.insert(ms, 4);
		ms.insert(ms, 5);
		ms.insert(ms, 4);
		ms.insert(ms, 3);
		ms.insert(ms, 2);
		ms.insert(ms, 1);
		ms.print(ms);
		ms.palindromeCheck(ms);
	}
}

