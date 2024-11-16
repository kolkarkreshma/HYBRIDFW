package practice;

import genericutil.PropertyFileUtil;

public class Propertyfiletest {
	public static void main(String[] args) throws Throwable {
		PropertyFileUtil  p=new PropertyFileUtil();
		System.out.println(p.readDataFromPf("un"));
		System.out.println(p.readDataFromPf("pwd"));
		System.out.println(p.readDataFromPf("url"));
		System.out.println(p.readDataFromPf("browser"));
		
		
	}

}
