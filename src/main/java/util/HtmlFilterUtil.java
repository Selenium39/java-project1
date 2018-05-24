package util;

public class HtmlFilterUtil {
	public static String HtmlFilter(String s) {
		if(s==null||s.equals("")) {
			return s;
		}
		String str=s.replaceAll("<[.[^<]]*>","");
		return str;
		
	}

}
