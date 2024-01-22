
public class ArrayARgumentTest {
	
	public static double minArray(double[]list) {
		double min= list[0];
		
		for(int i=0; i<=list.length;i++) {
			if(list[i]<min) {
				return min = list[i];
			}

		}
		return(min);
	}
	

	public static void main(String[] args) {
		double[] a = {1,2,3,4,5};
		double[] b = {4,7,8,9,56};
		
		double min;
		
		min = minArray(a);
		System.out.println(min);
		
		min = minArray(b);
		System.out.println(min);
		

	}

}
