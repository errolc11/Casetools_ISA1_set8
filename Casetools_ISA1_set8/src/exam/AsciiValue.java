package exam;

public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'a';
		int ascii = ch;
		int castAscii = (int)ch;
		System.out.println("The ASCII value of " +ch + " is:" +ascii);
		System.out.println("The ASCII value of" +ch + " is:" +castAscii);
	}
	
	public class VowelConsonant{
		public static void main(String[] args) {
			char ch = 'i';
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				System.out.println(ch + "is vowel");
				else
					System.out.println(ch + "is consonant");
			}
		}
	}


