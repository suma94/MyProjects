package com.suma;

import java.util.Arrays;
import java.util.Scanner;

public class ArrInput {
	int [] b = new int[5];
	
	public int rotate(int a[]){
		int i;
		for(i=0;i<a.length-1;i++){
			b[i+1]=a[i];
		}
		b[0]=a[a.length-1];
		/*for(i=0;i<a.length-1;i++){
			System.out.print(a[i] + "   ");;
		}*/
		
		for(i=0;i<b.length;i++){
			System.out.print(b[i] + "   ");;
		}
		Arrays.sort(a);
		int k=a.length;
		int m;
		if(k%2!=0){
			m=a[k/2];
			System.out.println(m);
			return m;
		}
		else{
			m=(a[k/2]+a[k/2+1])/2;
			System.out.println(m);
			return m;
		}
	}
}
