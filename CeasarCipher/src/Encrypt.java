public class Encrypt{

public String encrypt(String input , int key1) {

    StringBuilder encrypted = new StringBuilder(input);

    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String shiftedAlpha = alphabet.substring(key1) + alphabet.substring(0, key1);

    for (int i = 0; i < encrypted.length(); i++) {

        char currChar = encrypted.charAt(i);
        if (Character.isLowerCase(currChar)){
            char currCharUpper = Character.toUpperCase(currChar);
            int idx = alphabet.indexOf(currCharUpper);
        if (idx != -1) {
            char newChar = Character.toLowerCase(shiftedAlpha.charAt(idx));
            encrypted.setCharAt(i, newChar);
        }
    }else if (Character.isUpperCase(currChar)){

            int idx = alphabet.indexOf(currChar);
            if (idx != -1) {
                char newChar = shiftedAlpha.charAt(idx);
                encrypted.setCharAt(i, newChar);
            }
        }
    }
    return encrypted.toString();
}
}