package _01_introduction;

public class IntroToRecursion {
	public static void main(String[] args) {
		//1. Recursion is when a method calls itself.
		//   Before running the program, what do you predict
		//   the output will be?
		printRecursively(10);
	}
	
	public static void printRecursively(int n) {
		if(n > 0) {
			printRecursively(n - 1);
		}
		System.out.println(n);
	}
	
	//2. Go to codingbat.com/java/Recursion-1 and complete as many recursive methods as you can.
}

//void setup(){
//	  size(1500, 1500);
//	}
//
//	void draw(){
//	  fill(#0000FF);
//	  recursiveRect(300, 25, 200, 200, 5);
//	  //fill(#FF0000);
//	  recursiveEllipse(200, 400, 300, 200, 16);
//	  
//	  //BONUS
//	  recursiveTriangle(0, 0, 200, 0, 100, 173, 6);
//	}
//
//	void recursiveRect(int x, int y, int w, int h, int scale){
//	  if(scale<=0) {
//	    rect(0, 0, 0, 0, 0);
//	  }else if(scale>0) {
//	    rect(x-scale, y-scale, w/scale, h/scale);
//	    recursiveRect( x,  y,  w,  h,--scale);
//	    
//	  }
//	}
//
//	void recursiveEllipse(int x, int y, int w, int h, int scale){
//	  //me too
//	}
//
//	//BONUS
//	void recursiveTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int scale){
//	  //Complete me if you dare!
//	}

