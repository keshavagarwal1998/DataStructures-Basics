package com.keshav.string;

import java.util.*;
import java.lang.*;
import java.io.*;

class Each_digit_prime {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0)
		{
			int st = sc.nextInt();
			int ans=new string.Testing().Testing(st);
			System.out.print(ans);
		}
		//code
	}
}


class Testing{
	public static int Testing(int a){
		int count =0 ;
		int answer = 0;
		for(int i = 0 ; i< Integer.MAX_VALUE ; i++){
			int b = i%10;
			int c = i%100;
			int d = i%1000;
			if( (b==2|| b==3|| b==5|| b==7)&&( c==2|| c==3|| c==5|| c==7)&&(d==2|| d==3|| d==5|| d==7)){
				count++;
				answer = i;
			}
			if(count==a){
				return answer;
			}
		}
		return 0;
	}
}