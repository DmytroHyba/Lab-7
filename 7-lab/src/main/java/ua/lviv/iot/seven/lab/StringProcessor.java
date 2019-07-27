package ua.lviv.iot.seven.lab;

	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class StringProcessor {

	  public  int readInputBank() throws IOException {
	    Scanner sc = new Scanner(new InputStreamReader(System.in));
	    System.out.print("Enter bank");
	    return sc.nextInt();

	  }
	  public static String readInputText() throws IOException {
	    Scanner sc = new Scanner(new InputStreamReader(System.in));
	    System.out.print("Enter String");
	    return sc.nextLine();

	  }
	  public String showResults(String st, int bank) {

	    
	    
	    String replaced = st.replaceAll("\\b" + bank + "\\s[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}\\b", "");
	    String replacedSecond = replaced.replaceAll("\\b" + bank + "[0-9]{12}\\b", "");
	    
	    System.out.println(replacedSecond);

	   
	    return null;
	  }

	  public static void main(String[] args) throws IOException {
	    StringProcessor sp = new StringProcessor();
	    int bank = sp.readInputBank();
	    String st = new String();
	    st = StringProcessor.readInputText();
	    sp.showResults(st,bank);

	  }

	}

