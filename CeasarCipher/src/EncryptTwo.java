public class EncryptTwo {


    public String encrypt(String input , int key1, int key2) {

        StringBuilder encrypted2 = new StringBuilder(input);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlpha1 = alphabet.substring(key1) + alphabet.substring(0, key1);
        String shiftedAlpha2 = alphabet.substring(key2) + alphabet.substring(0, key2);

        for (int i = 0; i < encrypted2.length(); i++) {

            if (i % 2 == 0) {

                char currChar = encrypted2.charAt(i);
                if (Character.isLowerCase(currChar)) {
                    char currCharUpper = Character.toUpperCase(currChar);
                    int idx = alphabet.indexOf(currCharUpper);
                    if (idx != -1) {
                        char newChar = Character.toLowerCase(shiftedAlpha1.charAt(idx));
                        encrypted2.setCharAt(i, newChar);
                    }
                } else if (Character.isUpperCase(currChar)) {

                    int idx = alphabet.indexOf(currChar);
                    if (idx != -1) {
                        char newChar = shiftedAlpha1.charAt(idx);
                        encrypted2.setCharAt(i, newChar);
                    }
                }
            }else{

                char currChar = encrypted2.charAt(i);
                if (Character.isLowerCase(currChar)) {
                    char currCharUpper = Character.toUpperCase(currChar);
                    int idx = alphabet.indexOf(currCharUpper);
                    if (idx != -1) {
                        char newChar = Character.toLowerCase(shiftedAlpha2.charAt(idx));
                        encrypted2.setCharAt(i, newChar);
                    }
                } else if (Character.isUpperCase(currChar)) {

                    int idx = alphabet.indexOf(currChar);
                    if (idx != -1) {
                        char newChar = shiftedAlpha2.charAt(idx);
                        encrypted2.setCharAt(i, newChar);
                    }
                }


            }
        }
        return encrypted2.toString();
    }
}
