//2016301007 ���ȣ
import java.util.Scanner;
public class Assignment_2nd
{
	public static void main(String[] args) 
	{	// TODO �ڵ� ������ �޼ҵ� ����
		Scanner SC = new Scanner(System.in);
		String org_sentence;
		String mod_sentence = null;
		String delete;
		
		
		System.out.print("Give me a sentence >> ");
		org_sentence = SC.nextLine();
		
		System.out.print("Give me characters to delete >> ");
		delete = SC.nextLine();
		
		mod_sentence = org_sentence;
		
		for (int i = 0 ; i < delete.length() ; i ++)
		{
			String temp = Character.toString(delete.charAt(i));
			mod_sentence = mod_sentence.replaceAll(temp , "");
		}

		System.out.println("Original sentence >> " + org_sentence);
		System.out.println("Modified sentence >> " + mod_sentence);
	}
}