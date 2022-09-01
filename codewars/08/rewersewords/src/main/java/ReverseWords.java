public class ReverseWords{

    public static String reverseWords(String str){
        String arr[] = str.split(" ");
        String reverse = "";
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (i != 0) {
            reverse += arr[i] + " ";
            } else {
            reverse += arr[i];
            }
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("The greatest victory is that which requires no battle"));

    }
}

