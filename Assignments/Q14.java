class Q14
{
 public static void main(String args[] )
 {
   String p1 = " * * * * * * ==================================";
   String p2 = "  * * * * *  ==================================";
   String p3 = " ==============================================";

	for(int i=1;i<=9;i++){
		if(i%2==1){
			System.out.println(p1);
		}else{
			System.out.println(p2);
		}		
	}
	for(int i=1;i<=6;i++){
		System.out.println(p3);	
	}
 
  }
}
 

