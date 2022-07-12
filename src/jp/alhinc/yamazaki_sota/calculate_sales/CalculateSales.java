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
			File file = new File(args[0], "branch.lst");
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
		
		
		File salesFile = new File(args[0]);
	    String[] filenames = salesFile.list();
	    for(int i = 0; i<filenames.length; i++) {
	    	System.out.println(filenames[i]);
	    }
	    
	    
//	    for(int i = 0; i<filenames.length; i++) {
//	    	if(filenames[i].matches(".+rcd$")) {
//	    		try {
//	    			File file = new File(args[0], "filenames[i]");
//	    			FileReader fr = new FileReader(file);
//	    			BufferedReader br = new BufferedReader(fr);
//	    			String p;
//	    			while((p = br.readLine()) != null){
//	    				System.out.println(p);
//	    			}
//	    		}catch(IOException e) {
//	    			System.out.println(e);
//	    		}
//	    	}
//	    }
	}
}
