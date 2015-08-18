package com.suma;

public class Array {

	public static int findLarge(int arr[]){  

        int lar=arr[0];  
        for(int i=1;i<arr.length;i++){  
            if(lar<arr[i])  
                lar=arr[i];  
        }  
        return lar;  
	}
	
}
