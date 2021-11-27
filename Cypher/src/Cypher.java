public class Cypher {

public static void main(String [] args) {

    //create an empty string through StringBuilder so it is mutable through its method
    StringBuilder str = new StringBuilder();
    //A string containing all alphabets
    String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //A String message which is to be encrypted
    String message = "A BAT";
    //A key int to generate shifted alphabetical order to generate cypher code
    int key = 19;

    //creating shifted alphabet
    String shiftedAlpha = alpha.substring(key) + alpha.substring(0, key);

    System.out.println(alpha);
    System.out.println(shiftedAlpha);


    for(int i=0; i<message.length(); i++){

        int result = alpha.indexOf(message.charAt(i));

        //if the original message has empty space between words it will skip to add space in the encrypted message
        if(message.charAt(i)!=' '){
            str.append(shiftedAlpha.charAt(result));
        }else{
            str.append(" ");
        }
    }
    System.out.println(str);
    }

}

