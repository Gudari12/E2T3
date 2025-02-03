package Frogak;

/*public class Froga {
	public static void main(String[] args) { 
	    System.out.println("HELLO WORLD");
	  } 

}*/
public class Froga {
    public static void main(String[] args) {
        String str = "I love Java";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}