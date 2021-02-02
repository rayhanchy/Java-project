package javaDemo;

public class Stringconceptpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt = "Bangladesh Sylhet";
		String txt1 = "Bangladesh Sylhet";
		
		//To see the memory location :
		
		System.out.println(System.identityHashCode(txt));
		System.out.println(System.identityHashCode(txt1));
		
														//equal - return true or false. (compare two different variable)
		System.out.println(txt.equals(txt1));  //compare both value are same
		System.out.println(txt == txt1);   // compare memory address 
		
		System.out.println(txt.length());          // To count length
		
		System.out.println(txt.concat(txt1));   //To join more than one String we have to use Concatenation
		
		             // To concate different type of data type variables
		
				String num = "1000";
				int a  = 50;
				
				System.out.println(num + a);
				
		String ttt = "     Sylhet is my home town     ";
												//To remove white space from both side of the text we use trim
		System.out.println(ttt.trim());
		System.out.println(ttt.trim().length());
		
						//Sub String  (Return partial string)
		
		String txt3 = "Bangladesh is my motherland";
		System.out.println(txt3.substring(4));              //Show from 4th index
		
		System.out.println(txt3.substring(3, 12));   //Print begin index and end index
		
		System.out.println(txt3.toLowerCase());         //Print full text in lowercase
		System.out.println(txt3.toUpperCase());          //Print full text in uppercase
		
		System.out.println(txt3.charAt(6));				//return character of given index
		
		System.out.println(txt3.indexOf("d"));         //return characters index no.
		
		System.out.println(txt3.startsWith("B"));    //verify the string start with this letter
		System.out.println(txt3.endsWith("d"));      //verify the string ends with this letter
		
		System.out.println(txt3.contains("my"));     //is given string available on whoe string or not?
		System.out.println(txt3.contains("rayhan"));
		
		
		
	}

}
