class Overloading{

	public static void main(String args[]){
		int a=67;
        	float b=3.06f;
        	OverDrive.print();
        	OverDrive.print(a);
        	OverDrive.print(b);
    
	}
}
class OverDrive{
     	public static void print(){
		System.out.print("NULL");
	}
	public static void print(int x){
		System.out.print("\nInteger Override " +x);
	}
	public static void print(float y){
		System.out.print("\nFloating Override "+y);
	}
 }
 