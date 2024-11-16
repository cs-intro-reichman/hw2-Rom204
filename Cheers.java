// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                // recieve inputs
                String str = args[0];
                String UpperStr = str.toUpperCase();
                int times = Integer.parseInt(args[1]);

                String VOWLS = "AEFHILMNORSX";
                String articles = "";
                int strLength = str.length();

                for (int i = 0; i < strLength; i++){
                        if (VOWLS.indexOf(UpperStr.charAt(i)) != -1){
                                articles = "an";
                        } else {
                                articles = "a ";
                        }
                        System.out.println("Give me " + articles + " " + UpperStr.charAt(i) + ": " + UpperStr.charAt(i) + "!");
                }

                System.out.println("What does that spell?");

                for (int i = 0; i < times; i++){
                        System.out.println(UpperStr + "!!!");
                }              
        }
}
