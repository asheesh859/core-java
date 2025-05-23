package string_class;

public class Count_occurance {

	public static void main(String[] args) {
		String string = "aabaacv";
		int count=0;
		for(int i =0; i<string.length(); i++) {
			if(string.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println(count);
	}

}
