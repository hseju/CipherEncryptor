public class Decryption {

    String decrypt(String message, int Dkey){

        StringBuilder decrypt = new StringBuilder(message);
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


            String shiftedAlpha = alpha.substring(Dkey) + alpha.substring(0, Dkey);

            for (int i = 0; i < decrypt.length(); i++) {
                char ch = decrypt.charAt(i);
                if (Character.isLowerCase(ch)) {
                    char chUpper = Character.toUpperCase(ch);
                    int index = shiftedAlpha.indexOf(chUpper);
                    if (index != -1) {
                        char enChar = alpha.charAt(index);
                        decrypt.setCharAt(i, Character.toLowerCase(enChar));
                    }
                }

                int index = shiftedAlpha.indexOf(ch);
                if (index != -1) {
                    char enChar = alpha.charAt(index);
                    decrypt.setCharAt(i, enChar);
                }
            }


        return decrypt + "\n";
    }
}
