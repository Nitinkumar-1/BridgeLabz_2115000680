public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
		StringBuilder sb = new StringBuilder(input);
        System.out.println(sb.reverse().toString()); 
    }
}
