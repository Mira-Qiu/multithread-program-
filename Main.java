public class Main {

public static void main(String[]args){
	Random random = new Random();
	AddThread[] thread = new AddThread[10];
	int [] a = new int [100];
	int [] b = new int [10];
	
		for(int i = 0; i < a.length; i++){
			int test = random.nextInt(10)+1;
			a[i] = test;
		}
	
		for(int i = 0; i< b.length; i++){
			int [] temp = new int [10];
			for(int j = 0; j < 10; j++){
				temp [j] = a[i*10+j];
			}
			thread[i] = new AddThread(temp); 
			thread[i].start();
		}
		
		for(int i = 0; i < b.length; i++)
			try {
				thread[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		System.out.println(add.getSum());
	}
}
