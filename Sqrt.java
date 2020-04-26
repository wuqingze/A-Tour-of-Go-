import java.util.*;
import java.math.*;
class Sqrt{
	public static void main(String[] args){
		Double precise = new Double(args[0]);
		Double d = new Double(args[1]);
		Double low = 0.0d;
		Double hight = d;
		Double mid = (low+hight)/2;
		int count = 0;
		while(Math.abs(mid*mid-d)>precise){
			System.out.println(String.format("%f,%f,%f,%f",low,mid,hight,mid*mid));
			if(mid*mid>d){
				hight = mid;
			}else{
				low = mid;
			}
			mid = (low+hight)/2;
			count += 1;
		}
		System.out.println(mid);
		System.out.println(mid*mid);
		System.out.println(count);
	}
}

