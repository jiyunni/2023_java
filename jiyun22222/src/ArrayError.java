
public class ArrayError {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int i =0;
		
		try {
			for(i=0; i<=array.length;i++)
				System.out.println(array[i]+" ");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index "+i+" do not use");
		}
		
		String [] tokens = "I am a boy".split(" ");
		for(String token:tokens)
			System.out.println(token);
	}

}
