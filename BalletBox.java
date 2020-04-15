package javafiles;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class BalletBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		HashMap<String, Integer>candidates= new HashMap<>();
		String[] candidate= {"suresh", "sriram", "yoshi", "teja"};
		int[] c=new int[candidate.length];
        while(scan.hasNext()) {
        	for(int i=0;i<candidate.length;i++) {
        		if(scan.nextLine().equals(candidate[i])) {
        			c[i]++;
        			candidates.replace(candidate[i], c[i]);
        		}	
        	}
        }
        System.out.println(candidates);
        
	}

}
