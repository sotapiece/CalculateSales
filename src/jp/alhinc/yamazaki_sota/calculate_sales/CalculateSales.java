package jp.alhinc.yamazaki_sota.calculate_sales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CalculateSales {
	public static void main(String[] args) {
		String[] shops = new String[2];
		HashMap<String, Integer> shopsdeta = new HashMap<String, Integer>(5);
		try {
			File file = new File("/Users/yamazaki/training/CalculateSales/branch.lst");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s ;
			while((s = br.readLine()) != null) {
				System.out.println(s);
				shops = s.split(",");
				System.out.println(shops[0]);
				System.out.println(shops[1]);
				shopsdeta.put(shops[0],0);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println(shopsdeta.get("001"));
		System.out.println(shopsdeta.get("002"));
		System.out.println(shopsdeta.get("003"));
		System.out.println(shopsdeta.get("004"));
		System.out.println(shopsdeta.get("005"));
		
		
		File salesFile = new File("/Users/yamazaki/training/CalculateSales/earnings");
	    File[] salesFileList = salesFile.listFiles();
	    
	    for(int i = 0; i<salesFileList.length; i++) {
	    	System.out.println(salesFileList[i]);
	    }
	    
	    
	    
//	   if(salesFileList != null) {
//		   for(int i = 0; i<salesFileList.length; i++) {
//			   if(salesFileList[i].getName().substring(salesFileList[i].length() - 12).matches("^[0-9]{12}") && salesFileList[i].getName().substring(salesFileList[i].length() - 12).matches(".+rcd$")) {
//				  
//			   }
//		   }
//	   }
	}
}
