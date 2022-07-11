package jp.alhinc.yamazaki_sota.calculate_sales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CalculateSales {
	public static void main(String[] args) {
		String[] shops = new String[2];
		HashMap<String, String> shopsdeta = new HashMap<String, String>(5);
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
				shopsdeta.put(shops[0],shops[1]);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println(shopsdeta.get("001"));
	}
}
