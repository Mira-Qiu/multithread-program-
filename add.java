public class add {
static int sum = 0;

public static synchronized void adding(int x){
	sum += x;
}
public static int getSum(){
	return sum;
}
}
