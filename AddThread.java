public class AddThread extends Thread{
int [] x;

public AddThread(int [] x){
	this.x = x;
}
public void run(){
	for(int i = 0; i < x.length; i++)
		add.adding(x[i]);
}
}
