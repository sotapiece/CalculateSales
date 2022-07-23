package jp.alhinc.yamazaki_sota.calculate_sales;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
	    
	    System.out.println(filenames[0]);
	    int sapporo = 0;
	    int sendai = 0;
	    int tokyo = 0;
	    int nagoya = 0;
	    int osaka = 0;
	    
	    
	    
	    for(int i = 0; i<filenames.length; i++) {
	    	if(filenames[i].matches(".+rcd$")) {
	    		try {
	    			File file = new File(args[0], filenames[i]);
	    			FileReader fr = new FileReader(file);
	    			BufferedReader br = new BufferedReader(fr);
	    			String key;
	    			key = br.readLine();
	    			System.out.println(key);
	    			int value;
	    			value = Integer.parseInt(br.readLine());
	    			System.out.println(value);
	    			
	    			if(key.equals("001")) {
	    				sapporo += value;
	    				System.out.println(sapporo);
	    				shopsdeta.put(key,sapporo);
	    			}else if(key.equals("002")) {
	    				sendai += value;
	    				System.out.println(sendai);
	    				shopsdeta.put(key,sendai);
	    			}else if(key.equals("003")) {
	    				tokyo += value;
	    				System.out.println(tokyo);
	    				shopsdeta.put(key,tokyo);
	    			}else if(key.equals("004")) {
	    				nagoya += value;
	    				System.out.println(nagoya);
	    				shopsdeta.put(key,nagoya);
	    			}else if(key.equals("005")) {
	    				osaka += value;
	    				System.out.println(osaka);
	    				shopsdeta.put(key,osaka);
	    			}
	    		}catch(IOException e) {
	    			System.out.println(e);
	    		}
	    	}
	    }
	    
	    System.out.println(shopsdeta.get("001"));
		System.out.println(shopsdeta.get("002"));
		System.out.println(shopsdeta.get("003"));
		System.out.println(shopsdeta.get("004"));
		System.out.println(shopsdeta.get("005"));
	    
		
		try {
			File file = new File("/Users/yamazaki/training/CalculateSales/shopdetas/branch.out");
			if(file.createNewFile()) {
				System.out.println("ファイルが作成されました");
			}else {
				System.out.println("ファイルの作成に失敗しました");
			}
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println("001,札幌支店," + shopsdeta.get("001"));
			pw.println("002,仙台支店," + shopsdeta.get("002"));
			pw.println("003,東京支店," + shopsdeta.get("003"));
			pw.println("004,名古屋支店," + shopsdeta.get("004"));
			pw.println("005,大阪支店," + shopsdeta.get("005"));
			pw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			File file = new File(args[0], "branch.out");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s ;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
