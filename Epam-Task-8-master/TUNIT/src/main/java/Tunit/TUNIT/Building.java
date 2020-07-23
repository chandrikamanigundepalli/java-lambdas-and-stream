package Tunit.TUNIT;

public class Building {
	public static String makeSubString(String a){
	 	String s = "" ;
	 	if(a.charAt(0) != 'A') {
	 		s = s + a.charAt(0) ;
	 	}
	 	if(a.charAt(1) != 'A') {
	 		s = s + a.charAt(1) ;
	 	}
        for(int i=2;i<a.length();i++){  
            s = s + a.charAt(i) ;
        }  
        //System.out.println(s) ;
        return s;  
    }  
}
