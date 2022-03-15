package javassignment;

public class Q11oneDarray {

	public static void main(String[] args) {
		int array[]={0,0,0,0,0,0,0,0,0,0}; 
		 
		 // part b 
		 int bonus[];
		 bonus=new int[15]; // declaring array bonus with 15 elements
		 for(int i=0;i<15;i++){ // adding 1 to each element
		 bonus[i]+=1;
		 }
		 
		 // part c 
		 int bestScores[]={10,20,30,40,50}; 
		 for (int j=0;j<5;j++){
		 System.out.printf("%d\t", bestScores[j]);
		 }
	}

}
